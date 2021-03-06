/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpposedSkillTestCmdItemProvider extends SkillTestCmdItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpposedSkillTestCmdItemProvider(AdapterFactory adapterFactory) {
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

            addObjectPropertyDescriptor(object);
            addObjectSkillPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addObjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor// createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_OpposedSkillTestCmd_object_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_OpposedSkillTestCmd_object_feature", "_UI_OpposedSkillTestCmd_type"),
                        GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT, true, false, true, null, null, null) {
                    @Override
                    protected Collection<?> getComboBoxObjects(Object object) {
                        if (object instanceof OpposedSkillTestCmd) {
                            OpposedSkillTestCmd os = (OpposedSkillTestCmd)object;
                            CombatTurn ct = GameplayTools.getCombatTurn(os);
                            if (ct != null)
                                return GameplayTools.getActiveCharacters(ct.getCombatants());
                        }
                        return super.getComboBoxObjects(object);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Object Skill feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addObjectSkillPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_OpposedSkillTestCmd_objectSkill_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_OpposedSkillTestCmd_objectSkill_feature", "_UI_OpposedSkillTestCmd_type"),
                 GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns OpposedSkillTestCmd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/OpposedSkillTestCmd"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public String getText(Object object) {
        OpposedSkillTestCmd opposedSkillTestCmd = (OpposedSkillTestCmd)object;

        String defaultVaule = getString("_UI_unset");
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String label_subject = Shr5EditingTools.getLabelForEObject(factory, defaultVaule, opposedSkillTestCmd.getSubject());
        String label_opponent = Shr5EditingTools.getLabelForEObject(factory, defaultVaule, opposedSkillTestCmd.getObject());
        String label_skill = Shr5EditingTools.getLabelForEObject(factory, defaultVaule, opposedSkillTestCmd.getSkill());

        return getString("_UI_OpposedSkillTestCmd_type_text", new Object[]{ label_subject, label_opponent, label_skill });
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
