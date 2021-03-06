/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.util.ShadowrunToolsTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>shr5</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5Tests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public static Test suite() {
        TestSuite suite = new Shr5Tests("shr5 Tests");
        suite.addTestSuite(MudanPersonaTest.class);
        suite.addTestSuite(KiAdeptTest.class);
        suite.addTestSuite(MagierTest.class);
        suite.addTestSuite(MysticAdeptTest.class);
        suite.addTestSuite(AspektMagierTest.class);
        suite.addTestSuite(TechnomancerTest.class);
        suite.addTestSuite(SpriteTest.class);
        suite.addTestSuite(ShadowrunToolsTest.class);
        suite.addTestSuite(BioWareTest.class);
        suite.addTestSuite(CyberwareTest.class);
        suite.addTestSuite(BodenfahrzeugTest.class);
        suite.addTestSuite(PassagierFahrzeugTest.class);
        suite.addTestSuite(MunitionTest.class);
        suite.addTestSuite(VertragTest.class);
        suite.addTestSuite(GeistTest.class);
        suite.addTestSuite(CredstickTest.class);
        suite.addTestSuite(CommlinkTest.class);
        suite.addTestSuite(CyberdeckTest.class);
        suite.addTestSuite(RiggerCommandConsoleTest.class);
        suite.addTestSuite(DrohneTest.class);
        suite.addTestSuite(ConsumerSoftTest.class);
        suite.addTestSuite(AutoSoftTest.class);
        suite.addTestSuite(SkillSoftTest.class);
        suite.addTestSuite(TutorsoftTest.class);
        suite.addTestSuite(SoftwareAgentTest.class);
        suite.addTestSuite(CommonProgramTest.class);
        suite.addTestSuite(LifestyleTest.class);
        suite.addTestSuite(LifestyleOptionTest.class);
        suite.addTestSuite(PercentLifestyleOptionTest.class);
        suite.addTestSuite(PersonalAreaNetworkTest.class);
        suite.addTestSuite(QiFokusTest.class);
        suite.addTestSuite(WaffenFokusTest.class);
        suite.addTestSuite(MagieFokusTest.class);
        suite.addTestSuite(DrugTest.class);
        suite.addTestSuite(ToxinTest.class);
        suite.addTestSuite(HostTest.class);

        suite.addTestSuite(CyberwareEnhancementTest.class);
        suite.addTestSuite(MagazinTest.class);
        suite.addTestSuite(FernkampfwaffeModifikatorTest.class);
        suite.addTestSuite(ShoppingTransactionTest.class);
        suite.addTestSuite(KleidungTest.class);
        suite.addTestSuite(KleindungsModifikatorTest.class);
        suite.addTestSuite(SensorArrayTest.class);
        suite.addTestSuite(SensorTest.class);
        suite.addTestSuite(WeaponMountTest.class);
        suite.addTestSuite(FahrzeugErweiterungTest.class);
   
        suite.addTestSuite(WurfwaffeTest.class);
        suite.addTestSuite(MiniGrenateTest.class);
        suite.addTestSuite(GranateTest.class);

        // suite.addTestSuite(HostTest.class);

        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shr5Tests(String name) {
        super(name);
    }

} // Shr5Tests
