package de.urszeidler.shr5.ecp.editor.pages;

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.ShoppingTransaction;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.TransferAmount;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.SimpleTreeTableWidget;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.runtime.ui.views.SimpleListContenProvider;

import org.eclipse.swt.widgets.TableColumn;

public class TransactionsPage extends AbstractShr5Page<ShoppingTransaction> {
    private CredstickTransaction object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Text txtSearch;
    private Table table_1;
    private TableViewer tableViewer_1;
    private PatternFilter nameFilter;

    private class ItemLabelProvider extends DefaultLabelProvider implements ITableLabelProvider {

        @Override
        public Image getColumnImage(Object element, int columnIndex) {
            if (columnIndex == 0)
                return getImage(element);
            if (columnIndex == 1)
                if (element instanceof Quelle) {
                    Quelle q = (Quelle)element;
                    if (q.getSrcBook() != null)
                        return getImage(q.getSrcBook());
                }

            return null;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {

            switch (columnIndex) {
                case 0:
                    return getText(element);
                case 1:
                    if (element instanceof Quelle) {
                        Quelle q = (Quelle)element;
                        if (q.getSrcBook() != null)
                            return getText(q.getSrcBook());
                    }
                    return "unset";
                case 2:
                    GeldWert geldWert = (GeldWert)element;
                    if (geldWert.getWert() == null)
                        return "0";
                    return geldWert.getWert().toString();

                default:
                    break;
            }
            return null;
        }

    }

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public TransactionsPage(String id, String title) {
        super(id, title);
    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public TransactionsPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createShoppingTransaction();
    }

    public TransactionsPage(FormEditor editor, String id, String title, CredstickTransaction object) {
        super(editor, id, title);
        this.object = object;

    }

    public TransactionsPage(FormEditor editor, String id, String title, CredstickTransaction object, EditingDomain editingDomain,
            ReferenceManager manager1) {
        super(editor, id, title, manager1);
        this.object = object;
        this.editingDomain = editingDomain;
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        // ------------
        Section sctnBuyItems = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnBuyItems.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnBuyItems);
        sctnBuyItems.setText("Buy items");
        sctnBuyItems.setExpanded(true);

        Composite composite_1 = managedForm.getToolkit().createComposite(sctnBuyItems, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnBuyItems.setClient(composite_1);
        composite_1.setLayout(new GridLayout(1, false));

        Composite composite_3 = managedForm.getToolkit().createComposite(composite_1, SWT.NONE);
        composite_3.setLayout(new GridLayout(1, false));
        composite_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        composite_3.setBounds(0, 0, 64, 64);
        managedForm.getToolkit().paintBordersFor(composite_3);

        Composite composite_2 = new Composite(composite_3, SWT.NONE);
        GridData gd_composite_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_composite_2.widthHint = 353;
        composite_2.setLayoutData(gd_composite_2);
        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);
        composite_2.setLayout(new GridLayout(5, false));

        Label lblFind = new Label(composite_2, SWT.NONE);
        lblFind.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().adapt(lblFind, true, true);
        lblFind.setText("find");

        nameFilter = new PatternFilter() {
            @Override
            protected boolean isParentMatch(Viewer viewer, Object element) {
                return viewer instanceof AbstractTreeViewer && super.isParentMatch(viewer, element);
            }
        };

        txtSearch = new Text(composite_2, SWT.BORDER);
        txtSearch.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                nameFilter.setPattern(txtSearch.getText());
                if (tableViewer_1 != null)
                    tableViewer_1.refresh();
            }
        });
        txtSearch.setText("search");
        txtSearch.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(txtSearch, true, true);
        new Label(composite_2, SWT.NONE);
        new Label(composite_2, SWT.NONE);

        ToolBar toolBar = new ToolBar(composite_2, SWT.FLAT | SWT.RIGHT);
        toolBar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);

        ToolItem tltmAdd = new ToolItem(toolBar, SWT.NONE);
        tltmAdd.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                StructuredSelection selection = (StructuredSelection)tableViewer_1.getSelection();
                for (EObject eo : ShadowrunTools.toIterable(selection.iterator())) {
                    ((ShoppingTransaction)object).getItems().add((GeldWert)eo);
                }
            }
        });
        tltmAdd.setText("add");

        ToolItem tltmBuy = new ToolItem(toolBar, SWT.NONE);
        tltmBuy.setText("buy");

        tableViewer_1 = new TableViewer(composite_3, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
        table_1 = tableViewer_1.getTable();
        table_1.setLinesVisible(true);
        table_1.setHeaderVisible(true);
        GridData gd_table_1 = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_table_1.heightHint = 300;
        table_1.setLayoutData(gd_table_1);
        managedForm.getToolkit().paintBordersFor(table_1);

        TableColumn tblclmnName = new TableColumn(table_1, SWT.LEFT);
        tblclmnName.setWidth(300);
        tblclmnName.setText("name");

        TableColumn tblclmnSource = new TableColumn(table_1, SWT.NONE);
        tblclmnSource.setWidth(100);
        tblclmnSource.setText("source");

        TableColumn tblclmnPrice = new TableColumn(table_1, SWT.NONE);
        tblclmnPrice.setResizable(false);
        tblclmnPrice.setWidth(100);
        tblclmnPrice.setText("price");

        tableViewer_1.setContentProvider(new SimpleListContenProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance()
                .getAdapterFactory())));

        tableViewer_1.setLabelProvider(new ItemLabelProvider());
        tableViewer_1.setInput(getAllObjects());

        tableViewer_1.addFilter(nameFilter);

        // ------------------------------------
        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__AMOUNT, composite, new LabelMoneyEntry());
        emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__DATE, composite, new DateEntryFactory(toolkit));
        emfFormBuilder.addTextEntry(Shr5Package.Literals.CREDSTICK_TRANSACTION__DESCRIPTION, composite);

        if (object instanceof ShoppingTransaction) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SHOPPING_TRANSACTION__FEE, composite);
            SimpleTreeTableWidget treeTableWidgetEigenschaften = new SimpleTreeTableWidget(composite, "", SWT.NONE, object,
                    Shr5Package.Literals.SHOPPING_TRANSACTION__ITEMS, toolkit, mananger, editingDomain, this);
            GridData layoutData = new GridData(SWT.FILL, SWT.TOP, false, true, 3, 1);
            layoutData.heightHint = 150;
            treeTableWidgetEigenschaften.setLayoutData(layoutData);
            managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
            managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);

        } else if (object instanceof TransferAmount) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.TRANSFER_AMOUNT__SOURCE, composite);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.TRANSFER_AMOUNT__DEST, composite);

        }

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);
    }

    /**
     * @return
     */
    private List<EObject> getAllObjects() {
        return ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof GeldWert) {
                    return true;
                }
                return false;
            }
        });
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
}