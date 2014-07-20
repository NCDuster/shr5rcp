/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;

/**
 * @author urs
 *
 */
public class ActionPhaseComposite extends Composite implements IValueChangeListener {
    private DataBindingContext m_bindingContext;

    private WritableValue nameable = new WritableValue();
   // private Beschreibbar character = Shr5Factory.eINSTANCE.createBioWare();
            

    
	private Group mainGroup = null;
	private Label label_image = null;
	private Label label_name = null;
	private Button button_use = null;
	private Button button_use1 = null;
	private Button button_change = null;
	private String grouname;
	private ToolBar actionBar;

	public ActionPhaseComposite(Composite parent, int style,String groupName) {
		super(parent, style);
		this.grouname = groupName;
		nameable.addValueChangeListener(this);
		initialize();
	}

	private void initialize() {
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.horizontalSpacing = 0;
		gridLayout1.marginWidth = 0;
		gridLayout1.marginHeight = 0;
		gridLayout1.verticalSpacing = 0;
		createMainGroup();
		this.setLayout(gridLayout1);
		this.pack();
		
	}

	/**
	 * This method initializes mainGroup	
	 *
	 */
	private void createMainGroup() {
		GridData gridData3 = new GridData();
		gridData3.widthHint = 91;
		gridData3.minimumWidth = 20;
		gridData3.verticalAlignment = GridData.CENTER;
		gridData3.grabExcessHorizontalSpace = true;
		gridData3.horizontalAlignment = SWT.LEFT;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = 5;
		gridLayout.marginHeight = 5;
		gridLayout.horizontalSpacing = 0;
		GridData gridData2 = new GridData();
		gridData2.heightHint = 32;
		gridData2.widthHint = 32;
		GridData gridData = new GridData();
		gridData.widthHint = 193;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = false;
		gridData.verticalAlignment = GridData.FILL;
		mainGroup = new Group(this, SWT.NONE);

		mainGroup.setText(grouname);
		mainGroup.setLayout(gridLayout);
		mainGroup.setLayoutData(gridData);
		label_image = new Label(mainGroup, SWT.BORDER);
		label_image.setText("");
		label_image.setLayoutData(gridData2);
		label_name = new Label(mainGroup, SWT.NONE);
		label_name.setAlignment(SWT.RIGHT);
		label_name.setText("");
		label_name.setLayoutData(gridData3);
		
		actionBar = new ToolBar(mainGroup, SWT.FLAT | SWT.LEFT);
		
		ToolItem toolItem = new ToolItem(actionBar, SWT.NONE);
		toolItem.setText("1");
		
		ToolItem toolItem_1 = new ToolItem(actionBar, SWT.NONE);
		toolItem_1.setText("2");
		m_bindingContext = initDataBindings();
	}

	public Button getButton_change() {
		return button_change;
	}

	public Button getButton_use() {
		return button_use;
	}

	public Button getButton_use1() {
		return button_use1;
	}

	public Label getLabel_image() {
		return label_image;
	}

	public Label getLabel_name() {
		return label_name;
	}
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
         //
        IObservableValue observeTextLabel_nameObserveWidget_1 = WidgetProperties.text().observe(label_name);
        IObservableValue characterNameObserveValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(),nameable, Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextLabel_nameObserveWidget_1, characterNameObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        
        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(label_image);
        IObservableValue observeValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), nameable, Shr5Package.Literals.BESCHREIBBAR__IMAGE);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class,32);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //

        return bindingContext;
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        updateToolbar();        
    }

    private void updateToolbar() {
        // TODO Auto-generated method stub
        
    }

    public void setNameable(Beschreibbar nameable) {
        this.nameable.setValue(nameable);
    }
}