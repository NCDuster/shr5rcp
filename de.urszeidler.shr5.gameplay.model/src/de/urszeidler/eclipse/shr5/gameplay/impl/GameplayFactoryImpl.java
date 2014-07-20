/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameplayFactoryImpl extends EFactoryImpl implements GameplayFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static GameplayFactory init() {
        try {
            GameplayFactory theGameplayFactory = (GameplayFactory)EPackage.Registry.INSTANCE.getEFactory(GameplayPackage.eNS_URI);
            if (theGameplayFactory != null) {
                return theGameplayFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new GameplayFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case GameplayPackage.EXECUTION_STACK: return createExecutionStack();
            case GameplayPackage.DAMAGE_TEST: return createDamageTest();
            case GameplayPackage.SKILL_TEST_CMD: return createSkillTestCmd();
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD: return createOpposedSkillTestCmd();
            case GameplayPackage.INITATIVE: return createInitative();
            case GameplayPackage.EXECUTION_PROTOCOL: return createExecutionProtocol();
            case GameplayPackage.COMBAT_TURN: return createCombatTurn();
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD: return createExtendetSkillTestCmd();
            case GameplayPackage.DEFENS_TEST_CMD: return createDefensTestCmd();
            case GameplayPackage.SUCCES_TEST_CMD: return createSuccesTestCmd();
            case GameplayPackage.INITATIVE_PASS: return createInitativePass();
            case GameplayPackage.COMPLEX_ACTION: return createComplexAction();
            case GameplayPackage.SIMPLE_ACTION: return createSimpleAction();
            case GameplayPackage.SIMPLE_ACTIONS: return createSimpleActions();
            case GameplayPackage.FREE_ACTION: return createFreeAction();
            case GameplayPackage.INTERRUPT_ACTION: return createInterruptAction();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionStack createExecutionStack() {
        ExecutionStackImpl executionStack = new ExecutionStackImpl();
        return executionStack;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DamageTest createDamageTest() {
        DamageTestImpl damageTest = new DamageTestImpl();
        return damageTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SkillTestCmd createSkillTestCmd() {
        SkillTestCmdImpl skillTestCmd = new SkillTestCmdImpl();
        return skillTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpposedSkillTestCmd createOpposedSkillTestCmd() {
        OpposedSkillTestCmdImpl opposedSkillTestCmd = new OpposedSkillTestCmdImpl();
        return opposedSkillTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Initative createInitative() {
        InitativeImpl initative = new InitativeImpl();
        return initative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionProtocol createExecutionProtocol() {
        ExecutionProtocolImpl executionProtocol = new ExecutionProtocolImpl();
        return executionProtocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombatTurn createCombatTurn() {
        CombatTurnImpl combatTurn = new CombatTurnImpl();
        return combatTurn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendetSkillTestCmd createExtendetSkillTestCmd() {
        ExtendetSkillTestCmdImpl extendetSkillTestCmd = new ExtendetSkillTestCmdImpl();
        return extendetSkillTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefensTestCmd createDefensTestCmd() {
        DefensTestCmdImpl defensTestCmd = new DefensTestCmdImpl();
        return defensTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SuccesTestCmd createSuccesTestCmd() {
        SuccesTestCmdImpl succesTestCmd = new SuccesTestCmdImpl();
        return succesTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitativePass createInitativePass() {
        InitativePassImpl initativePass = new InitativePassImpl();
        return initativePass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexAction createComplexAction() {
        ComplexActionImpl complexAction = new ComplexActionImpl();
        return complexAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleAction createSimpleAction() {
        SimpleActionImpl simpleAction = new SimpleActionImpl();
        return simpleAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleActions createSimpleActions() {
        SimpleActionsImpl simpleActions = new SimpleActionsImpl();
        return simpleActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FreeAction createFreeAction() {
        FreeActionImpl freeAction = new FreeActionImpl();
        return freeAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterruptAction createInterruptAction() {
        InterruptActionImpl interruptAction = new InterruptActionImpl();
        return interruptAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayPackage getGameplayPackage() {
        return (GameplayPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static GameplayPackage getPackage() {
        return GameplayPackage.eINSTANCE;
    }

} //GameplayFactoryImpl
