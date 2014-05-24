/**
 */
package de.urszeidler.eclipse.shr5.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.KoerperPersona} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KoerperPersonaItemProvider
	extends AbstraktPersonaItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KoerperPersonaItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addPanzerPropertyDescriptor(object);
            addZustandKoerperlichMaxPropertyDescriptor(object);
            addZustandGeistigMaxPropertyDescriptor(object);
            addZustandGrenzePropertyDescriptor(object);
            addErrinerungsvermoegenPropertyDescriptor(object);
            addMenschenkenntnisPropertyDescriptor(object);
            addSelbstbeherrschungPropertyDescriptor(object);
            addZustandKoerperlichPropertyDescriptor(object);
            addZustandGeistigPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Panzer feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPanzerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Panzerung_panzer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Panzerung_panzer_feature", "_UI_Panzerung_type"),
                 Shr5Package.Literals.PANZERUNG__PANZER,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Zustand Koerperlich Max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZustandKoerperlichMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PersonaZustand_zustandKoerperlichMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PersonaZustand_zustandKoerperlichMax_feature", "_UI_PersonaZustand_type"),
                 Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zustand Geistig Max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZustandGeistigMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PersonaZustand_zustandGeistigMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PersonaZustand_zustandGeistigMax_feature", "_UI_PersonaZustand_type"),
                 Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zustand Grenze feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZustandGrenzePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PersonaZustand_zustandGrenze_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PersonaZustand_zustandGrenze_feature", "_UI_PersonaZustand_type"),
                 Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_GRENZE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Errinerungsvermoegen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addErrinerungsvermoegenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BerechneteAttribute_errinerungsvermoegen_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BerechneteAttribute_errinerungsvermoegen_feature", "_UI_BerechneteAttribute_type"),
                 Shr5Package.Literals.BERECHNETE_ATTRIBUTE__ERRINERUNGSVERMOEGEN,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Menschenkenntnis feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMenschenkenntnisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BerechneteAttribute_menschenkenntnis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BerechneteAttribute_menschenkenntnis_feature", "_UI_BerechneteAttribute_type"),
                 Shr5Package.Literals.BERECHNETE_ATTRIBUTE__MENSCHENKENNTNIS,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Selbstbeherrschung feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelbstbeherrschungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BerechneteAttribute_selbstbeherrschung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BerechneteAttribute_selbstbeherrschung_feature", "_UI_BerechneteAttribute_type"),
                 Shr5Package.Literals.BERECHNETE_ATTRIBUTE__SELBSTBEHERRSCHUNG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zustand Koerperlich feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZustandKoerperlichPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KoerperPersona_zustandKoerperlich_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KoerperPersona_zustandKoerperlich_feature", "_UI_KoerperPersona_type"),
                 Shr5Package.Literals.KOERPER_PERSONA__ZUSTAND_KOERPERLICH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zustand Geistig feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZustandGeistigPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KoerperPersona_zustandGeistig_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KoerperPersona_zustandGeistig_feature", "_UI_KoerperPersona_type"),
                 Shr5Package.Literals.KOERPER_PERSONA__ZUSTAND_GEISTIG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS);
            childrenFeatures.add(Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN);
        }
        return childrenFeatures;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((KoerperPersona)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_KoerperPersona_type") :
            getString("_UI_KoerperPersona_type") + " " + label;
    }

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(KoerperPersona.class)) {
            case Shr5Package.KOERPER_PERSONA__PANZER:
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX:
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX:
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GRENZE:
            case Shr5Package.KOERPER_PERSONA__ERRINERUNGSVERMOEGEN:
            case Shr5Package.KOERPER_PERSONA__MENSCHENKENNTNIS:
            case Shr5Package.KOERPER_PERSONA__SELBSTBEHERRSCHUNG:
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_KOERPERLICH:
            case Shr5Package.KOERPER_PERSONA__ZUSTAND_GEISTIG:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
            case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

	/**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS,
                 Shr5Factory.eINSTANCE.createCyberware()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS,
                 Shr5Factory.eINSTANCE.createBioWare()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN,
                 Shr5Factory.eINSTANCE.createPersonaEigenschaft()));
    }

}
