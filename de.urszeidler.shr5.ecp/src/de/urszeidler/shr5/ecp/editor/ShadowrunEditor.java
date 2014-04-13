/**
 * 
 */
package de.urszeidler.shr5.ecp.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Projektilwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Wurfwaffe;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementSwitch;
import de.urszeidler.emf.commons.ui.dialogs.GenericEObjectDialog;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.editor.BasicEditor;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.dialogs.CreateAttributModifikatorDialog;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.dialogs.ReferenceValueDialog;
import de.urszeidler.shr5.ecp.editor.pages.AbstractGeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.AbstraktPersonaPage;
import de.urszeidler.shr5.ecp.editor.pages.BeschreibbarContainterPage;
import de.urszeidler.shr5.ecp.editor.pages.CharacterAdvancementPage;
import de.urszeidler.shr5.ecp.editor.pages.DefaultEmfFormsPage;
import de.urszeidler.shr5.ecp.editor.pages.FernkampfwaffePage;
import de.urszeidler.shr5.ecp.editor.pages.FertigkeitPage;
import de.urszeidler.shr5.ecp.editor.pages.FeuerwaffePage;
import de.urszeidler.shr5.ecp.editor.pages.FreeStyleGeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.GegenstandPage;
import de.urszeidler.shr5.ecp.editor.pages.GenericBasicBeschreibbarPage;
import de.urszeidler.shr5.ecp.editor.pages.GruntGroupPage;
import de.urszeidler.shr5.ecp.editor.pages.ManagedCharacterPage;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.editor.pages.ModifikatorPage;
import de.urszeidler.shr5.ecp.editor.pages.ModifizierbarPage;
import de.urszeidler.shr5.ecp.editor.pages.NahkampwaffePage;
import de.urszeidler.shr5.ecp.editor.pages.PrintPreviewPage;
import de.urszeidler.shr5.ecp.editor.pages.ReichweitePage;
import de.urszeidler.shr5.ecp.editor.pages.Shr5GeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.Shr5KarmaGeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.SpeziesPage;
import de.urszeidler.shr5.ecp.printer.PersonaPrinter;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * An editor capable of handling several object types
 * 
 * @author urs
 */
public class ShadowrunEditor extends BasicEditor<EObject> {
    private static final String EMPTY = ""; //$NON-NLS-1$
    private ShrEditingState editingMode = ShrEditingState.CUSTOM;
    public static final String id = "de.urszeidler.eclipse.shadowrun.presentation.editors.ShadowrunEditorID"; //$NON-NLS-1$

    protected ReferenceManager manager = new DefaultReferenceManager(AdapterFactoryUtil.getInstance().getItemDelegator()) {
        public void handleManage(FormbuilderEntry e, EObject object) {
            if (Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_TYPE.equals(e.getFeature())) {
                Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(
                        Shr5managementFactory.eINSTANCE.createPlayerCharacter(), Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                        editingDomain);

                OwnChooseDialog dialog = new OwnChooseDialog(getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
                        Messages.ShadowrunEditor_dlg_select_type, Messages.ShadowrunEditor_dlg_select_persona_type);
                dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
                int open = dialog.open();
                if (open == Dialog.OK) {
                    Object[] result = dialog.getResult();
                    IObservable observable = e.getObservable();
                    if (observable instanceof IObservableValue) {
                        IObservableValue ov = (IObservableValue)e.getObservable();
                        if (result.length > 0)
                            ov.setValue((EClass)result[0]);
                        else
                            ov.setValue(null);
                    }
                }
                return;
            }
            super.handleManage(e, object);
        }

        @Override
        protected Object provideObject(FormbuilderEntry e, EObject object) {
            if (Shr5Package.Literals.MODIFIZIERBAR__MODS.equals(e.getFeature())) {
                de.urszeidler.eclipse.shr5.AttributModifikatorWert amw = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
                CreateAttributModifikatorDialog dialog = new CreateAttributModifikatorDialog(getSite().getShell(), amw, (Modifizierbar)object);

                if (dialog.open() == Dialog.OK)
                    return amw;
                else
                    return null;
            } else if (Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS.equals(e.getFeature())
                    || Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN.equals(e.getFeature())
                    || Shr5Package.Literals.KI_ADEPT__KIKRAFT.equals(e.getFeature())
                    || Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS.equals(e.getFeature())
                    || Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS.equals(e.getFeature())
                    || Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR.equals(e.getFeature())) {
                return handleCopyAddToPersona((EReference)e.getFeature(), object);

                // return null;
            } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN.equals(e.getFeature())) {
                Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(theEObject, Shr5Package.Literals.FERTIGKEIT);

                PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
                ReferenceValueDialog dialog = new ReferenceValueDialog(getSite().getShell(), personaFertigkeit,
                        Shr5Package.Literals.PERSONA_FERTIGKEIT__FERTIGKEIT, Shr5Package.Literals.STEIGERBAR__STUFE, objectsOfType.toArray());

                if (dialog.open() == Dialog.OK)
                    return personaFertigkeit;
                else
                    return null;

            } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN.equals(e.getFeature())) {
                Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(theEObject,
                        Shr5Package.Literals.FERTIGKEITS_GRUPPE);

                PersonaFertigkeitsGruppe personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
                ReferenceValueDialog dialog = new ReferenceValueDialog(getSite().getShell(), personaFertigkeit,
                        Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, Shr5Package.Literals.STEIGERBAR__STUFE, objectsOfType.toArray());

                if (dialog.open() == Dialog.OK)
                    return personaFertigkeit;
                else
                    return null;

            } else if (Shr5Package.Literals.ZAUBERER__ZAUBER.equals(e.getFeature())) {
                Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(theEObject, Shr5Package.Literals.ZAUBER);

                ShrList basicList = Shr5Factory.eINSTANCE.createShrList();

                Transformer<Zauber, PersonaZauber> transformer = ShadowrunEditingTools.zauber2PersonaZauberTransformer();

                FeatureEditorDialog dialog = new FeatureEditorDialogWert(getSite().getShell(), labelProvider, basicList,
                        Shr5Package.Literals.SHR_LIST__ENTRIES, Messages.ShadowrunEditor_dlg_select_spells, new ArrayList<EObject>(objectsOfType));

                int result = dialog.open();
                if (result == Window.OK) {
                    EList<?> list = dialog.getResult();
                    List<EObject> objectList = new ArrayList<EObject>();
                    for (Object object1 : list) {
                        if (object1 instanceof EObject) {
                            objectList.add(transformer.transform((Zauber)object1));
                        }
                    }

                    return objectList;
                }

                //
                //
                //
                //
                //
                // PersonaZauber personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaZauber();
                // ReferenceValueDialog dialog = new ReferenceValueDialog(getSite().getShell(), personaFertigkeit,
                // Shr5Package.Literals.PERSONA_ZAUBER__FORMEL, Shr5Package.Literals.PERSONA_ZAUBER__STUFE, objectsOfType.toArray());
                //
                // if (dialog.open() == Dialog.OK)
                // return personaFertigkeit;
                // else
                // return null;

            } else if (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS.equals(e.getFeature())) {
                EObject eObject = Shr5managementFactory.eINSTANCE.createConnection();
                GenericEObjectDialog dialog = new GenericEObjectDialog(getSite().getShell(), eObject, itemDelegator, this, this);

                if (dialog.open() == Dialog.OK)
                    return eObject;
                else
                    return null;
            }
            // else
            // if (Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES.equals(e.getFeature())) {
            // Collection<EClass> filteredEClasses = provideNewClassTypes(object, e.getFeature());
            //
            // }

            return defaultCreationDialog(e, object);
        }

        private EObject defaultCreationDialog(FormbuilderEntry e, EObject object) {

            Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(object, e.getFeature(), editingDomain);// provideNewClassTypes(object,
                                                                                                                                    // e.getFeature());
            if (filteredEClasses.size() == 1) {
                EClass eClass = filteredEClasses.iterator().next();
                return eClass.getEPackage().getEFactoryInstance().create(eClass);
            }

            OwnChooseDialog dialog = new OwnChooseDialog(getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
                    Messages.ShadowrunEditor_dlg_select_type, Messages.ShadowrunEditor_dlg_select_persona_type);
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            int open = dialog.open();
            if (open == Dialog.OK) {
                Object[] result = dialog.getResult();
                if (result.length > 0) {
                    EClass eClass = (EClass)result[0];
                    return eClass.getEPackage().getEFactoryInstance().create(eClass);
                }
            }

            return null;

//            final SelectionComposite<TreeViewer> helper = CompositeFactory.getSelectModelClassComposite(Collections.EMPTY_SET, Collections.EMPTY_SET,
//                    filteredEClasses);
//
//            SelectModelElementWizard w = new SelectModelElementWizard(EMPTY, EMPTY, EMPTY, Messages.ShadowrunEditor_dlg_select_object_type); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
//            w.setCompositeProvider(helper);
//            final WizardDialog wd = new WizardDialog(getSite().getShell(), w);
//
//            final int wizardResult = wd.open();
//            if (wizardResult == Window.OK) {
//                Object[] selection = helper.getSelection();
//                EClass eClass = (EClass)selection[0];
//                return eClass.getEPackage().getEFactoryInstance().create(eClass);
//                // return Shr5Factory.eINSTANCE.create(eClass);
//            }
//            return null;
        }
    };

    @Override
    protected void initAdatpterFactory() {
        adapterFactory = AdapterFactoryUtil.getInstance().getAdapterFactory();
        adapterFactory.insertAdapterFactory(new Shr5managementItemProviderAdapterFactory());
        basicContentProvider = new AdapterFactoryContentProvider(adapterFactory);
        itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
        labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
    }

    @Override
    protected void logError(String message, Exception exception) {
        Activator.logError(message, exception);
    }

    @Override
    protected void setInputObject(EObject eobject) {
    }

    @Override
    protected void addPages() {

        // the switch creates all the pages
        Shr5Switch<Object> shadowrunSwitch = new Shr5Switch<Object>() {

            @Override
            public Object caseSpezies(Spezies object) {
                try {
                    addPage(new SpeziesPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_species, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SpeziesPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseFertigkeitsGruppe(FertigkeitsGruppe object) {
                try {
                    addPage(new FertigkeitPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_skill_group, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseFertigkeit(Fertigkeit object) {
                try {
                    addPage(new FertigkeitPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_skill, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseReichweite(Reichweite object) {
                try {
                    addPage(new ReichweitePage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_range, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating ReichweitePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseCredstick(Credstick object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_credstick, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseMunition(Munition object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_credstick, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseGegenstand(Gegenstand object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_item, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseKleidung(Kleidung object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_armor, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseNahkampfwaffe(Nahkampfwaffe object) {
                try {
                    addPage(new NahkampwaffePage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_meeleweapon, object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating NahkampwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseFeuerwaffe(Feuerwaffe object) {
                try {
                    addPage(new FeuerwaffePage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_fireweapon, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FeuerwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseShrList(ShrList object) {
                try {
                    addPage(new GenericBasicBeschreibbarPage(ShadowrunEditor.this, EMPTY, EMPTY, object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseAbstraktPersona(AbstraktPersona object) {
                try {
                    addPage(new AbstraktPersonaPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_persona, object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseProjektilwaffe(Projektilwaffe object) {
                try {
                    addPage(new FernkampfwaffePage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_projectileweapon, object,
                            editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FernkampfwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseWurfwaffe(Wurfwaffe object) {
                try {
                    addPage(new FernkampfwaffePage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_throwingweapon, object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating FernkampfwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseModifizierbar(Modifizierbar object) {
                try {
                    addPage(new ModifizierbarPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_modifications, object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseModifizierbar(object);
            }

            @Override
            public Integer caseAbstraktModifikatoren(AbstraktModifikatoren object) {
                try {
                    addPage(new ModifikatorPage(ShadowrunEditor.this, EMPTY, object.eClass().getName(), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return null;
            }

        };

        shadowrunSwitch.doSwitch(theEObject);

        Shr5managementSwitch<Object> shr5managementSwitch = new Shr5managementSwitch<Object>() {

            @Override
            public Object caseFreeStyleGenerator(FreeStyleGenerator object) {
                try {
                    addPage(new FreeStyleGeneratorPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_freestyle_generator, object,
                            editingDomain, manager));

                    addPage(new PrintPreviewPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_shr5_generator_sheet, PersonaPrinter
                            .getInstance().createShr5CharacterGeneratorPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseFreeStyleGenerator(object);
            }

            @Override
            public Object caseShr5Generator(Shr5Generator object) {
                try {
                    addPage(new Shr5GeneratorPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_shr5_generator, object, editingDomain,
                            manager));

                    addPage(new PrintPreviewPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_shr5_generator_sheet, PersonaPrinter
                            .getInstance().createShr5CharacterGeneratorPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseShr5Generator(object);
            }

            @Override
            public Object caseShr5KarmaGenerator(Shr5KarmaGenerator object) {
                try {
                    addPage(new Shr5KarmaGeneratorPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_Karama_Generator, object, editingDomain,
                            manager));
                    addPage(new PrintPreviewPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_shr5_generator_sheet, PersonaPrinter
                            .getInstance().createShr5CharacterGeneratorPrintFactory(object)));
                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseShr5KarmaGenerator(object);
            }

            @Override
            public Object caseManagedCharacter(ManagedCharacter object) {
                try {
                    addPage(new AbstraktPersonaPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA, Messages.ShadowrunEditor_page_persona,
                            object.getPersona(), editingDomain, manager));
                    addPage(new ManagedCharacterPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_INVENTAR,
                            Messages.ShadowrunEditor_page_character, object, editingDomain, manager));
                    addPage(new CharacterAdvancementPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_ADVANCEMENT,
                            Messages.ShadowrunEditor_page_advacement, object, editingDomain, manager));

                    addPage(new PrintPreviewPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_PRINTER,
                            Messages.ShadowrunEditor_page_character_sheet, PersonaPrinter.getInstance().createPrintFactory(object)));
                    if (object.getGeneratorSrc() != null)
                        this.doSwitch(object.getGeneratorSrc());

                } catch (PartInitException e) {
                    logError("error creating ManagedCharacterPage", e);//$NON-NLS-1$
                }
                return super.caseManagedCharacter(object);
            }

            @Override
            public Object caseGruntGroup(GruntGroup object) {
                try {
                    addPage(new GruntGroupPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_grount_group, object, editingDomain,
                            manager));
                    addPage(new PrintPreviewPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_PRINTER,
                            Messages.ShadowrunEditor_page_grunt_group_sheet, PersonaPrinter.getInstance().createGruntPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating GruntPage", e);//$NON-NLS-1$
                }
                return super.caseGruntGroup(object);
            }

            @Override
            public Object caseCharacterGroup(CharacterGroup object) {
                try {
                    addPage(new BeschreibbarContainterPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_character_group, object,
                            editingDomain, manager));
                    addPage(new PrintPreviewPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_PRINTER,
                            Messages.ShadowrunEditor_page_character_group_sheet, PersonaPrinter.getInstance()
                                    .createCharacterGroupPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating BeschreibbarContainterPage", e);//$NON-NLS-1$
                }
                return super.caseCharacterGroup(object);
            }

            @Override
            public Object caseCharacterGenerator(CharacterGenerator object) {

                GeneratorState state = object.getState();
                switch (state) {
                    case COMMITED:
                        editingMode = ShrEditingState.READONLY;
                        break;

                    default:
                        editingMode = ShrEditingState.EDITABLE;
                        break;
                }

                return super.caseCharacterGenerator(object);
            }
        };
        shr5managementSwitch.doSwitch(theEObject);

        try {
            addPage(new DefaultEmfFormsPage(ShadowrunEditor.this, "Default_EMF_Form_Page", "default form", theEObject));
        } catch (PartInitException e) {
            logError("error creating DefaultEmfFormsPage", e);//$NON-NLS-1$
        }
    }

    @Override
    public void doSaveAs() {
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    public AdapterFactoryLabelProvider getLabelProvider() {
        return labelProvider;
    }

    @Override
    public boolean isSaveOnCloseNeeded() {
        return false;
    }

    /**
     * This is for implementing {@link IEditorPart} and simply tests the command
     * stack.
     */
    @Override
    public boolean isDirty() {
        return false;
        // if (getEditingDomain() == null)
        // return false;
        //
        // return ((BasicCommandStack)
        // getEditingDomain().getCommandStack()).isSaveNeeded();
    }

    @Override
    public TabbedPropertySheetPage getTabbedPropertySheetPage() {
        return null;
    }

    @Override
    public String getContributorId() {
        return null;
    }

    /**
     * @param object_ref
     * @param orgObject
     * @return
     */
    private List<EObject> handleCopyAddToPersona(EReference object_ref, EObject orgObject) {
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(getEObject(), object_ref.getEType());

        ShrList basicList = Shr5Factory.eINSTANCE.createShrList();

        FeatureEditorDialog dialog = new FeatureEditorDialogWert(getSite().getShell(), labelProvider, basicList,
                Shr5Package.Literals.SHR_LIST__ENTRIES, "Add " + labelProvider.getText(object_ref), new ArrayList<EObject>(collection));

        int result = dialog.open();
        if (result == Window.OK) {
            EList<?> list = dialog.getResult();
            List<EObject> objectList = new ArrayList<EObject>();
            for (Object object : list) {
                if (object instanceof EObject) {
                    EObject eo = (EObject)object;
                    EObject copy = EcoreUtil.copy(eo);
                    objectList.add(copy);
                }
            }

            return objectList;
        }
        return null;
    }

}
