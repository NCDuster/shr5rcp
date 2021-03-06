/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.text.DateFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.ContractPayment;
import de.urszeidler.eclipse.shr5Management.DiaryEntry;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.ContractPayment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractPaymentItemProvider extends DiaryEntryItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContractPaymentItemProvider(AdapterFactory adapterFactory) {
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

            addContractToPayPropertyDescriptor(object);
            addPayedPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Contract To Pay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContractToPayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ContractPayment_contractToPay_feature"),
                 getString("_UI_ContractPayment_contractToPay_description"),
                 Shr5managementPackage.Literals.CONTRACT_PAYMENT__CONTRACT_TO_PAY,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Payed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPayedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ContractPayment_payed_feature"),
                 getString("_UI_ContractPayment_payed_description"),
                 Shr5managementPackage.Literals.CONTRACT_PAYMENT__PAYED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ContractPayment.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ContractPayment"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        ContractPayment cp = (ContractPayment)object;
        String format = "";
        if (((DiaryEntry)object).getDate()!=null)
            format  = DateFormat.getDateInstance(DateFormat.SHORT).format(((DiaryEntry)object).getDate());

        final ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        final String unset = getString("_UI_Unset_text");      
        String text = Shr5EditingTools.getLabelForEObject(factory, unset, cp.getContractToPay());

        return String.format("%s: %s payed: %b", format,text,cp.isPayed());
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

        switch (notification.getFeatureID(ContractPayment.class)) {
            case Shr5managementPackage.CONTRACT_PAYMENT__PAYED:
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

}
