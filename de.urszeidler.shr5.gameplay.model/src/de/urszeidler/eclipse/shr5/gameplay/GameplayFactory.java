/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage
 * @generated
 */
public interface GameplayFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GameplayFactory eINSTANCE = de.urszeidler.eclipse.shr5.gameplay.impl.GameplayFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Execution Stack</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Stack</em>'.
     * @generated
     */
    ExecutionStack createExecutionStack();

    /**
     * Returns a new object of class '<em>Damage Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Damage Test</em>'.
     * @generated
     */
    DamageTest createDamageTest();

    /**
     * Returns a new object of class '<em>Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Skill Test Cmd</em>'.
     * @generated
     */
    SkillTestCmd createSkillTestCmd();

    /**
     * Returns a new object of class '<em>Opposed Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opposed Skill Test Cmd</em>'.
     * @generated
     */
    OpposedSkillTestCmd createOpposedSkillTestCmd();

    /**
     * Returns a new object of class '<em>Initative</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Initative</em>'.
     * @generated
     */
    Initative createInitative();

    /**
     * Returns a new object of class '<em>Execution Protocol</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Protocol</em>'.
     * @generated
     */
    ExecutionProtocol createExecutionProtocol();

    /**
     * Returns a new object of class '<em>Combat Turn</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combat Turn</em>'.
     * @generated
     */
    CombatTurn createCombatTurn();

    /**
     * Returns a new object of class '<em>Extendet Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extendet Skill Test Cmd</em>'.
     * @generated
     */
    ExtendetSkillTestCmd createExtendetSkillTestCmd();

    /**
     * Returns a new object of class '<em>Defens Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Defens Test Cmd</em>'.
     * @generated
     */
    DefensTestCmd createDefensTestCmd();

    /**
     * Returns a new object of class '<em>Succes Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Succes Test Cmd</em>'.
     * @generated
     */
    SuccesTestCmd createSuccesTestCmd();

    /**
     * Returns a new object of class '<em>Initative Pass</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Initative Pass</em>'.
     * @generated
     */
    InitativePass createInitativePass();

    /**
     * Returns a new object of class '<em>Complex Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Complex Action</em>'.
     * @generated
     */
    ComplexAction createComplexAction();

    /**
     * Returns a new object of class '<em>Simple Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Action</em>'.
     * @generated
     */
    SimpleAction createSimpleAction();

    /**
     * Returns a new object of class '<em>Simple Actions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Actions</em>'.
     * @generated
     */
    SimpleActions createSimpleActions();

    /**
     * Returns a new object of class '<em>Free Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Free Action</em>'.
     * @generated
     */
    FreeAction createFreeAction();

    /**
     * Returns a new object of class '<em>Interrupt Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interrupt Action</em>'.
     * @generated
     */
    InterruptAction createInterruptAction();

    /**
     * Returns a new object of class '<em>Set Feature Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Feature Command</em>'.
     * @generated
     */
    SetFeatureCommand createSetFeatureCommand();

    /**
     * Returns a new object of class '<em>Meele Attack Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meele Attack Cmd</em>'.
     * @generated
     */
    MeeleAttackCmd createMeeleAttackCmd();

    /**
     * Returns a new object of class '<em>Ranged Attack Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ranged Attack Cmd</em>'.
     * @generated
     */
    RangedAttackCmd createRangedAttackCmd();

    /**
     * Returns a new object of class '<em>Intervall</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Intervall</em>'.
     * @generated
     */
    Intervall createIntervall();

    /**
     * Returns a new object of class '<em>Probe Mod</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Probe Mod</em>'.
     * @generated
     */
    ProbeMod createProbeMod();

    /**
     * Returns a new object of class '<em>Set Extendet Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Extendet Data</em>'.
     * @generated
     */
    SetExtendetData createSetExtendetData();

    /**
     * Returns a new object of class '<em>Semantic Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Semantic Action</em>'.
     * @generated
     */
    SemanticAction createSemanticAction();

    /**
     * Returns a new object of class '<em>Drain Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Drain Command</em>'.
     * @generated
     */
    DrainCommand createDrainCommand();

    /**
     * Returns a new object of class '<em>Combat Spell Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combat Spell Cmd</em>'.
     * @generated
     */
    CombatSpellCmd createCombatSpellCmd();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GameplayPackage getGameplayPackage();

} //GameplayFactory
