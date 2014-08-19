/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.urszeidler.eclipse.shr5.gameplay.util.GameplayAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GameplayItemProviderAdapterFactory extends GameplayAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionStackItemProvider executionStackItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExecutionStackAdapter() {
        if (executionStackItemProvider == null) {
            executionStackItemProvider = new ExecutionStackItemProvider(this);
        }

        return executionStackItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.DamageTest} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DamageTestItemProvider damageTestItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.DamageTest}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDamageTestAdapter() {
        if (damageTestItemProvider == null) {
            damageTestItemProvider = new DamageTestItemProvider(this);
        }

        return damageTestItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SkillTestCmdItemProvider skillTestCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSkillTestCmdAdapter() {
        if (skillTestCmdItemProvider == null) {
            skillTestCmdItemProvider = new SkillTestCmdItemProvider(this);
        }

        return skillTestCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpposedSkillTestCmdItemProvider opposedSkillTestCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOpposedSkillTestCmdAdapter() {
        if (opposedSkillTestCmdItemProvider == null) {
            opposedSkillTestCmdItemProvider = new OpposedSkillTestCmdItemProvider(this);
        }

        return opposedSkillTestCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.Initative} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InitativeItemProvider initativeItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.Initative}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInitativeAdapter() {
        if (initativeItemProvider == null) {
            initativeItemProvider = new InitativeItemProvider(this);
        }

        return initativeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionProtocolItemProvider executionProtocolItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExecutionProtocolAdapter() {
        if (executionProtocolItemProvider == null) {
            executionProtocolItemProvider = new ExecutionProtocolItemProvider(this);
        }

        return executionProtocolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombatTurnItemProvider combatTurnItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCombatTurnAdapter() {
        if (combatTurnItemProvider == null) {
            combatTurnItemProvider = new CombatTurnItemProvider(this);
        }

        return combatTurnItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendetSkillTestCmdItemProvider extendetSkillTestCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExtendetSkillTestCmdAdapter() {
        if (extendetSkillTestCmdItemProvider == null) {
            extendetSkillTestCmdItemProvider = new ExtendetSkillTestCmdItemProvider(this);
        }

        return extendetSkillTestCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefensTestCmdItemProvider defensTestCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDefensTestCmdAdapter() {
        if (defensTestCmdItemProvider == null) {
            defensTestCmdItemProvider = new DefensTestCmdItemProvider(this);
        }

        return defensTestCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SuccesTestCmdItemProvider succesTestCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSuccesTestCmdAdapter() {
        if (succesTestCmdItemProvider == null) {
            succesTestCmdItemProvider = new SuccesTestCmdItemProvider(this);
        }

        return succesTestCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.InitativePass} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InitativePassItemProvider initativePassItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.InitativePass}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInitativePassAdapter() {
        if (initativePassItemProvider == null) {
            initativePassItemProvider = new InitativePassItemProvider(this);
        }

        return initativePassItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.ComplexAction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexActionItemProvider complexActionItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.ComplexAction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createComplexActionAdapter() {
        if (complexActionItemProvider == null) {
            complexActionItemProvider = new ComplexActionItemProvider(this);
        }

        return complexActionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.SimpleAction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleActionItemProvider simpleActionItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SimpleAction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSimpleActionAdapter() {
        if (simpleActionItemProvider == null) {
            simpleActionItemProvider = new SimpleActionItemProvider(this);
        }

        return simpleActionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleActionsItemProvider simpleActionsItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSimpleActionsAdapter() {
        if (simpleActionsItemProvider == null) {
            simpleActionsItemProvider = new SimpleActionsItemProvider(this);
        }

        return simpleActionsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.FreeAction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FreeActionItemProvider freeActionItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.FreeAction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFreeActionAdapter() {
        if (freeActionItemProvider == null) {
            freeActionItemProvider = new FreeActionItemProvider(this);
        }

        return freeActionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterruptActionItemProvider interruptActionItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInterruptActionAdapter() {
        if (interruptActionItemProvider == null) {
            interruptActionItemProvider = new InterruptActionItemProvider(this);
        }

        return interruptActionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetFeatureCommandItemProvider setFeatureCommandItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSetFeatureCommandAdapter() {
        if (setFeatureCommandItemProvider == null) {
            setFeatureCommandItemProvider = new SetFeatureCommandItemProvider(this);
        }

        return setFeatureCommandItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeeleAttackCmdItemProvider meeleAttackCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMeeleAttackCmdAdapter() {
        if (meeleAttackCmdItemProvider == null) {
            meeleAttackCmdItemProvider = new MeeleAttackCmdItemProvider(this);
        }

        return meeleAttackCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RangedAttackCmdItemProvider rangedAttackCmdItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRangedAttackCmdAdapter() {
        if (rangedAttackCmdItemProvider == null) {
            rangedAttackCmdItemProvider = new RangedAttackCmdItemProvider(this);
        }

        return rangedAttackCmdItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5.gameplay.Intervall} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervallItemProvider intervallItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.Intervall}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIntervallAdapter() {
        if (intervallItemProvider == null) {
            intervallItemProvider = new IntervallItemProvider(this);
        }

        return intervallItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (executionStackItemProvider != null) executionStackItemProvider.dispose();
        if (damageTestItemProvider != null) damageTestItemProvider.dispose();
        if (skillTestCmdItemProvider != null) skillTestCmdItemProvider.dispose();
        if (opposedSkillTestCmdItemProvider != null) opposedSkillTestCmdItemProvider.dispose();
        if (initativeItemProvider != null) initativeItemProvider.dispose();
        if (executionProtocolItemProvider != null) executionProtocolItemProvider.dispose();
        if (combatTurnItemProvider != null) combatTurnItemProvider.dispose();
        if (extendetSkillTestCmdItemProvider != null) extendetSkillTestCmdItemProvider.dispose();
        if (defensTestCmdItemProvider != null) defensTestCmdItemProvider.dispose();
        if (succesTestCmdItemProvider != null) succesTestCmdItemProvider.dispose();
        if (initativePassItemProvider != null) initativePassItemProvider.dispose();
        if (complexActionItemProvider != null) complexActionItemProvider.dispose();
        if (simpleActionItemProvider != null) simpleActionItemProvider.dispose();
        if (simpleActionsItemProvider != null) simpleActionsItemProvider.dispose();
        if (freeActionItemProvider != null) freeActionItemProvider.dispose();
        if (interruptActionItemProvider != null) interruptActionItemProvider.dispose();
        if (setFeatureCommandItemProvider != null) setFeatureCommandItemProvider.dispose();
        if (meeleAttackCmdItemProvider != null) meeleAttackCmdItemProvider.dispose();
        if (rangedAttackCmdItemProvider != null) rangedAttackCmdItemProvider.dispose();
        if (intervallItemProvider != null) intervallItemProvider.dispose();
    }

}
