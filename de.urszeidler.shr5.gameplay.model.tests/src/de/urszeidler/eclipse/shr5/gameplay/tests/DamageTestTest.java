/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Zustand;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Damage Test</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DamageTestTest extends ProbeCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DamageTestTest.class);
    }

    /**
     * Constructs a new Damage Test test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DamageTestTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Damage Test test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DamageTest getFixture() {
        return (DamageTest)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createDamageTest());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute() <em>Can Execute</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @generated not
     */
    public void testIsCanExecute() {
        assertFalse(getFixture().isCanExecute());
        getFixture().setSubject(GameplayTools.createRuntimeCharacter());
        assertTrue(getFixture().isCanExecute());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();

        getFixture().setSubject(runtimeCharacter);
        getFixture().setDv(1);
        getFixture().setDamage("10P");
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(10);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertNull(getFixture().getEffectiveDamage());        
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_OneDamage() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();

        getFixture().setSubject(runtimeCharacter);
        getFixture().setDv(1);
        getFixture().setDamage("10P");
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(9);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals("1P", getFixture().getEffectiveDamage());
        assertEquals("One damage expected",1,runtimeCharacter.getPhysicalDamage());
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_TenDamage() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        runtimeCharacter.getCharacter().getPersona().setKonstitutionBasis(2);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setDv(1);
        getFixture().setDamage("10P");
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(0);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals("10P", getFixture().getEffectiveDamage());
        assertEquals("Ten damage expected",10,runtimeCharacter.getPhysicalDamage());
        assertEquals("Ten damage expected",Zustand.STERBEND,runtimeCharacter.getZustand());
    }

    public void testRedo_OneDamage_M() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        Kleidung kleidung = Shr5Factory.eINSTANCE.createKleidung();
        kleidung.setRuestung(11);
        runtimeCharacter.setArmor(kleidung);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setDamage("10P");
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(9);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals("1M", getFixture().getEffectiveDamage());
        assertEquals("One damage expected",1,runtimeCharacter.getMentalDamage());
    }

    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated not
     */
    public void testUndo() {
        // fail();
    }

} //DamageTestTest
