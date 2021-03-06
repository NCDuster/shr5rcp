/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LifestyleToStartMoneyItemProvider
    extends ItemProviderAdapter
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
    public LifestyleToStartMoneyItemProvider(AdapterFactory adapterFactory) {
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

            addNumberOfWPropertyDescriptor(object);
            addMoneyFactorPropertyDescriptor(object);
            addLifeStylesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Number Of W feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumberOfWPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LifestyleToStartMoney_numberOfW_feature"),
                 getString("_UI_LifestyleToStartMoney_numberOfW_description"),
                 Shr5managementPackage.Literals.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Money Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMoneyFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LifestyleToStartMoney_moneyFactor_feature"),
                 getString("_UI_LifestyleToStartMoney_moneyFactor_description"),
                 Shr5managementPackage.Literals.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Life Styles feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLifeStylesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LifestyleToStartMoney_lifeStyles_feature"),
                 getString("_UI_LifestyleToStartMoney_lifeStyles_description"),
                 Shr5managementPackage.Literals.LIFESTYLE_TO_START_MONEY__LIFE_STYLES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns LifestyleToStartMoney.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/LifestyleToStartMoney"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        LifestyleToStartMoney lifestyleToStartMoney = (LifestyleToStartMoney)object;
        EList<Lifestyle> lifeStyles = lifestyleToStartMoney.getLifeStyles();
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory();
        if (factory != null && !lifeStyles.isEmpty()) {
            IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(lifeStyles.get(0),
                    IItemLabelProvider.class);
            if (labelprovider != null)
                return String.format("%s %s [%d dice x %d]", getString("_UI_LifestyleToStartMoney_type"),
                        labelprovider.getText(lifeStyles.get(0))
                        ,lifestyleToStartMoney.getNumberOfW()
                        ,lifestyleToStartMoney.getMoneyFactor())   ;

        }
        return getString("_UI_LifestyleToStartMoney_type") + " " + lifestyleToStartMoney.getNumberOfW();
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

        switch (notification.getFeatureID(LifestyleToStartMoney.class)) {
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__NUMBER_OF_W:
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY__MONEY_FACTOR:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Shr5ManagementEditPlugin.INSTANCE;
    }

}
