/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Factory
 * @model kind="package"
 * @generated
 */
public interface Shr5Package extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "shr5";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://urszeidler.de/shr5/1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "shr5";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Shr5Package eINSTANCE = de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl.init();

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Beschreibbar <em>Beschreibbar</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Beschreibbar
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBeschreibbar()
     * @generated
     */
	int BESCHREIBBAR = 0;

	/**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BESCHREIBBAR__BESCHREIBUNG = 0;

	/**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BESCHREIBBAR__IMAGE = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BESCHREIBBAR__NAME = 2;

	/**
     * The number of structural features of the '<em>Beschreibbar</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BESCHREIBBAR_FEATURE_COUNT = 3;

	/**
     * The number of operations of the '<em>Beschreibbar</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BESCHREIBBAR_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Quelle <em>Quelle</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Quelle
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getQuelle()
     * @generated
     */
	int QUELLE = 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl <em>Source Book</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SourceBookImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSourceBook()
     * @generated
     */
	int SOURCE_BOOK = 2;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl <em>Abstrakt Persona</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstraktPersona()
     * @generated
     */
	int ABSTRAKT_PERSONA = 3;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl <em>Abstrakt Gegenstand</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstraktGegenstand()
     * @generated
     */
	int ABSTRAKT_GEGENSTAND = 11;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.GegenstandImpl <em>Gegenstand</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.GegenstandImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGegenstand()
     * @generated
     */
	int GEGENSTAND = 4;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.GeldWert <em>Geld Wert</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGeldWert()
     * @generated
     */
	int GELD_WERT = 5;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl <em>Reichweite</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.ReichweiteImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getReichweite()
     * @generated
     */
	int REICHWEITE = 6;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl <em>Attribut Modifikator Wert</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAttributModifikatorWert()
     * @generated
     */
	int ATTRIBUT_MODIFIKATOR_WERT = 7;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Modifizierbar <em>Modifizierbar</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Modifizierbar
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModifizierbar()
     * @generated
     */
	int MODIFIZIERBAR = 8;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ModifikatorAttribute <em>Modifikator Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ModifikatorAttribute
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModifikatorAttribute()
     * @generated
     */
    int MODIFIKATOR_ATTRIBUTE = 83;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute <em>Koerperliche Attribute</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKoerperlicheAttribute()
     * @generated
     */
	int KOERPERLICHE_ATTRIBUTE = 9;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute <em>Spezielle Attribute</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSpezielleAttribute()
     * @generated
     */
	int SPEZIELLE_ATTRIBUTE = 10;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl <em>Abstakt Waffe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstaktWaffe()
     * @generated
     */
	int ABSTAKT_WAFFE = 13;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AbstaktFernKampfwaffeImpl <em>Abstakt Fern Kampfwaffe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AbstaktFernKampfwaffeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstaktFernKampfwaffe()
     * @generated
     */
	int ABSTAKT_FERN_KAMPFWAFFE = 12;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.NahkampfwaffeImpl <em>Nahkampfwaffe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.NahkampfwaffeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getNahkampfwaffe()
     * @generated
     */
	int NAHKAMPFWAFFE = 14;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl <em>Feuerwaffe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFeuerwaffe()
     * @generated
     */
	int FEUERWAFFE = 15;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.WurfwaffeImpl <em>Wurfwaffe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.WurfwaffeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getWurfwaffe()
     * @generated
     */
	int WURFWAFFE = 16;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.ShrListImpl <em>Shr List</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.ShrListImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getShrList()
     * @generated
     */
	int SHR_LIST = 17;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.ProjektilwaffeImpl <em>Projektilwaffe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.ProjektilwaffeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getProjektilwaffe()
     * @generated
     */
	int PROJEKTILWAFFE = 18;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl <em>Fertigkeits Gruppe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFertigkeitsGruppe()
     * @generated
     */
	int FERTIGKEITS_GRUPPE = 19;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FertigkeitImpl <em>Fertigkeit</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FertigkeitImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFertigkeit()
     * @generated
     */
	int FERTIGKEIT = 20;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Erlernbar <em>Erlernbar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Erlernbar
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getErlernbar()
     * @generated
     */
    int ERLERNBAR = 79;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Steigerbar <em>Steigerbar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Steigerbar
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSteigerbar()
     * @generated
     */
    int STEIGERBAR = 78;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitImpl <em>Persona Fertigkeit</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaFertigkeit()
     * @generated
     */
	int PERSONA_FERTIGKEIT = 21;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitsGruppeImpl <em>Persona Fertigkeits Gruppe</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitsGruppeImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaFertigkeitsGruppe()
     * @generated
     */
	int PERSONA_FERTIGKEITS_GRUPPE = 22;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AbstraktModifikatorenImpl <em>Abstrakt Modifikatoren</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AbstraktModifikatorenImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstraktModifikatoren()
     * @generated
     */
	int ABSTRAKT_MODIFIKATOREN = 26;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.KoerpermodsImpl <em>Koerpermods</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.KoerpermodsImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKoerpermods()
     * @generated
     */
	int KOERPERMODS = 25;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl <em>Cyberware</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CyberwareImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCyberware()
     * @generated
     */
	int CYBERWARE = 23;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.BioWareImpl <em>Bio Ware</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.BioWareImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBioWare()
     * @generated
     */
	int BIO_WARE = 24;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute <em>Geistige Attribute</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGeistigeAttribute()
     * @generated
     */
	int GEISTIGE_ATTRIBUTE = 27;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl <em>Koerper Persona</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKoerperPersona()
     * @generated
     */
	int KOERPER_PERSONA = 29;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MudanPersonaImpl <em>Mudan Persona</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MudanPersonaImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMudanPersona()
     * @generated
     */
	int MUDAN_PERSONA = 28;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MagischeModsImpl <em>Magische Mods</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MagischeModsImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagischeMods()
     * @generated
     */
	int MAGISCHE_MODS = 30;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.KiKraftImpl <em>Ki Kraft</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.KiKraftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKiKraft()
     * @generated
     */
	int KI_KRAFT = 31;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl <em>Magische Persona</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagischePersona()
     * @generated
     */
	int MAGISCHE_PERSONA = 32;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona <em>Base Magische Persona</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.BaseMagischePersona
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBaseMagischePersona()
     * @generated
     */
	int BASE_MAGISCHE_PERSONA = 33;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren <em>Fernkampfwaffen Modifikatoren</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFernkampfwaffenModifikatoren()
     * @generated
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN = 34;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse <em>Sichtverhaeltnisse</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSichtverhaeltnisse()
     * @generated
     */
	int SICHTVERHAELTNISSE = 35;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl <em>Spezies</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SpeziesImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSpezies()
     * @generated
     */
	int SPEZIES = 36;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.GegenstandStufen <em>Gegenstand Stufen</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGegenstandStufen()
     * @generated
     */
	int GEGENSTAND_STUFEN = 37;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.KiAdeptImpl <em>Ki Adept</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.KiAdeptImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKiAdept()
     * @generated
     */
	int KI_ADEPT = 38;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl <em>Kleidung</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.KleidungImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKleidung()
     * @generated
     */
	int KLEIDUNG = 39;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl <em>Fernkampfwaffe Modifikator</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFernkampfwaffeModifikator()
     * @generated
     */
	int FERNKAMPFWAFFE_MODIFIKATOR = 40;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Anwendbar <em>Anwendbar</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Anwendbar
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAnwendbar()
     * @generated
     */
	int ANWENDBAR = 41;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaEigenschaftImpl <em>Persona Eigenschaft</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PersonaEigenschaftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaEigenschaft()
     * @generated
     */
	int PERSONA_EIGENSCHAFT = 42;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren <em>Proben Modifikatoren</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ProbenModifikatoren
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getProbenModifikatoren()
     * @generated
     */
	int PROBEN_MODIFIKATOREN = 43;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MagierImpl <em>Magier</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MagierImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagier()
     * @generated
     */
	int MAGIER = 44;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Zauberer <em>Zauberer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Zauberer
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberer()
     * @generated
     */
	int ZAUBERER = 45;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl <em>Mystic Adept</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMysticAdept()
     * @generated
     */
	int MYSTIC_ADEPT = 46;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaZauberImpl <em>Persona Zauber</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PersonaZauberImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaZauber()
     * @generated
     */
	int PERSONA_ZAUBER = 47;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl <em>Zauber</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.ZauberImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauber()
     * @generated
     */
	int ZAUBER = 48;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits <em>Chrakter Limits</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getChrakterLimits()
     * @generated
     */
	int CHRAKTER_LIMITS = 49;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Panzerung <em>Panzerung</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Panzerung
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPanzerung()
     * @generated
     */
	int PANZERUNG = 50;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AspektMagierImpl <em>Aspekt Magier</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AspektMagierImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAspektMagier()
     * @generated
     */
	int ASPEKT_MAGIER = 51;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion <em>Astrale Projektion</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAstraleProjektion()
     * @generated
     */
	int ASTRALE_PROJEKTION = 52;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SchutzgeistImpl <em>Schutzgeist</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SchutzgeistImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSchutzgeist()
     * @generated
     */
	int SCHUTZGEIST = 53;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.InitationImpl <em>Initation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.InitationImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getInitation()
     * @generated
     */
	int INITATION = 54;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MetaMagieImpl <em>Meta Magie</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MetaMagieImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMetaMagie()
     * @generated
     */
	int META_MAGIE = 55;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CritterKraftImpl <em>Critter Kraft</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CritterKraftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterKraft()
     * @generated
     */
	int CRITTER_KRAFT = 56;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl <em>Fahrzeug</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FahrzeugImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFahrzeug()
     * @generated
     */
	int FAHRZEUG = 57;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PassagierFahrzeugImpl <em>Passagier Fahrzeug</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PassagierFahrzeugImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPassagierFahrzeug()
     * @generated
     */
	int PASSAGIER_FAHRZEUG = 59;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.BodenfahrzeugImpl <em>Bodenfahrzeug</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.BodenfahrzeugImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBodenfahrzeug()
     * @generated
     */
	int BODENFAHRZEUG = 58;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl <em>Drohne</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.DrohneImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getDrohne()
     * @generated
     */
	int DROHNE = 60;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FahrzeugModifikationImpl <em>Fahrzeug Modifikation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FahrzeugModifikationImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFahrzeugModifikation()
     * @generated
     */
	int FAHRZEUG_MODIFIKATION = 61;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl <em>Technomancer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.TechnomancerImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getTechnomancer()
     * @generated
     */
	int TECHNOMANCER = 62;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ResonanzPersona <em>Resonanz Persona</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ResonanzPersona
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getResonanzPersona()
     * @generated
     */
	int RESONANZ_PERSONA = 63;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl <em>Komplexe Form</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKomplexeForm()
     * @generated
     */
	int KOMPLEXE_FORM = 64;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaKomplexFormImpl <em>Persona Komplex Form</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PersonaKomplexFormImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaKomplexForm()
     * @generated
     */
	int PERSONA_KOMPLEX_FORM = 65;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl <em>Sprite</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SpriteImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSprite()
     * @generated
     */
	int SPRITE = 66;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.EchoImpl <em>Echo</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.EchoImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getEcho()
     * @generated
     */
	int ECHO = 67;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.VertragImpl <em>Vertrag</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.VertragImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getVertrag()
     * @generated
     */
	int VERTRAG = 68;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl <em>Intervall Vertrag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getIntervallVertrag()
     * @generated
     */
    int INTERVALL_VERTRAG = 74;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.LifestyleImpl <em>Lifestyle</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.LifestyleImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getLifestyle()
     * @generated
     */
	int LIFESTYLE = 69;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.WissensfertigkeitImpl <em>Wissensfertigkeit</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.WissensfertigkeitImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getWissensfertigkeit()
     * @generated
     */
	int WISSENSFERTIGKEIT = 70;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SprachfertigkeitImpl <em>Sprachfertigkeit</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SprachfertigkeitImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSprachfertigkeit()
     * @generated
     */
	int SPRACHFERTIGKEIT = 71;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.PersonaZustand <em>Persona Zustand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.PersonaZustand
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaZustand()
     * @generated
     */
    int PERSONA_ZUSTAND = 72;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CritterImpl <em>Critter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CritterImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritter()
     * @generated
     */
    int CRITTER = 73;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.FakeableImpl <em>Fakeable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.FakeableImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFakeable()
     * @generated
     */
    int FAKEABLE = 77;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SinImpl <em>Sin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SinImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSin()
     * @generated
     */
    int SIN = 75;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.LizenzImpl <em>Lizenz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.LizenzImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getLizenz()
     * @generated
     */
    int LIZENZ = 76;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl <em>Credstick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CredstickImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCredstick()
     * @generated
     */
    int CREDSTICK = 80;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Menge <em>Menge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Menge
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMenge()
     * @generated
     */
    int MENGE = 81;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl <em>Munition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.MunitionImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMunition()
     * @generated
     */
    int MUNITION = 82;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.GebundenerGeistImpl <em>Gebundener Geist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.GebundenerGeistImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGebundenerGeist()
     * @generated
     */
    int GEBUNDENER_GEIST = 84;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.StufenPersona <em>Stufen Persona</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.StufenPersona
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getStufenPersona()
     * @generated
     */
    int STUFEN_PERSONA = 85;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.GeistImpl <em>Geist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.GeistImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGeist()
     * @generated
     */
    int GEIST = 86;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Identifiable <em>Identifiable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Identifiable
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getIdentifiable()
     * @generated
     */
    int IDENTIFIABLE = 87;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE__PARENT_ID = 0;

    /**
     * The number of structural features of the '<em>Identifiable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Identifiable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUELLE__PARENT_ID = IDENTIFIABLE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUELLE__PAGE = IDENTIFIABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUELLE__SRC_BOOK = IDENTIFIABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Quelle</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUELLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Quelle</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUELLE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Start Shr Time</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK__START_SHR_TIME = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End Shr Time</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK__END_SHR_TIME = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Source Book</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Source Book</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOURCE_BOOK_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__KONSTITUTION = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__GESCHICKLICHKEIT = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__REAKTION = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__STAERKE = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__INITATIVE = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__INITATIV_WUERFEL = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__AUSWEICHEN = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__ESSENZ = BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__EDGE_BASIS = BESCHREIBBAR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__EDGE = BESCHREIBBAR_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__CHARISMA = BESCHREIBBAR_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__WILLENSKRAFT = BESCHREIBBAR_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__INTUITION = BESCHREIBBAR_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__LOGIK = BESCHREIBBAR_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__KOERPERLICH = BESCHREIBBAR_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__GEISTIG = BESCHREIBBAR_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__SOZIAL = BESCHREIBBAR_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__KONSTITUTION_BASIS = BESCHREIBBAR_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS = BESCHREIBBAR_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__REAKTION_BASIS = BESCHREIBBAR_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__STAERKE_BASIS = BESCHREIBBAR_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__CHARISMA_BASIS = BESCHREIBBAR_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS = BESCHREIBBAR_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__INTUITION_BASIS = BESCHREIBBAR_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__LOGIK_BASIS = BESCHREIBBAR_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__FERTIGKEITEN = BESCHREIBBAR_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN = BESCHREIBBAR_FEATURE_COUNT + 26;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__SPEZIES = BESCHREIBBAR_FEATURE_COUNT + 27;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA__MOD_MANAGER = BESCHREIBBAR_FEATURE_COUNT + 28;

    /**
     * The number of structural features of the '<em>Abstrakt Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 29;

    /**
     * The number of operations of the '<em>Abstrakt Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_PERSONA_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRAKT_GEGENSTAND__PARENT_ID = QUELLE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__PAGE = QUELLE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__SRC_BOOK = QUELLE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__WERT = QUELLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT = QUELLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRAKT_GEGENSTAND__WERT_VALUE = QUELLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__BESCHREIBUNG = QUELLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__IMAGE = QUELLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__NAME = QUELLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__MODS = QUELLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND__FERTIGKEIT = QUELLE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Abstrakt Gegenstand</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND_FEATURE_COUNT = QUELLE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Abstrakt Gegenstand</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_GEGENSTAND_OPERATION_COUNT = QUELLE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEGENSTAND__PARENT_ID = ABSTRAKT_GEGENSTAND__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__PAGE = ABSTRAKT_GEGENSTAND__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__SRC_BOOK = ABSTRAKT_GEGENSTAND__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__WERT = ABSTRAKT_GEGENSTAND__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__VERFUEGBARKEIT = ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEGENSTAND__WERT_VALUE = ABSTRAKT_GEGENSTAND__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__BESCHREIBUNG = ABSTRAKT_GEGENSTAND__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__IMAGE = ABSTRAKT_GEGENSTAND__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__NAME = ABSTRAKT_GEGENSTAND__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__MODS = ABSTRAKT_GEGENSTAND__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__FERTIGKEIT = ABSTRAKT_GEGENSTAND__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Kategorie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__KATEGORIE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND__STUFE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Gegenstand</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_FEATURE_COUNT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Gegenstand</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_OPERATION_COUNT = ABSTRAKT_GEGENSTAND_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GELD_WERT__WERT = 0;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GELD_WERT__VERFUEGBARKEIT = 1;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GELD_WERT__WERT_VALUE = 2;

    /**
     * The number of structural features of the '<em>Geld Wert</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GELD_WERT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Geld Wert</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GELD_WERT_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__MIN = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Kurz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__KURZ = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mittel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__MITTEL = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Weit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__WEIT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Extrem</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE__EXTREM = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Reichweite</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Reichweite</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REICHWEITE_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Attribut</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT = 0;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUT_MODIFIKATOR_WERT__WERT = 1;

    /**
     * The feature id for the '<em><b>Modifiziertes</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES = 2;

    /**
     * The number of structural features of the '<em>Attribut Modifikator Wert</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUT_MODIFIKATOR_WERT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Attribut Modifikator Wert</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUT_MODIFIKATOR_WERT_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODIFIZIERBAR__MODS = 0;

    /**
     * The number of structural features of the '<em>Modifizierbar</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODIFIZIERBAR_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Modifizierbar</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODIFIZIERBAR_OPERATION_COUNT = 0;

    /**
     * The number of structural features of the '<em>Modifikator Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Modifikator Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERLICHE_ATTRIBUTE__KONSTITUTION = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERLICHE_ATTRIBUTE__REAKTION = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERLICHE_ATTRIBUTE__STAERKE = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Koerperliche Attribute</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERLICHE_ATTRIBUTE_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Koerperliche Attribute</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERLICHE_ATTRIBUTE_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE__INITATIVE = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE__AUSWEICHEN = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE__ESSENZ = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE__EDGE_BASIS = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE__EDGE = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Spezielle Attribute</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Spezielle Attribute</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIELLE_ATTRIBUTE_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTAKT_WAFFE__PARENT_ID = ABSTRAKT_GEGENSTAND__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__PAGE = ABSTRAKT_GEGENSTAND__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__SRC_BOOK = ABSTRAKT_GEGENSTAND__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__WERT = ABSTRAKT_GEGENSTAND__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__VERFUEGBARKEIT = ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTAKT_WAFFE__WERT_VALUE = ABSTRAKT_GEGENSTAND__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__BESCHREIBUNG = ABSTRAKT_GEGENSTAND__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__IMAGE = ABSTRAKT_GEGENSTAND__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__NAME = ABSTRAKT_GEGENSTAND__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__MODS = ABSTRAKT_GEGENSTAND__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__FERTIGKEIT = ABSTRAKT_GEGENSTAND__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Schadenscode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__SCHADENSCODE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schades Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__SCHADES_TYP = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Praezision</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__PRAEZISION = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Durchschlags Kraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Abstakt Waffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE_FEATURE_COUNT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Abstakt Waffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_WAFFE_OPERATION_COUNT = ABSTRAKT_GEGENSTAND_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTAKT_FERN_KAMPFWAFFE__PARENT_ID = ABSTAKT_WAFFE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__PAGE = ABSTAKT_WAFFE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__SRC_BOOK = ABSTAKT_WAFFE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__WERT = ABSTAKT_WAFFE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__VERFUEGBARKEIT = ABSTAKT_WAFFE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTAKT_FERN_KAMPFWAFFE__WERT_VALUE = ABSTAKT_WAFFE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__BESCHREIBUNG = ABSTAKT_WAFFE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__IMAGE = ABSTAKT_WAFFE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__NAME = ABSTAKT_WAFFE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__MODS = ABSTAKT_WAFFE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__FERTIGKEIT = ABSTAKT_WAFFE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Schadenscode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__SCHADENSCODE = ABSTAKT_WAFFE__SCHADENSCODE;

    /**
     * The feature id for the '<em><b>Schades Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__SCHADES_TYP = ABSTAKT_WAFFE__SCHADES_TYP;

    /**
     * The feature id for the '<em><b>Praezision</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__PRAEZISION = ABSTAKT_WAFFE__PRAEZISION;

    /**
     * The feature id for the '<em><b>Durchschlags Kraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__DURCHSCHLAGS_KRAFT = ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE = ABSTAKT_WAFFE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstakt Fern Kampfwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT = ABSTAKT_WAFFE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Abstakt Fern Kampfwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTAKT_FERN_KAMPFWAFFE_OPERATION_COUNT = ABSTAKT_WAFFE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMPFWAFFE__PARENT_ID = ABSTAKT_WAFFE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__PAGE = ABSTAKT_WAFFE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__SRC_BOOK = ABSTAKT_WAFFE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__WERT = ABSTAKT_WAFFE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__VERFUEGBARKEIT = ABSTAKT_WAFFE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMPFWAFFE__WERT_VALUE = ABSTAKT_WAFFE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__BESCHREIBUNG = ABSTAKT_WAFFE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__IMAGE = ABSTAKT_WAFFE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__NAME = ABSTAKT_WAFFE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__MODS = ABSTAKT_WAFFE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__FERTIGKEIT = ABSTAKT_WAFFE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Schadenscode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__SCHADENSCODE = ABSTAKT_WAFFE__SCHADENSCODE;

    /**
     * The feature id for the '<em><b>Schades Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__SCHADES_TYP = ABSTAKT_WAFFE__SCHADES_TYP;

    /**
     * The feature id for the '<em><b>Praezision</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__PRAEZISION = ABSTAKT_WAFFE__PRAEZISION;

    /**
     * The feature id for the '<em><b>Durchschlags Kraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__DURCHSCHLAGS_KRAFT = ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE__REICHWEITE = ABSTAKT_WAFFE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Nahkampfwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE_FEATURE_COUNT = ABSTAKT_WAFFE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Nahkampfwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAHKAMPFWAFFE_OPERATION_COUNT = ABSTAKT_WAFFE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEUERWAFFE__PARENT_ID = ABSTAKT_FERN_KAMPFWAFFE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__PAGE = ABSTAKT_FERN_KAMPFWAFFE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__SRC_BOOK = ABSTAKT_FERN_KAMPFWAFFE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__WERT = ABSTAKT_FERN_KAMPFWAFFE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__VERFUEGBARKEIT = ABSTAKT_FERN_KAMPFWAFFE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEUERWAFFE__WERT_VALUE = ABSTAKT_FERN_KAMPFWAFFE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__BESCHREIBUNG = ABSTAKT_FERN_KAMPFWAFFE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__IMAGE = ABSTAKT_FERN_KAMPFWAFFE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__NAME = ABSTAKT_FERN_KAMPFWAFFE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__MODS = ABSTAKT_FERN_KAMPFWAFFE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__FERTIGKEIT = ABSTAKT_FERN_KAMPFWAFFE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Schadenscode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__SCHADENSCODE = ABSTAKT_FERN_KAMPFWAFFE__SCHADENSCODE;

    /**
     * The feature id for the '<em><b>Schades Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__SCHADES_TYP = ABSTAKT_FERN_KAMPFWAFFE__SCHADES_TYP;

    /**
     * The feature id for the '<em><b>Praezision</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__PRAEZISION = ABSTAKT_FERN_KAMPFWAFFE__PRAEZISION;

    /**
     * The feature id for the '<em><b>Durchschlags Kraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__DURCHSCHLAGS_KRAFT = ABSTAKT_FERN_KAMPFWAFFE__DURCHSCHLAGS_KRAFT;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__REICHWEITE = ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE;

    /**
     * The feature id for the '<em><b>Munitionstyp</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__MUNITIONSTYP = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Modie</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__MODIE = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Kapazitaet</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__KAPAZITAET = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Erweiterung</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__ERWEITERUNG = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Rueckstoss</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__RUECKSTOSS = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Einbau</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE__EINBAU = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Magazin</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEUERWAFFE__MAGAZIN = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Feuerwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE_FEATURE_COUNT = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Feuerwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FEUERWAFFE_OPERATION_COUNT = ABSTAKT_FERN_KAMPFWAFFE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WURFWAFFE__PARENT_ID = ABSTAKT_FERN_KAMPFWAFFE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__PAGE = ABSTAKT_FERN_KAMPFWAFFE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__SRC_BOOK = ABSTAKT_FERN_KAMPFWAFFE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__WERT = ABSTAKT_FERN_KAMPFWAFFE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__VERFUEGBARKEIT = ABSTAKT_FERN_KAMPFWAFFE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WURFWAFFE__WERT_VALUE = ABSTAKT_FERN_KAMPFWAFFE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__BESCHREIBUNG = ABSTAKT_FERN_KAMPFWAFFE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__IMAGE = ABSTAKT_FERN_KAMPFWAFFE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__NAME = ABSTAKT_FERN_KAMPFWAFFE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__MODS = ABSTAKT_FERN_KAMPFWAFFE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__FERTIGKEIT = ABSTAKT_FERN_KAMPFWAFFE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Schadenscode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__SCHADENSCODE = ABSTAKT_FERN_KAMPFWAFFE__SCHADENSCODE;

    /**
     * The feature id for the '<em><b>Schades Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__SCHADES_TYP = ABSTAKT_FERN_KAMPFWAFFE__SCHADES_TYP;

    /**
     * The feature id for the '<em><b>Praezision</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__PRAEZISION = ABSTAKT_FERN_KAMPFWAFFE__PRAEZISION;

    /**
     * The feature id for the '<em><b>Durchschlags Kraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__DURCHSCHLAGS_KRAFT = ABSTAKT_FERN_KAMPFWAFFE__DURCHSCHLAGS_KRAFT;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE__REICHWEITE = ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE;

    /**
     * The number of structural features of the '<em>Wurfwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE_FEATURE_COUNT = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Wurfwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WURFWAFFE_OPERATION_COUNT = ABSTAKT_FERN_KAMPFWAFFE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR_LIST__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR_LIST__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR_LIST__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR_LIST__ENTRIES = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Shr List</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR_LIST_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Shr List</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR_LIST_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJEKTILWAFFE__PARENT_ID = ABSTAKT_FERN_KAMPFWAFFE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__PAGE = ABSTAKT_FERN_KAMPFWAFFE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__SRC_BOOK = ABSTAKT_FERN_KAMPFWAFFE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__WERT = ABSTAKT_FERN_KAMPFWAFFE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__VERFUEGBARKEIT = ABSTAKT_FERN_KAMPFWAFFE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJEKTILWAFFE__WERT_VALUE = ABSTAKT_FERN_KAMPFWAFFE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__BESCHREIBUNG = ABSTAKT_FERN_KAMPFWAFFE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__IMAGE = ABSTAKT_FERN_KAMPFWAFFE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__NAME = ABSTAKT_FERN_KAMPFWAFFE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__MODS = ABSTAKT_FERN_KAMPFWAFFE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__FERTIGKEIT = ABSTAKT_FERN_KAMPFWAFFE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Schadenscode</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__SCHADENSCODE = ABSTAKT_FERN_KAMPFWAFFE__SCHADENSCODE;

    /**
     * The feature id for the '<em><b>Schades Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__SCHADES_TYP = ABSTAKT_FERN_KAMPFWAFFE__SCHADES_TYP;

    /**
     * The feature id for the '<em><b>Praezision</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__PRAEZISION = ABSTAKT_FERN_KAMPFWAFFE__PRAEZISION;

    /**
     * The feature id for the '<em><b>Durchschlags Kraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__DURCHSCHLAGS_KRAFT = ABSTAKT_FERN_KAMPFWAFFE__DURCHSCHLAGS_KRAFT;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE__REICHWEITE = ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE;

    /**
     * The number of structural features of the '<em>Projektilwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE_FEATURE_COUNT = ABSTAKT_FERN_KAMPFWAFFE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Projektilwaffe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJEKTILWAFFE_OPERATION_COUNT = ABSTAKT_FERN_KAMPFWAFFE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FERTIGKEITS_GRUPPE__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE__FERTIGKEITEN = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Fertigkeits Gruppe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Fertigkeits Gruppe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEITS_GRUPPE_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FERTIGKEIT__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Kategorie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__KATEGORIE = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__AUSWEICHEN = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Attribut</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__ATTRIBUT = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Spezialisierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT__SPEZIALISIERUNGEN = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Fertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Fertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERTIGKEIT_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The number of structural features of the '<em>Erlernbar</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERLERNBAR_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Erlernbar</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERLERNBAR_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEIGERBAR__STUFE = ERLERNBAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Steigerbar</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEIGERBAR_FEATURE_COUNT = ERLERNBAR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Steigerbar</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEIGERBAR_OPERATION_COUNT = ERLERNBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEIT__STUFE = STEIGERBAR__STUFE;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEIT__FERTIGKEIT = STEIGERBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Spezialisierungen</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN = STEIGERBAR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Persona Fertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEIT_FEATURE_COUNT = STEIGERBAR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Persona Fertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEIT_OPERATION_COUNT = STEIGERBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEITS_GRUPPE__STUFE = STEIGERBAR__STUFE;

    /**
     * The feature id for the '<em><b>Gruppe</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEITS_GRUPPE__GRUPPE = STEIGERBAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Persona Fertigkeits Gruppe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEITS_GRUPPE_FEATURE_COUNT = STEIGERBAR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Persona Fertigkeits Gruppe</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_FERTIGKEITS_GRUPPE_OPERATION_COUNT = STEIGERBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN__MODS = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRAKT_MODIFIKATOREN__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN__PAGE = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Abstrakt Modifikatoren</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Abstrakt Modifikatoren</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ABSTRAKT_MODIFIKATOREN_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS__BESCHREIBUNG = ABSTRAKT_MODIFIKATOREN__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS__IMAGE = ABSTRAKT_MODIFIKATOREN__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS__NAME = ABSTRAKT_MODIFIKATOREN__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS__MODS = ABSTRAKT_MODIFIKATOREN__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOERPERMODS__PARENT_ID = ABSTRAKT_MODIFIKATOREN__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS__PAGE = ABSTRAKT_MODIFIKATOREN__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS__SRC_BOOK = ABSTRAKT_MODIFIKATOREN__SRC_BOOK;

    /**
     * The number of structural features of the '<em>Koerpermods</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS_FEATURE_COUNT = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Koerpermods</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPERMODS_OPERATION_COUNT = ABSTRAKT_MODIFIKATOREN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__BESCHREIBUNG = KOERPERMODS__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__IMAGE = KOERPERMODS__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__NAME = KOERPERMODS__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__MODS = KOERPERMODS__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE__PARENT_ID = KOERPERMODS__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__PAGE = KOERPERMODS__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__SRC_BOOK = KOERPERMODS__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__WERT = KOERPERMODS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__VERFUEGBARKEIT = KOERPERMODS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE__WERT_VALUE = KOERPERMODS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Persona</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__PERSONA = KOERPERMODS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Einbau</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE__EINBAU = KOERPERMODS_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Cyberware</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE_FEATURE_COUNT = KOERPERMODS_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Cyberware</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CYBERWARE_OPERATION_COUNT = KOERPERMODS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__BESCHREIBUNG = KOERPERMODS__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__IMAGE = KOERPERMODS__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__NAME = KOERPERMODS__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__MODS = KOERPERMODS__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIO_WARE__PARENT_ID = KOERPERMODS__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__PAGE = KOERPERMODS__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__SRC_BOOK = KOERPERMODS__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__WERT = KOERPERMODS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__VERFUEGBARKEIT = KOERPERMODS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIO_WARE__WERT_VALUE = KOERPERMODS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Persona</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE__PERSONA = KOERPERMODS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Bio Ware</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE_FEATURE_COUNT = KOERPERMODS_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Bio Ware</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BIO_WARE_OPERATION_COUNT = KOERPERMODS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEISTIGE_ATTRIBUTE__CHARISMA = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEISTIGE_ATTRIBUTE__WILLENSKRAFT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEISTIGE_ATTRIBUTE__INTUITION = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEISTIGE_ATTRIBUTE__LOGIK = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Geistige Attribute</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEISTIGE_ATTRIBUTE_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Geistige Attribute</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEISTIGE_ATTRIBUTE_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__BESCHREIBUNG = ABSTRAKT_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__IMAGE = ABSTRAKT_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__NAME = ABSTRAKT_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__KONSTITUTION = ABSTRAKT_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__GESCHICKLICHKEIT = ABSTRAKT_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__REAKTION = ABSTRAKT_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__STAERKE = ABSTRAKT_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__INITATIVE = ABSTRAKT_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__INITATIV_WUERFEL = ABSTRAKT_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__AUSWEICHEN = ABSTRAKT_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__ESSENZ = ABSTRAKT_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__EDGE_BASIS = ABSTRAKT_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__EDGE = ABSTRAKT_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__CHARISMA = ABSTRAKT_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__WILLENSKRAFT = ABSTRAKT_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__INTUITION = ABSTRAKT_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__LOGIK = ABSTRAKT_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__KOERPERLICH = ABSTRAKT_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__GEISTIG = ABSTRAKT_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__SOZIAL = ABSTRAKT_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__KONSTITUTION_BASIS = ABSTRAKT_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__GESCHICKLICHKEIT_BASIS = ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__REAKTION_BASIS = ABSTRAKT_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__STAERKE_BASIS = ABSTRAKT_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__CHARISMA_BASIS = ABSTRAKT_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__WILLENSKRAFT_BASIS = ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__INTUITION_BASIS = ABSTRAKT_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__LOGIK_BASIS = ABSTRAKT_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__FERTIGKEITEN = ABSTRAKT_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__FERTIGKEITS_GRUPPEN = ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__SPEZIES = ABSTRAKT_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__MOD_MANAGER = ABSTRAKT_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__PANZER = ABSTRAKT_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX = ABSTRAKT_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX = ABSTRAKT_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOERPER_PERSONA__ZUSTAND_GRENZE = ABSTRAKT_PERSONA_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__KOERPER_MODS = ABSTRAKT_PERSONA_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA__EIGENSCHAFTEN = ABSTRAKT_PERSONA_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOERPER_PERSONA__ZUSTAND_KOERPERLICH = ABSTRAKT_PERSONA_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOERPER_PERSONA__ZUSTAND_GEISTIG = ABSTRAKT_PERSONA_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Koerper Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA_FEATURE_COUNT = ABSTRAKT_PERSONA_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Koerper Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOERPER_PERSONA_OPERATION_COUNT = ABSTRAKT_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__BESCHREIBUNG = KOERPER_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__IMAGE = KOERPER_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__NAME = KOERPER_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__KONSTITUTION = KOERPER_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__GESCHICKLICHKEIT = KOERPER_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__REAKTION = KOERPER_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__STAERKE = KOERPER_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__INITATIVE = KOERPER_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__INITATIV_WUERFEL = KOERPER_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__AUSWEICHEN = KOERPER_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__ESSENZ = KOERPER_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__EDGE_BASIS = KOERPER_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__EDGE = KOERPER_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__CHARISMA = KOERPER_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__WILLENSKRAFT = KOERPER_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__INTUITION = KOERPER_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__LOGIK = KOERPER_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__KOERPERLICH = KOERPER_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__GEISTIG = KOERPER_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__SOZIAL = KOERPER_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__KONSTITUTION_BASIS = KOERPER_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__GESCHICKLICHKEIT_BASIS = KOERPER_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__REAKTION_BASIS = KOERPER_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__STAERKE_BASIS = KOERPER_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__CHARISMA_BASIS = KOERPER_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__WILLENSKRAFT_BASIS = KOERPER_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__INTUITION_BASIS = KOERPER_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__LOGIK_BASIS = KOERPER_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__FERTIGKEITEN = KOERPER_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__FERTIGKEITS_GRUPPEN = KOERPER_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__SPEZIES = KOERPER_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__MOD_MANAGER = KOERPER_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__PANZER = KOERPER_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUDAN_PERSONA__ZUSTAND_KOERPERLICH_MAX = KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUDAN_PERSONA__ZUSTAND_GEISTIG_MAX = KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUDAN_PERSONA__ZUSTAND_GRENZE = KOERPER_PERSONA__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__KOERPER_MODS = KOERPER_PERSONA__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA__EIGENSCHAFTEN = KOERPER_PERSONA__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUDAN_PERSONA__ZUSTAND_KOERPERLICH = KOERPER_PERSONA__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUDAN_PERSONA__ZUSTAND_GEISTIG = KOERPER_PERSONA__ZUSTAND_GEISTIG;

    /**
     * The number of structural features of the '<em>Mudan Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA_FEATURE_COUNT = KOERPER_PERSONA_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mudan Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_PERSONA_OPERATION_COUNT = KOERPER_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS__BESCHREIBUNG = ABSTRAKT_MODIFIKATOREN__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS__IMAGE = ABSTRAKT_MODIFIKATOREN__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS__NAME = ABSTRAKT_MODIFIKATOREN__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS__MODS = ABSTRAKT_MODIFIKATOREN__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGISCHE_MODS__PARENT_ID = ABSTRAKT_MODIFIKATOREN__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS__PAGE = ABSTRAKT_MODIFIKATOREN__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS__SRC_BOOK = ABSTRAKT_MODIFIKATOREN__SRC_BOOK;

    /**
     * The number of structural features of the '<em>Magische Mods</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS_FEATURE_COUNT = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Magische Mods</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_MODS_OPERATION_COUNT = ABSTRAKT_MODIFIKATOREN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__BESCHREIBUNG = MAGISCHE_MODS__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__IMAGE = MAGISCHE_MODS__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__NAME = MAGISCHE_MODS__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__MODS = MAGISCHE_MODS__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KI_KRAFT__PARENT_ID = MAGISCHE_MODS__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__PAGE = MAGISCHE_MODS__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__SRC_BOOK = MAGISCHE_MODS__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Kraftpunkte</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT__KRAFTPUNKTE = MAGISCHE_MODS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ki Kraft</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT_FEATURE_COUNT = MAGISCHE_MODS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ki Kraft</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_KRAFT_OPERATION_COUNT = MAGISCHE_MODS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__BESCHREIBUNG = KOERPER_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__IMAGE = KOERPER_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__NAME = KOERPER_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__KONSTITUTION = KOERPER_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__GESCHICKLICHKEIT = KOERPER_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__REAKTION = KOERPER_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__STAERKE = KOERPER_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__INITATIVE = KOERPER_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__INITATIV_WUERFEL = KOERPER_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__AUSWEICHEN = KOERPER_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__ESSENZ = KOERPER_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__EDGE_BASIS = KOERPER_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__EDGE = KOERPER_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__CHARISMA = KOERPER_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__WILLENSKRAFT = KOERPER_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__INTUITION = KOERPER_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__LOGIK = KOERPER_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__KOERPERLICH = KOERPER_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__GEISTIG = KOERPER_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__SOZIAL = KOERPER_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__KONSTITUTION_BASIS = KOERPER_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__GESCHICKLICHKEIT_BASIS = KOERPER_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__REAKTION_BASIS = KOERPER_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__STAERKE_BASIS = KOERPER_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__CHARISMA_BASIS = KOERPER_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__WILLENSKRAFT_BASIS = KOERPER_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__INTUITION_BASIS = KOERPER_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__LOGIK_BASIS = KOERPER_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__FERTIGKEITEN = KOERPER_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__FERTIGKEITS_GRUPPEN = KOERPER_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__SPEZIES = KOERPER_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__MOD_MANAGER = KOERPER_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__PANZER = KOERPER_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH_MAX = KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGISCHE_PERSONA__ZUSTAND_GEISTIG_MAX = KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGISCHE_PERSONA__ZUSTAND_GRENZE = KOERPER_PERSONA__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__KOERPER_MODS = KOERPER_PERSONA__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__EIGENSCHAFTEN = KOERPER_PERSONA__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH = KOERPER_PERSONA__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGISCHE_PERSONA__ZUSTAND_GEISTIG = KOERPER_PERSONA__ZUSTAND_GEISTIG;

    /**
     * The feature id for the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__MAGIE = KOERPER_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initationen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__INITATIONEN = KOERPER_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__MAGIE_BASIS = KOERPER_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Mentor</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA__MENTOR = KOERPER_PERSONA_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Magische Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA_FEATURE_COUNT = KOERPER_PERSONA_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Magische Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGISCHE_PERSONA_OPERATION_COUNT = KOERPER_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASE_MAGISCHE_PERSONA__MAGIE = 0;

    /**
     * The feature id for the '<em><b>Initationen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASE_MAGISCHE_PERSONA__INITATIONEN = 1;

    /**
     * The feature id for the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASE_MAGISCHE_PERSONA__MAGIE_BASIS = 2;

    /**
     * The number of structural features of the '<em>Base Magische Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASE_MAGISCHE_PERSONA_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Base Magische Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASE_MAGISCHE_PERSONA_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Smartgun</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN__SMARTGUN = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Rueckstoss</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN__RUECKSTOSS = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Laster Pointer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN__LASTER_POINTER = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Schalldaempfer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN__SCHALLDAEMPFER = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Vergroesserung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN__VERGROESSERUNG = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Sichtverbesserung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FERNKAMPFWAFFEN_MODIFIKATOREN__SICHTVERBESSERUNG = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Fernkampfwaffen Modifikatoren</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Fernkampfwaffen Modifikatoren</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFEN_MODIFIKATOREN_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Restlichtverstaerkung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SICHTVERHAELTNISSE__RESTLICHTVERSTAERKUNG = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Infrarot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SICHTVERHAELTNISSE__INFRAROT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ultrasound</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SICHTVERHAELTNISSE__ULTRASOUND = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sichtverhaeltnisse</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SICHTVERHAELTNISSE_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Sichtverhaeltnisse</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SICHTVERHAELTNISSE_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__MODS = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIES__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__PAGE = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Konstitution Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__KONSTITUTION_MIN = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__GESCHICKLICHKEIT_MIN = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Reaktion Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__REAKTION_MIN = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Staerke Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__STAERKE_MIN = BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Charisma Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__CHARISMA_MIN = BESCHREIBBAR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Willenskraft Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__WILLENSKRAFT_MIN = BESCHREIBBAR_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Intuition Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__INTUITION_MIN = BESCHREIBBAR_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Logik Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__LOGIK_MIN = BESCHREIBBAR_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Edge Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__EDGE_MIN = BESCHREIBBAR_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Magie Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__MAGIE_MIN = BESCHREIBBAR_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Resonanz Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__RESONANZ_MIN = BESCHREIBBAR_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Essenz Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__ESSENZ_MIN = BESCHREIBBAR_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Konstitution Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__KONSTITUTION_MAX = BESCHREIBBAR_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__GESCHICKLICHKEIT_MAX = BESCHREIBBAR_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Reaktion Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__REAKTION_MAX = BESCHREIBBAR_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Staerke Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__STAERKE_MAX = BESCHREIBBAR_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Charisma Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__CHARISMA_MAX = BESCHREIBBAR_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Willenskraft Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__WILLENSKRAFT_MAX = BESCHREIBBAR_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Intuition Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__INTUITION_MAX = BESCHREIBBAR_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Logik Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__LOGIK_MAX = BESCHREIBBAR_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Edge Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__EDGE_MAX = BESCHREIBBAR_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Magie Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__MAGIE_MAX = BESCHREIBBAR_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Resonanz Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__RESONANZ_MAX = BESCHREIBBAR_FEATURE_COUNT + 26;

    /**
     * The feature id for the '<em><b>Essenz Max</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__ESSENZ_MAX = BESCHREIBBAR_FEATURE_COUNT + 27;

    /**
     * The feature id for the '<em><b>Laufen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__LAUFEN = BESCHREIBBAR_FEATURE_COUNT + 28;

    /**
     * The feature id for the '<em><b>Rennen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__RENNEN = BESCHREIBBAR_FEATURE_COUNT + 29;

    /**
     * The feature id for the '<em><b>Sprinten</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES__SPRINTEN = BESCHREIBBAR_FEATURE_COUNT + 30;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIES__ANGRIFF = BESCHREIBBAR_FEATURE_COUNT + 31;

    /**
     * The number of structural features of the '<em>Spezies</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 32;

    /**
     * The number of operations of the '<em>Spezies</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPEZIES_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Computer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN__COMPUTER = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elektronik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN__ELEKTRONIK = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Tracing</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN__TRACING = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Anti Tracing</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN__ANTI_TRACING = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Protection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN__PROTECTION = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Anti Protection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN__ANTI_PROTECTION = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Gegenstand Stufen</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Gegenstand Stufen</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GEGENSTAND_STUFEN_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__BESCHREIBUNG = MAGISCHE_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__IMAGE = MAGISCHE_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__NAME = MAGISCHE_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__KONSTITUTION = MAGISCHE_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__GESCHICKLICHKEIT = MAGISCHE_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__REAKTION = MAGISCHE_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__STAERKE = MAGISCHE_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__INITATIVE = MAGISCHE_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__INITATIV_WUERFEL = MAGISCHE_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__AUSWEICHEN = MAGISCHE_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__ESSENZ = MAGISCHE_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__EDGE_BASIS = MAGISCHE_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__EDGE = MAGISCHE_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__CHARISMA = MAGISCHE_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__WILLENSKRAFT = MAGISCHE_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__INTUITION = MAGISCHE_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__LOGIK = MAGISCHE_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__KOERPERLICH = MAGISCHE_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__GEISTIG = MAGISCHE_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__SOZIAL = MAGISCHE_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__KONSTITUTION_BASIS = MAGISCHE_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__GESCHICKLICHKEIT_BASIS = MAGISCHE_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__REAKTION_BASIS = MAGISCHE_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__STAERKE_BASIS = MAGISCHE_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__CHARISMA_BASIS = MAGISCHE_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__WILLENSKRAFT_BASIS = MAGISCHE_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__INTUITION_BASIS = MAGISCHE_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__LOGIK_BASIS = MAGISCHE_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__FERTIGKEITEN = MAGISCHE_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__FERTIGKEITS_GRUPPEN = MAGISCHE_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__SPEZIES = MAGISCHE_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__MOD_MANAGER = MAGISCHE_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__PANZER = MAGISCHE_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KI_ADEPT__ZUSTAND_KOERPERLICH_MAX = MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KI_ADEPT__ZUSTAND_GEISTIG_MAX = MAGISCHE_PERSONA__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KI_ADEPT__ZUSTAND_GRENZE = MAGISCHE_PERSONA__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__KOERPER_MODS = MAGISCHE_PERSONA__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__EIGENSCHAFTEN = MAGISCHE_PERSONA__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KI_ADEPT__ZUSTAND_KOERPERLICH = MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KI_ADEPT__ZUSTAND_GEISTIG = MAGISCHE_PERSONA__ZUSTAND_GEISTIG;

    /**
     * The feature id for the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__MAGIE = MAGISCHE_PERSONA__MAGIE;

    /**
     * The feature id for the '<em><b>Initationen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__INITATIONEN = MAGISCHE_PERSONA__INITATIONEN;

    /**
     * The feature id for the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__MAGIE_BASIS = MAGISCHE_PERSONA__MAGIE_BASIS;

    /**
     * The feature id for the '<em><b>Mentor</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__MENTOR = MAGISCHE_PERSONA__MENTOR;

    /**
     * The feature id for the '<em><b>Kikraft</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT__KIKRAFT = MAGISCHE_PERSONA_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ki Adept</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT_FEATURE_COUNT = MAGISCHE_PERSONA_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ki Adept</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KI_ADEPT_OPERATION_COUNT = MAGISCHE_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLEIDUNG__PARENT_ID = ABSTRAKT_GEGENSTAND__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__PAGE = ABSTRAKT_GEGENSTAND__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__SRC_BOOK = ABSTRAKT_GEGENSTAND__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__WERT = ABSTRAKT_GEGENSTAND__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__VERFUEGBARKEIT = ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLEIDUNG__WERT_VALUE = ABSTRAKT_GEGENSTAND__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__BESCHREIBUNG = ABSTRAKT_GEGENSTAND__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__IMAGE = ABSTRAKT_GEGENSTAND__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__NAME = ABSTRAKT_GEGENSTAND__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__MODS = ABSTRAKT_GEGENSTAND__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__FERTIGKEIT = ABSTRAKT_GEGENSTAND__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Ruestung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG__RUESTUNG = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Kleidung</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG_FEATURE_COUNT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Kleidung</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KLEIDUNG_OPERATION_COUNT = ABSTRAKT_GEGENSTAND_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__BESCHREIBUNG = ABSTRAKT_MODIFIKATOREN__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__IMAGE = ABSTRAKT_MODIFIKATOREN__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__NAME = ABSTRAKT_MODIFIKATOREN__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__MODS = ABSTRAKT_MODIFIKATOREN__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FERNKAMPFWAFFE_MODIFIKATOR__PARENT_ID = ABSTRAKT_MODIFIKATOREN__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__PAGE = ABSTRAKT_MODIFIKATOREN__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__SRC_BOOK = ABSTRAKT_MODIFIKATOREN__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Ep</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR__EP = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Fernkampfwaffe Modifikator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR_FEATURE_COUNT = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Fernkampfwaffe Modifikator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FERNKAMPFWAFFE_MODIFIKATOR_OPERATION_COUNT = ABSTRAKT_MODIFIKATOREN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANWENDBAR__FERTIGKEIT = 0;

    /**
     * The number of structural features of the '<em>Anwendbar</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANWENDBAR_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Anwendbar</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ANWENDBAR_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__BESCHREIBUNG = ABSTRAKT_MODIFIKATOREN__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__IMAGE = ABSTRAKT_MODIFIKATOREN__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__NAME = ABSTRAKT_MODIFIKATOREN__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__MODS = ABSTRAKT_MODIFIKATOREN__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_EIGENSCHAFT__PARENT_ID = ABSTRAKT_MODIFIKATOREN__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__PAGE = ABSTRAKT_MODIFIKATOREN__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__SRC_BOOK = ABSTRAKT_MODIFIKATOREN__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Karma Kosten</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT__KARMA_KOSTEN = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Persona Eigenschaft</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT_FEATURE_COUNT = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Persona Eigenschaft</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_EIGENSCHAFT_OPERATION_COUNT = ABSTRAKT_MODIFIKATOREN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schadenswiederstand</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROBEN_MODIFIKATOREN__SCHADENSWIEDERSTAND = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Heilung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROBEN_MODIFIKATOREN__HEILUNG = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Proben Modifikatoren</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROBEN_MODIFIKATOREN_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Proben Modifikatoren</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROBEN_MODIFIKATOREN_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__BESCHREIBUNG = MAGISCHE_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__IMAGE = MAGISCHE_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__NAME = MAGISCHE_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__KONSTITUTION = MAGISCHE_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__GESCHICKLICHKEIT = MAGISCHE_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__REAKTION = MAGISCHE_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__STAERKE = MAGISCHE_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__INITATIVE = MAGISCHE_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__INITATIV_WUERFEL = MAGISCHE_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__AUSWEICHEN = MAGISCHE_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ESSENZ = MAGISCHE_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__EDGE_BASIS = MAGISCHE_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__EDGE = MAGISCHE_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__CHARISMA = MAGISCHE_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__WILLENSKRAFT = MAGISCHE_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__INTUITION = MAGISCHE_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__LOGIK = MAGISCHE_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__KOERPERLICH = MAGISCHE_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__GEISTIG = MAGISCHE_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__SOZIAL = MAGISCHE_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__KONSTITUTION_BASIS = MAGISCHE_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__GESCHICKLICHKEIT_BASIS = MAGISCHE_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__REAKTION_BASIS = MAGISCHE_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__STAERKE_BASIS = MAGISCHE_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__CHARISMA_BASIS = MAGISCHE_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__WILLENSKRAFT_BASIS = MAGISCHE_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__INTUITION_BASIS = MAGISCHE_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__LOGIK_BASIS = MAGISCHE_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__FERTIGKEITEN = MAGISCHE_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__FERTIGKEITS_GRUPPEN = MAGISCHE_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__SPEZIES = MAGISCHE_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__MOD_MANAGER = MAGISCHE_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__PANZER = MAGISCHE_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__ZUSTAND_KOERPERLICH_MAX = MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__ZUSTAND_GEISTIG_MAX = MAGISCHE_PERSONA__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__ZUSTAND_GRENZE = MAGISCHE_PERSONA__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__KOERPER_MODS = MAGISCHE_PERSONA__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__EIGENSCHAFTEN = MAGISCHE_PERSONA__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__ZUSTAND_KOERPERLICH = MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__ZUSTAND_GEISTIG = MAGISCHE_PERSONA__ZUSTAND_GEISTIG;

    /**
     * The feature id for the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__MAGIE = MAGISCHE_PERSONA__MAGIE;

    /**
     * The feature id for the '<em><b>Initationen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__INITATIONEN = MAGISCHE_PERSONA__INITATIONEN;

    /**
     * The feature id for the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__MAGIE_BASIS = MAGISCHE_PERSONA__MAGIE_BASIS;

    /**
     * The feature id for the '<em><b>Mentor</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__MENTOR = MAGISCHE_PERSONA__MENTOR;

    /**
     * The feature id for the '<em><b>Zauber</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ZAUBER = MAGISCHE_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Enzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ENZUG = MAGISCHE_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Tradition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__TRADITION = MAGISCHE_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Gebundene Geister</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__GEBUNDENE_GEISTER = MAGISCHE_PERSONA_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ungebundener Geist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAGIER__UNGEBUNDENER_GEIST = MAGISCHE_PERSONA_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Astrales Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALES_LIMIT = MAGISCHE_PERSONA_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Astrale Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_KONSTITUTION = MAGISCHE_PERSONA_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Astrale Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_GESCHICKLICHKEIT = MAGISCHE_PERSONA_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Astrale Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_REAKTION = MAGISCHE_PERSONA_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Astrale Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_STAERKE = MAGISCHE_PERSONA_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Astrale Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_INITATIVE = MAGISCHE_PERSONA_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Astrale Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_INITATIV_WUERFEL = MAGISCHE_PERSONA_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Astrale Panzerung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER__ASTRALE_PANZERUNG = MAGISCHE_PERSONA_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>Magier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER_FEATURE_COUNT = MAGISCHE_PERSONA_FEATURE_COUNT + 13;

    /**
     * The number of operations of the '<em>Magier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAGIER_OPERATION_COUNT = MAGISCHE_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Zauber</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBERER__ZAUBER = 0;

    /**
     * The feature id for the '<em><b>Enzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBERER__ENZUG = 1;

    /**
     * The feature id for the '<em><b>Tradition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBERER__TRADITION = 2;

    /**
     * The feature id for the '<em><b>Gebundene Geister</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZAUBERER__GEBUNDENE_GEISTER = 3;

    /**
     * The feature id for the '<em><b>Ungebundener Geist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZAUBERER__UNGEBUNDENER_GEIST = 4;

    /**
     * The number of structural features of the '<em>Zauberer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBERER_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Zauberer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBERER_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__BESCHREIBUNG = KI_ADEPT__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__IMAGE = KI_ADEPT__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__NAME = KI_ADEPT__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__KONSTITUTION = KI_ADEPT__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__GESCHICKLICHKEIT = KI_ADEPT__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__REAKTION = KI_ADEPT__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__STAERKE = KI_ADEPT__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__INITATIVE = KI_ADEPT__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__INITATIV_WUERFEL = KI_ADEPT__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__AUSWEICHEN = KI_ADEPT__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__ESSENZ = KI_ADEPT__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__EDGE_BASIS = KI_ADEPT__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__EDGE = KI_ADEPT__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__CHARISMA = KI_ADEPT__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__WILLENSKRAFT = KI_ADEPT__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__INTUITION = KI_ADEPT__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__LOGIK = KI_ADEPT__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__KOERPERLICH = KI_ADEPT__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__GEISTIG = KI_ADEPT__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__SOZIAL = KI_ADEPT__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__KONSTITUTION_BASIS = KI_ADEPT__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__GESCHICKLICHKEIT_BASIS = KI_ADEPT__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__REAKTION_BASIS = KI_ADEPT__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__STAERKE_BASIS = KI_ADEPT__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__CHARISMA_BASIS = KI_ADEPT__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__WILLENSKRAFT_BASIS = KI_ADEPT__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__INTUITION_BASIS = KI_ADEPT__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__LOGIK_BASIS = KI_ADEPT__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__FERTIGKEITEN = KI_ADEPT__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__FERTIGKEITS_GRUPPEN = KI_ADEPT__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__SPEZIES = KI_ADEPT__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__MOD_MANAGER = KI_ADEPT__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__PANZER = KI_ADEPT__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__ZUSTAND_KOERPERLICH_MAX = KI_ADEPT__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__ZUSTAND_GEISTIG_MAX = KI_ADEPT__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__ZUSTAND_GRENZE = KI_ADEPT__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__KOERPER_MODS = KI_ADEPT__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__EIGENSCHAFTEN = KI_ADEPT__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__ZUSTAND_KOERPERLICH = KI_ADEPT__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__ZUSTAND_GEISTIG = KI_ADEPT__ZUSTAND_GEISTIG;

    /**
     * The feature id for the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__MAGIE = KI_ADEPT__MAGIE;

    /**
     * The feature id for the '<em><b>Initationen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__INITATIONEN = KI_ADEPT__INITATIONEN;

    /**
     * The feature id for the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__MAGIE_BASIS = KI_ADEPT__MAGIE_BASIS;

    /**
     * The feature id for the '<em><b>Mentor</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__MENTOR = KI_ADEPT__MENTOR;

    /**
     * The feature id for the '<em><b>Kikraft</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__KIKRAFT = KI_ADEPT__KIKRAFT;

    /**
     * The feature id for the '<em><b>Zauber</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__ZAUBER = KI_ADEPT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Enzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__ENZUG = KI_ADEPT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Tradition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT__TRADITION = KI_ADEPT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Gebundene Geister</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__GEBUNDENE_GEISTER = KI_ADEPT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ungebundener Geist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MYSTIC_ADEPT__UNGEBUNDENER_GEIST = KI_ADEPT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Mystic Adept</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT_FEATURE_COUNT = KI_ADEPT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Mystic Adept</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MYSTIC_ADEPT_OPERATION_COUNT = KI_ADEPT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_ZAUBER__STUFE = ERLERNBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Formel</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_ZAUBER__FORMEL = ERLERNBAR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Persona Zauber</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_ZAUBER_FEATURE_COUNT = ERLERNBAR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Persona Zauber</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_ZAUBER_OPERATION_COUNT = ERLERNBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ZAUBER__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Art</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__ART = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__REICHWEITE = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Schaden</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__SCHADEN = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Dauer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__DAUER = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Entzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__ENTZUG = BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Kategorie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__KATEGORIE = BESCHREIBBAR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Merkmale</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER__MERKMALE = BESCHREIBBAR_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Zauber</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Zauber</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ZAUBER_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHRAKTER_LIMITS__KOERPERLICH = 0;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHRAKTER_LIMITS__GEISTIG = 1;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHRAKTER_LIMITS__SOZIAL = 2;

    /**
     * The number of structural features of the '<em>Chrakter Limits</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHRAKTER_LIMITS_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Chrakter Limits</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHRAKTER_LIMITS_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PANZERUNG__PANZER = 0;

    /**
     * The number of structural features of the '<em>Panzerung</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PANZERUNG_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Panzerung</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PANZERUNG_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__BESCHREIBUNG = MAGISCHE_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__IMAGE = MAGISCHE_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__NAME = MAGISCHE_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__KONSTITUTION = MAGISCHE_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__GESCHICKLICHKEIT = MAGISCHE_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__REAKTION = MAGISCHE_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__STAERKE = MAGISCHE_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__INITATIVE = MAGISCHE_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__INITATIV_WUERFEL = MAGISCHE_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__AUSWEICHEN = MAGISCHE_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__ESSENZ = MAGISCHE_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__EDGE_BASIS = MAGISCHE_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__EDGE = MAGISCHE_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__CHARISMA = MAGISCHE_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__WILLENSKRAFT = MAGISCHE_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__INTUITION = MAGISCHE_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__LOGIK = MAGISCHE_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__KOERPERLICH = MAGISCHE_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__GEISTIG = MAGISCHE_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__SOZIAL = MAGISCHE_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__KONSTITUTION_BASIS = MAGISCHE_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__GESCHICKLICHKEIT_BASIS = MAGISCHE_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__REAKTION_BASIS = MAGISCHE_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__STAERKE_BASIS = MAGISCHE_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__CHARISMA_BASIS = MAGISCHE_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__WILLENSKRAFT_BASIS = MAGISCHE_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__INTUITION_BASIS = MAGISCHE_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__LOGIK_BASIS = MAGISCHE_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__FERTIGKEITEN = MAGISCHE_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__FERTIGKEITS_GRUPPEN = MAGISCHE_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__SPEZIES = MAGISCHE_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__MOD_MANAGER = MAGISCHE_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__PANZER = MAGISCHE_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__ZUSTAND_KOERPERLICH_MAX = MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__ZUSTAND_GEISTIG_MAX = MAGISCHE_PERSONA__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__ZUSTAND_GRENZE = MAGISCHE_PERSONA__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__KOERPER_MODS = MAGISCHE_PERSONA__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__EIGENSCHAFTEN = MAGISCHE_PERSONA__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__ZUSTAND_KOERPERLICH = MAGISCHE_PERSONA__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__ZUSTAND_GEISTIG = MAGISCHE_PERSONA__ZUSTAND_GEISTIG;

    /**
     * The feature id for the '<em><b>Magie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__MAGIE = MAGISCHE_PERSONA__MAGIE;

    /**
     * The feature id for the '<em><b>Initationen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__INITATIONEN = MAGISCHE_PERSONA__INITATIONEN;

    /**
     * The feature id for the '<em><b>Magie Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__MAGIE_BASIS = MAGISCHE_PERSONA__MAGIE_BASIS;

    /**
     * The feature id for the '<em><b>Mentor</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__MENTOR = MAGISCHE_PERSONA__MENTOR;

    /**
     * The feature id for the '<em><b>Zauber</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__ZAUBER = MAGISCHE_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Enzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__ENZUG = MAGISCHE_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Tradition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__TRADITION = MAGISCHE_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Gebundene Geister</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__GEBUNDENE_GEISTER = MAGISCHE_PERSONA_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ungebundener Geist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASPEKT_MAGIER__UNGEBUNDENER_GEIST = MAGISCHE_PERSONA_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Aspekt</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER__ASPEKT = MAGISCHE_PERSONA_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Aspekt Magier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER_FEATURE_COUNT = MAGISCHE_PERSONA_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Aspekt Magier</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASPEKT_MAGIER_OPERATION_COUNT = MAGISCHE_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Astrales Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALES_LIMIT = 0;

    /**
     * The feature id for the '<em><b>Astrale Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION = 1;

    /**
     * The feature id for the '<em><b>Astrale Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT = 2;

    /**
     * The feature id for the '<em><b>Astrale Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_REAKTION = 3;

    /**
     * The feature id for the '<em><b>Astrale Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_STAERKE = 4;

    /**
     * The feature id for the '<em><b>Astrale Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_INITATIVE = 5;

    /**
     * The feature id for the '<em><b>Astrale Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL = 6;

    /**
     * The feature id for the '<em><b>Astrale Panzerung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION__ASTRALE_PANZERUNG = 7;

    /**
     * The number of structural features of the '<em>Astrale Projektion</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Astrale Projektion</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASTRALE_PROJEKTION_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__BESCHREIBUNG = MAGISCHE_MODS__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__IMAGE = MAGISCHE_MODS__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__NAME = MAGISCHE_MODS__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__MODS = MAGISCHE_MODS__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHUTZGEIST__PARENT_ID = MAGISCHE_MODS__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__PAGE = MAGISCHE_MODS__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__SRC_BOOK = MAGISCHE_MODS__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Vorteile</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__VORTEILE = MAGISCHE_MODS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Nachteile</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST__NACHTEILE = MAGISCHE_MODS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Schutzgeist</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST_FEATURE_COUNT = MAGISCHE_MODS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Schutzgeist</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SCHUTZGEIST_OPERATION_COUNT = MAGISCHE_MODS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INITATION__STUFE = STEIGERBAR__STUFE;

    /**
     * The feature id for the '<em><b>Erlernt</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INITATION__ERLERNT = STEIGERBAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Initation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INITATION_FEATURE_COUNT = STEIGERBAR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Initation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INITATION_OPERATION_COUNT = STEIGERBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int META_MAGIE__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Meta Magie</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Meta Magie</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_MAGIE_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__BESCHREIBUNG = MAGISCHE_MODS__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__IMAGE = MAGISCHE_MODS__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__NAME = MAGISCHE_MODS__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__MODS = MAGISCHE_MODS__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER_KRAFT__PARENT_ID = MAGISCHE_MODS__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__PAGE = MAGISCHE_MODS__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__SRC_BOOK = MAGISCHE_MODS__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Art</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__ART = MAGISCHE_MODS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Handlung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__HANDLUNG = MAGISCHE_MODS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reichweite</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__REICHWEITE = MAGISCHE_MODS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Dauer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT__DAUER = MAGISCHE_MODS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Critter Kraft</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT_FEATURE_COUNT = MAGISCHE_MODS_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Critter Kraft</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CRITTER_KRAFT_OPERATION_COUNT = MAGISCHE_MODS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__WERT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__VERFUEGBARKEIT = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG__WERT_VALUE = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__FERTIGKEIT = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG__MODS = BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG__ZUSTAND_MAX = BESCHREIBBAR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Handling</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__HANDLING = BESCHREIBBAR_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Geschwindigkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__GESCHWINDIGKEIT = BESCHREIBBAR_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Beschleunigung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__BESCHLEUNIGUNG = BESCHREIBBAR_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Rumpf</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__RUMPF = BESCHREIBBAR_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Pilot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__PILOT = BESCHREIBBAR_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Sensor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__SENSOR = BESCHREIBBAR_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Fahrzeug Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__FAHRZEUG_TYP = BESCHREIBBAR_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Modifizierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG__MODIFIZIERUNGEN = BESCHREIBBAR_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG__PANZER = BESCHREIBBAR_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Weapon Mounts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG__WEAPON_MOUNTS = BESCHREIBBAR_FEATURE_COUNT + 18;

    /**
     * The number of structural features of the '<em>Fahrzeug</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 19;

    /**
     * The number of operations of the '<em>Fahrzeug</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__BESCHREIBUNG = FAHRZEUG__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__IMAGE = FAHRZEUG__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__NAME = FAHRZEUG__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSAGIER_FAHRZEUG__PARENT_ID = FAHRZEUG__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__PAGE = FAHRZEUG__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__SRC_BOOK = FAHRZEUG__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__WERT = FAHRZEUG__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__VERFUEGBARKEIT = FAHRZEUG__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSAGIER_FAHRZEUG__WERT_VALUE = FAHRZEUG__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__FERTIGKEIT = FAHRZEUG__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSAGIER_FAHRZEUG__MODS = FAHRZEUG__MODS;

    /**
     * The feature id for the '<em><b>Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSAGIER_FAHRZEUG__ZUSTAND_MAX = FAHRZEUG__ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Handling</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__HANDLING = FAHRZEUG__HANDLING;

    /**
     * The feature id for the '<em><b>Geschwindigkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__GESCHWINDIGKEIT = FAHRZEUG__GESCHWINDIGKEIT;

    /**
     * The feature id for the '<em><b>Beschleunigung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__BESCHLEUNIGUNG = FAHRZEUG__BESCHLEUNIGUNG;

    /**
     * The feature id for the '<em><b>Rumpf</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__RUMPF = FAHRZEUG__RUMPF;

    /**
     * The feature id for the '<em><b>Pilot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__PILOT = FAHRZEUG__PILOT;

    /**
     * The feature id for the '<em><b>Sensor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__SENSOR = FAHRZEUG__SENSOR;

    /**
     * The feature id for the '<em><b>Fahrzeug Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__FAHRZEUG_TYP = FAHRZEUG__FAHRZEUG_TYP;

    /**
     * The feature id for the '<em><b>Modifizierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__MODIFIZIERUNGEN = FAHRZEUG__MODIFIZIERUNGEN;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSAGIER_FAHRZEUG__PANZER = FAHRZEUG__PANZER;

    /**
     * The feature id for the '<em><b>Weapon Mounts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSAGIER_FAHRZEUG__WEAPON_MOUNTS = FAHRZEUG__WEAPON_MOUNTS;

    /**
     * The feature id for the '<em><b>Sitze</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG__SITZE = FAHRZEUG_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Passagier Fahrzeug</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG_FEATURE_COUNT = FAHRZEUG_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Passagier Fahrzeug</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PASSAGIER_FAHRZEUG_OPERATION_COUNT = FAHRZEUG_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__BESCHREIBUNG = PASSAGIER_FAHRZEUG__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__IMAGE = PASSAGIER_FAHRZEUG__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__NAME = PASSAGIER_FAHRZEUG__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__PARENT_ID = PASSAGIER_FAHRZEUG__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__PAGE = PASSAGIER_FAHRZEUG__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__SRC_BOOK = PASSAGIER_FAHRZEUG__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__WERT = PASSAGIER_FAHRZEUG__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__VERFUEGBARKEIT = PASSAGIER_FAHRZEUG__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__WERT_VALUE = PASSAGIER_FAHRZEUG__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__FERTIGKEIT = PASSAGIER_FAHRZEUG__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__MODS = PASSAGIER_FAHRZEUG__MODS;

    /**
     * The feature id for the '<em><b>Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__ZUSTAND_MAX = PASSAGIER_FAHRZEUG__ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Handling</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__HANDLING = PASSAGIER_FAHRZEUG__HANDLING;

    /**
     * The feature id for the '<em><b>Geschwindigkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__GESCHWINDIGKEIT = PASSAGIER_FAHRZEUG__GESCHWINDIGKEIT;

    /**
     * The feature id for the '<em><b>Beschleunigung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__BESCHLEUNIGUNG = PASSAGIER_FAHRZEUG__BESCHLEUNIGUNG;

    /**
     * The feature id for the '<em><b>Rumpf</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__RUMPF = PASSAGIER_FAHRZEUG__RUMPF;

    /**
     * The feature id for the '<em><b>Pilot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__PILOT = PASSAGIER_FAHRZEUG__PILOT;

    /**
     * The feature id for the '<em><b>Sensor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__SENSOR = PASSAGIER_FAHRZEUG__SENSOR;

    /**
     * The feature id for the '<em><b>Fahrzeug Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__FAHRZEUG_TYP = PASSAGIER_FAHRZEUG__FAHRZEUG_TYP;

    /**
     * The feature id for the '<em><b>Modifizierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__MODIFIZIERUNGEN = PASSAGIER_FAHRZEUG__MODIFIZIERUNGEN;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__PANZER = PASSAGIER_FAHRZEUG__PANZER;

    /**
     * The feature id for the '<em><b>Weapon Mounts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__WEAPON_MOUNTS = PASSAGIER_FAHRZEUG__WEAPON_MOUNTS;

    /**
     * The feature id for the '<em><b>Sitze</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__SITZE = PASSAGIER_FAHRZEUG__SITZE;

    /**
     * The feature id for the '<em><b>Handling Gelaende</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG__HANDLING_GELAENDE = PASSAGIER_FAHRZEUG_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geschwindigkeit Gelaende</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE = PASSAGIER_FAHRZEUG_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Bodenfahrzeug</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG_FEATURE_COUNT = PASSAGIER_FAHRZEUG_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Bodenfahrzeug</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BODENFAHRZEUG_OPERATION_COUNT = PASSAGIER_FAHRZEUG_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__BESCHREIBUNG = FAHRZEUG__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__IMAGE = FAHRZEUG__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__NAME = FAHRZEUG__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__PARENT_ID = FAHRZEUG__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__PAGE = FAHRZEUG__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__SRC_BOOK = FAHRZEUG__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__WERT = FAHRZEUG__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__VERFUEGBARKEIT = FAHRZEUG__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__WERT_VALUE = FAHRZEUG__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__FERTIGKEIT = FAHRZEUG__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__MODS = FAHRZEUG__MODS;

    /**
     * The feature id for the '<em><b>Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__ZUSTAND_MAX = FAHRZEUG__ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Handling</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__HANDLING = FAHRZEUG__HANDLING;

    /**
     * The feature id for the '<em><b>Geschwindigkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__GESCHWINDIGKEIT = FAHRZEUG__GESCHWINDIGKEIT;

    /**
     * The feature id for the '<em><b>Beschleunigung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__BESCHLEUNIGUNG = FAHRZEUG__BESCHLEUNIGUNG;

    /**
     * The feature id for the '<em><b>Rumpf</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__RUMPF = FAHRZEUG__RUMPF;

    /**
     * The feature id for the '<em><b>Pilot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__PILOT = FAHRZEUG__PILOT;

    /**
     * The feature id for the '<em><b>Sensor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__SENSOR = FAHRZEUG__SENSOR;

    /**
     * The feature id for the '<em><b>Fahrzeug Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__FAHRZEUG_TYP = FAHRZEUG__FAHRZEUG_TYP;

    /**
     * The feature id for the '<em><b>Modifizierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE__MODIFIZIERUNGEN = FAHRZEUG__MODIFIZIERUNGEN;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__PANZER = FAHRZEUG__PANZER;

    /**
     * The feature id for the '<em><b>Weapon Mounts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__WEAPON_MOUNTS = FAHRZEUG__WEAPON_MOUNTS;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__MATRIX_ZUSTAND_MAX = FAHRZEUG_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__GERAETESTUFE = FAHRZEUG_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__FIREWALL = FAHRZEUG_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__DATENVERARBEITUNG = FAHRZEUG_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__CURRENT_MODUS = FAHRZEUG_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Program Slot Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__PROGRAM_SLOT_COUNT = FAHRZEUG_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Running Programs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__RUNNING_PROGRAMS = FAHRZEUG_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Stored Programs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DROHNE__STORED_PROGRAMS = FAHRZEUG_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Drohne</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE_FEATURE_COUNT = FAHRZEUG_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Drohne</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DROHNE_OPERATION_COUNT = FAHRZEUG_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG_MODIFIKATION__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__WERT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION__VERFUEGBARKEIT = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG_MODIFIKATION__WERT_VALUE = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Fahrzeug Modifikation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Fahrzeug Modifikation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FAHRZEUG_MODIFIKATION_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__BESCHREIBUNG = KOERPER_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__IMAGE = KOERPER_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__NAME = KOERPER_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__KONSTITUTION = KOERPER_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__GESCHICKLICHKEIT = KOERPER_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__REAKTION = KOERPER_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__STAERKE = KOERPER_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__INITATIVE = KOERPER_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__INITATIV_WUERFEL = KOERPER_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__AUSWEICHEN = KOERPER_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__ESSENZ = KOERPER_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__EDGE_BASIS = KOERPER_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__EDGE = KOERPER_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__CHARISMA = KOERPER_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__WILLENSKRAFT = KOERPER_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__INTUITION = KOERPER_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__LOGIK = KOERPER_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__KOERPERLICH = KOERPER_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__GEISTIG = KOERPER_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SOZIAL = KOERPER_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__KONSTITUTION_BASIS = KOERPER_PERSONA__KONSTITUTION_BASIS;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__GESCHICKLICHKEIT_BASIS = KOERPER_PERSONA__GESCHICKLICHKEIT_BASIS;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__REAKTION_BASIS = KOERPER_PERSONA__REAKTION_BASIS;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__STAERKE_BASIS = KOERPER_PERSONA__STAERKE_BASIS;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__CHARISMA_BASIS = KOERPER_PERSONA__CHARISMA_BASIS;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__WILLENSKRAFT_BASIS = KOERPER_PERSONA__WILLENSKRAFT_BASIS;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__INTUITION_BASIS = KOERPER_PERSONA__INTUITION_BASIS;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__LOGIK_BASIS = KOERPER_PERSONA__LOGIK_BASIS;

    /**
     * The feature id for the '<em><b>Fertigkeiten</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__FERTIGKEITEN = KOERPER_PERSONA__FERTIGKEITEN;

    /**
     * The feature id for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__FERTIGKEITS_GRUPPEN = KOERPER_PERSONA__FERTIGKEITS_GRUPPEN;

    /**
     * The feature id for the '<em><b>Spezies</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SPEZIES = KOERPER_PERSONA__SPEZIES;

    /**
     * The feature id for the '<em><b>Mod Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__MOD_MANAGER = KOERPER_PERSONA__MOD_MANAGER;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__PANZER = KOERPER_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__ZUSTAND_KOERPERLICH_MAX = KOERPER_PERSONA__ZUSTAND_KOERPERLICH_MAX;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__ZUSTAND_GEISTIG_MAX = KOERPER_PERSONA__ZUSTAND_GEISTIG_MAX;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__ZUSTAND_GRENZE = KOERPER_PERSONA__ZUSTAND_GRENZE;

    /**
     * The feature id for the '<em><b>Koerper Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__KOERPER_MODS = KOERPER_PERSONA__KOERPER_MODS;

    /**
     * The feature id for the '<em><b>Eigenschaften</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__EIGENSCHAFTEN = KOERPER_PERSONA__EIGENSCHAFTEN;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__ZUSTAND_KOERPERLICH = KOERPER_PERSONA__ZUSTAND_KOERPERLICH;

    /**
     * The feature id for the '<em><b>Zustand Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__ZUSTAND_GEISTIG = KOERPER_PERSONA__ZUSTAND_GEISTIG;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__MATRIX_ZUSTAND_MAX = KOERPER_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__GERAETESTUFE = KOERPER_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__FIREWALL = KOERPER_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__DATENVERARBEITUNG = KOERPER_PERSONA_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__CURRENT_MODUS = KOERPER_PERSONA_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__ANGRIFF = KOERPER_PERSONA_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SCHLEICHER = KOERPER_PERSONA_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__RESONANZ = KOERPER_PERSONA_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Resonanz Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__RESONANZ_BASIS = KOERPER_PERSONA_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Complex Forms</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__COMPLEX_FORMS = KOERPER_PERSONA_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Echos</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__ECHOS = KOERPER_PERSONA_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Technomancer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER_FEATURE_COUNT = KOERPER_PERSONA_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Technomancer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER_OPERATION_COUNT = KOERPER_PERSONA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor <em>Matix Condition Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatixConditionMonitor()
     * @generated
     */
    int MATIX_CONDITION_MONITOR = 93;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX = 0;

    /**
     * The number of structural features of the '<em>Matix Condition Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATIX_CONDITION_MONITOR_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Matix Condition Monitor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATIX_CONDITION_MONITOR_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes <em>Matrix Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixAttributes()
     * @generated
     */
    int MATRIX_ATTRIBUTES = 90;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES__MATRIX_ZUSTAND_MAX = MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES__GERAETESTUFE = MATIX_CONDITION_MONITOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES__FIREWALL = MATIX_CONDITION_MONITOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES__DATENVERARBEITUNG = MATIX_CONDITION_MONITOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES__CURRENT_MODUS = MATIX_CONDITION_MONITOR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Matrix Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES_FEATURE_COUNT = MATIX_CONDITION_MONITOR_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Matrix Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_ATTRIBUTES_OPERATION_COUNT = MATIX_CONDITION_MONITOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MatrixDevice <em>Matrix Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixDevice
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixDevice()
     * @generated
     */
    int MATRIX_DEVICE = 111;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CommonProgramImpl <em>Common Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CommonProgramImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCommonProgram()
     * @generated
     */
    int COMMON_PROGRAM = 112;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice <em>Active Matix Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getActiveMatixDevice()
     * @generated
     */
    int ACTIVE_MATIX_DEVICE = 91;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__MATRIX_ZUSTAND_MAX = MATRIX_ATTRIBUTES__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__GERAETESTUFE = MATRIX_ATTRIBUTES__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__FIREWALL = MATRIX_ATTRIBUTES__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__DATENVERARBEITUNG = MATRIX_ATTRIBUTES__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__CURRENT_MODUS = MATRIX_ATTRIBUTES__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__ANGRIFF = MATRIX_ATTRIBUTES_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE__SCHLEICHER = MATRIX_ATTRIBUTES_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Active Matix Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE_FEATURE_COUNT = MATRIX_ATTRIBUTES_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Active Matix Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_MATIX_DEVICE_OPERATION_COUNT = MATRIX_ATTRIBUTES_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESONANZ_PERSONA__MATRIX_ZUSTAND_MAX = ACTIVE_MATIX_DEVICE__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__GERAETESTUFE = ACTIVE_MATIX_DEVICE__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__FIREWALL = ACTIVE_MATIX_DEVICE__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__DATENVERARBEITUNG = ACTIVE_MATIX_DEVICE__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESONANZ_PERSONA__CURRENT_MODUS = ACTIVE_MATIX_DEVICE__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__ANGRIFF = ACTIVE_MATIX_DEVICE__ANGRIFF;

    /**
     * The feature id for the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__SCHLEICHER = ACTIVE_MATIX_DEVICE__SCHLEICHER;

    /**
     * The feature id for the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__RESONANZ = ACTIVE_MATIX_DEVICE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resonanz Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA__RESONANZ_BASIS = ACTIVE_MATIX_DEVICE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Resonanz Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA_FEATURE_COUNT = ACTIVE_MATIX_DEVICE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Resonanz Persona</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESONANZ_PERSONA_OPERATION_COUNT = ACTIVE_MATIX_DEVICE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KOMPLEXE_FORM__PARENT_ID = QUELLE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__PAGE = QUELLE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__SRC_BOOK = QUELLE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__BESCHREIBUNG = QUELLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__IMAGE = QUELLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__NAME = QUELLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ziel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__ZIEL = QUELLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Dauer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__DAUER = QUELLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Schwund</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM__SCHWUND = QUELLE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Komplexe Form</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM_FEATURE_COUNT = QUELLE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Komplexe Form</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KOMPLEXE_FORM_OPERATION_COUNT = QUELLE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Form</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_KOMPLEX_FORM__FORM = ERLERNBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_KOMPLEX_FORM__STUFE = ERLERNBAR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Persona Komplex Form</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_KOMPLEX_FORM_FEATURE_COUNT = ERLERNBAR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Persona Komplex Form</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_KOMPLEX_FORM_OPERATION_COUNT = ERLERNBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPRITE__MATRIX_ZUSTAND_MAX = RESONANZ_PERSONA__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__GERAETESTUFE = RESONANZ_PERSONA__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__FIREWALL = RESONANZ_PERSONA__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__DATENVERARBEITUNG = RESONANZ_PERSONA__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPRITE__CURRENT_MODUS = RESONANZ_PERSONA__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__ANGRIFF = RESONANZ_PERSONA__ANGRIFF;

    /**
     * The feature id for the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__SCHLEICHER = RESONANZ_PERSONA__SCHLEICHER;

    /**
     * The feature id for the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__RESONANZ = RESONANZ_PERSONA__RESONANZ;

    /**
     * The feature id for the '<em><b>Resonanz Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__RESONANZ_BASIS = RESONANZ_PERSONA__RESONANZ_BASIS;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__BESCHREIBUNG = RESONANZ_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__IMAGE = RESONANZ_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__NAME = RESONANZ_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPRITE__PARENT_ID = RESONANZ_PERSONA_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__PAGE = RESONANZ_PERSONA_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__SRC_BOOK = RESONANZ_PERSONA_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__STUFE = RESONANZ_PERSONA_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Angriff Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__ANGRIFF_MOD = RESONANZ_PERSONA_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Schleicher Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__SCHLEICHER_MOD = RESONANZ_PERSONA_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Datenverarbeitung Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__DATENVERARBEITUNG_MOD = RESONANZ_PERSONA_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Firewall Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__FIREWALL_MOD = RESONANZ_PERSONA_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Initative Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE__INITATIVE_MOD = RESONANZ_PERSONA_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Sprite</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE_FEATURE_COUNT = RESONANZ_PERSONA_FEATURE_COUNT + 12;

    /**
     * The number of operations of the '<em>Sprite</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRITE_OPERATION_COUNT = RESONANZ_PERSONA_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO__BESCHREIBUNG = ABSTRAKT_MODIFIKATOREN__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO__IMAGE = ABSTRAKT_MODIFIKATOREN__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO__NAME = ABSTRAKT_MODIFIKATOREN__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO__MODS = ABSTRAKT_MODIFIKATOREN__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECHO__PARENT_ID = ABSTRAKT_MODIFIKATOREN__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO__PAGE = ABSTRAKT_MODIFIKATOREN__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO__SRC_BOOK = ABSTRAKT_MODIFIKATOREN__SRC_BOOK;

    /**
     * The number of structural features of the '<em>Echo</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO_FEATURE_COUNT = ABSTRAKT_MODIFIKATOREN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Echo</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ECHO_OPERATION_COUNT = ABSTRAKT_MODIFIKATOREN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERTRAG__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__WERT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG__VERFUEGBARKEIT = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERTRAG__WERT_VALUE = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Vertrag</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Vertrag</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VERTRAG_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__BESCHREIBUNG = VERTRAG__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__IMAGE = VERTRAG__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__NAME = VERTRAG__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__PARENT_ID = VERTRAG__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__PAGE = VERTRAG__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__SRC_BOOK = VERTRAG__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__WERT = VERTRAG__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__VERFUEGBARKEIT = VERTRAG__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__WERT_VALUE = VERTRAG__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Faelligkeits Intervall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL = VERTRAG_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Intervall Vertrag</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG_FEATURE_COUNT = VERTRAG_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Intervall Vertrag</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_VERTRAG_OPERATION_COUNT = VERTRAG_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__BESCHREIBUNG = INTERVALL_VERTRAG__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__IMAGE = INTERVALL_VERTRAG__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__NAME = INTERVALL_VERTRAG__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE__PARENT_ID = INTERVALL_VERTRAG__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__PAGE = INTERVALL_VERTRAG__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__SRC_BOOK = INTERVALL_VERTRAG__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__WERT = INTERVALL_VERTRAG__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__VERFUEGBARKEIT = INTERVALL_VERTRAG__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE__WERT_VALUE = INTERVALL_VERTRAG__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Faelligkeits Intervall</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE__FAELLIGKEITS_INTERVALL = INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL;

    /**
     * The feature id for the '<em><b>Options</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE__OPTIONS = INTERVALL_VERTRAG_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE__OWNED = INTERVALL_VERTRAG_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Lifestyle</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE_FEATURE_COUNT = INTERVALL_VERTRAG_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Lifestyle</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LIFESTYLE_OPERATION_COUNT = INTERVALL_VERTRAG_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__BESCHREIBUNG = FERTIGKEIT__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__IMAGE = FERTIGKEIT__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__NAME = FERTIGKEIT__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WISSENSFERTIGKEIT__PARENT_ID = FERTIGKEIT__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__PAGE = FERTIGKEIT__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__SRC_BOOK = FERTIGKEIT__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Kategorie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__KATEGORIE = FERTIGKEIT__KATEGORIE;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__AUSWEICHEN = FERTIGKEIT__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Attribut</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__ATTRIBUT = FERTIGKEIT__ATTRIBUT;

    /**
     * The feature id for the '<em><b>Spezialisierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT__SPEZIALISIERUNGEN = FERTIGKEIT__SPEZIALISIERUNGEN;

    /**
     * The number of structural features of the '<em>Wissensfertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT_FEATURE_COUNT = FERTIGKEIT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Wissensfertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WISSENSFERTIGKEIT_OPERATION_COUNT = FERTIGKEIT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__BESCHREIBUNG = WISSENSFERTIGKEIT__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__IMAGE = WISSENSFERTIGKEIT__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__NAME = WISSENSFERTIGKEIT__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPRACHFERTIGKEIT__PARENT_ID = WISSENSFERTIGKEIT__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__PAGE = WISSENSFERTIGKEIT__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__SRC_BOOK = WISSENSFERTIGKEIT__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Kategorie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__KATEGORIE = WISSENSFERTIGKEIT__KATEGORIE;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__AUSWEICHEN = WISSENSFERTIGKEIT__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Attribut</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__ATTRIBUT = WISSENSFERTIGKEIT__ATTRIBUT;

    /**
     * The feature id for the '<em><b>Spezialisierungen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT__SPEZIALISIERUNGEN = WISSENSFERTIGKEIT__SPEZIALISIERUNGEN;

    /**
     * The number of structural features of the '<em>Sprachfertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT_FEATURE_COUNT = WISSENSFERTIGKEIT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Sprachfertigkeit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPRACHFERTIGKEIT_OPERATION_COUNT = WISSENSFERTIGKEIT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Zustand Koerperlich Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX = 0;

    /**
     * The feature id for the '<em><b>Zustand Geistig Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX = 1;

    /**
     * The feature id for the '<em><b>Zustand Grenze</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_ZUSTAND__ZUSTAND_GRENZE = 2;

    /**
     * The number of structural features of the '<em>Persona Zustand</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_ZUSTAND_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Persona Zustand</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_ZUSTAND_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__BESCHREIBUNG = SPEZIES__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__IMAGE = SPEZIES__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__NAME = SPEZIES__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__MODS = SPEZIES__MODS;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__PARENT_ID = SPEZIES__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__PAGE = SPEZIES__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__SRC_BOOK = SPEZIES__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Konstitution Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__KONSTITUTION_MIN = SPEZIES__KONSTITUTION_MIN;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__GESCHICKLICHKEIT_MIN = SPEZIES__GESCHICKLICHKEIT_MIN;

    /**
     * The feature id for the '<em><b>Reaktion Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__REAKTION_MIN = SPEZIES__REAKTION_MIN;

    /**
     * The feature id for the '<em><b>Staerke Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__STAERKE_MIN = SPEZIES__STAERKE_MIN;

    /**
     * The feature id for the '<em><b>Charisma Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__CHARISMA_MIN = SPEZIES__CHARISMA_MIN;

    /**
     * The feature id for the '<em><b>Willenskraft Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__WILLENSKRAFT_MIN = SPEZIES__WILLENSKRAFT_MIN;

    /**
     * The feature id for the '<em><b>Intuition Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__INTUITION_MIN = SPEZIES__INTUITION_MIN;

    /**
     * The feature id for the '<em><b>Logik Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__LOGIK_MIN = SPEZIES__LOGIK_MIN;

    /**
     * The feature id for the '<em><b>Edge Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__EDGE_MIN = SPEZIES__EDGE_MIN;

    /**
     * The feature id for the '<em><b>Magie Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__MAGIE_MIN = SPEZIES__MAGIE_MIN;

    /**
     * The feature id for the '<em><b>Resonanz Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__RESONANZ_MIN = SPEZIES__RESONANZ_MIN;

    /**
     * The feature id for the '<em><b>Essenz Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__ESSENZ_MIN = SPEZIES__ESSENZ_MIN;

    /**
     * The feature id for the '<em><b>Konstitution Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__KONSTITUTION_MAX = SPEZIES__KONSTITUTION_MAX;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__GESCHICKLICHKEIT_MAX = SPEZIES__GESCHICKLICHKEIT_MAX;

    /**
     * The feature id for the '<em><b>Reaktion Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__REAKTION_MAX = SPEZIES__REAKTION_MAX;

    /**
     * The feature id for the '<em><b>Staerke Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__STAERKE_MAX = SPEZIES__STAERKE_MAX;

    /**
     * The feature id for the '<em><b>Charisma Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__CHARISMA_MAX = SPEZIES__CHARISMA_MAX;

    /**
     * The feature id for the '<em><b>Willenskraft Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__WILLENSKRAFT_MAX = SPEZIES__WILLENSKRAFT_MAX;

    /**
     * The feature id for the '<em><b>Intuition Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__INTUITION_MAX = SPEZIES__INTUITION_MAX;

    /**
     * The feature id for the '<em><b>Logik Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__LOGIK_MAX = SPEZIES__LOGIK_MAX;

    /**
     * The feature id for the '<em><b>Edge Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__EDGE_MAX = SPEZIES__EDGE_MAX;

    /**
     * The feature id for the '<em><b>Magie Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__MAGIE_MAX = SPEZIES__MAGIE_MAX;

    /**
     * The feature id for the '<em><b>Resonanz Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__RESONANZ_MAX = SPEZIES__RESONANZ_MAX;

    /**
     * The feature id for the '<em><b>Essenz Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__ESSENZ_MAX = SPEZIES__ESSENZ_MAX;

    /**
     * The feature id for the '<em><b>Laufen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__LAUFEN = SPEZIES__LAUFEN;

    /**
     * The feature id for the '<em><b>Rennen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__RENNEN = SPEZIES__RENNEN;

    /**
     * The feature id for the '<em><b>Sprinten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__SPRINTEN = SPEZIES__SPRINTEN;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__ANGRIFF = SPEZIES__ANGRIFF;

    /**
     * The feature id for the '<em><b>Powers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER__POWERS = SPEZIES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Critter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER_FEATURE_COUNT = SPEZIES_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Critter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRITTER_OPERATION_COUNT = SPEZIES_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__BESCHREIBUNG = VERTRAG__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__IMAGE = VERTRAG__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__NAME = VERTRAG__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__PARENT_ID = VERTRAG__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__PAGE = VERTRAG__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__SRC_BOOK = VERTRAG__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__WERT = VERTRAG__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__VERFUEGBARKEIT = VERTRAG__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__WERT_VALUE = VERTRAG__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__STUFE = VERTRAG_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Gefaelscht</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE__GEFAELSCHT = VERTRAG_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Fakeable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE_FEATURE_COUNT = VERTRAG_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Fakeable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAKEABLE_OPERATION_COUNT = VERTRAG_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__BESCHREIBUNG = FAKEABLE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__IMAGE = FAKEABLE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__NAME = FAKEABLE__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__PARENT_ID = FAKEABLE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__PAGE = FAKEABLE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__SRC_BOOK = FAKEABLE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__WERT = FAKEABLE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__VERFUEGBARKEIT = FAKEABLE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__WERT_VALUE = FAKEABLE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__STUFE = FAKEABLE__STUFE;

    /**
     * The feature id for the '<em><b>Gefaelscht</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN__GEFAELSCHT = FAKEABLE__GEFAELSCHT;

    /**
     * The number of structural features of the '<em>Sin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN_FEATURE_COUNT = FAKEABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Sin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIN_OPERATION_COUNT = FAKEABLE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__BESCHREIBUNG = FAKEABLE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__IMAGE = FAKEABLE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__NAME = FAKEABLE__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__PARENT_ID = FAKEABLE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__PAGE = FAKEABLE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__SRC_BOOK = FAKEABLE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__WERT = FAKEABLE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__VERFUEGBARKEIT = FAKEABLE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__WERT_VALUE = FAKEABLE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__STUFE = FAKEABLE__STUFE;

    /**
     * The feature id for the '<em><b>Gefaelscht</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__GEFAELSCHT = FAKEABLE__GEFAELSCHT;

    /**
     * The feature id for the '<em><b>Lizen Gegenstand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__LIZEN_GEGENSTAND = FAKEABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lizenz Traeger</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ__LIZENZ_TRAEGER = FAKEABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Lizenz</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ_FEATURE_COUNT = FAKEABLE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Lizenz</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIZENZ_OPERATION_COUNT = FAKEABLE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__PARENT_ID = ABSTRAKT_GEGENSTAND__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__PAGE = ABSTRAKT_GEGENSTAND__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__SRC_BOOK = ABSTRAKT_GEGENSTAND__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__WERT = ABSTRAKT_GEGENSTAND__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__VERFUEGBARKEIT = ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__WERT_VALUE = ABSTRAKT_GEGENSTAND__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__BESCHREIBUNG = ABSTRAKT_GEGENSTAND__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__IMAGE = ABSTRAKT_GEGENSTAND__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__NAME = ABSTRAKT_GEGENSTAND__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__MODS = ABSTRAKT_GEGENSTAND__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__FERTIGKEIT = ABSTRAKT_GEGENSTAND__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__MAX_VALUE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Transactionlog</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__TRANSACTIONLOG = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Current Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK__CURRENT_VALUE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Credstick</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_FEATURE_COUNT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Credstick</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_OPERATION_COUNT = ABSTRAKT_GEGENSTAND_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Anzahl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENGE__ANZAHL = 0;

    /**
     * The feature id for the '<em><b>Pro Anzahl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENGE__PRO_ANZAHL = 1;

    /**
     * The number of structural features of the '<em>Menge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENGE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Menge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENGE_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__PARENT_ID = ABSTRAKT_GEGENSTAND__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__PAGE = ABSTRAKT_GEGENSTAND__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__SRC_BOOK = ABSTRAKT_GEGENSTAND__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__WERT = ABSTRAKT_GEGENSTAND__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__VERFUEGBARKEIT = ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__WERT_VALUE = ABSTRAKT_GEGENSTAND__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__BESCHREIBUNG = ABSTRAKT_GEGENSTAND__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__IMAGE = ABSTRAKT_GEGENSTAND__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__NAME = ABSTRAKT_GEGENSTAND__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__MODS = ABSTRAKT_GEGENSTAND__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__FERTIGKEIT = ABSTRAKT_GEGENSTAND__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Anzahl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__ANZAHL = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pro Anzahl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__PRO_ANZAHL = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Damage Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__DAMAGE_TYPE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Damage Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__DAMAGE_MOD = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Armor Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__ARMOR_MOD = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION__TYPE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Munition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION_FEATURE_COUNT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Munition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUNITION_OPERATION_COUNT = ABSTRAKT_GEGENSTAND_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dienste</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEBUNDENER_GEIST__DIENSTE = 0;

    /**
     * The feature id for the '<em><b>Geist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEBUNDENER_GEIST__GEIST = 1;

    /**
     * The number of structural features of the '<em>Gebundener Geist</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEBUNDENER_GEIST_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Gebundener Geist</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEBUNDENER_GEIST_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__PARENT_ID = QUELLE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__PAGE = QUELLE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__SRC_BOOK = QUELLE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__INITATIVE = QUELLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__INITATIV_WUERFEL = QUELLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__AUSWEICHEN = QUELLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__ESSENZ = QUELLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__EDGE_BASIS = QUELLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__EDGE = QUELLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__CHARISMA = QUELLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__WILLENSKRAFT = QUELLE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__INTUITION = QUELLE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__LOGIK = QUELLE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__KONSTITUTION = QUELLE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__GESCHICKLICHKEIT = QUELLE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__REAKTION = QUELLE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__STAERKE = QUELLE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__BESCHREIBUNG = QUELLE_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__IMAGE = QUELLE_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__NAME = QUELLE_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__KOERPERLICH = QUELLE_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__GEISTIG = QUELLE_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__SOZIAL = QUELLE_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__PANZER = QUELLE_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__STUFE = QUELLE_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__SKILL_GROUPS = QUELLE_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA__SKILLS = QUELLE_FEATURE_COUNT + 23;

    /**
     * The number of structural features of the '<em>Stufen Persona</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA_FEATURE_COUNT = QUELLE_FEATURE_COUNT + 24;

    /**
     * The number of operations of the '<em>Stufen Persona</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STUFEN_PERSONA_OPERATION_COUNT = QUELLE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__PARENT_ID = STUFEN_PERSONA__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__PAGE = STUFEN_PERSONA__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__SRC_BOOK = STUFEN_PERSONA__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__INITATIVE = STUFEN_PERSONA__INITATIVE;

    /**
     * The feature id for the '<em><b>Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__INITATIV_WUERFEL = STUFEN_PERSONA__INITATIV_WUERFEL;

    /**
     * The feature id for the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__AUSWEICHEN = STUFEN_PERSONA__AUSWEICHEN;

    /**
     * The feature id for the '<em><b>Essenz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ESSENZ = STUFEN_PERSONA__ESSENZ;

    /**
     * The feature id for the '<em><b>Edge Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__EDGE_BASIS = STUFEN_PERSONA__EDGE_BASIS;

    /**
     * The feature id for the '<em><b>Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__EDGE = STUFEN_PERSONA__EDGE;

    /**
     * The feature id for the '<em><b>Charisma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__CHARISMA = STUFEN_PERSONA__CHARISMA;

    /**
     * The feature id for the '<em><b>Willenskraft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__WILLENSKRAFT = STUFEN_PERSONA__WILLENSKRAFT;

    /**
     * The feature id for the '<em><b>Intuition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__INTUITION = STUFEN_PERSONA__INTUITION;

    /**
     * The feature id for the '<em><b>Logik</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__LOGIK = STUFEN_PERSONA__LOGIK;

    /**
     * The feature id for the '<em><b>Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__KONSTITUTION = STUFEN_PERSONA__KONSTITUTION;

    /**
     * The feature id for the '<em><b>Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__GESCHICKLICHKEIT = STUFEN_PERSONA__GESCHICKLICHKEIT;

    /**
     * The feature id for the '<em><b>Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__REAKTION = STUFEN_PERSONA__REAKTION;

    /**
     * The feature id for the '<em><b>Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__STAERKE = STUFEN_PERSONA__STAERKE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__BESCHREIBUNG = STUFEN_PERSONA__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__IMAGE = STUFEN_PERSONA__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__NAME = STUFEN_PERSONA__NAME;

    /**
     * The feature id for the '<em><b>Koerperlich</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__KOERPERLICH = STUFEN_PERSONA__KOERPERLICH;

    /**
     * The feature id for the '<em><b>Geistig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__GEISTIG = STUFEN_PERSONA__GEISTIG;

    /**
     * The feature id for the '<em><b>Sozial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__SOZIAL = STUFEN_PERSONA__SOZIAL;

    /**
     * The feature id for the '<em><b>Panzer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__PANZER = STUFEN_PERSONA__PANZER;

    /**
     * The feature id for the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__STUFE = STUFEN_PERSONA__STUFE;

    /**
     * The feature id for the '<em><b>Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__SKILL_GROUPS = STUFEN_PERSONA__SKILL_GROUPS;

    /**
     * The feature id for the '<em><b>Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__SKILLS = STUFEN_PERSONA__SKILLS;

    /**
     * The feature id for the '<em><b>Astrales Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALES_LIMIT = STUFEN_PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Astrale Konstitution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_KONSTITUTION = STUFEN_PERSONA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Astrale Geschicklichkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_GESCHICKLICHKEIT = STUFEN_PERSONA_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Astrale Reaktion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_REAKTION = STUFEN_PERSONA_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Astrale Staerke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_STAERKE = STUFEN_PERSONA_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Astrale Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_INITATIVE = STUFEN_PERSONA_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Astrale Initativ Wuerfel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_INITATIV_WUERFEL = STUFEN_PERSONA_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Astrale Panzerung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__ASTRALE_PANZERUNG = STUFEN_PERSONA_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Konstitution Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__KONSTITUTION_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Geschicklichkeit Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__GESCHICKLICHKEIT_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Reaktion Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__REAKTION_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Staerke Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__STAERKE_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Charisma Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__CHARISMA_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Willenskraft Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__WILLENSKRAFT_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Intuition Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__INTUITION_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Logik Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__LOGIK_BASIS = STUFEN_PERSONA_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Powers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__POWERS = STUFEN_PERSONA_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Optional Powers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST__OPTIONAL_POWERS = STUFEN_PERSONA_FEATURE_COUNT + 17;

    /**
     * The number of structural features of the '<em>Geist</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST_FEATURE_COUNT = STUFEN_PERSONA_FEATURE_COUNT + 18;

    /**
     * The number of operations of the '<em>Geist</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEIST_OPERATION_COUNT = STUFEN_PERSONA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CredstickTransactionImpl <em>Credstick Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CredstickTransactionImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCredstickTransaction()
     * @generated
     */
    int CREDSTICK_TRANSACTION = 88;

    /**
     * The feature id for the '<em><b>Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_TRANSACTION__AMOUNT = 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_TRANSACTION__DATE = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_TRANSACTION__DESCRIPTION = 2;

    /**
     * The number of structural features of the '<em>Credstick Transaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_TRANSACTION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Credstick Transaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREDSTICK_TRANSACTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SpezialisierungImpl <em>Spezialisierung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SpezialisierungImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSpezialisierung()
     * @generated
     */
    int SPEZIALISIERUNG = 89;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Spezialisierung</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Spezialisierung</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPEZIALISIERUNG_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice <em>Abstract Matrix Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AbstractMatrixDevice
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstractMatrixDevice()
     * @generated
     */
    int ABSTRACT_MATRIX_DEVICE = 108;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__PARENT_ID = ABSTRAKT_GEGENSTAND__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__PAGE = ABSTRAKT_GEGENSTAND__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__SRC_BOOK = ABSTRAKT_GEGENSTAND__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__WERT = ABSTRAKT_GEGENSTAND__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__VERFUEGBARKEIT = ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__WERT_VALUE = ABSTRAKT_GEGENSTAND__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__BESCHREIBUNG = ABSTRAKT_GEGENSTAND__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__IMAGE = ABSTRAKT_GEGENSTAND__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__NAME = ABSTRAKT_GEGENSTAND__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__MODS = ABSTRAKT_GEGENSTAND__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__FERTIGKEIT = ABSTRAKT_GEGENSTAND__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__MATRIX_ZUSTAND_MAX = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__GERAETESTUFE = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__FIREWALL = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__DATENVERARBEITUNG = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__CURRENT_MODUS = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Pan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__PAN = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Device Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE__DEVICE_RATING = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Abstract Matrix Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT = ABSTRAKT_GEGENSTAND_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Abstract Matrix Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MATRIX_DEVICE_OPERATION_COUNT = ABSTRAKT_GEGENSTAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl <em>Commlink</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CommlinkImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCommlink()
     * @generated
     */
    int COMMLINK = 92;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__PARENT_ID = ABSTRACT_MATRIX_DEVICE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__PAGE = ABSTRACT_MATRIX_DEVICE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__SRC_BOOK = ABSTRACT_MATRIX_DEVICE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__WERT = ABSTRACT_MATRIX_DEVICE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__VERFUEGBARKEIT = ABSTRACT_MATRIX_DEVICE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__WERT_VALUE = ABSTRACT_MATRIX_DEVICE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__BESCHREIBUNG = ABSTRACT_MATRIX_DEVICE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__IMAGE = ABSTRACT_MATRIX_DEVICE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__NAME = ABSTRACT_MATRIX_DEVICE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__MODS = ABSTRACT_MATRIX_DEVICE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__FERTIGKEIT = ABSTRACT_MATRIX_DEVICE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__MATRIX_ZUSTAND_MAX = ABSTRACT_MATRIX_DEVICE__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__GERAETESTUFE = ABSTRACT_MATRIX_DEVICE__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__FIREWALL = ABSTRACT_MATRIX_DEVICE__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__DATENVERARBEITUNG = ABSTRACT_MATRIX_DEVICE__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__CURRENT_MODUS = ABSTRACT_MATRIX_DEVICE__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Pan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__PAN = ABSTRACT_MATRIX_DEVICE__PAN;

    /**
     * The feature id for the '<em><b>Device Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__DEVICE_RATING = ABSTRACT_MATRIX_DEVICE__DEVICE_RATING;

    /**
     * The feature id for the '<em><b>Stored Programs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK__STORED_PROGRAMS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Commlink</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK_FEATURE_COUNT = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Commlink</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMLINK_OPERATION_COUNT = ABSTRACT_MATRIX_DEVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl <em>Cyberdeck</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.CyberdeckImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCyberdeck()
     * @generated
     */
    int CYBERDECK = 94;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__PARENT_ID = ABSTRACT_MATRIX_DEVICE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__PAGE = ABSTRACT_MATRIX_DEVICE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__SRC_BOOK = ABSTRACT_MATRIX_DEVICE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__WERT = ABSTRACT_MATRIX_DEVICE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__VERFUEGBARKEIT = ABSTRACT_MATRIX_DEVICE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__WERT_VALUE = ABSTRACT_MATRIX_DEVICE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__BESCHREIBUNG = ABSTRACT_MATRIX_DEVICE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__IMAGE = ABSTRACT_MATRIX_DEVICE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__NAME = ABSTRACT_MATRIX_DEVICE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__MODS = ABSTRACT_MATRIX_DEVICE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__FERTIGKEIT = ABSTRACT_MATRIX_DEVICE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__MATRIX_ZUSTAND_MAX = ABSTRACT_MATRIX_DEVICE__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__GERAETESTUFE = ABSTRACT_MATRIX_DEVICE__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__FIREWALL = ABSTRACT_MATRIX_DEVICE__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__DATENVERARBEITUNG = ABSTRACT_MATRIX_DEVICE__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__CURRENT_MODUS = ABSTRACT_MATRIX_DEVICE__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Pan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__PAN = ABSTRACT_MATRIX_DEVICE__PAN;

    /**
     * The feature id for the '<em><b>Device Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__DEVICE_RATING = ABSTRACT_MATRIX_DEVICE__DEVICE_RATING;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__ANGRIFF = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__SCHLEICHER = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Program Slots</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__PROGRAM_SLOTS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Attribute1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__ATTRIBUTE1 = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Attribute2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__ATTRIBUTE2 = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Attribute3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__ATTRIBUTE3 = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Attribute4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__ATTRIBUTE4 = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__CONFIGURATION = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Stored Programs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__STORED_PROGRAMS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Running Programs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK__RUNNING_PROGRAMS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Cyberdeck</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK_FEATURE_COUNT = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Cyberdeck</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERDECK_OPERATION_COUNT = ABSTRACT_MATRIX_DEVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.Software <em>Software</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Software
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSoftware()
     * @generated
     */
    int SOFTWARE = 100;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__WERT = GELD_WERT__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__VERFUEGBARKEIT = GELD_WERT__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__WERT_VALUE = GELD_WERT__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__BESCHREIBUNG = GELD_WERT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__IMAGE = GELD_WERT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__NAME = GELD_WERT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__PARENT_ID = GELD_WERT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__PAGE = GELD_WERT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE__SRC_BOOK = GELD_WERT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Software</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_FEATURE_COUNT = GELD_WERT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Software</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_OPERATION_COUNT = GELD_WERT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.BasicProgramImpl <em>Basic Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.BasicProgramImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBasicProgram()
     * @generated
     */
    int BASIC_PROGRAM = 106;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MatrixProgram <em>Matrix Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixProgram
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixProgram()
     * @generated
     */
    int MATRIX_PROGRAM = 101;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__WERT = SOFTWARE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__VERFUEGBARKEIT = SOFTWARE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__WERT_VALUE = SOFTWARE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__BESCHREIBUNG = SOFTWARE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__IMAGE = SOFTWARE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__NAME = SOFTWARE__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__PARENT_ID = SOFTWARE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__PAGE = SOFTWARE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM__SRC_BOOK = SOFTWARE__SRC_BOOK;

    /**
     * The number of structural features of the '<em>Matrix Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Matrix Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_PROGRAM_OPERATION_COUNT = SOFTWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSoftwareAgent()
     * @generated
     */
    int SOFTWARE_AGENT = 95;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__WERT = MATRIX_PROGRAM__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__VERFUEGBARKEIT = MATRIX_PROGRAM__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__WERT_VALUE = MATRIX_PROGRAM__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__BESCHREIBUNG = MATRIX_PROGRAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__IMAGE = MATRIX_PROGRAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__NAME = MATRIX_PROGRAM__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__PARENT_ID = MATRIX_PROGRAM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__PAGE = MATRIX_PROGRAM__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__SRC_BOOK = MATRIX_PROGRAM__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT__RATING = MATRIX_PROGRAM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Software Agent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT_FEATURE_COUNT = MATRIX_PROGRAM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Software Agent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_AGENT_OPERATION_COUNT = MATRIX_PROGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.HostImpl <em>Host</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.HostImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getHost()
     * @generated
     */
    int HOST = 96;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__MATRIX_ZUSTAND_MAX = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__GERAETESTUFE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__FIREWALL = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__DATENVERARBEITUNG = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__CURRENT_MODUS = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Pan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__PAN = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__ANGRIFF = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST__SCHLEICHER = BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Host</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOST_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren <em>Cyberware Modifikatioren</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCyberwareModifikatioren()
     * @generated
     */
    int CYBERWARE_MODIFIKATIOREN = 97;

    /**
     * The feature id for the '<em><b>Direct Neural Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN__DIRECT_NEURAL_INTERFACE = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Universal Data Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN__UNIVERSAL_DATA_CONNECTOR = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Control Rig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN__CONTROL_RIG = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sim Rig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN__SIM_RIG = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Rigger Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN__RIGGER_INTERFACE = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Cyberware Modifikatioren</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN_FEATURE_COUNT = MODIFIKATOR_ATTRIBUTE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Cyberware Modifikatioren</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CYBERWARE_MODIFIKATIOREN_OPERATION_COUNT = MODIFIKATOR_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl <em>Rigger Command Console</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getRiggerCommandConsole()
     * @generated
     */
    int RIGGER_COMMAND_CONSOLE = 98;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__PARENT_ID = ABSTRACT_MATRIX_DEVICE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__PAGE = ABSTRACT_MATRIX_DEVICE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__SRC_BOOK = ABSTRACT_MATRIX_DEVICE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__WERT = ABSTRACT_MATRIX_DEVICE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__VERFUEGBARKEIT = ABSTRACT_MATRIX_DEVICE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__WERT_VALUE = ABSTRACT_MATRIX_DEVICE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__BESCHREIBUNG = ABSTRACT_MATRIX_DEVICE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__IMAGE = ABSTRACT_MATRIX_DEVICE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__NAME = ABSTRACT_MATRIX_DEVICE__NAME;

    /**
     * The feature id for the '<em><b>Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__MODS = ABSTRACT_MATRIX_DEVICE__MODS;

    /**
     * The feature id for the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__FERTIGKEIT = ABSTRACT_MATRIX_DEVICE__FERTIGKEIT;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__MATRIX_ZUSTAND_MAX = ABSTRACT_MATRIX_DEVICE__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__GERAETESTUFE = ABSTRACT_MATRIX_DEVICE__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__FIREWALL = ABSTRACT_MATRIX_DEVICE__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG = ABSTRACT_MATRIX_DEVICE__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__CURRENT_MODUS = ABSTRACT_MATRIX_DEVICE__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Pan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__PAN = ABSTRACT_MATRIX_DEVICE__PAN;

    /**
     * The feature id for the '<em><b>Device Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__DEVICE_RATING = ABSTRACT_MATRIX_DEVICE__DEVICE_RATING;

    /**
     * The feature id for the '<em><b>Rauschunterdrueckung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Zugriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__ZUGRIFF = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Datenverarbeitung Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Firewall Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Zugriff Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Stored Programs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Running Programs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Rigger Command Console</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE_FEATURE_COUNT = ABSTRACT_MATRIX_DEVICE_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Rigger Command Console</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_COMMAND_CONSOLE_OPERATION_COUNT = ABSTRACT_MATRIX_DEVICE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.RiggerProgram <em>Rigger Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.RiggerProgram
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getRiggerProgram()
     * @generated
     */
    int RIGGER_PROGRAM = 110;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__WERT = SOFTWARE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__VERFUEGBARKEIT = SOFTWARE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__WERT_VALUE = SOFTWARE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__BESCHREIBUNG = SOFTWARE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__IMAGE = SOFTWARE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__NAME = SOFTWARE__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__PARENT_ID = SOFTWARE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__PAGE = SOFTWARE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM__SRC_BOOK = SOFTWARE__SRC_BOOK;

    /**
     * The number of structural features of the '<em>Rigger Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Rigger Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RIGGER_PROGRAM_OPERATION_COUNT = SOFTWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl <em>Auto Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.AutoSoftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAutoSoft()
     * @generated
     */
    int AUTO_SOFT = 99;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__WERT = RIGGER_PROGRAM__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__VERFUEGBARKEIT = RIGGER_PROGRAM__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__WERT_VALUE = RIGGER_PROGRAM__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__BESCHREIBUNG = RIGGER_PROGRAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__IMAGE = RIGGER_PROGRAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__NAME = RIGGER_PROGRAM__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__PARENT_ID = RIGGER_PROGRAM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__PAGE = RIGGER_PROGRAM__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__SRC_BOOK = RIGGER_PROGRAM__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__RATING = RIGGER_PROGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__SKILL = RIGGER_PROGRAM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Weapon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__WEAPON = RIGGER_PROGRAM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT__MODEL = RIGGER_PROGRAM_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Auto Soft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT_FEATURE_COUNT = RIGGER_PROGRAM_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Auto Soft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTO_SOFT_OPERATION_COUNT = RIGGER_PROGRAM_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__WERT = SOFTWARE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__VERFUEGBARKEIT = SOFTWARE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__WERT_VALUE = SOFTWARE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__BESCHREIBUNG = SOFTWARE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__IMAGE = SOFTWARE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__NAME = SOFTWARE__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__PARENT_ID = SOFTWARE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__PAGE = SOFTWARE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM__SRC_BOOK = SOFTWARE__SRC_BOOK;

    /**
     * The number of structural features of the '<em>Basic Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Basic Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_PROGRAM_OPERATION_COUNT = SOFTWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.TutorsoftImpl <em>Tutorsoft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.TutorsoftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getTutorsoft()
     * @generated
     */
    int TUTORSOFT = 102;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__WERT = BASIC_PROGRAM__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__VERFUEGBARKEIT = BASIC_PROGRAM__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__WERT_VALUE = BASIC_PROGRAM__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__BESCHREIBUNG = BASIC_PROGRAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__IMAGE = BASIC_PROGRAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__NAME = BASIC_PROGRAM__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__PARENT_ID = BASIC_PROGRAM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__PAGE = BASIC_PROGRAM__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__SRC_BOOK = BASIC_PROGRAM__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__RATING = BASIC_PROGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT__SKILL = BASIC_PROGRAM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Tutorsoft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT_FEATURE_COUNT = BASIC_PROGRAM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Tutorsoft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUTORSOFT_OPERATION_COUNT = BASIC_PROGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl <em>Skill Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.SkillSoftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSkillSoft()
     * @generated
     */
    int SKILL_SOFT = 103;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__WERT = SOFTWARE__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__VERFUEGBARKEIT = SOFTWARE__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__WERT_VALUE = SOFTWARE__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__BESCHREIBUNG = SOFTWARE__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__IMAGE = SOFTWARE__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__NAME = SOFTWARE__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__PARENT_ID = SOFTWARE__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__PAGE = SOFTWARE__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__SRC_BOOK = SOFTWARE__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__SKILL = SOFTWARE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT__RATING = SOFTWARE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Skill Soft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Skill Soft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_SOFT_OPERATION_COUNT = SOFTWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand <em>Fahrzeug Zustand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFahrzeugZustand()
     * @generated
     */
    int FAHRZEUG_ZUSTAND = 104;

    /**
     * The feature id for the '<em><b>Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG_ZUSTAND__ZUSTAND_MAX = 0;

    /**
     * The number of structural features of the '<em>Fahrzeug Zustand</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG_ZUSTAND_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Fahrzeug Zustand</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAHRZEUG_ZUSTAND_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl <em>Personal Area Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonalAreaNetwork()
     * @generated
     */
    int PERSONAL_AREA_NETWORK = 105;

    /**
     * The feature id for the '<em><b>Slaves</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONAL_AREA_NETWORK__SLAVES = 0;

    /**
     * The feature id for the '<em><b>Master</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONAL_AREA_NETWORK__MASTER = 1;

    /**
     * The feature id for the '<em><b>Slave Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONAL_AREA_NETWORK__SLAVE_MAX = 2;

    /**
     * The number of structural features of the '<em>Personal Area Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONAL_AREA_NETWORK_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Personal Area Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONAL_AREA_NETWORK_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.DatasoftImpl <em>Datasoft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.DatasoftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getDatasoft()
     * @generated
     */
    int DATASOFT = 107;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__WERT = BASIC_PROGRAM__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__VERFUEGBARKEIT = BASIC_PROGRAM__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__WERT_VALUE = BASIC_PROGRAM__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__BESCHREIBUNG = BASIC_PROGRAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__IMAGE = BASIC_PROGRAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__NAME = BASIC_PROGRAM__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__PARENT_ID = BASIC_PROGRAM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__PAGE = BASIC_PROGRAM__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__SRC_BOOK = BASIC_PROGRAM__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT__SKILL = BASIC_PROGRAM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Datasoft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT_FEATURE_COUNT = BASIC_PROGRAM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Datasoft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASOFT_OPERATION_COUNT = BASIC_PROGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.ConsumerSoftImpl <em>Consumer Soft</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.ConsumerSoftImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getConsumerSoft()
     * @generated
     */
    int CONSUMER_SOFT = 109;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__WERT = BASIC_PROGRAM__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__VERFUEGBARKEIT = BASIC_PROGRAM__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__WERT_VALUE = BASIC_PROGRAM__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__BESCHREIBUNG = BASIC_PROGRAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__IMAGE = BASIC_PROGRAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__NAME = BASIC_PROGRAM__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__PARENT_ID = BASIC_PROGRAM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__PAGE = BASIC_PROGRAM__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__SRC_BOOK = BASIC_PROGRAM__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT__TYPE = BASIC_PROGRAM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Consumer Soft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT_FEATURE_COUNT = BASIC_PROGRAM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Consumer Soft</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSUMER_SOFT_OPERATION_COUNT = BASIC_PROGRAM_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE__MATRIX_ZUSTAND_MAX = MATRIX_ATTRIBUTES__MATRIX_ZUSTAND_MAX;

    /**
     * The feature id for the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE__GERAETESTUFE = MATRIX_ATTRIBUTES__GERAETESTUFE;

    /**
     * The feature id for the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE__FIREWALL = MATRIX_ATTRIBUTES__FIREWALL;

    /**
     * The feature id for the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE__DATENVERARBEITUNG = MATRIX_ATTRIBUTES__DATENVERARBEITUNG;

    /**
     * The feature id for the '<em><b>Current Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE__CURRENT_MODUS = MATRIX_ATTRIBUTES__CURRENT_MODUS;

    /**
     * The feature id for the '<em><b>Pan</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE__PAN = MATRIX_ATTRIBUTES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Matrix Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE_FEATURE_COUNT = MATRIX_ATTRIBUTES_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Matrix Device</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_DEVICE_OPERATION_COUNT = MATRIX_ATTRIBUTES_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__WERT = MATRIX_PROGRAM__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__VERFUEGBARKEIT = MATRIX_PROGRAM__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__WERT_VALUE = MATRIX_PROGRAM__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__BESCHREIBUNG = MATRIX_PROGRAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__IMAGE = MATRIX_PROGRAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__NAME = MATRIX_PROGRAM__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__PARENT_ID = MATRIX_PROGRAM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__PAGE = MATRIX_PROGRAM__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__SRC_BOOK = MATRIX_PROGRAM__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Program Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM__PROGRAM_TYPE = MATRIX_PROGRAM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Common Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM_FEATURE_COUNT = MATRIX_PROGRAM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Common Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMON_PROGRAM_OPERATION_COUNT = MATRIX_PROGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.WeaponMountImpl <em>Weapon Mount</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.WeaponMountImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getWeaponMount()
     * @generated
     */
    int WEAPON_MOUNT = 113;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__BESCHREIBUNG = FAHRZEUG_MODIFIKATION__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__IMAGE = FAHRZEUG_MODIFIKATION__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__NAME = FAHRZEUG_MODIFIKATION__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__PARENT_ID = FAHRZEUG_MODIFIKATION__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__PAGE = FAHRZEUG_MODIFIKATION__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__SRC_BOOK = FAHRZEUG_MODIFIKATION__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__WERT = FAHRZEUG_MODIFIKATION__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__VERFUEGBARKEIT = FAHRZEUG_MODIFIKATION__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__WERT_VALUE = FAHRZEUG_MODIFIKATION__WERT_VALUE;

    /**
     * The feature id for the '<em><b>Weapon</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT__WEAPON = FAHRZEUG_MODIFIKATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Weapon Mount</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT_FEATURE_COUNT = FAHRZEUG_MODIFIKATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Weapon Mount</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAPON_MOUNT_OPERATION_COUNT = FAHRZEUG_MODIFIKATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.LifestyleOptionImpl <em>Lifestyle Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.LifestyleOptionImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getLifestyleOption()
     * @generated
     */
    int LIFESTYLE_OPTION = 114;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__BESCHREIBUNG = BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__IMAGE = BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__NAME = BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__PARENT_ID = BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__PAGE = BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__SRC_BOOK = BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__WERT = BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__VERFUEGBARKEIT = BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION__WERT_VALUE = BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Lifestyle Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION_FEATURE_COUNT = BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Lifestyle Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_OPTION_OPERATION_COUNT = BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.impl.PercentLifestyleOptionImpl <em>Percent Lifestyle Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.impl.PercentLifestyleOptionImpl
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPercentLifestyleOption()
     * @generated
     */
    int PERCENT_LIFESTYLE_OPTION = 115;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__BESCHREIBUNG = LIFESTYLE_OPTION__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__IMAGE = LIFESTYLE_OPTION__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__NAME = LIFESTYLE_OPTION__NAME;

    /**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__PARENT_ID = LIFESTYLE_OPTION__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__PAGE = LIFESTYLE_OPTION__PAGE;

    /**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__SRC_BOOK = LIFESTYLE_OPTION__SRC_BOOK;

    /**
     * The feature id for the '<em><b>Wert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__WERT = LIFESTYLE_OPTION__WERT;

    /**
     * The feature id for the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__VERFUEGBARKEIT = LIFESTYLE_OPTION__VERFUEGBARKEIT;

    /**
     * The feature id for the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION__WERT_VALUE = LIFESTYLE_OPTION__WERT_VALUE;

    /**
     * The number of structural features of the '<em>Percent Lifestyle Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION_FEATURE_COUNT = LIFESTYLE_OPTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Percent Lifestyle Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCENT_LIFESTYLE_OPTION_OPERATION_COUNT = LIFESTYLE_OPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.FeuerModus <em>Feuer Modus</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FeuerModus
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFeuerModus()
     * @generated
     */
	int FEUER_MODUS = 116;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.SchadensTyp <em>Schadens Typ</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SchadensTyp
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSchadensTyp()
     * @generated
     */
	int SCHADENS_TYP = 117;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MagazinTyp <em>Magazin Typ</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MagazinTyp
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagazinTyp()
     * @generated
     */
	int MAGAZIN_TYP = 118;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung <em>Feuwerwaffen Erweiterung</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFeuwerwaffenErweiterung()
     * @generated
     */
	int FEUWERWAFFEN_ERWEITERUNG = 119;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ModifikatorType <em>Modifikator Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModifikatorType()
     * @generated
     */
	int MODIFIKATOR_TYPE = 120;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.SmartgunType <em>Smartgun Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SmartgunType
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSmartgunType()
     * @generated
     */
	int SMARTGUN_TYPE = 121;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ZauberArt <em>Zauber Art</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ZauberArt
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberArt()
     * @generated
     */
	int ZAUBER_ART = 122;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ZauberReichweite <em>Zauber Reichweite</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ZauberReichweite
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberReichweite()
     * @generated
     */
	int ZAUBER_REICHWEITE = 123;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ZauberDauer <em>Zauber Dauer</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ZauberDauer
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberDauer()
     * @generated
     */
	int ZAUBER_DAUER = 124;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MagischeTradition <em>Magische Tradition</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MagischeTradition
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagischeTradition()
     * @generated
     */
	int MAGISCHE_TRADITION = 125;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.CritterHandlung <em>Critter Handlung</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.CritterHandlung
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterHandlung()
     * @generated
     */
	int CRITTER_HANDLUNG = 126;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.CritterReichweite <em>Critter Reichweite</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.CritterReichweite
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterReichweite()
     * @generated
     */
	int CRITTER_REICHWEITE = 127;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.CritterDauer <em>Critter Dauer</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.CritterDauer
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterDauer()
     * @generated
     */
	int CRITTER_DAUER = 128;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ResonanzZiel <em>Resonanz Ziel</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ResonanzZiel
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getResonanzZiel()
     * @generated
     */
	int RESONANZ_ZIEL = 129;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.InterfaceModus <em>Interface Modus</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.InterfaceModus
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getInterfaceModus()
     * @generated
     */
    int INTERFACE_MODUS = 130;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.ProgramType <em>Program Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ProgramType
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getProgramType()
     * @generated
     */
    int PROGRAM_TYPE = 131;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.MatrixProgramType <em>Matrix Program Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixProgramType
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixProgramType()
     * @generated
     */
    int MATRIX_PROGRAM_TYPE = 132;

    /**
     * The meta object id for the '<em>Shr Date</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.util.Date
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getShrDate()
     * @generated
     */
	int SHR_DATE = 133;


	/**
     * The meta object id for the '<em>Modification Manager</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ModSetter
     * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModificationManager()
     * @generated
     */
	int MODIFICATION_MANAGER = 134;


	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Beschreibbar <em>Beschreibbar</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Beschreibbar</em>'.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar
     * @generated
     */
	EClass getBeschreibbar();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Beschreibbar#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar#getName()
     * @see #getBeschreibbar()
     * @generated
     */
	EAttribute getBeschreibbar_Name();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Beschreibbar#getBeschreibung <em>Beschreibung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Beschreibung</em>'.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar#getBeschreibung()
     * @see #getBeschreibbar()
     * @generated
     */
	EAttribute getBeschreibbar_Beschreibung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Beschreibbar#getImage <em>Image</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Image</em>'.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar#getImage()
     * @see #getBeschreibbar()
     * @generated
     */
	EAttribute getBeschreibbar_Image();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Quelle <em>Quelle</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quelle</em>'.
     * @see de.urszeidler.eclipse.shr5.Quelle
     * @generated
     */
	EClass getQuelle();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Quelle#getPage <em>Page</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Page</em>'.
     * @see de.urszeidler.eclipse.shr5.Quelle#getPage()
     * @see #getQuelle()
     * @generated
     */
	EAttribute getQuelle_Page();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Quelle#getSrcBook <em>Src Book</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Src Book</em>'.
     * @see de.urszeidler.eclipse.shr5.Quelle#getSrcBook()
     * @see #getQuelle()
     * @generated
     */
	EReference getQuelle_SrcBook();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.SourceBook <em>Source Book</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source Book</em>'.
     * @see de.urszeidler.eclipse.shr5.SourceBook
     * @generated
     */
	EClass getSourceBook();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SourceBook#getStartShrTime <em>Start Shr Time</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Shr Time</em>'.
     * @see de.urszeidler.eclipse.shr5.SourceBook#getStartShrTime()
     * @see #getSourceBook()
     * @generated
     */
	EAttribute getSourceBook_StartShrTime();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SourceBook#getEndShrTime <em>End Shr Time</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End Shr Time</em>'.
     * @see de.urszeidler.eclipse.shr5.SourceBook#getEndShrTime()
     * @see #getSourceBook()
     * @generated
     */
	EAttribute getSourceBook_EndShrTime();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AbstraktPersona <em>Abstrakt Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstrakt Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona
     * @generated
     */
	EClass getAbstraktPersona();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getKonstitutionBasis <em>Konstitution Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Konstitution Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getKonstitutionBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_KonstitutionBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschicklichkeit Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getGeschicklichkeitBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_GeschicklichkeitBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getReaktionBasis <em>Reaktion Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reaktion Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getReaktionBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_ReaktionBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getStaerkeBasis <em>Staerke Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Staerke Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getStaerkeBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_StaerkeBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getCharismaBasis <em>Charisma Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charisma Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getCharismaBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_CharismaBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getWillenskraftBasis <em>Willenskraft Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Willenskraft Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getWillenskraftBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_WillenskraftBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getIntuitionBasis <em>Intuition Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intuition Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getIntuitionBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_IntuitionBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getLogikBasis <em>Logik Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logik Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getLogikBasis()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_LogikBasis();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getFertigkeiten <em>Fertigkeiten</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fertigkeiten</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getFertigkeiten()
     * @see #getAbstraktPersona()
     * @generated
     */
	EReference getAbstraktPersona_Fertigkeiten();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getFertigkeitsGruppen <em>Fertigkeits Gruppen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fertigkeits Gruppen</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getFertigkeitsGruppen()
     * @see #getAbstraktPersona()
     * @generated
     */
	EReference getAbstraktPersona_FertigkeitsGruppen();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getSpezies <em>Spezies</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Spezies</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getSpezies()
     * @see #getAbstraktPersona()
     * @generated
     */
	EReference getAbstraktPersona_Spezies();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstraktPersona#getModManager <em>Mod Manager</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mod Manager</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktPersona#getModManager()
     * @see #getAbstraktPersona()
     * @generated
     */
	EAttribute getAbstraktPersona_ModManager();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Gegenstand <em>Gegenstand</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gegenstand</em>'.
     * @see de.urszeidler.eclipse.shr5.Gegenstand
     * @generated
     */
	EClass getGegenstand();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Gegenstand#getKategorie <em>Kategorie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kategorie</em>'.
     * @see de.urszeidler.eclipse.shr5.Gegenstand#getKategorie()
     * @see #getGegenstand()
     * @generated
     */
	EAttribute getGegenstand_Kategorie();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Gegenstand#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.Gegenstand#getStufe()
     * @see #getGegenstand()
     * @generated
     */
	EAttribute getGegenstand_Stufe();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.GeldWert <em>Geld Wert</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Geld Wert</em>'.
     * @see de.urszeidler.eclipse.shr5.GeldWert
     * @generated
     */
	EClass getGeldWert();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert <em>Wert</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wert</em>'.
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @see #getGeldWert()
     * @generated
     */
	EAttribute getGeldWert_Wert();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeldWert#getVerfuegbarkeit <em>Verfuegbarkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Verfuegbarkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.GeldWert#getVerfuegbarkeit()
     * @see #getGeldWert()
     * @generated
     */
	EAttribute getGeldWert_Verfuegbarkeit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeldWert#getWertValue <em>Wert Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wert Value</em>'.
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWertValue()
     * @see #getGeldWert()
     * @generated
     */
    EAttribute getGeldWert_WertValue();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Reichweite <em>Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.Reichweite
     * @generated
     */
	EClass getReichweite();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Reichweite#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Reichweite#getMin()
     * @see #getReichweite()
     * @generated
     */
	EAttribute getReichweite_Min();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Reichweite#getKurz <em>Kurz</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kurz</em>'.
     * @see de.urszeidler.eclipse.shr5.Reichweite#getKurz()
     * @see #getReichweite()
     * @generated
     */
	EAttribute getReichweite_Kurz();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Reichweite#getMittel <em>Mittel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mittel</em>'.
     * @see de.urszeidler.eclipse.shr5.Reichweite#getMittel()
     * @see #getReichweite()
     * @generated
     */
	EAttribute getReichweite_Mittel();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Reichweite#getWeit <em>Weit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weit</em>'.
     * @see de.urszeidler.eclipse.shr5.Reichweite#getWeit()
     * @see #getReichweite()
     * @generated
     */
	EAttribute getReichweite_Weit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Reichweite#getExtrem <em>Extrem</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extrem</em>'.
     * @see de.urszeidler.eclipse.shr5.Reichweite#getExtrem()
     * @see #getReichweite()
     * @generated
     */
	EAttribute getReichweite_Extrem();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert <em>Attribut Modifikator Wert</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribut Modifikator Wert</em>'.
     * @see de.urszeidler.eclipse.shr5.AttributModifikatorWert
     * @generated
     */
	EClass getAttributModifikatorWert();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getAttribut <em>Attribut</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Attribut</em>'.
     * @see de.urszeidler.eclipse.shr5.AttributModifikatorWert#getAttribut()
     * @see #getAttributModifikatorWert()
     * @generated
     */
	EReference getAttributModifikatorWert_Attribut();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getWert <em>Wert</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wert</em>'.
     * @see de.urszeidler.eclipse.shr5.AttributModifikatorWert#getWert()
     * @see #getAttributModifikatorWert()
     * @generated
     */
	EAttribute getAttributModifikatorWert_Wert();

	/**
     * Returns the meta object for the container reference '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getModifiziertes <em>Modifiziertes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Modifiziertes</em>'.
     * @see de.urszeidler.eclipse.shr5.AttributModifikatorWert#getModifiziertes()
     * @see #getAttributModifikatorWert()
     * @generated
     */
	EReference getAttributModifikatorWert_Modifiziertes();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Modifizierbar <em>Modifizierbar</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modifizierbar</em>'.
     * @see de.urszeidler.eclipse.shr5.Modifizierbar
     * @generated
     */
	EClass getModifizierbar();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Modifizierbar#getMods <em>Mods</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mods</em>'.
     * @see de.urszeidler.eclipse.shr5.Modifizierbar#getMods()
     * @see #getModifizierbar()
     * @generated
     */
	EReference getModifizierbar_Mods();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute <em>Koerperliche Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Koerperliche Attribute</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute
     * @generated
     */
	EClass getKoerperlicheAttribute();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution <em>Konstitution</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Konstitution</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution()
     * @see #getKoerperlicheAttribute()
     * @generated
     */
	EAttribute getKoerperlicheAttribute_Konstitution();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit <em>Geschicklichkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschicklichkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit()
     * @see #getKoerperlicheAttribute()
     * @generated
     */
	EAttribute getKoerperlicheAttribute_Geschicklichkeit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion <em>Reaktion</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reaktion</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion()
     * @see #getKoerperlicheAttribute()
     * @generated
     */
	EAttribute getKoerperlicheAttribute_Reaktion();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke <em>Staerke</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Staerke</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke()
     * @see #getKoerperlicheAttribute()
     * @generated
     */
	EAttribute getKoerperlicheAttribute_Staerke();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute <em>Spezielle Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spezielle Attribute</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute
     * @generated
     */
	EClass getSpezielleAttribute();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative <em>Initative</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initative</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative()
     * @see #getSpezielleAttribute()
     * @generated
     */
	EAttribute getSpezielleAttribute_Initative();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel <em>Initativ Wuerfel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initativ Wuerfel</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
     * @see #getSpezielleAttribute()
     * @generated
     */
	EAttribute getSpezielleAttribute_InitativWuerfel();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen <em>Ausweichen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ausweichen</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen()
     * @see #getSpezielleAttribute()
     * @generated
     */
	EAttribute getSpezielleAttribute_Ausweichen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz <em>Essenz</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Essenz</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz()
     * @see #getSpezielleAttribute()
     * @generated
     */
	EAttribute getSpezielleAttribute_Essenz();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdgeBasis <em>Edge Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edge Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdgeBasis()
     * @see #getSpezielleAttribute()
     * @generated
     */
	EAttribute getSpezielleAttribute_EdgeBasis();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edge</em>'.
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge()
     * @see #getSpezielleAttribute()
     * @generated
     */
	EAttribute getSpezielleAttribute_Edge();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AbstraktGegenstand <em>Abstrakt Gegenstand</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstrakt Gegenstand</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktGegenstand
     * @generated
     */
	EClass getAbstraktGegenstand();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe <em>Abstakt Fern Kampfwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstakt Fern Kampfwaffe</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe
     * @generated
     */
	EClass getAbstaktFernKampfwaffe();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe#getReichweite <em>Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe#getReichweite()
     * @see #getAbstaktFernKampfwaffe()
     * @generated
     */
	EReference getAbstaktFernKampfwaffe_Reichweite();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe <em>Abstakt Waffe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstakt Waffe</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktWaffe
     * @generated
     */
	EClass getAbstaktWaffe();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadenscode <em>Schadenscode</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schadenscode</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadenscode()
     * @see #getAbstaktWaffe()
     * @generated
     */
	EAttribute getAbstaktWaffe_Schadenscode();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadesTyp <em>Schades Typ</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schades Typ</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadesTyp()
     * @see #getAbstaktWaffe()
     * @generated
     */
	EAttribute getAbstaktWaffe_SchadesTyp();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getPraezision <em>Praezision</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Praezision</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktWaffe#getPraezision()
     * @see #getAbstaktWaffe()
     * @generated
     */
	EAttribute getAbstaktWaffe_Praezision();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getDurchschlagsKraft <em>Durchschlags Kraft</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Durchschlags Kraft</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstaktWaffe#getDurchschlagsKraft()
     * @see #getAbstaktWaffe()
     * @generated
     */
	EAttribute getAbstaktWaffe_DurchschlagsKraft();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Nahkampfwaffe <em>Nahkampfwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nahkampfwaffe</em>'.
     * @see de.urszeidler.eclipse.shr5.Nahkampfwaffe
     * @generated
     */
	EClass getNahkampfwaffe();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Nahkampfwaffe#getReichweite <em>Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.Nahkampfwaffe#getReichweite()
     * @see #getNahkampfwaffe()
     * @generated
     */
	EAttribute getNahkampfwaffe_Reichweite();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Feuerwaffe <em>Feuerwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feuerwaffe</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe
     * @generated
     */
	EClass getFeuerwaffe();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getMunitionstyp <em>Munitionstyp</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Munitionstyp</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getMunitionstyp()
     * @see #getFeuerwaffe()
     * @generated
     */
	EAttribute getFeuerwaffe_Munitionstyp();

	/**
     * Returns the meta object for the attribute list '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getModie <em>Modie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Modie</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getModie()
     * @see #getFeuerwaffe()
     * @generated
     */
	EAttribute getFeuerwaffe_Modie();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getKapazitaet <em>Kapazitaet</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kapazitaet</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getKapazitaet()
     * @see #getFeuerwaffe()
     * @generated
     */
	EAttribute getFeuerwaffe_Kapazitaet();

	/**
     * Returns the meta object for the attribute list '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getErweiterung <em>Erweiterung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Erweiterung</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getErweiterung()
     * @see #getFeuerwaffe()
     * @generated
     */
	EAttribute getFeuerwaffe_Erweiterung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getRueckstoss <em>Rueckstoss</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rueckstoss</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getRueckstoss()
     * @see #getFeuerwaffe()
     * @generated
     */
	EAttribute getFeuerwaffe_Rueckstoss();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getEinbau <em>Einbau</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Einbau</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getEinbau()
     * @see #getFeuerwaffe()
     * @generated
     */
	EReference getFeuerwaffe_Einbau();

	/**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.Feuerwaffe#getMagazin <em>Magazin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Magazin</em>'.
     * @see de.urszeidler.eclipse.shr5.Feuerwaffe#getMagazin()
     * @see #getFeuerwaffe()
     * @generated
     */
    EReference getFeuerwaffe_Magazin();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Wurfwaffe <em>Wurfwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wurfwaffe</em>'.
     * @see de.urszeidler.eclipse.shr5.Wurfwaffe
     * @generated
     */
	EClass getWurfwaffe();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ShrList <em>Shr List</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shr List</em>'.
     * @see de.urszeidler.eclipse.shr5.ShrList
     * @generated
     */
	EClass getShrList();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.ShrList#getEntries <em>Entries</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entries</em>'.
     * @see de.urszeidler.eclipse.shr5.ShrList#getEntries()
     * @see #getShrList()
     * @generated
     */
	EReference getShrList_Entries();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Projektilwaffe <em>Projektilwaffe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Projektilwaffe</em>'.
     * @see de.urszeidler.eclipse.shr5.Projektilwaffe
     * @generated
     */
	EClass getProjektilwaffe();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.FertigkeitsGruppe <em>Fertigkeits Gruppe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fertigkeits Gruppe</em>'.
     * @see de.urszeidler.eclipse.shr5.FertigkeitsGruppe
     * @generated
     */
	EClass getFertigkeitsGruppe();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.FertigkeitsGruppe#getFertigkeiten <em>Fertigkeiten</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fertigkeiten</em>'.
     * @see de.urszeidler.eclipse.shr5.FertigkeitsGruppe#getFertigkeiten()
     * @see #getFertigkeitsGruppe()
     * @generated
     */
	EReference getFertigkeitsGruppe_Fertigkeiten();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Fertigkeit <em>Fertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fertigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.Fertigkeit
     * @generated
     */
	EClass getFertigkeit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fertigkeit#getKategorie <em>Kategorie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kategorie</em>'.
     * @see de.urszeidler.eclipse.shr5.Fertigkeit#getKategorie()
     * @see #getFertigkeit()
     * @generated
     */
	EAttribute getFertigkeit_Kategorie();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fertigkeit#isAusweichen <em>Ausweichen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ausweichen</em>'.
     * @see de.urszeidler.eclipse.shr5.Fertigkeit#isAusweichen()
     * @see #getFertigkeit()
     * @generated
     */
	EAttribute getFertigkeit_Ausweichen();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Fertigkeit#getAttribut <em>Attribut</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Attribut</em>'.
     * @see de.urszeidler.eclipse.shr5.Fertigkeit#getAttribut()
     * @see #getFertigkeit()
     * @generated
     */
	EReference getFertigkeit_Attribut();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Fertigkeit#getSpezialisierungen <em>Spezialisierungen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Spezialisierungen</em>'.
     * @see de.urszeidler.eclipse.shr5.Fertigkeit#getSpezialisierungen()
     * @see #getFertigkeit()
     * @generated
     */
	EReference getFertigkeit_Spezialisierungen();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit <em>Persona Fertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Fertigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeit
     * @generated
     */
	EClass getPersonaFertigkeit();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getFertigkeit <em>Fertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fertigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeit#getFertigkeit()
     * @see #getPersonaFertigkeit()
     * @generated
     */
	EReference getPersonaFertigkeit_Fertigkeit();

	/**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getSpezialisierungen <em>Spezialisierungen</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Spezialisierungen</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeit#getSpezialisierungen()
     * @see #getPersonaFertigkeit()
     * @generated
     */
    EReference getPersonaFertigkeit_Spezialisierungen();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe <em>Persona Fertigkeits Gruppe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Fertigkeits Gruppe</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe
     * @generated
     */
	EClass getPersonaFertigkeitsGruppe();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe#getGruppe <em>Gruppe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Gruppe</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe#getGruppe()
     * @see #getPersonaFertigkeitsGruppe()
     * @generated
     */
	EReference getPersonaFertigkeitsGruppe_Gruppe();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Cyberware <em>Cyberware</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cyberware</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberware
     * @generated
     */
	EClass getCyberware();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Cyberware#getPersona <em>Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberware#getPersona()
     * @see #getCyberware()
     * @generated
     */
	EReference getCyberware_Persona();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Cyberware#getEinbau <em>Einbau</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Einbau</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberware#getEinbau()
     * @see #getCyberware()
     * @generated
     */
	EReference getCyberware_Einbau();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.BioWare <em>Bio Ware</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bio Ware</em>'.
     * @see de.urszeidler.eclipse.shr5.BioWare
     * @generated
     */
	EClass getBioWare();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.BioWare#getPersona <em>Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.BioWare#getPersona()
     * @see #getBioWare()
     * @generated
     */
	EReference getBioWare_Persona();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Koerpermods <em>Koerpermods</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Koerpermods</em>'.
     * @see de.urszeidler.eclipse.shr5.Koerpermods
     * @generated
     */
	EClass getKoerpermods();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AbstraktModifikatoren <em>Abstrakt Modifikatoren</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstrakt Modifikatoren</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstraktModifikatoren
     * @generated
     */
	EClass getAbstraktModifikatoren();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute <em>Geistige Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Geistige Attribute</em>'.
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute
     * @generated
     */
	EClass getGeistigeAttribute();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma <em>Charisma</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charisma</em>'.
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma()
     * @see #getGeistigeAttribute()
     * @generated
     */
	EAttribute getGeistigeAttribute_Charisma();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft <em>Willenskraft</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Willenskraft</em>'.
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft()
     * @see #getGeistigeAttribute()
     * @generated
     */
	EAttribute getGeistigeAttribute_Willenskraft();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition <em>Intuition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intuition</em>'.
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition()
     * @see #getGeistigeAttribute()
     * @generated
     */
	EAttribute getGeistigeAttribute_Intuition();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik <em>Logik</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logik</em>'.
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik()
     * @see #getGeistigeAttribute()
     * @generated
     */
	EAttribute getGeistigeAttribute_Logik();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MudanPersona <em>Mudan Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mudan Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.MudanPersona
     * @generated
     */
	EClass getMudanPersona();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.KoerperPersona <em>Koerper Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Koerper Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperPersona
     * @generated
     */
	EClass getKoerperPersona();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.KoerperPersona#getKoerperMods <em>Koerper Mods</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Koerper Mods</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperPersona#getKoerperMods()
     * @see #getKoerperPersona()
     * @generated
     */
	EReference getKoerperPersona_KoerperMods();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.KoerperPersona#getEigenschaften <em>Eigenschaften</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eigenschaften</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperPersona#getEigenschaften()
     * @see #getKoerperPersona()
     * @generated
     */
	EReference getKoerperPersona_Eigenschaften();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KoerperPersona#getZustandKoerperlich <em>Zustand Koerperlich</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand Koerperlich</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperPersona#getZustandKoerperlich()
     * @see #getKoerperPersona()
     * @generated
     */
    EAttribute getKoerperPersona_ZustandKoerperlich();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KoerperPersona#getZustandGeistig <em>Zustand Geistig</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand Geistig</em>'.
     * @see de.urszeidler.eclipse.shr5.KoerperPersona#getZustandGeistig()
     * @see #getKoerperPersona()
     * @generated
     */
    EAttribute getKoerperPersona_ZustandGeistig();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MagischeMods <em>Magische Mods</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Magische Mods</em>'.
     * @see de.urszeidler.eclipse.shr5.MagischeMods
     * @generated
     */
	EClass getMagischeMods();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.KiKraft <em>Ki Kraft</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ki Kraft</em>'.
     * @see de.urszeidler.eclipse.shr5.KiKraft
     * @generated
     */
	EClass getKiKraft();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KiKraft#getKraftpunkte <em>Kraftpunkte</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kraftpunkte</em>'.
     * @see de.urszeidler.eclipse.shr5.KiKraft#getKraftpunkte()
     * @see #getKiKraft()
     * @generated
     */
	EAttribute getKiKraft_Kraftpunkte();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MagischePersona <em>Magische Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Magische Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.MagischePersona
     * @generated
     */
	EClass getMagischePersona();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.MagischePersona#getMentor <em>Mentor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mentor</em>'.
     * @see de.urszeidler.eclipse.shr5.MagischePersona#getMentor()
     * @see #getMagischePersona()
     * @generated
     */
	EReference getMagischePersona_Mentor();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona <em>Base Magische Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Magische Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.BaseMagischePersona
     * @generated
     */
	EClass getBaseMagischePersona();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie <em>Magie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Magie</em>'.
     * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie()
     * @see #getBaseMagischePersona()
     * @generated
     */
	EAttribute getBaseMagischePersona_Magie();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getInitationen <em>Initationen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Initationen</em>'.
     * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#getInitationen()
     * @see #getBaseMagischePersona()
     * @generated
     */
	EReference getBaseMagischePersona_Initationen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagieBasis <em>Magie Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Magie Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagieBasis()
     * @see #getBaseMagischePersona()
     * @generated
     */
	EAttribute getBaseMagischePersona_MagieBasis();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren <em>Fernkampfwaffen Modifikatoren</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fernkampfwaffen Modifikatoren</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren
     * @generated
     */
	EClass getFernkampfwaffenModifikatoren();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSmartgun <em>Smartgun</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smartgun</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSmartgun()
     * @see #getFernkampfwaffenModifikatoren()
     * @generated
     */
	EAttribute getFernkampfwaffenModifikatoren_Smartgun();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getRueckstoss <em>Rueckstoss</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rueckstoss</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getRueckstoss()
     * @see #getFernkampfwaffenModifikatoren()
     * @generated
     */
	EAttribute getFernkampfwaffenModifikatoren_Rueckstoss();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isLasterPointer <em>Laster Pointer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Laster Pointer</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isLasterPointer()
     * @see #getFernkampfwaffenModifikatoren()
     * @generated
     */
	EAttribute getFernkampfwaffenModifikatoren_LasterPointer();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isSchalldaempfer <em>Schalldaempfer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schalldaempfer</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isSchalldaempfer()
     * @see #getFernkampfwaffenModifikatoren()
     * @generated
     */
	EAttribute getFernkampfwaffenModifikatoren_Schalldaempfer();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getVergroesserung <em>Vergroesserung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vergroesserung</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getVergroesserung()
     * @see #getFernkampfwaffenModifikatoren()
     * @generated
     */
	EAttribute getFernkampfwaffenModifikatoren_Vergroesserung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSichtverbesserung <em>Sichtverbesserung</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sichtverbesserung</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSichtverbesserung()
     * @see #getFernkampfwaffenModifikatoren()
     * @generated
     */
    EAttribute getFernkampfwaffenModifikatoren_Sichtverbesserung();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse <em>Sichtverhaeltnisse</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sichtverhaeltnisse</em>'.
     * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse
     * @generated
     */
	EClass getSichtverhaeltnisse();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getRestlichtverstaerkung <em>Restlichtverstaerkung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Restlichtverstaerkung</em>'.
     * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getRestlichtverstaerkung()
     * @see #getSichtverhaeltnisse()
     * @generated
     */
	EAttribute getSichtverhaeltnisse_Restlichtverstaerkung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getInfrarot <em>Infrarot</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Infrarot</em>'.
     * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getInfrarot()
     * @see #getSichtverhaeltnisse()
     * @generated
     */
	EAttribute getSichtverhaeltnisse_Infrarot();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getUltrasound <em>Ultrasound</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ultrasound</em>'.
     * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse#getUltrasound()
     * @see #getSichtverhaeltnisse()
     * @generated
     */
	EAttribute getSichtverhaeltnisse_Ultrasound();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Spezies <em>Spezies</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spezies</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies
     * @generated
     */
	EClass getSpezies();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getKonstitutionMin <em>Konstitution Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Konstitution Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getKonstitutionMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_KonstitutionMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getGeschicklichkeitMin <em>Geschicklichkeit Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschicklichkeit Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getGeschicklichkeitMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_GeschicklichkeitMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getReaktionMin <em>Reaktion Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reaktion Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getReaktionMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_ReaktionMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getStaerkeMin <em>Staerke Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Staerke Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getStaerkeMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_StaerkeMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getCharismaMin <em>Charisma Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charisma Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getCharismaMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_CharismaMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getWillenskraftMin <em>Willenskraft Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Willenskraft Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getWillenskraftMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_WillenskraftMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getIntuitionMin <em>Intuition Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intuition Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getIntuitionMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_IntuitionMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getLogikMin <em>Logik Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logik Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getLogikMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_LogikMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getEdgeMin <em>Edge Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edge Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getEdgeMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_EdgeMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getMagieMin <em>Magie Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Magie Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getMagieMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_MagieMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getResonanzMin <em>Resonanz Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resonanz Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getResonanzMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_ResonanzMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getEssenzMin <em>Essenz Min</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Essenz Min</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getEssenzMin()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_EssenzMin();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getKonstitutionMax <em>Konstitution Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Konstitution Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getKonstitutionMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_KonstitutionMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getGeschicklichkeitMax <em>Geschicklichkeit Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschicklichkeit Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getGeschicklichkeitMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_GeschicklichkeitMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getReaktionMax <em>Reaktion Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reaktion Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getReaktionMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_ReaktionMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getStaerkeMax <em>Staerke Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Staerke Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getStaerkeMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_StaerkeMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getCharismaMax <em>Charisma Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charisma Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getCharismaMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_CharismaMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getWillenskraftMax <em>Willenskraft Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Willenskraft Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getWillenskraftMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_WillenskraftMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getIntuitionMax <em>Intuition Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intuition Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getIntuitionMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_IntuitionMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getLogikMax <em>Logik Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logik Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getLogikMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_LogikMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getEdgeMax <em>Edge Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edge Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getEdgeMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_EdgeMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getMagieMax <em>Magie Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Magie Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getMagieMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_MagieMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getResonanzMax <em>Resonanz Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resonanz Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getResonanzMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_ResonanzMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getEssenzMax <em>Essenz Max</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Essenz Max</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getEssenzMax()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_EssenzMax();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getLaufen <em>Laufen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Laufen</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getLaufen()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_Laufen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getRennen <em>Rennen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rennen</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getRennen()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_Rennen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Spezies#getSprinten <em>Sprinten</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sprinten</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getSprinten()
     * @see #getSpezies()
     * @generated
     */
	EAttribute getSpezies_Sprinten();

	/**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.Spezies#getAngriff <em>Angriff</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Angriff</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezies#getAngriff()
     * @see #getSpezies()
     * @generated
     */
    EReference getSpezies_Angriff();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.GegenstandStufen <em>Gegenstand Stufen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gegenstand Stufen</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen
     * @generated
     */
	EClass getGegenstandStufen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GegenstandStufen#getComputer <em>Computer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Computer</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen#getComputer()
     * @see #getGegenstandStufen()
     * @generated
     */
	EAttribute getGegenstandStufen_Computer();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GegenstandStufen#getElektronik <em>Elektronik</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Elektronik</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen#getElektronik()
     * @see #getGegenstandStufen()
     * @generated
     */
	EAttribute getGegenstandStufen_Elektronik();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GegenstandStufen#getTracing <em>Tracing</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tracing</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen#getTracing()
     * @see #getGegenstandStufen()
     * @generated
     */
	EAttribute getGegenstandStufen_Tracing();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GegenstandStufen#getAntiTracing <em>Anti Tracing</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anti Tracing</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen#getAntiTracing()
     * @see #getGegenstandStufen()
     * @generated
     */
	EAttribute getGegenstandStufen_AntiTracing();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GegenstandStufen#getProtection <em>Protection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protection</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen#getProtection()
     * @see #getGegenstandStufen()
     * @generated
     */
	EAttribute getGegenstandStufen_Protection();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GegenstandStufen#getAntiProtection <em>Anti Protection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anti Protection</em>'.
     * @see de.urszeidler.eclipse.shr5.GegenstandStufen#getAntiProtection()
     * @see #getGegenstandStufen()
     * @generated
     */
	EAttribute getGegenstandStufen_AntiProtection();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.KiAdept <em>Ki Adept</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ki Adept</em>'.
     * @see de.urszeidler.eclipse.shr5.KiAdept
     * @generated
     */
	EClass getKiAdept();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.KiAdept#getKikraft <em>Kikraft</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Kikraft</em>'.
     * @see de.urszeidler.eclipse.shr5.KiAdept#getKikraft()
     * @see #getKiAdept()
     * @generated
     */
	EReference getKiAdept_Kikraft();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Kleidung <em>Kleidung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Kleidung</em>'.
     * @see de.urszeidler.eclipse.shr5.Kleidung
     * @generated
     */
	EClass getKleidung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Kleidung#getRuestung <em>Ruestung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ruestung</em>'.
     * @see de.urszeidler.eclipse.shr5.Kleidung#getRuestung()
     * @see #getKleidung()
     * @generated
     */
	EAttribute getKleidung_Ruestung();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator <em>Fernkampfwaffe Modifikator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fernkampfwaffe Modifikator</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator
     * @generated
     */
	EClass getFernkampfwaffeModifikator();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator#getEp <em>Ep</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ep</em>'.
     * @see de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator#getEp()
     * @see #getFernkampfwaffeModifikator()
     * @generated
     */
	EAttribute getFernkampfwaffeModifikator_Ep();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Anwendbar <em>Anwendbar</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Anwendbar</em>'.
     * @see de.urszeidler.eclipse.shr5.Anwendbar
     * @generated
     */
	EClass getAnwendbar();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Anwendbar#getFertigkeit <em>Fertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fertigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.Anwendbar#getFertigkeit()
     * @see #getAnwendbar()
     * @generated
     */
	EReference getAnwendbar_Fertigkeit();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonaEigenschaft <em>Persona Eigenschaft</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Eigenschaft</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaEigenschaft
     * @generated
     */
	EClass getPersonaEigenschaft();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonaEigenschaft#getKarmaKosten <em>Karma Kosten</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Kosten</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaEigenschaft#getKarmaKosten()
     * @see #getPersonaEigenschaft()
     * @generated
     */
	EAttribute getPersonaEigenschaft_KarmaKosten();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren <em>Proben Modifikatoren</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Proben Modifikatoren</em>'.
     * @see de.urszeidler.eclipse.shr5.ProbenModifikatoren
     * @generated
     */
	EClass getProbenModifikatoren();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren#getSchadenswiederstand <em>Schadenswiederstand</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schadenswiederstand</em>'.
     * @see de.urszeidler.eclipse.shr5.ProbenModifikatoren#getSchadenswiederstand()
     * @see #getProbenModifikatoren()
     * @generated
     */
	EAttribute getProbenModifikatoren_Schadenswiederstand();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren#getHeilung <em>Heilung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Heilung</em>'.
     * @see de.urszeidler.eclipse.shr5.ProbenModifikatoren#getHeilung()
     * @see #getProbenModifikatoren()
     * @generated
     */
	EAttribute getProbenModifikatoren_Heilung();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Magier <em>Magier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Magier</em>'.
     * @see de.urszeidler.eclipse.shr5.Magier
     * @generated
     */
	EClass getMagier();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Zauberer <em>Zauberer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zauberer</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauberer
     * @generated
     */
	EClass getZauberer();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Zauberer#getZauber <em>Zauber</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Zauber</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauberer#getZauber()
     * @see #getZauberer()
     * @generated
     */
	EReference getZauberer_Zauber();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauberer#getEnzug <em>Enzug</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enzug</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauberer#getEnzug()
     * @see #getZauberer()
     * @generated
     */
	EAttribute getZauberer_Enzug();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauberer#getTradition <em>Tradition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tradition</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauberer#getTradition()
     * @see #getZauberer()
     * @generated
     */
	EAttribute getZauberer_Tradition();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Zauberer#getGebundeneGeister <em>Gebundene Geister</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Gebundene Geister</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauberer#getGebundeneGeister()
     * @see #getZauberer()
     * @generated
     */
    EReference getZauberer_GebundeneGeister();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.Zauberer#getUngebundenerGeist <em>Ungebundener Geist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ungebundener Geist</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauberer#getUngebundenerGeist()
     * @see #getZauberer()
     * @generated
     */
    EReference getZauberer_UngebundenerGeist();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MysticAdept <em>Mystic Adept</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mystic Adept</em>'.
     * @see de.urszeidler.eclipse.shr5.MysticAdept
     * @generated
     */
	EClass getMysticAdept();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonaZauber <em>Persona Zauber</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Zauber</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZauber
     * @generated
     */
	EClass getPersonaZauber();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonaZauber#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZauber#getStufe()
     * @see #getPersonaZauber()
     * @generated
     */
	EAttribute getPersonaZauber_Stufe();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.PersonaZauber#getFormel <em>Formel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Formel</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZauber#getFormel()
     * @see #getPersonaZauber()
     * @generated
     */
	EReference getPersonaZauber_Formel();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Zauber <em>Zauber</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Zauber</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber
     * @generated
     */
	EClass getZauber();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getArt <em>Art</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Art</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getArt()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Art();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getReichweite <em>Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getReichweite()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Reichweite();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getSchaden <em>Schaden</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schaden</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getSchaden()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Schaden();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getDauer <em>Dauer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dauer</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getDauer()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Dauer();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getEntzug <em>Entzug</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entzug</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getEntzug()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Entzug();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getKategorie <em>Kategorie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kategorie</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getKategorie()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Kategorie();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Zauber#getMerkmale <em>Merkmale</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Merkmale</em>'.
     * @see de.urszeidler.eclipse.shr5.Zauber#getMerkmale()
     * @see #getZauber()
     * @generated
     */
	EAttribute getZauber_Merkmale();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ChrakterLimits <em>Chrakter Limits</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chrakter Limits</em>'.
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits
     * @generated
     */
	EClass getChrakterLimits();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich <em>Koerperlich</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Koerperlich</em>'.
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich()
     * @see #getChrakterLimits()
     * @generated
     */
	EAttribute getChrakterLimits_Koerperlich();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig <em>Geistig</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geistig</em>'.
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig()
     * @see #getChrakterLimits()
     * @generated
     */
	EAttribute getChrakterLimits_Geistig();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial <em>Sozial</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sozial</em>'.
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial()
     * @see #getChrakterLimits()
     * @generated
     */
	EAttribute getChrakterLimits_Sozial();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Panzerung <em>Panzerung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Panzerung</em>'.
     * @see de.urszeidler.eclipse.shr5.Panzerung
     * @generated
     */
	EClass getPanzerung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Panzerung#getPanzer <em>Panzer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Panzer</em>'.
     * @see de.urszeidler.eclipse.shr5.Panzerung#getPanzer()
     * @see #getPanzerung()
     * @generated
     */
	EAttribute getPanzerung_Panzer();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AspektMagier <em>Aspekt Magier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Aspekt Magier</em>'.
     * @see de.urszeidler.eclipse.shr5.AspektMagier
     * @generated
     */
	EClass getAspektMagier();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AspektMagier#getAspekt <em>Aspekt</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Aspekt</em>'.
     * @see de.urszeidler.eclipse.shr5.AspektMagier#getAspekt()
     * @see #getAspektMagier()
     * @generated
     */
	EReference getAspektMagier_Aspekt();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AstraleProjektion <em>Astrale Projektion</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Astrale Projektion</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion
     * @generated
     */
	EClass getAstraleProjektion();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit <em>Astrales Limit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrales Limit</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstralesLimit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution <em>Astrale Konstitution</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Konstitution</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstraleKonstitution();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit <em>Astrale Geschicklichkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Geschicklichkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstraleGeschicklichkeit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion <em>Astrale Reaktion</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Reaktion</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstraleReaktion();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke <em>Astrale Staerke</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Staerke</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstraleStaerke();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative <em>Astrale Initative</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Initative</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstraleInitative();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel <em>Astrale Initativ Wuerfel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Initativ Wuerfel</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstraleInitativWuerfel();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung <em>Astrale Panzerung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Astrale Panzerung</em>'.
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung()
     * @see #getAstraleProjektion()
     * @generated
     */
	EAttribute getAstraleProjektion_AstralePanzerung();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Schutzgeist <em>Schutzgeist</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schutzgeist</em>'.
     * @see de.urszeidler.eclipse.shr5.Schutzgeist
     * @generated
     */
	EClass getSchutzgeist();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Schutzgeist#getVorteile <em>Vorteile</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vorteile</em>'.
     * @see de.urszeidler.eclipse.shr5.Schutzgeist#getVorteile()
     * @see #getSchutzgeist()
     * @generated
     */
	EAttribute getSchutzgeist_Vorteile();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Schutzgeist#getNachteile <em>Nachteile</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nachteile</em>'.
     * @see de.urszeidler.eclipse.shr5.Schutzgeist#getNachteile()
     * @see #getSchutzgeist()
     * @generated
     */
	EAttribute getSchutzgeist_Nachteile();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Initation <em>Initation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Initation</em>'.
     * @see de.urszeidler.eclipse.shr5.Initation
     * @generated
     */
	EClass getInitation();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Initation#getErlernt <em>Erlernt</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Erlernt</em>'.
     * @see de.urszeidler.eclipse.shr5.Initation#getErlernt()
     * @see #getInitation()
     * @generated
     */
	EReference getInitation_Erlernt();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MetaMagie <em>Meta Magie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Meta Magie</em>'.
     * @see de.urszeidler.eclipse.shr5.MetaMagie
     * @generated
     */
	EClass getMetaMagie();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.CritterKraft <em>Critter Kraft</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Critter Kraft</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterKraft
     * @generated
     */
	EClass getCritterKraft();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CritterKraft#getArt <em>Art</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Art</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterKraft#getArt()
     * @see #getCritterKraft()
     * @generated
     */
	EAttribute getCritterKraft_Art();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CritterKraft#getHandlung <em>Handlung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Handlung</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterKraft#getHandlung()
     * @see #getCritterKraft()
     * @generated
     */
	EAttribute getCritterKraft_Handlung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CritterKraft#getReichweite <em>Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterKraft#getReichweite()
     * @see #getCritterKraft()
     * @generated
     */
	EAttribute getCritterKraft_Reichweite();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CritterKraft#getDauer <em>Dauer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dauer</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterKraft#getDauer()
     * @see #getCritterKraft()
     * @generated
     */
	EAttribute getCritterKraft_Dauer();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Fahrzeug <em>Fahrzeug</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fahrzeug</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug
     * @generated
     */
	EClass getFahrzeug();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getHandling <em>Handling</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Handling</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getHandling()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_Handling();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getGeschwindigkeit <em>Geschwindigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschwindigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getGeschwindigkeit()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_Geschwindigkeit();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getBeschleunigung <em>Beschleunigung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Beschleunigung</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getBeschleunigung()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_Beschleunigung();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getRumpf <em>Rumpf</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rumpf</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getRumpf()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_Rumpf();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getPilot <em>Pilot</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pilot</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getPilot()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_Pilot();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getSensor <em>Sensor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sensor</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getSensor()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_Sensor();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getFahrzeugTyp <em>Fahrzeug Typ</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fahrzeug Typ</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getFahrzeugTyp()
     * @see #getFahrzeug()
     * @generated
     */
	EAttribute getFahrzeug_FahrzeugTyp();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getModifizierungen <em>Modifizierungen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modifizierungen</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getModifizierungen()
     * @see #getFahrzeug()
     * @generated
     */
	EReference getFahrzeug_Modifizierungen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getPanzer <em>Panzer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Panzer</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getPanzer()
     * @see #getFahrzeug()
     * @generated
     */
    EAttribute getFahrzeug_Panzer();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fahrzeug#getWeaponMounts <em>Weapon Mounts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weapon Mounts</em>'.
     * @see de.urszeidler.eclipse.shr5.Fahrzeug#getWeaponMounts()
     * @see #getFahrzeug()
     * @generated
     */
    EAttribute getFahrzeug_WeaponMounts();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug <em>Bodenfahrzeug</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bodenfahrzeug</em>'.
     * @see de.urszeidler.eclipse.shr5.Bodenfahrzeug
     * @generated
     */
	EClass getBodenfahrzeug();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug#getHandlingGelaende <em>Handling Gelaende</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Handling Gelaende</em>'.
     * @see de.urszeidler.eclipse.shr5.Bodenfahrzeug#getHandlingGelaende()
     * @see #getBodenfahrzeug()
     * @generated
     */
	EAttribute getBodenfahrzeug_HandlingGelaende();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug#getGeschwindigkeitGelaende <em>Geschwindigkeit Gelaende</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschwindigkeit Gelaende</em>'.
     * @see de.urszeidler.eclipse.shr5.Bodenfahrzeug#getGeschwindigkeitGelaende()
     * @see #getBodenfahrzeug()
     * @generated
     */
    EAttribute getBodenfahrzeug_GeschwindigkeitGelaende();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PassagierFahrzeug <em>Passagier Fahrzeug</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Passagier Fahrzeug</em>'.
     * @see de.urszeidler.eclipse.shr5.PassagierFahrzeug
     * @generated
     */
	EClass getPassagierFahrzeug();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PassagierFahrzeug#getSitze <em>Sitze</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sitze</em>'.
     * @see de.urszeidler.eclipse.shr5.PassagierFahrzeug#getSitze()
     * @see #getPassagierFahrzeug()
     * @generated
     */
	EAttribute getPassagierFahrzeug_Sitze();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Drohne <em>Drohne</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Drohne</em>'.
     * @see de.urszeidler.eclipse.shr5.Drohne
     * @generated
     */
	EClass getDrohne();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount <em>Program Slot Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Program Slot Count</em>'.
     * @see de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount()
     * @see #getDrohne()
     * @generated
     */
    EAttribute getDrohne_ProgramSlotCount();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.Drohne#getRunningPrograms <em>Running Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Running Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.Drohne#getRunningPrograms()
     * @see #getDrohne()
     * @generated
     */
    EReference getDrohne_RunningPrograms();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Drohne#getStoredPrograms <em>Stored Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stored Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.Drohne#getStoredPrograms()
     * @see #getDrohne()
     * @generated
     */
    EReference getDrohne_StoredPrograms();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.FahrzeugModifikation <em>Fahrzeug Modifikation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fahrzeug Modifikation</em>'.
     * @see de.urszeidler.eclipse.shr5.FahrzeugModifikation
     * @generated
     */
	EClass getFahrzeugModifikation();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Technomancer <em>Technomancer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technomancer</em>'.
     * @see de.urszeidler.eclipse.shr5.Technomancer
     * @generated
     */
	EClass getTechnomancer();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Technomancer#getComplexForms <em>Complex Forms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Complex Forms</em>'.
     * @see de.urszeidler.eclipse.shr5.Technomancer#getComplexForms()
     * @see #getTechnomancer()
     * @generated
     */
	EReference getTechnomancer_ComplexForms();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Technomancer#getEchos <em>Echos</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Echos</em>'.
     * @see de.urszeidler.eclipse.shr5.Technomancer#getEchos()
     * @see #getTechnomancer()
     * @generated
     */
	EReference getTechnomancer_Echos();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ResonanzPersona <em>Resonanz Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resonanz Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.ResonanzPersona
     * @generated
     */
	EClass getResonanzPersona();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz <em>Resonanz</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resonanz</em>'.
     * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz()
     * @see #getResonanzPersona()
     * @generated
     */
	EAttribute getResonanzPersona_Resonanz();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanzBasis <em>Resonanz Basis</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resonanz Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanzBasis()
     * @see #getResonanzPersona()
     * @generated
     */
	EAttribute getResonanzPersona_ResonanzBasis();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.KomplexeForm <em>Komplexe Form</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Komplexe Form</em>'.
     * @see de.urszeidler.eclipse.shr5.KomplexeForm
     * @generated
     */
	EClass getKomplexeForm();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KomplexeForm#getZiel <em>Ziel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ziel</em>'.
     * @see de.urszeidler.eclipse.shr5.KomplexeForm#getZiel()
     * @see #getKomplexeForm()
     * @generated
     */
	EAttribute getKomplexeForm_Ziel();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KomplexeForm#getDauer <em>Dauer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dauer</em>'.
     * @see de.urszeidler.eclipse.shr5.KomplexeForm#getDauer()
     * @see #getKomplexeForm()
     * @generated
     */
	EAttribute getKomplexeForm_Dauer();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.KomplexeForm#getSchwund <em>Schwund</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schwund</em>'.
     * @see de.urszeidler.eclipse.shr5.KomplexeForm#getSchwund()
     * @see #getKomplexeForm()
     * @generated
     */
	EAttribute getKomplexeForm_Schwund();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm <em>Persona Komplex Form</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Komplex Form</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaKomplexForm
     * @generated
     */
	EClass getPersonaKomplexForm();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm#getForm <em>Form</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Form</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaKomplexForm#getForm()
     * @see #getPersonaKomplexForm()
     * @generated
     */
	EReference getPersonaKomplexForm_Form();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaKomplexForm#getStufe()
     * @see #getPersonaKomplexForm()
     * @generated
     */
	EAttribute getPersonaKomplexForm_Stufe();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Sprite <em>Sprite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sprite</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite
     * @generated
     */
	EClass getSprite();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sprite#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite#getStufe()
     * @see #getSprite()
     * @generated
     */
	EAttribute getSprite_Stufe();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sprite#getAngriffMod <em>Angriff Mod</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Angriff Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite#getAngriffMod()
     * @see #getSprite()
     * @generated
     */
	EAttribute getSprite_AngriffMod();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sprite#getSchleicherMod <em>Schleicher Mod</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schleicher Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite#getSchleicherMod()
     * @see #getSprite()
     * @generated
     */
	EAttribute getSprite_SchleicherMod();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sprite#getDatenverarbeitungMod <em>Datenverarbeitung Mod</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datenverarbeitung Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite#getDatenverarbeitungMod()
     * @see #getSprite()
     * @generated
     */
	EAttribute getSprite_DatenverarbeitungMod();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sprite#getFirewallMod <em>Firewall Mod</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Firewall Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite#getFirewallMod()
     * @see #getSprite()
     * @generated
     */
	EAttribute getSprite_FirewallMod();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Sprite#getInitativeMod <em>Initative Mod</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initative Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprite#getInitativeMod()
     * @see #getSprite()
     * @generated
     */
	EAttribute getSprite_InitativeMod();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Echo <em>Echo</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Echo</em>'.
     * @see de.urszeidler.eclipse.shr5.Echo
     * @generated
     */
	EClass getEcho();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Vertrag <em>Vertrag</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vertrag</em>'.
     * @see de.urszeidler.eclipse.shr5.Vertrag
     * @generated
     */
	EClass getVertrag();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Lifestyle <em>Lifestyle</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lifestyle</em>'.
     * @see de.urszeidler.eclipse.shr5.Lifestyle
     * @generated
     */
	EClass getLifestyle();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Lifestyle#getOptions <em>Options</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Options</em>'.
     * @see de.urszeidler.eclipse.shr5.Lifestyle#getOptions()
     * @see #getLifestyle()
     * @generated
     */
    EReference getLifestyle_Options();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Lifestyle#isOwned <em>Owned</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owned</em>'.
     * @see de.urszeidler.eclipse.shr5.Lifestyle#isOwned()
     * @see #getLifestyle()
     * @generated
     */
    EAttribute getLifestyle_Owned();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Wissensfertigkeit <em>Wissensfertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wissensfertigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.Wissensfertigkeit
     * @generated
     */
	EClass getWissensfertigkeit();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Sprachfertigkeit <em>Sprachfertigkeit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sprachfertigkeit</em>'.
     * @see de.urszeidler.eclipse.shr5.Sprachfertigkeit
     * @generated
     */
	EClass getSprachfertigkeit();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonaZustand <em>Persona Zustand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Zustand</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZustand
     * @generated
     */
    EClass getPersonaZustand();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandKoerperlichMax <em>Zustand Koerperlich Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand Koerperlich Max</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZustand#getZustandKoerperlichMax()
     * @see #getPersonaZustand()
     * @generated
     */
    EAttribute getPersonaZustand_ZustandKoerperlichMax();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGeistigMax <em>Zustand Geistig Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand Geistig Max</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGeistigMax()
     * @see #getPersonaZustand()
     * @generated
     */
    EAttribute getPersonaZustand_ZustandGeistigMax();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGrenze <em>Zustand Grenze</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand Grenze</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGrenze()
     * @see #getPersonaZustand()
     * @generated
     */
    EAttribute getPersonaZustand_ZustandGrenze();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Critter <em>Critter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Critter</em>'.
     * @see de.urszeidler.eclipse.shr5.Critter
     * @generated
     */
    EClass getCritter();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Critter#getPowers <em>Powers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Powers</em>'.
     * @see de.urszeidler.eclipse.shr5.Critter#getPowers()
     * @see #getCritter()
     * @generated
     */
    EReference getCritter_Powers();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.IntervallVertrag <em>Intervall Vertrag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intervall Vertrag</em>'.
     * @see de.urszeidler.eclipse.shr5.IntervallVertrag
     * @generated
     */
    EClass getIntervallVertrag();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.IntervallVertrag#getFaelligkeitsIntervall <em>Faelligkeits Intervall</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Faelligkeits Intervall</em>'.
     * @see de.urszeidler.eclipse.shr5.IntervallVertrag#getFaelligkeitsIntervall()
     * @see #getIntervallVertrag()
     * @generated
     */
    EAttribute getIntervallVertrag_FaelligkeitsIntervall();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Sin <em>Sin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sin</em>'.
     * @see de.urszeidler.eclipse.shr5.Sin
     * @generated
     */
    EClass getSin();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Lizenz <em>Lizenz</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lizenz</em>'.
     * @see de.urszeidler.eclipse.shr5.Lizenz
     * @generated
     */
    EClass getLizenz();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenGegenstand <em>Lizen Gegenstand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lizen Gegenstand</em>'.
     * @see de.urszeidler.eclipse.shr5.Lizenz#getLizenGegenstand()
     * @see #getLizenz()
     * @generated
     */
    EAttribute getLizenz_LizenGegenstand();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenzTraeger <em>Lizenz Traeger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Lizenz Traeger</em>'.
     * @see de.urszeidler.eclipse.shr5.Lizenz#getLizenzTraeger()
     * @see #getLizenz()
     * @generated
     */
    EReference getLizenz_LizenzTraeger();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Fakeable <em>Fakeable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fakeable</em>'.
     * @see de.urszeidler.eclipse.shr5.Fakeable
     * @generated
     */
    EClass getFakeable();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fakeable#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.Fakeable#getStufe()
     * @see #getFakeable()
     * @generated
     */
    EAttribute getFakeable_Stufe();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Fakeable#isGefaelscht <em>Gefaelscht</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gefaelscht</em>'.
     * @see de.urszeidler.eclipse.shr5.Fakeable#isGefaelscht()
     * @see #getFakeable()
     * @generated
     */
    EAttribute getFakeable_Gefaelscht();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Steigerbar <em>Steigerbar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Steigerbar</em>'.
     * @see de.urszeidler.eclipse.shr5.Steigerbar
     * @generated
     */
    EClass getSteigerbar();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Steigerbar#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.Steigerbar#getStufe()
     * @see #getSteigerbar()
     * @generated
     */
    EAttribute getSteigerbar_Stufe();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Erlernbar <em>Erlernbar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Erlernbar</em>'.
     * @see de.urszeidler.eclipse.shr5.Erlernbar
     * @generated
     */
    EClass getErlernbar();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Credstick <em>Credstick</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Credstick</em>'.
     * @see de.urszeidler.eclipse.shr5.Credstick
     * @generated
     */
    EClass getCredstick();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Credstick#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see de.urszeidler.eclipse.shr5.Credstick#getMaxValue()
     * @see #getCredstick()
     * @generated
     */
    EAttribute getCredstick_MaxValue();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Credstick#getTransactionlog <em>Transactionlog</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transactionlog</em>'.
     * @see de.urszeidler.eclipse.shr5.Credstick#getTransactionlog()
     * @see #getCredstick()
     * @generated
     */
    EReference getCredstick_Transactionlog();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Credstick#getCurrentValue <em>Current Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Current Value</em>'.
     * @see de.urszeidler.eclipse.shr5.Credstick#getCurrentValue()
     * @see #getCredstick()
     * @generated
     */
    EAttribute getCredstick_CurrentValue();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Menge <em>Menge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Menge</em>'.
     * @see de.urszeidler.eclipse.shr5.Menge
     * @generated
     */
    EClass getMenge();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Menge#getAnzahl <em>Anzahl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anzahl</em>'.
     * @see de.urszeidler.eclipse.shr5.Menge#getAnzahl()
     * @see #getMenge()
     * @generated
     */
    EAttribute getMenge_Anzahl();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Menge#getProAnzahl <em>Pro Anzahl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pro Anzahl</em>'.
     * @see de.urszeidler.eclipse.shr5.Menge#getProAnzahl()
     * @see #getMenge()
     * @generated
     */
    EAttribute getMenge_ProAnzahl();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Munition <em>Munition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Munition</em>'.
     * @see de.urszeidler.eclipse.shr5.Munition
     * @generated
     */
    EClass getMunition();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Munition#getDamageType <em>Damage Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Damage Type</em>'.
     * @see de.urszeidler.eclipse.shr5.Munition#getDamageType()
     * @see #getMunition()
     * @generated
     */
    EAttribute getMunition_DamageType();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Munition#getDamageMod <em>Damage Mod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Damage Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Munition#getDamageMod()
     * @see #getMunition()
     * @generated
     */
    EAttribute getMunition_DamageMod();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Munition#getArmorMod <em>Armor Mod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Armor Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.Munition#getArmorMod()
     * @see #getMunition()
     * @generated
     */
    EAttribute getMunition_ArmorMod();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Munition#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.urszeidler.eclipse.shr5.Munition#getType()
     * @see #getMunition()
     * @generated
     */
    EReference getMunition_Type();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ModifikatorAttribute <em>Modifikator Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modifikator Attribute</em>'.
     * @see de.urszeidler.eclipse.shr5.ModifikatorAttribute
     * @generated
     */
    EClass getModifikatorAttribute();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.GebundenerGeist <em>Gebundener Geist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gebundener Geist</em>'.
     * @see de.urszeidler.eclipse.shr5.GebundenerGeist
     * @generated
     */
    EClass getGebundenerGeist();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.GebundenerGeist#getDienste <em>Dienste</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dienste</em>'.
     * @see de.urszeidler.eclipse.shr5.GebundenerGeist#getDienste()
     * @see #getGebundenerGeist()
     * @generated
     */
    EAttribute getGebundenerGeist_Dienste();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.GebundenerGeist#getGeist <em>Geist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Geist</em>'.
     * @see de.urszeidler.eclipse.shr5.GebundenerGeist#getGeist()
     * @see #getGebundenerGeist()
     * @generated
     */
    EReference getGebundenerGeist_Geist();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.StufenPersona <em>Stufen Persona</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stufen Persona</em>'.
     * @see de.urszeidler.eclipse.shr5.StufenPersona
     * @generated
     */
    EClass getStufenPersona();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.StufenPersona#getStufe <em>Stufe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stufe</em>'.
     * @see de.urszeidler.eclipse.shr5.StufenPersona#getStufe()
     * @see #getStufenPersona()
     * @generated
     */
    EAttribute getStufenPersona_Stufe();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.StufenPersona#getSkillGroups <em>Skill Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Skill Groups</em>'.
     * @see de.urszeidler.eclipse.shr5.StufenPersona#getSkillGroups()
     * @see #getStufenPersona()
     * @generated
     */
    EReference getStufenPersona_SkillGroups();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.StufenPersona#getSkills <em>Skills</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Skills</em>'.
     * @see de.urszeidler.eclipse.shr5.StufenPersona#getSkills()
     * @see #getStufenPersona()
     * @generated
     */
    EReference getStufenPersona_Skills();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Geist <em>Geist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Geist</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist
     * @generated
     */
    EClass getGeist();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getKonstitutionBasis <em>Konstitution Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Konstitution Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getKonstitutionBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_KonstitutionBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geschicklichkeit Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getGeschicklichkeitBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_GeschicklichkeitBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getReaktionBasis <em>Reaktion Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reaktion Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getReaktionBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_ReaktionBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getStaerkeBasis <em>Staerke Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Staerke Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getStaerkeBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_StaerkeBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getCharismaBasis <em>Charisma Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charisma Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getCharismaBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_CharismaBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getWillenskraftBasis <em>Willenskraft Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Willenskraft Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getWillenskraftBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_WillenskraftBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getIntuitionBasis <em>Intuition Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intuition Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getIntuitionBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_IntuitionBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Geist#getLogikBasis <em>Logik Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logik Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getLogikBasis()
     * @see #getGeist()
     * @generated
     */
    EAttribute getGeist_LogikBasis();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Geist#getPowers <em>Powers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Powers</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getPowers()
     * @see #getGeist()
     * @generated
     */
    EReference getGeist_Powers();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Geist#getOptionalPowers <em>Optional Powers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Optional Powers</em>'.
     * @see de.urszeidler.eclipse.shr5.Geist#getOptionalPowers()
     * @see #getGeist()
     * @generated
     */
    EReference getGeist_OptionalPowers();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Identifiable <em>Identifiable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifiable</em>'.
     * @see de.urszeidler.eclipse.shr5.Identifiable
     * @generated
     */
    EClass getIdentifiable();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Identifiable#getParentId <em>Parent Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parent Id</em>'.
     * @see de.urszeidler.eclipse.shr5.Identifiable#getParentId()
     * @see #getIdentifiable()
     * @generated
     */
    EAttribute getIdentifiable_ParentId();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.CredstickTransaction <em>Credstick Transaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Credstick Transaction</em>'.
     * @see de.urszeidler.eclipse.shr5.CredstickTransaction
     * @generated
     */
    EClass getCredstickTransaction();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getAmount <em>Amount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Amount</em>'.
     * @see de.urszeidler.eclipse.shr5.CredstickTransaction#getAmount()
     * @see #getCredstickTransaction()
     * @generated
     */
    EAttribute getCredstickTransaction_Amount();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see de.urszeidler.eclipse.shr5.CredstickTransaction#getDate()
     * @see #getCredstickTransaction()
     * @generated
     */
    EAttribute getCredstickTransaction_Date();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CredstickTransaction#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see de.urszeidler.eclipse.shr5.CredstickTransaction#getDescription()
     * @see #getCredstickTransaction()
     * @generated
     */
    EAttribute getCredstickTransaction_Description();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Spezialisierung <em>Spezialisierung</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spezialisierung</em>'.
     * @see de.urszeidler.eclipse.shr5.Spezialisierung
     * @generated
     */
    EClass getSpezialisierung();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MatrixAttributes <em>Matrix Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Matrix Attributes</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes
     * @generated
     */
    EClass getMatrixAttributes();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe <em>Geraetestufe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geraetestufe</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe()
     * @see #getMatrixAttributes()
     * @generated
     */
    EAttribute getMatrixAttributes_Geraetestufe();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall <em>Firewall</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Firewall</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall()
     * @see #getMatrixAttributes()
     * @generated
     */
    EAttribute getMatrixAttributes_Firewall();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung <em>Datenverarbeitung</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datenverarbeitung</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung()
     * @see #getMatrixAttributes()
     * @generated
     */
    EAttribute getMatrixAttributes_Datenverarbeitung();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getCurrentModus <em>Current Modus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Current Modus</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getCurrentModus()
     * @see #getMatrixAttributes()
     * @generated
     */
    EAttribute getMatrixAttributes_CurrentModus();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MatrixDevice <em>Matrix Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Matrix Device</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixDevice
     * @generated
     */
    EClass getMatrixDevice();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getPan <em>Pan</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Pan</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getPan()
     * @see #getMatrixDevice()
     * @generated
     */
    EReference getMatrixDevice_Pan();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.CommonProgram <em>Common Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Common Program</em>'.
     * @see de.urszeidler.eclipse.shr5.CommonProgram
     * @generated
     */
    EClass getCommonProgram();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CommonProgram#getProgramType <em>Program Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Program Type</em>'.
     * @see de.urszeidler.eclipse.shr5.CommonProgram#getProgramType()
     * @see #getCommonProgram()
     * @generated
     */
    EAttribute getCommonProgram_ProgramType();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.WeaponMount <em>Weapon Mount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Weapon Mount</em>'.
     * @see de.urszeidler.eclipse.shr5.WeaponMount
     * @generated
     */
    EClass getWeaponMount();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.WeaponMount#getWeapon <em>Weapon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Weapon</em>'.
     * @see de.urszeidler.eclipse.shr5.WeaponMount#getWeapon()
     * @see #getWeaponMount()
     * @generated
     */
    EReference getWeaponMount_Weapon();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.LifestyleOption <em>Lifestyle Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lifestyle Option</em>'.
     * @see de.urszeidler.eclipse.shr5.LifestyleOption
     * @generated
     */
    EClass getLifestyleOption();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PercentLifestyleOption <em>Percent Lifestyle Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Percent Lifestyle Option</em>'.
     * @see de.urszeidler.eclipse.shr5.PercentLifestyleOption
     * @generated
     */
    EClass getPercentLifestyleOption();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice <em>Active Matix Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Active Matix Device</em>'.
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice
     * @generated
     */
    EClass getActiveMatixDevice();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff <em>Angriff</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Angriff</em>'.
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff()
     * @see #getActiveMatixDevice()
     * @generated
     */
    EAttribute getActiveMatixDevice_Angriff();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher <em>Schleicher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schleicher</em>'.
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher()
     * @see #getActiveMatixDevice()
     * @generated
     */
    EAttribute getActiveMatixDevice_Schleicher();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Commlink <em>Commlink</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Commlink</em>'.
     * @see de.urszeidler.eclipse.shr5.Commlink
     * @generated
     */
    EClass getCommlink();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Commlink#getStoredPrograms <em>Stored Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stored Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.Commlink#getStoredPrograms()
     * @see #getCommlink()
     * @generated
     */
    EReference getCommlink_StoredPrograms();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor <em>Matix Condition Monitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Matix Condition Monitor</em>'.
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor
     * @generated
     */
    EClass getMatixConditionMonitor();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax <em>Matrix Zustand Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Matrix Zustand Max</em>'.
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax()
     * @see #getMatixConditionMonitor()
     * @generated
     */
    EAttribute getMatixConditionMonitor_MatrixZustandMax();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Cyberdeck <em>Cyberdeck</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cyberdeck</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck
     * @generated
     */
    EClass getCyberdeck();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getProgramSlots <em>Program Slots</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Program Slots</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getProgramSlots()
     * @see #getCyberdeck()
     * @generated
     */
    EAttribute getCyberdeck_ProgramSlots();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute1 <em>Attribute1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute1</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute1()
     * @see #getCyberdeck()
     * @generated
     */
    EAttribute getCyberdeck_Attribute1();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute2 <em>Attribute2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute2</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute2()
     * @see #getCyberdeck()
     * @generated
     */
    EAttribute getCyberdeck_Attribute2();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute3 <em>Attribute3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute3</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute3()
     * @see #getCyberdeck()
     * @generated
     */
    EAttribute getCyberdeck_Attribute3();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute4 <em>Attribute4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute4</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getAttribute4()
     * @see #getCyberdeck()
     * @generated
     */
    EAttribute getCyberdeck_Attribute4();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Configuration</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getConfiguration()
     * @see #getCyberdeck()
     * @generated
     */
    EReference getCyberdeck_Configuration();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getStoredPrograms <em>Stored Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stored Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getStoredPrograms()
     * @see #getCyberdeck()
     * @generated
     */
    EReference getCyberdeck_StoredPrograms();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.Cyberdeck#getRunningPrograms <em>Running Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Running Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.Cyberdeck#getRunningPrograms()
     * @see #getCyberdeck()
     * @generated
     */
    EReference getCyberdeck_RunningPrograms();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.SoftwareAgent <em>Software Agent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software Agent</em>'.
     * @see de.urszeidler.eclipse.shr5.SoftwareAgent
     * @generated
     */
    EClass getSoftwareAgent();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SoftwareAgent#getRating <em>Rating</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rating</em>'.
     * @see de.urszeidler.eclipse.shr5.SoftwareAgent#getRating()
     * @see #getSoftwareAgent()
     * @generated
     */
    EAttribute getSoftwareAgent_Rating();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Host <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Host</em>'.
     * @see de.urszeidler.eclipse.shr5.Host
     * @generated
     */
    EClass getHost();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren <em>Cyberware Modifikatioren</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cyberware Modifikatioren</em>'.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren
     * @generated
     */
    EClass getCyberwareModifikatioren();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isDirectNeuralInterface <em>Direct Neural Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direct Neural Interface</em>'.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isDirectNeuralInterface()
     * @see #getCyberwareModifikatioren()
     * @generated
     */
    EAttribute getCyberwareModifikatioren_DirectNeuralInterface();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isUniversalDataConnector <em>Universal Data Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Universal Data Connector</em>'.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isUniversalDataConnector()
     * @see #getCyberwareModifikatioren()
     * @generated
     */
    EAttribute getCyberwareModifikatioren_UniversalDataConnector();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getControlRig <em>Control Rig</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Control Rig</em>'.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getControlRig()
     * @see #getCyberwareModifikatioren()
     * @generated
     */
    EAttribute getCyberwareModifikatioren_ControlRig();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getSimRig <em>Sim Rig</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sim Rig</em>'.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getSimRig()
     * @see #getCyberwareModifikatioren()
     * @generated
     */
    EAttribute getCyberwareModifikatioren_SimRig();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isRiggerInterface <em>Rigger Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rigger Interface</em>'.
     * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isRiggerInterface()
     * @see #getCyberwareModifikatioren()
     * @generated
     */
    EAttribute getCyberwareModifikatioren_RiggerInterface();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole <em>Rigger Command Console</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rigger Command Console</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole
     * @generated
     */
    EClass getRiggerCommandConsole();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRauschunterdrueckung <em>Rauschunterdrueckung</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rauschunterdrueckung</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRauschunterdrueckung()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EAttribute getRiggerCommandConsole_Rauschunterdrueckung();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriff <em>Zugriff</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zugriff</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriff()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EAttribute getRiggerCommandConsole_Zugriff();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getDatenverarbeitungBasis <em>Datenverarbeitung Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datenverarbeitung Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getDatenverarbeitungBasis()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EAttribute getRiggerCommandConsole_DatenverarbeitungBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getFirewallBasis <em>Firewall Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Firewall Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getFirewallBasis()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EAttribute getRiggerCommandConsole_FirewallBasis();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriffBasis <em>Zugriff Basis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zugriff Basis</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriffBasis()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EAttribute getRiggerCommandConsole_ZugriffBasis();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getStoredPrograms <em>Stored Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stored Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getStoredPrograms()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EReference getRiggerCommandConsole_StoredPrograms();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRunningPrograms <em>Running Programs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Running Programs</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRunningPrograms()
     * @see #getRiggerCommandConsole()
     * @generated
     */
    EReference getRiggerCommandConsole_RunningPrograms();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AutoSoft <em>Auto Soft</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Auto Soft</em>'.
     * @see de.urszeidler.eclipse.shr5.AutoSoft
     * @generated
     */
    EClass getAutoSoft();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AutoSoft#getRating <em>Rating</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rating</em>'.
     * @see de.urszeidler.eclipse.shr5.AutoSoft#getRating()
     * @see #getAutoSoft()
     * @generated
     */
    EAttribute getAutoSoft_Rating();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AutoSoft#getSkill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Skill</em>'.
     * @see de.urszeidler.eclipse.shr5.AutoSoft#getSkill()
     * @see #getAutoSoft()
     * @generated
     */
    EReference getAutoSoft_Skill();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AutoSoft#getWeapon <em>Weapon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Weapon</em>'.
     * @see de.urszeidler.eclipse.shr5.AutoSoft#getWeapon()
     * @see #getAutoSoft()
     * @generated
     */
    EReference getAutoSoft_Weapon();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.AutoSoft#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Model</em>'.
     * @see de.urszeidler.eclipse.shr5.AutoSoft#getModel()
     * @see #getAutoSoft()
     * @generated
     */
    EReference getAutoSoft_Model();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Software <em>Software</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software</em>'.
     * @see de.urszeidler.eclipse.shr5.Software
     * @generated
     */
    EClass getSoftware();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.MatrixProgram <em>Matrix Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Matrix Program</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixProgram
     * @generated
     */
    EClass getMatrixProgram();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Tutorsoft <em>Tutorsoft</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tutorsoft</em>'.
     * @see de.urszeidler.eclipse.shr5.Tutorsoft
     * @generated
     */
    EClass getTutorsoft();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.Tutorsoft#getRating <em>Rating</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rating</em>'.
     * @see de.urszeidler.eclipse.shr5.Tutorsoft#getRating()
     * @see #getTutorsoft()
     * @generated
     */
    EAttribute getTutorsoft_Rating();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Tutorsoft#getSkill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Skill</em>'.
     * @see de.urszeidler.eclipse.shr5.Tutorsoft#getSkill()
     * @see #getTutorsoft()
     * @generated
     */
    EReference getTutorsoft_Skill();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.SkillSoft <em>Skill Soft</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Skill Soft</em>'.
     * @see de.urszeidler.eclipse.shr5.SkillSoft
     * @generated
     */
    EClass getSkillSoft();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.SkillSoft#getSkill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Skill</em>'.
     * @see de.urszeidler.eclipse.shr5.SkillSoft#getSkill()
     * @see #getSkillSoft()
     * @generated
     */
    EReference getSkillSoft_Skill();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.SkillSoft#getRating <em>Rating</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rating</em>'.
     * @see de.urszeidler.eclipse.shr5.SkillSoft#getRating()
     * @see #getSkillSoft()
     * @generated
     */
    EAttribute getSkillSoft_Rating();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand <em>Fahrzeug Zustand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fahrzeug Zustand</em>'.
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand
     * @generated
     */
    EClass getFahrzeugZustand();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax <em>Zustand Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand Max</em>'.
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax()
     * @see #getFahrzeugZustand()
     * @generated
     */
    EAttribute getFahrzeugZustand_ZustandMax();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork <em>Personal Area Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Personal Area Network</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork
     * @generated
     */
    EClass getPersonalAreaNetwork();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaves <em>Slaves</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Slaves</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaves()
     * @see #getPersonalAreaNetwork()
     * @generated
     */
    EReference getPersonalAreaNetwork_Slaves();

    /**
     * Returns the meta object for the container reference '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getMaster <em>Master</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Master</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getMaster()
     * @see #getPersonalAreaNetwork()
     * @generated
     */
    EReference getPersonalAreaNetwork_Master();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaveMax <em>Slave Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Slave Max</em>'.
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaveMax()
     * @see #getPersonalAreaNetwork()
     * @generated
     */
    EAttribute getPersonalAreaNetwork_SlaveMax();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.BasicProgram <em>Basic Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Program</em>'.
     * @see de.urszeidler.eclipse.shr5.BasicProgram
     * @generated
     */
    EClass getBasicProgram();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.Datasoft <em>Datasoft</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datasoft</em>'.
     * @see de.urszeidler.eclipse.shr5.Datasoft
     * @generated
     */
    EClass getDatasoft();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.Datasoft#getSkill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Skill</em>'.
     * @see de.urszeidler.eclipse.shr5.Datasoft#getSkill()
     * @see #getDatasoft()
     * @generated
     */
    EReference getDatasoft_Skill();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice <em>Abstract Matrix Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Matrix Device</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstractMatrixDevice
     * @generated
     */
    EClass getAbstractMatrixDevice();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice#getDeviceRating <em>Device Rating</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Device Rating</em>'.
     * @see de.urszeidler.eclipse.shr5.AbstractMatrixDevice#getDeviceRating()
     * @see #getAbstractMatrixDevice()
     * @generated
     */
    EAttribute getAbstractMatrixDevice_DeviceRating();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.ConsumerSoft <em>Consumer Soft</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consumer Soft</em>'.
     * @see de.urszeidler.eclipse.shr5.ConsumerSoft
     * @generated
     */
    EClass getConsumerSoft();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.ConsumerSoft#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.urszeidler.eclipse.shr5.ConsumerSoft#getType()
     * @see #getConsumerSoft()
     * @generated
     */
    EAttribute getConsumerSoft_Type();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.RiggerProgram <em>Rigger Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rigger Program</em>'.
     * @see de.urszeidler.eclipse.shr5.RiggerProgram
     * @generated
     */
    EClass getRiggerProgram();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.FeuerModus <em>Feuer Modus</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Feuer Modus</em>'.
     * @see de.urszeidler.eclipse.shr5.FeuerModus
     * @generated
     */
	EEnum getFeuerModus();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.SchadensTyp <em>Schadens Typ</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Schadens Typ</em>'.
     * @see de.urszeidler.eclipse.shr5.SchadensTyp
     * @generated
     */
	EEnum getSchadensTyp();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.MagazinTyp <em>Magazin Typ</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Magazin Typ</em>'.
     * @see de.urszeidler.eclipse.shr5.MagazinTyp
     * @generated
     */
	EEnum getMagazinTyp();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung <em>Feuwerwaffen Erweiterung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Feuwerwaffen Erweiterung</em>'.
     * @see de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung
     * @generated
     */
	EEnum getFeuwerwaffenErweiterung();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.ModifikatorType <em>Modifikator Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Modifikator Type</em>'.
     * @see de.urszeidler.eclipse.shr5.ModifikatorType
     * @generated
     */
	EEnum getModifikatorType();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.SmartgunType <em>Smartgun Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Smartgun Type</em>'.
     * @see de.urszeidler.eclipse.shr5.SmartgunType
     * @generated
     */
	EEnum getSmartgunType();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.ZauberArt <em>Zauber Art</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Zauber Art</em>'.
     * @see de.urszeidler.eclipse.shr5.ZauberArt
     * @generated
     */
	EEnum getZauberArt();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.ZauberReichweite <em>Zauber Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Zauber Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.ZauberReichweite
     * @generated
     */
	EEnum getZauberReichweite();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.ZauberDauer <em>Zauber Dauer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Zauber Dauer</em>'.
     * @see de.urszeidler.eclipse.shr5.ZauberDauer
     * @generated
     */
	EEnum getZauberDauer();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.MagischeTradition <em>Magische Tradition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Magische Tradition</em>'.
     * @see de.urszeidler.eclipse.shr5.MagischeTradition
     * @generated
     */
	EEnum getMagischeTradition();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.CritterHandlung <em>Critter Handlung</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Critter Handlung</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterHandlung
     * @generated
     */
	EEnum getCritterHandlung();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.CritterReichweite <em>Critter Reichweite</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Critter Reichweite</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterReichweite
     * @generated
     */
	EEnum getCritterReichweite();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.CritterDauer <em>Critter Dauer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Critter Dauer</em>'.
     * @see de.urszeidler.eclipse.shr5.CritterDauer
     * @generated
     */
	EEnum getCritterDauer();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.ResonanzZiel <em>Resonanz Ziel</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resonanz Ziel</em>'.
     * @see de.urszeidler.eclipse.shr5.ResonanzZiel
     * @generated
     */
	EEnum getResonanzZiel();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.InterfaceModus <em>Interface Modus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Interface Modus</em>'.
     * @see de.urszeidler.eclipse.shr5.InterfaceModus
     * @generated
     */
    EEnum getInterfaceModus();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.ProgramType <em>Program Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Program Type</em>'.
     * @see de.urszeidler.eclipse.shr5.ProgramType
     * @generated
     */
    EEnum getProgramType();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.MatrixProgramType <em>Matrix Program Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Matrix Program Type</em>'.
     * @see de.urszeidler.eclipse.shr5.MatrixProgramType
     * @generated
     */
    EEnum getMatrixProgramType();

    /**
     * Returns the meta object for data type '{@link java.util.Date <em>Shr Date</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Shr Date</em>'.
     * @see java.util.Date
     * @model instanceClass="java.util.Date"
     * @generated
     */
	EDataType getShrDate();

	/**
     * Returns the meta object for data type '{@link de.urszeidler.eclipse.shr5.ModSetter <em>Modification Manager</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modification Manager</em>'.
     * @see de.urszeidler.eclipse.shr5.ModSetter
     * @model instanceClass="de.urszeidler.eclipse.shr5.ModSetter" serializeable="false"
     * @generated
     */
	EDataType getModificationManager();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	Shr5Factory getShr5Factory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Beschreibbar <em>Beschreibbar</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Beschreibbar
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBeschreibbar()
         * @generated
         */
		EClass BESCHREIBBAR = eINSTANCE.getBeschreibbar();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BESCHREIBBAR__NAME = eINSTANCE.getBeschreibbar_Name();

		/**
         * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BESCHREIBBAR__BESCHREIBUNG = eINSTANCE.getBeschreibbar_Beschreibung();

		/**
         * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BESCHREIBBAR__IMAGE = eINSTANCE.getBeschreibbar_Image();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Quelle <em>Quelle</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Quelle
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getQuelle()
         * @generated
         */
		EClass QUELLE = eINSTANCE.getQuelle();

		/**
         * The meta object literal for the '<em><b>Page</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute QUELLE__PAGE = eINSTANCE.getQuelle_Page();

		/**
         * The meta object literal for the '<em><b>Src Book</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference QUELLE__SRC_BOOK = eINSTANCE.getQuelle_SrcBook();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl <em>Source Book</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SourceBookImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSourceBook()
         * @generated
         */
		EClass SOURCE_BOOK = eINSTANCE.getSourceBook();

		/**
         * The meta object literal for the '<em><b>Start Shr Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SOURCE_BOOK__START_SHR_TIME = eINSTANCE.getSourceBook_StartShrTime();

		/**
         * The meta object literal for the '<em><b>End Shr Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SOURCE_BOOK__END_SHR_TIME = eINSTANCE.getSourceBook_EndShrTime();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl <em>Abstrakt Persona</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstraktPersona()
         * @generated
         */
		EClass ABSTRAKT_PERSONA = eINSTANCE.getAbstraktPersona();

		/**
         * The meta object literal for the '<em><b>Konstitution Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__KONSTITUTION_BASIS = eINSTANCE.getAbstraktPersona_KonstitutionBasis();

		/**
         * The meta object literal for the '<em><b>Geschicklichkeit Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS = eINSTANCE.getAbstraktPersona_GeschicklichkeitBasis();

		/**
         * The meta object literal for the '<em><b>Reaktion Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__REAKTION_BASIS = eINSTANCE.getAbstraktPersona_ReaktionBasis();

		/**
         * The meta object literal for the '<em><b>Staerke Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__STAERKE_BASIS = eINSTANCE.getAbstraktPersona_StaerkeBasis();

		/**
         * The meta object literal for the '<em><b>Charisma Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__CHARISMA_BASIS = eINSTANCE.getAbstraktPersona_CharismaBasis();

		/**
         * The meta object literal for the '<em><b>Willenskraft Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS = eINSTANCE.getAbstraktPersona_WillenskraftBasis();

		/**
         * The meta object literal for the '<em><b>Intuition Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__INTUITION_BASIS = eINSTANCE.getAbstraktPersona_IntuitionBasis();

		/**
         * The meta object literal for the '<em><b>Logik Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__LOGIK_BASIS = eINSTANCE.getAbstraktPersona_LogikBasis();

		/**
         * The meta object literal for the '<em><b>Fertigkeiten</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ABSTRAKT_PERSONA__FERTIGKEITEN = eINSTANCE.getAbstraktPersona_Fertigkeiten();

		/**
         * The meta object literal for the '<em><b>Fertigkeits Gruppen</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN = eINSTANCE.getAbstraktPersona_FertigkeitsGruppen();

		/**
         * The meta object literal for the '<em><b>Spezies</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ABSTRAKT_PERSONA__SPEZIES = eINSTANCE.getAbstraktPersona_Spezies();

		/**
         * The meta object literal for the '<em><b>Mod Manager</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTRAKT_PERSONA__MOD_MANAGER = eINSTANCE.getAbstraktPersona_ModManager();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.GegenstandImpl <em>Gegenstand</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.GegenstandImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGegenstand()
         * @generated
         */
		EClass GEGENSTAND = eINSTANCE.getGegenstand();

		/**
         * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND__KATEGORIE = eINSTANCE.getGegenstand_Kategorie();

		/**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND__STUFE = eINSTANCE.getGegenstand_Stufe();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.GeldWert <em>Geld Wert</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.GeldWert
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGeldWert()
         * @generated
         */
		EClass GELD_WERT = eINSTANCE.getGeldWert();

		/**
         * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GELD_WERT__WERT = eINSTANCE.getGeldWert_Wert();

		/**
         * The meta object literal for the '<em><b>Verfuegbarkeit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GELD_WERT__VERFUEGBARKEIT = eINSTANCE.getGeldWert_Verfuegbarkeit();

		/**
         * The meta object literal for the '<em><b>Wert Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GELD_WERT__WERT_VALUE = eINSTANCE.getGeldWert_WertValue();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl <em>Reichweite</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.ReichweiteImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getReichweite()
         * @generated
         */
		EClass REICHWEITE = eINSTANCE.getReichweite();

		/**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REICHWEITE__MIN = eINSTANCE.getReichweite_Min();

		/**
         * The meta object literal for the '<em><b>Kurz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REICHWEITE__KURZ = eINSTANCE.getReichweite_Kurz();

		/**
         * The meta object literal for the '<em><b>Mittel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REICHWEITE__MITTEL = eINSTANCE.getReichweite_Mittel();

		/**
         * The meta object literal for the '<em><b>Weit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REICHWEITE__WEIT = eINSTANCE.getReichweite_Weit();

		/**
         * The meta object literal for the '<em><b>Extrem</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REICHWEITE__EXTREM = eINSTANCE.getReichweite_Extrem();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl <em>Attribut Modifikator Wert</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAttributModifikatorWert()
         * @generated
         */
		EClass ATTRIBUT_MODIFIKATOR_WERT = eINSTANCE.getAttributModifikatorWert();

		/**
         * The meta object literal for the '<em><b>Attribut</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT = eINSTANCE.getAttributModifikatorWert_Attribut();

		/**
         * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ATTRIBUT_MODIFIKATOR_WERT__WERT = eINSTANCE.getAttributModifikatorWert_Wert();

		/**
         * The meta object literal for the '<em><b>Modifiziertes</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES = eINSTANCE.getAttributModifikatorWert_Modifiziertes();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Modifizierbar <em>Modifizierbar</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Modifizierbar
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModifizierbar()
         * @generated
         */
		EClass MODIFIZIERBAR = eINSTANCE.getModifizierbar();

		/**
         * The meta object literal for the '<em><b>Mods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MODIFIZIERBAR__MODS = eINSTANCE.getModifizierbar_Mods();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute <em>Koerperliche Attribute</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKoerperlicheAttribute()
         * @generated
         */
		EClass KOERPERLICHE_ATTRIBUTE = eINSTANCE.getKoerperlicheAttribute();

		/**
         * The meta object literal for the '<em><b>Konstitution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOERPERLICHE_ATTRIBUTE__KONSTITUTION = eINSTANCE.getKoerperlicheAttribute_Konstitution();

		/**
         * The meta object literal for the '<em><b>Geschicklichkeit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT = eINSTANCE.getKoerperlicheAttribute_Geschicklichkeit();

		/**
         * The meta object literal for the '<em><b>Reaktion</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOERPERLICHE_ATTRIBUTE__REAKTION = eINSTANCE.getKoerperlicheAttribute_Reaktion();

		/**
         * The meta object literal for the '<em><b>Staerke</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOERPERLICHE_ATTRIBUTE__STAERKE = eINSTANCE.getKoerperlicheAttribute_Staerke();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute <em>Spezielle Attribute</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.SpezielleAttribute
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSpezielleAttribute()
         * @generated
         */
		EClass SPEZIELLE_ATTRIBUTE = eINSTANCE.getSpezielleAttribute();

		/**
         * The meta object literal for the '<em><b>Initative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIELLE_ATTRIBUTE__INITATIVE = eINSTANCE.getSpezielleAttribute_Initative();

		/**
         * The meta object literal for the '<em><b>Initativ Wuerfel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL = eINSTANCE.getSpezielleAttribute_InitativWuerfel();

		/**
         * The meta object literal for the '<em><b>Ausweichen</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIELLE_ATTRIBUTE__AUSWEICHEN = eINSTANCE.getSpezielleAttribute_Ausweichen();

		/**
         * The meta object literal for the '<em><b>Essenz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIELLE_ATTRIBUTE__ESSENZ = eINSTANCE.getSpezielleAttribute_Essenz();

		/**
         * The meta object literal for the '<em><b>Edge Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIELLE_ATTRIBUTE__EDGE_BASIS = eINSTANCE.getSpezielleAttribute_EdgeBasis();

		/**
         * The meta object literal for the '<em><b>Edge</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIELLE_ATTRIBUTE__EDGE = eINSTANCE.getSpezielleAttribute_Edge();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl <em>Abstrakt Gegenstand</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstraktGegenstand()
         * @generated
         */
		EClass ABSTRAKT_GEGENSTAND = eINSTANCE.getAbstraktGegenstand();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AbstaktFernKampfwaffeImpl <em>Abstakt Fern Kampfwaffe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AbstaktFernKampfwaffeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstaktFernKampfwaffe()
         * @generated
         */
		EClass ABSTAKT_FERN_KAMPFWAFFE = eINSTANCE.getAbstaktFernKampfwaffe();

		/**
         * The meta object literal for the '<em><b>Reichweite</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE = eINSTANCE.getAbstaktFernKampfwaffe_Reichweite();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl <em>Abstakt Waffe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstaktWaffe()
         * @generated
         */
		EClass ABSTAKT_WAFFE = eINSTANCE.getAbstaktWaffe();

		/**
         * The meta object literal for the '<em><b>Schadenscode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTAKT_WAFFE__SCHADENSCODE = eINSTANCE.getAbstaktWaffe_Schadenscode();

		/**
         * The meta object literal for the '<em><b>Schades Typ</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTAKT_WAFFE__SCHADES_TYP = eINSTANCE.getAbstaktWaffe_SchadesTyp();

		/**
         * The meta object literal for the '<em><b>Praezision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTAKT_WAFFE__PRAEZISION = eINSTANCE.getAbstaktWaffe_Praezision();

		/**
         * The meta object literal for the '<em><b>Durchschlags Kraft</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT = eINSTANCE.getAbstaktWaffe_DurchschlagsKraft();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.NahkampfwaffeImpl <em>Nahkampfwaffe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.NahkampfwaffeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getNahkampfwaffe()
         * @generated
         */
		EClass NAHKAMPFWAFFE = eINSTANCE.getNahkampfwaffe();

		/**
         * The meta object literal for the '<em><b>Reichweite</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NAHKAMPFWAFFE__REICHWEITE = eINSTANCE.getNahkampfwaffe_Reichweite();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl <em>Feuerwaffe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFeuerwaffe()
         * @generated
         */
		EClass FEUERWAFFE = eINSTANCE.getFeuerwaffe();

		/**
         * The meta object literal for the '<em><b>Munitionstyp</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FEUERWAFFE__MUNITIONSTYP = eINSTANCE.getFeuerwaffe_Munitionstyp();

		/**
         * The meta object literal for the '<em><b>Modie</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FEUERWAFFE__MODIE = eINSTANCE.getFeuerwaffe_Modie();

		/**
         * The meta object literal for the '<em><b>Kapazitaet</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FEUERWAFFE__KAPAZITAET = eINSTANCE.getFeuerwaffe_Kapazitaet();

		/**
         * The meta object literal for the '<em><b>Erweiterung</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FEUERWAFFE__ERWEITERUNG = eINSTANCE.getFeuerwaffe_Erweiterung();

		/**
         * The meta object literal for the '<em><b>Rueckstoss</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FEUERWAFFE__RUECKSTOSS = eINSTANCE.getFeuerwaffe_Rueckstoss();

		/**
         * The meta object literal for the '<em><b>Einbau</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FEUERWAFFE__EINBAU = eINSTANCE.getFeuerwaffe_Einbau();

		/**
         * The meta object literal for the '<em><b>Magazin</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEUERWAFFE__MAGAZIN = eINSTANCE.getFeuerwaffe_Magazin();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.WurfwaffeImpl <em>Wurfwaffe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.WurfwaffeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getWurfwaffe()
         * @generated
         */
		EClass WURFWAFFE = eINSTANCE.getWurfwaffe();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.ShrListImpl <em>Shr List</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.ShrListImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getShrList()
         * @generated
         */
		EClass SHR_LIST = eINSTANCE.getShrList();

		/**
         * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHR_LIST__ENTRIES = eINSTANCE.getShrList_Entries();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.ProjektilwaffeImpl <em>Projektilwaffe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.ProjektilwaffeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getProjektilwaffe()
         * @generated
         */
		EClass PROJEKTILWAFFE = eINSTANCE.getProjektilwaffe();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl <em>Fertigkeits Gruppe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFertigkeitsGruppe()
         * @generated
         */
		EClass FERTIGKEITS_GRUPPE = eINSTANCE.getFertigkeitsGruppe();

		/**
         * The meta object literal for the '<em><b>Fertigkeiten</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FERTIGKEITS_GRUPPE__FERTIGKEITEN = eINSTANCE.getFertigkeitsGruppe_Fertigkeiten();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FertigkeitImpl <em>Fertigkeit</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FertigkeitImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFertigkeit()
         * @generated
         */
		EClass FERTIGKEIT = eINSTANCE.getFertigkeit();

		/**
         * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERTIGKEIT__KATEGORIE = eINSTANCE.getFertigkeit_Kategorie();

		/**
         * The meta object literal for the '<em><b>Ausweichen</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERTIGKEIT__AUSWEICHEN = eINSTANCE.getFertigkeit_Ausweichen();

		/**
         * The meta object literal for the '<em><b>Attribut</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FERTIGKEIT__ATTRIBUT = eINSTANCE.getFertigkeit_Attribut();

		/**
         * The meta object literal for the '<em><b>Spezialisierungen</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FERTIGKEIT__SPEZIALISIERUNGEN = eINSTANCE.getFertigkeit_Spezialisierungen();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitImpl <em>Persona Fertigkeit</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaFertigkeit()
         * @generated
         */
		EClass PERSONA_FERTIGKEIT = eINSTANCE.getPersonaFertigkeit();

		/**
         * The meta object literal for the '<em><b>Fertigkeit</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PERSONA_FERTIGKEIT__FERTIGKEIT = eINSTANCE.getPersonaFertigkeit_Fertigkeit();

		/**
         * The meta object literal for the '<em><b>Spezialisierungen</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSONA_FERTIGKEIT__SPEZIALISIERUNGEN = eINSTANCE.getPersonaFertigkeit_Spezialisierungen();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitsGruppeImpl <em>Persona Fertigkeits Gruppe</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitsGruppeImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaFertigkeitsGruppe()
         * @generated
         */
		EClass PERSONA_FERTIGKEITS_GRUPPE = eINSTANCE.getPersonaFertigkeitsGruppe();

		/**
         * The meta object literal for the '<em><b>Gruppe</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PERSONA_FERTIGKEITS_GRUPPE__GRUPPE = eINSTANCE.getPersonaFertigkeitsGruppe_Gruppe();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl <em>Cyberware</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CyberwareImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCyberware()
         * @generated
         */
		EClass CYBERWARE = eINSTANCE.getCyberware();

		/**
         * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CYBERWARE__PERSONA = eINSTANCE.getCyberware_Persona();

		/**
         * The meta object literal for the '<em><b>Einbau</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CYBERWARE__EINBAU = eINSTANCE.getCyberware_Einbau();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.BioWareImpl <em>Bio Ware</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.BioWareImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBioWare()
         * @generated
         */
		EClass BIO_WARE = eINSTANCE.getBioWare();

		/**
         * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BIO_WARE__PERSONA = eINSTANCE.getBioWare_Persona();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.KoerpermodsImpl <em>Koerpermods</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.KoerpermodsImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKoerpermods()
         * @generated
         */
		EClass KOERPERMODS = eINSTANCE.getKoerpermods();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AbstraktModifikatorenImpl <em>Abstrakt Modifikatoren</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AbstraktModifikatorenImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstraktModifikatoren()
         * @generated
         */
		EClass ABSTRAKT_MODIFIKATOREN = eINSTANCE.getAbstraktModifikatoren();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute <em>Geistige Attribute</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.GeistigeAttribute
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGeistigeAttribute()
         * @generated
         */
		EClass GEISTIGE_ATTRIBUTE = eINSTANCE.getGeistigeAttribute();

		/**
         * The meta object literal for the '<em><b>Charisma</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEISTIGE_ATTRIBUTE__CHARISMA = eINSTANCE.getGeistigeAttribute_Charisma();

		/**
         * The meta object literal for the '<em><b>Willenskraft</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEISTIGE_ATTRIBUTE__WILLENSKRAFT = eINSTANCE.getGeistigeAttribute_Willenskraft();

		/**
         * The meta object literal for the '<em><b>Intuition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEISTIGE_ATTRIBUTE__INTUITION = eINSTANCE.getGeistigeAttribute_Intuition();

		/**
         * The meta object literal for the '<em><b>Logik</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEISTIGE_ATTRIBUTE__LOGIK = eINSTANCE.getGeistigeAttribute_Logik();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MudanPersonaImpl <em>Mudan Persona</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MudanPersonaImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMudanPersona()
         * @generated
         */
		EClass MUDAN_PERSONA = eINSTANCE.getMudanPersona();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl <em>Koerper Persona</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKoerperPersona()
         * @generated
         */
		EClass KOERPER_PERSONA = eINSTANCE.getKoerperPersona();

		/**
         * The meta object literal for the '<em><b>Koerper Mods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference KOERPER_PERSONA__KOERPER_MODS = eINSTANCE.getKoerperPersona_KoerperMods();

		/**
         * The meta object literal for the '<em><b>Eigenschaften</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference KOERPER_PERSONA__EIGENSCHAFTEN = eINSTANCE.getKoerperPersona_Eigenschaften();

		/**
         * The meta object literal for the '<em><b>Zustand Koerperlich</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KOERPER_PERSONA__ZUSTAND_KOERPERLICH = eINSTANCE.getKoerperPersona_ZustandKoerperlich();

        /**
         * The meta object literal for the '<em><b>Zustand Geistig</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KOERPER_PERSONA__ZUSTAND_GEISTIG = eINSTANCE.getKoerperPersona_ZustandGeistig();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MagischeModsImpl <em>Magische Mods</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MagischeModsImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagischeMods()
         * @generated
         */
		EClass MAGISCHE_MODS = eINSTANCE.getMagischeMods();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.KiKraftImpl <em>Ki Kraft</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.KiKraftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKiKraft()
         * @generated
         */
		EClass KI_KRAFT = eINSTANCE.getKiKraft();

		/**
         * The meta object literal for the '<em><b>Kraftpunkte</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KI_KRAFT__KRAFTPUNKTE = eINSTANCE.getKiKraft_Kraftpunkte();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl <em>Magische Persona</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagischePersona()
         * @generated
         */
		EClass MAGISCHE_PERSONA = eINSTANCE.getMagischePersona();

		/**
         * The meta object literal for the '<em><b>Mentor</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MAGISCHE_PERSONA__MENTOR = eINSTANCE.getMagischePersona_Mentor();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona <em>Base Magische Persona</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.BaseMagischePersona
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBaseMagischePersona()
         * @generated
         */
		EClass BASE_MAGISCHE_PERSONA = eINSTANCE.getBaseMagischePersona();

		/**
         * The meta object literal for the '<em><b>Magie</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASE_MAGISCHE_PERSONA__MAGIE = eINSTANCE.getBaseMagischePersona_Magie();

		/**
         * The meta object literal for the '<em><b>Initationen</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BASE_MAGISCHE_PERSONA__INITATIONEN = eINSTANCE.getBaseMagischePersona_Initationen();

		/**
         * The meta object literal for the '<em><b>Magie Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASE_MAGISCHE_PERSONA__MAGIE_BASIS = eINSTANCE.getBaseMagischePersona_MagieBasis();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren <em>Fernkampfwaffen Modifikatoren</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFernkampfwaffenModifikatoren()
         * @generated
         */
		EClass FERNKAMPFWAFFEN_MODIFIKATOREN = eINSTANCE.getFernkampfwaffenModifikatoren();

		/**
         * The meta object literal for the '<em><b>Smartgun</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERNKAMPFWAFFEN_MODIFIKATOREN__SMARTGUN = eINSTANCE.getFernkampfwaffenModifikatoren_Smartgun();

		/**
         * The meta object literal for the '<em><b>Rueckstoss</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERNKAMPFWAFFEN_MODIFIKATOREN__RUECKSTOSS = eINSTANCE.getFernkampfwaffenModifikatoren_Rueckstoss();

		/**
         * The meta object literal for the '<em><b>Laster Pointer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERNKAMPFWAFFEN_MODIFIKATOREN__LASTER_POINTER = eINSTANCE.getFernkampfwaffenModifikatoren_LasterPointer();

		/**
         * The meta object literal for the '<em><b>Schalldaempfer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERNKAMPFWAFFEN_MODIFIKATOREN__SCHALLDAEMPFER = eINSTANCE.getFernkampfwaffenModifikatoren_Schalldaempfer();

		/**
         * The meta object literal for the '<em><b>Vergroesserung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERNKAMPFWAFFEN_MODIFIKATOREN__VERGROESSERUNG = eINSTANCE.getFernkampfwaffenModifikatoren_Vergroesserung();

		/**
         * The meta object literal for the '<em><b>Sichtverbesserung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FERNKAMPFWAFFEN_MODIFIKATOREN__SICHTVERBESSERUNG = eINSTANCE.getFernkampfwaffenModifikatoren_Sichtverbesserung();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Sichtverhaeltnisse <em>Sichtverhaeltnisse</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Sichtverhaeltnisse
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSichtverhaeltnisse()
         * @generated
         */
		EClass SICHTVERHAELTNISSE = eINSTANCE.getSichtverhaeltnisse();

		/**
         * The meta object literal for the '<em><b>Restlichtverstaerkung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SICHTVERHAELTNISSE__RESTLICHTVERSTAERKUNG = eINSTANCE.getSichtverhaeltnisse_Restlichtverstaerkung();

		/**
         * The meta object literal for the '<em><b>Infrarot</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SICHTVERHAELTNISSE__INFRAROT = eINSTANCE.getSichtverhaeltnisse_Infrarot();

		/**
         * The meta object literal for the '<em><b>Ultrasound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SICHTVERHAELTNISSE__ULTRASOUND = eINSTANCE.getSichtverhaeltnisse_Ultrasound();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl <em>Spezies</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SpeziesImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSpezies()
         * @generated
         */
		EClass SPEZIES = eINSTANCE.getSpezies();

		/**
         * The meta object literal for the '<em><b>Konstitution Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__KONSTITUTION_MIN = eINSTANCE.getSpezies_KonstitutionMin();

		/**
         * The meta object literal for the '<em><b>Geschicklichkeit Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__GESCHICKLICHKEIT_MIN = eINSTANCE.getSpezies_GeschicklichkeitMin();

		/**
         * The meta object literal for the '<em><b>Reaktion Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__REAKTION_MIN = eINSTANCE.getSpezies_ReaktionMin();

		/**
         * The meta object literal for the '<em><b>Staerke Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__STAERKE_MIN = eINSTANCE.getSpezies_StaerkeMin();

		/**
         * The meta object literal for the '<em><b>Charisma Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__CHARISMA_MIN = eINSTANCE.getSpezies_CharismaMin();

		/**
         * The meta object literal for the '<em><b>Willenskraft Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__WILLENSKRAFT_MIN = eINSTANCE.getSpezies_WillenskraftMin();

		/**
         * The meta object literal for the '<em><b>Intuition Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__INTUITION_MIN = eINSTANCE.getSpezies_IntuitionMin();

		/**
         * The meta object literal for the '<em><b>Logik Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__LOGIK_MIN = eINSTANCE.getSpezies_LogikMin();

		/**
         * The meta object literal for the '<em><b>Edge Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__EDGE_MIN = eINSTANCE.getSpezies_EdgeMin();

		/**
         * The meta object literal for the '<em><b>Magie Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__MAGIE_MIN = eINSTANCE.getSpezies_MagieMin();

		/**
         * The meta object literal for the '<em><b>Resonanz Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__RESONANZ_MIN = eINSTANCE.getSpezies_ResonanzMin();

		/**
         * The meta object literal for the '<em><b>Essenz Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__ESSENZ_MIN = eINSTANCE.getSpezies_EssenzMin();

		/**
         * The meta object literal for the '<em><b>Konstitution Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__KONSTITUTION_MAX = eINSTANCE.getSpezies_KonstitutionMax();

		/**
         * The meta object literal for the '<em><b>Geschicklichkeit Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__GESCHICKLICHKEIT_MAX = eINSTANCE.getSpezies_GeschicklichkeitMax();

		/**
         * The meta object literal for the '<em><b>Reaktion Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__REAKTION_MAX = eINSTANCE.getSpezies_ReaktionMax();

		/**
         * The meta object literal for the '<em><b>Staerke Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__STAERKE_MAX = eINSTANCE.getSpezies_StaerkeMax();

		/**
         * The meta object literal for the '<em><b>Charisma Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__CHARISMA_MAX = eINSTANCE.getSpezies_CharismaMax();

		/**
         * The meta object literal for the '<em><b>Willenskraft Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__WILLENSKRAFT_MAX = eINSTANCE.getSpezies_WillenskraftMax();

		/**
         * The meta object literal for the '<em><b>Intuition Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__INTUITION_MAX = eINSTANCE.getSpezies_IntuitionMax();

		/**
         * The meta object literal for the '<em><b>Logik Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__LOGIK_MAX = eINSTANCE.getSpezies_LogikMax();

		/**
         * The meta object literal for the '<em><b>Edge Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__EDGE_MAX = eINSTANCE.getSpezies_EdgeMax();

		/**
         * The meta object literal for the '<em><b>Magie Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__MAGIE_MAX = eINSTANCE.getSpezies_MagieMax();

		/**
         * The meta object literal for the '<em><b>Resonanz Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__RESONANZ_MAX = eINSTANCE.getSpezies_ResonanzMax();

		/**
         * The meta object literal for the '<em><b>Essenz Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__ESSENZ_MAX = eINSTANCE.getSpezies_EssenzMax();

		/**
         * The meta object literal for the '<em><b>Laufen</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__LAUFEN = eINSTANCE.getSpezies_Laufen();

		/**
         * The meta object literal for the '<em><b>Rennen</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__RENNEN = eINSTANCE.getSpezies_Rennen();

		/**
         * The meta object literal for the '<em><b>Sprinten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPEZIES__SPRINTEN = eINSTANCE.getSpezies_Sprinten();

		/**
         * The meta object literal for the '<em><b>Angriff</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPEZIES__ANGRIFF = eINSTANCE.getSpezies_Angriff();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.GegenstandStufen <em>Gegenstand Stufen</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.GegenstandStufen
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGegenstandStufen()
         * @generated
         */
		EClass GEGENSTAND_STUFEN = eINSTANCE.getGegenstandStufen();

		/**
         * The meta object literal for the '<em><b>Computer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND_STUFEN__COMPUTER = eINSTANCE.getGegenstandStufen_Computer();

		/**
         * The meta object literal for the '<em><b>Elektronik</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND_STUFEN__ELEKTRONIK = eINSTANCE.getGegenstandStufen_Elektronik();

		/**
         * The meta object literal for the '<em><b>Tracing</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND_STUFEN__TRACING = eINSTANCE.getGegenstandStufen_Tracing();

		/**
         * The meta object literal for the '<em><b>Anti Tracing</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND_STUFEN__ANTI_TRACING = eINSTANCE.getGegenstandStufen_AntiTracing();

		/**
         * The meta object literal for the '<em><b>Protection</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND_STUFEN__PROTECTION = eINSTANCE.getGegenstandStufen_Protection();

		/**
         * The meta object literal for the '<em><b>Anti Protection</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GEGENSTAND_STUFEN__ANTI_PROTECTION = eINSTANCE.getGegenstandStufen_AntiProtection();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.KiAdeptImpl <em>Ki Adept</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.KiAdeptImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKiAdept()
         * @generated
         */
		EClass KI_ADEPT = eINSTANCE.getKiAdept();

		/**
         * The meta object literal for the '<em><b>Kikraft</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference KI_ADEPT__KIKRAFT = eINSTANCE.getKiAdept_Kikraft();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.KleidungImpl <em>Kleidung</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.KleidungImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKleidung()
         * @generated
         */
		EClass KLEIDUNG = eINSTANCE.getKleidung();

		/**
         * The meta object literal for the '<em><b>Ruestung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KLEIDUNG__RUESTUNG = eINSTANCE.getKleidung_Ruestung();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl <em>Fernkampfwaffe Modifikator</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFernkampfwaffeModifikator()
         * @generated
         */
		EClass FERNKAMPFWAFFE_MODIFIKATOR = eINSTANCE.getFernkampfwaffeModifikator();

		/**
         * The meta object literal for the '<em><b>Ep</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FERNKAMPFWAFFE_MODIFIKATOR__EP = eINSTANCE.getFernkampfwaffeModifikator_Ep();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Anwendbar <em>Anwendbar</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Anwendbar
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAnwendbar()
         * @generated
         */
		EClass ANWENDBAR = eINSTANCE.getAnwendbar();

		/**
         * The meta object literal for the '<em><b>Fertigkeit</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ANWENDBAR__FERTIGKEIT = eINSTANCE.getAnwendbar_Fertigkeit();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaEigenschaftImpl <em>Persona Eigenschaft</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PersonaEigenschaftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaEigenschaft()
         * @generated
         */
		EClass PERSONA_EIGENSCHAFT = eINSTANCE.getPersonaEigenschaft();

		/**
         * The meta object literal for the '<em><b>Karma Kosten</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSONA_EIGENSCHAFT__KARMA_KOSTEN = eINSTANCE.getPersonaEigenschaft_KarmaKosten();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ProbenModifikatoren <em>Proben Modifikatoren</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ProbenModifikatoren
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getProbenModifikatoren()
         * @generated
         */
		EClass PROBEN_MODIFIKATOREN = eINSTANCE.getProbenModifikatoren();

		/**
         * The meta object literal for the '<em><b>Schadenswiederstand</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PROBEN_MODIFIKATOREN__SCHADENSWIEDERSTAND = eINSTANCE.getProbenModifikatoren_Schadenswiederstand();

		/**
         * The meta object literal for the '<em><b>Heilung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PROBEN_MODIFIKATOREN__HEILUNG = eINSTANCE.getProbenModifikatoren_Heilung();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MagierImpl <em>Magier</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MagierImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagier()
         * @generated
         */
		EClass MAGIER = eINSTANCE.getMagier();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Zauberer <em>Zauberer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Zauberer
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberer()
         * @generated
         */
		EClass ZAUBERER = eINSTANCE.getZauberer();

		/**
         * The meta object literal for the '<em><b>Zauber</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ZAUBERER__ZAUBER = eINSTANCE.getZauberer_Zauber();

		/**
         * The meta object literal for the '<em><b>Enzug</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBERER__ENZUG = eINSTANCE.getZauberer_Enzug();

		/**
         * The meta object literal for the '<em><b>Tradition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBERER__TRADITION = eINSTANCE.getZauberer_Tradition();

		/**
         * The meta object literal for the '<em><b>Gebundene Geister</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ZAUBERER__GEBUNDENE_GEISTER = eINSTANCE.getZauberer_GebundeneGeister();

        /**
         * The meta object literal for the '<em><b>Ungebundener Geist</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ZAUBERER__UNGEBUNDENER_GEIST = eINSTANCE.getZauberer_UngebundenerGeist();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl <em>Mystic Adept</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MysticAdeptImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMysticAdept()
         * @generated
         */
		EClass MYSTIC_ADEPT = eINSTANCE.getMysticAdept();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaZauberImpl <em>Persona Zauber</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PersonaZauberImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaZauber()
         * @generated
         */
		EClass PERSONA_ZAUBER = eINSTANCE.getPersonaZauber();

		/**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSONA_ZAUBER__STUFE = eINSTANCE.getPersonaZauber_Stufe();

		/**
         * The meta object literal for the '<em><b>Formel</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PERSONA_ZAUBER__FORMEL = eINSTANCE.getPersonaZauber_Formel();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl <em>Zauber</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.ZauberImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauber()
         * @generated
         */
		EClass ZAUBER = eINSTANCE.getZauber();

		/**
         * The meta object literal for the '<em><b>Art</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__ART = eINSTANCE.getZauber_Art();

		/**
         * The meta object literal for the '<em><b>Reichweite</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__REICHWEITE = eINSTANCE.getZauber_Reichweite();

		/**
         * The meta object literal for the '<em><b>Schaden</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__SCHADEN = eINSTANCE.getZauber_Schaden();

		/**
         * The meta object literal for the '<em><b>Dauer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__DAUER = eINSTANCE.getZauber_Dauer();

		/**
         * The meta object literal for the '<em><b>Entzug</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__ENTZUG = eINSTANCE.getZauber_Entzug();

		/**
         * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__KATEGORIE = eINSTANCE.getZauber_Kategorie();

		/**
         * The meta object literal for the '<em><b>Merkmale</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ZAUBER__MERKMALE = eINSTANCE.getZauber_Merkmale();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits <em>Chrakter Limits</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ChrakterLimits
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getChrakterLimits()
         * @generated
         */
		EClass CHRAKTER_LIMITS = eINSTANCE.getChrakterLimits();

		/**
         * The meta object literal for the '<em><b>Koerperlich</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHRAKTER_LIMITS__KOERPERLICH = eINSTANCE.getChrakterLimits_Koerperlich();

		/**
         * The meta object literal for the '<em><b>Geistig</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHRAKTER_LIMITS__GEISTIG = eINSTANCE.getChrakterLimits_Geistig();

		/**
         * The meta object literal for the '<em><b>Sozial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHRAKTER_LIMITS__SOZIAL = eINSTANCE.getChrakterLimits_Sozial();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Panzerung <em>Panzerung</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Panzerung
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPanzerung()
         * @generated
         */
		EClass PANZERUNG = eINSTANCE.getPanzerung();

		/**
         * The meta object literal for the '<em><b>Panzer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PANZERUNG__PANZER = eINSTANCE.getPanzerung_Panzer();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AspektMagierImpl <em>Aspekt Magier</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AspektMagierImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAspektMagier()
         * @generated
         */
		EClass ASPEKT_MAGIER = eINSTANCE.getAspektMagier();

		/**
         * The meta object literal for the '<em><b>Aspekt</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ASPEKT_MAGIER__ASPEKT = eINSTANCE.getAspektMagier_Aspekt();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion <em>Astrale Projektion</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.AstraleProjektion
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAstraleProjektion()
         * @generated
         */
		EClass ASTRALE_PROJEKTION = eINSTANCE.getAstraleProjektion();

		/**
         * The meta object literal for the '<em><b>Astrales Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALES_LIMIT = eINSTANCE.getAstraleProjektion_AstralesLimit();

		/**
         * The meta object literal for the '<em><b>Astrale Konstitution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION = eINSTANCE.getAstraleProjektion_AstraleKonstitution();

		/**
         * The meta object literal for the '<em><b>Astrale Geschicklichkeit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT = eINSTANCE.getAstraleProjektion_AstraleGeschicklichkeit();

		/**
         * The meta object literal for the '<em><b>Astrale Reaktion</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_REAKTION = eINSTANCE.getAstraleProjektion_AstraleReaktion();

		/**
         * The meta object literal for the '<em><b>Astrale Staerke</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_STAERKE = eINSTANCE.getAstraleProjektion_AstraleStaerke();

		/**
         * The meta object literal for the '<em><b>Astrale Initative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_INITATIVE = eINSTANCE.getAstraleProjektion_AstraleInitative();

		/**
         * The meta object literal for the '<em><b>Astrale Initativ Wuerfel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL = eINSTANCE.getAstraleProjektion_AstraleInitativWuerfel();

		/**
         * The meta object literal for the '<em><b>Astrale Panzerung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ASTRALE_PROJEKTION__ASTRALE_PANZERUNG = eINSTANCE.getAstraleProjektion_AstralePanzerung();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SchutzgeistImpl <em>Schutzgeist</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SchutzgeistImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSchutzgeist()
         * @generated
         */
		EClass SCHUTZGEIST = eINSTANCE.getSchutzgeist();

		/**
         * The meta object literal for the '<em><b>Vorteile</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SCHUTZGEIST__VORTEILE = eINSTANCE.getSchutzgeist_Vorteile();

		/**
         * The meta object literal for the '<em><b>Nachteile</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SCHUTZGEIST__NACHTEILE = eINSTANCE.getSchutzgeist_Nachteile();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.InitationImpl <em>Initation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.InitationImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getInitation()
         * @generated
         */
		EClass INITATION = eINSTANCE.getInitation();

		/**
         * The meta object literal for the '<em><b>Erlernt</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference INITATION__ERLERNT = eINSTANCE.getInitation_Erlernt();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MetaMagieImpl <em>Meta Magie</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MetaMagieImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMetaMagie()
         * @generated
         */
		EClass META_MAGIE = eINSTANCE.getMetaMagie();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CritterKraftImpl <em>Critter Kraft</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CritterKraftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterKraft()
         * @generated
         */
		EClass CRITTER_KRAFT = eINSTANCE.getCritterKraft();

		/**
         * The meta object literal for the '<em><b>Art</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CRITTER_KRAFT__ART = eINSTANCE.getCritterKraft_Art();

		/**
         * The meta object literal for the '<em><b>Handlung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CRITTER_KRAFT__HANDLUNG = eINSTANCE.getCritterKraft_Handlung();

		/**
         * The meta object literal for the '<em><b>Reichweite</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CRITTER_KRAFT__REICHWEITE = eINSTANCE.getCritterKraft_Reichweite();

		/**
         * The meta object literal for the '<em><b>Dauer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CRITTER_KRAFT__DAUER = eINSTANCE.getCritterKraft_Dauer();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl <em>Fahrzeug</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FahrzeugImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFahrzeug()
         * @generated
         */
		EClass FAHRZEUG = eINSTANCE.getFahrzeug();

		/**
         * The meta object literal for the '<em><b>Handling</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__HANDLING = eINSTANCE.getFahrzeug_Handling();

		/**
         * The meta object literal for the '<em><b>Geschwindigkeit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__GESCHWINDIGKEIT = eINSTANCE.getFahrzeug_Geschwindigkeit();

		/**
         * The meta object literal for the '<em><b>Beschleunigung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__BESCHLEUNIGUNG = eINSTANCE.getFahrzeug_Beschleunigung();

		/**
         * The meta object literal for the '<em><b>Rumpf</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__RUMPF = eINSTANCE.getFahrzeug_Rumpf();

		/**
         * The meta object literal for the '<em><b>Pilot</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__PILOT = eINSTANCE.getFahrzeug_Pilot();

		/**
         * The meta object literal for the '<em><b>Sensor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__SENSOR = eINSTANCE.getFahrzeug_Sensor();

		/**
         * The meta object literal for the '<em><b>Fahrzeug Typ</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FAHRZEUG__FAHRZEUG_TYP = eINSTANCE.getFahrzeug_FahrzeugTyp();

		/**
         * The meta object literal for the '<em><b>Modifizierungen</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FAHRZEUG__MODIFIZIERUNGEN = eINSTANCE.getFahrzeug_Modifizierungen();

		/**
         * The meta object literal for the '<em><b>Panzer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAHRZEUG__PANZER = eINSTANCE.getFahrzeug_Panzer();

        /**
         * The meta object literal for the '<em><b>Weapon Mounts</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAHRZEUG__WEAPON_MOUNTS = eINSTANCE.getFahrzeug_WeaponMounts();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.BodenfahrzeugImpl <em>Bodenfahrzeug</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.BodenfahrzeugImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBodenfahrzeug()
         * @generated
         */
		EClass BODENFAHRZEUG = eINSTANCE.getBodenfahrzeug();

		/**
         * The meta object literal for the '<em><b>Handling Gelaende</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BODENFAHRZEUG__HANDLING_GELAENDE = eINSTANCE.getBodenfahrzeug_HandlingGelaende();

		/**
         * The meta object literal for the '<em><b>Geschwindigkeit Gelaende</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE = eINSTANCE.getBodenfahrzeug_GeschwindigkeitGelaende();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PassagierFahrzeugImpl <em>Passagier Fahrzeug</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PassagierFahrzeugImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPassagierFahrzeug()
         * @generated
         */
		EClass PASSAGIER_FAHRZEUG = eINSTANCE.getPassagierFahrzeug();

		/**
         * The meta object literal for the '<em><b>Sitze</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PASSAGIER_FAHRZEUG__SITZE = eINSTANCE.getPassagierFahrzeug_Sitze();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.DrohneImpl <em>Drohne</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.DrohneImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getDrohne()
         * @generated
         */
		EClass DROHNE = eINSTANCE.getDrohne();

		/**
         * The meta object literal for the '<em><b>Program Slot Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DROHNE__PROGRAM_SLOT_COUNT = eINSTANCE.getDrohne_ProgramSlotCount();

        /**
         * The meta object literal for the '<em><b>Running Programs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DROHNE__RUNNING_PROGRAMS = eINSTANCE.getDrohne_RunningPrograms();

        /**
         * The meta object literal for the '<em><b>Stored Programs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DROHNE__STORED_PROGRAMS = eINSTANCE.getDrohne_StoredPrograms();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FahrzeugModifikationImpl <em>Fahrzeug Modifikation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FahrzeugModifikationImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFahrzeugModifikation()
         * @generated
         */
		EClass FAHRZEUG_MODIFIKATION = eINSTANCE.getFahrzeugModifikation();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl <em>Technomancer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.TechnomancerImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getTechnomancer()
         * @generated
         */
		EClass TECHNOMANCER = eINSTANCE.getTechnomancer();

		/**
         * The meta object literal for the '<em><b>Complex Forms</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference TECHNOMANCER__COMPLEX_FORMS = eINSTANCE.getTechnomancer_ComplexForms();

		/**
         * The meta object literal for the '<em><b>Echos</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference TECHNOMANCER__ECHOS = eINSTANCE.getTechnomancer_Echos();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ResonanzPersona <em>Resonanz Persona</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ResonanzPersona
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getResonanzPersona()
         * @generated
         */
		EClass RESONANZ_PERSONA = eINSTANCE.getResonanzPersona();

		/**
         * The meta object literal for the '<em><b>Resonanz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESONANZ_PERSONA__RESONANZ = eINSTANCE.getResonanzPersona_Resonanz();

		/**
         * The meta object literal for the '<em><b>Resonanz Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESONANZ_PERSONA__RESONANZ_BASIS = eINSTANCE.getResonanzPersona_ResonanzBasis();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl <em>Komplexe Form</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getKomplexeForm()
         * @generated
         */
		EClass KOMPLEXE_FORM = eINSTANCE.getKomplexeForm();

		/**
         * The meta object literal for the '<em><b>Ziel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOMPLEXE_FORM__ZIEL = eINSTANCE.getKomplexeForm_Ziel();

		/**
         * The meta object literal for the '<em><b>Dauer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOMPLEXE_FORM__DAUER = eINSTANCE.getKomplexeForm_Dauer();

		/**
         * The meta object literal for the '<em><b>Schwund</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KOMPLEXE_FORM__SCHWUND = eINSTANCE.getKomplexeForm_Schwund();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PersonaKomplexFormImpl <em>Persona Komplex Form</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PersonaKomplexFormImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaKomplexForm()
         * @generated
         */
		EClass PERSONA_KOMPLEX_FORM = eINSTANCE.getPersonaKomplexForm();

		/**
         * The meta object literal for the '<em><b>Form</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PERSONA_KOMPLEX_FORM__FORM = eINSTANCE.getPersonaKomplexForm_Form();

		/**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSONA_KOMPLEX_FORM__STUFE = eINSTANCE.getPersonaKomplexForm_Stufe();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl <em>Sprite</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SpriteImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSprite()
         * @generated
         */
		EClass SPRITE = eINSTANCE.getSprite();

		/**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPRITE__STUFE = eINSTANCE.getSprite_Stufe();

		/**
         * The meta object literal for the '<em><b>Angriff Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPRITE__ANGRIFF_MOD = eINSTANCE.getSprite_AngriffMod();

		/**
         * The meta object literal for the '<em><b>Schleicher Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPRITE__SCHLEICHER_MOD = eINSTANCE.getSprite_SchleicherMod();

		/**
         * The meta object literal for the '<em><b>Datenverarbeitung Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPRITE__DATENVERARBEITUNG_MOD = eINSTANCE.getSprite_DatenverarbeitungMod();

		/**
         * The meta object literal for the '<em><b>Firewall Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPRITE__FIREWALL_MOD = eINSTANCE.getSprite_FirewallMod();

		/**
         * The meta object literal for the '<em><b>Initative Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPRITE__INITATIVE_MOD = eINSTANCE.getSprite_InitativeMod();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.EchoImpl <em>Echo</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.EchoImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getEcho()
         * @generated
         */
		EClass ECHO = eINSTANCE.getEcho();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.VertragImpl <em>Vertrag</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.VertragImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getVertrag()
         * @generated
         */
		EClass VERTRAG = eINSTANCE.getVertrag();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.LifestyleImpl <em>Lifestyle</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.LifestyleImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getLifestyle()
         * @generated
         */
		EClass LIFESTYLE = eINSTANCE.getLifestyle();

		/**
         * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFESTYLE__OPTIONS = eINSTANCE.getLifestyle_Options();

        /**
         * The meta object literal for the '<em><b>Owned</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFESTYLE__OWNED = eINSTANCE.getLifestyle_Owned();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.WissensfertigkeitImpl <em>Wissensfertigkeit</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.WissensfertigkeitImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getWissensfertigkeit()
         * @generated
         */
		EClass WISSENSFERTIGKEIT = eINSTANCE.getWissensfertigkeit();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SprachfertigkeitImpl <em>Sprachfertigkeit</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SprachfertigkeitImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSprachfertigkeit()
         * @generated
         */
		EClass SPRACHFERTIGKEIT = eINSTANCE.getSprachfertigkeit();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.PersonaZustand <em>Persona Zustand</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.PersonaZustand
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonaZustand()
         * @generated
         */
        EClass PERSONA_ZUSTAND = eINSTANCE.getPersonaZustand();

        /**
         * The meta object literal for the '<em><b>Zustand Koerperlich Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX = eINSTANCE.getPersonaZustand_ZustandKoerperlichMax();

        /**
         * The meta object literal for the '<em><b>Zustand Geistig Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX = eINSTANCE.getPersonaZustand_ZustandGeistigMax();

        /**
         * The meta object literal for the '<em><b>Zustand Grenze</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSONA_ZUSTAND__ZUSTAND_GRENZE = eINSTANCE.getPersonaZustand_ZustandGrenze();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CritterImpl <em>Critter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CritterImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritter()
         * @generated
         */
        EClass CRITTER = eINSTANCE.getCritter();

        /**
         * The meta object literal for the '<em><b>Powers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CRITTER__POWERS = eINSTANCE.getCritter_Powers();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl <em>Intervall Vertrag</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.IntervallVertragImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getIntervallVertrag()
         * @generated
         */
        EClass INTERVALL_VERTRAG = eINSTANCE.getIntervallVertrag();

        /**
         * The meta object literal for the '<em><b>Faelligkeits Intervall</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERVALL_VERTRAG__FAELLIGKEITS_INTERVALL = eINSTANCE.getIntervallVertrag_FaelligkeitsIntervall();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SinImpl <em>Sin</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SinImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSin()
         * @generated
         */
        EClass SIN = eINSTANCE.getSin();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.LizenzImpl <em>Lizenz</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.LizenzImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getLizenz()
         * @generated
         */
        EClass LIZENZ = eINSTANCE.getLizenz();

        /**
         * The meta object literal for the '<em><b>Lizen Gegenstand</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIZENZ__LIZEN_GEGENSTAND = eINSTANCE.getLizenz_LizenGegenstand();

        /**
         * The meta object literal for the '<em><b>Lizenz Traeger</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIZENZ__LIZENZ_TRAEGER = eINSTANCE.getLizenz_LizenzTraeger();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.FakeableImpl <em>Fakeable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.FakeableImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFakeable()
         * @generated
         */
        EClass FAKEABLE = eINSTANCE.getFakeable();

        /**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAKEABLE__STUFE = eINSTANCE.getFakeable_Stufe();

        /**
         * The meta object literal for the '<em><b>Gefaelscht</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAKEABLE__GEFAELSCHT = eINSTANCE.getFakeable_Gefaelscht();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Steigerbar <em>Steigerbar</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Steigerbar
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSteigerbar()
         * @generated
         */
        EClass STEIGERBAR = eINSTANCE.getSteigerbar();

        /**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STEIGERBAR__STUFE = eINSTANCE.getSteigerbar_Stufe();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Erlernbar <em>Erlernbar</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Erlernbar
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getErlernbar()
         * @generated
         */
        EClass ERLERNBAR = eINSTANCE.getErlernbar();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl <em>Credstick</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CredstickImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCredstick()
         * @generated
         */
        EClass CREDSTICK = eINSTANCE.getCredstick();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CREDSTICK__MAX_VALUE = eINSTANCE.getCredstick_MaxValue();

        /**
         * The meta object literal for the '<em><b>Transactionlog</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CREDSTICK__TRANSACTIONLOG = eINSTANCE.getCredstick_Transactionlog();

        /**
         * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CREDSTICK__CURRENT_VALUE = eINSTANCE.getCredstick_CurrentValue();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Menge <em>Menge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Menge
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMenge()
         * @generated
         */
        EClass MENGE = eINSTANCE.getMenge();

        /**
         * The meta object literal for the '<em><b>Anzahl</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MENGE__ANZAHL = eINSTANCE.getMenge_Anzahl();

        /**
         * The meta object literal for the '<em><b>Pro Anzahl</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MENGE__PRO_ANZAHL = eINSTANCE.getMenge_ProAnzahl();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.MunitionImpl <em>Munition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.MunitionImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMunition()
         * @generated
         */
        EClass MUNITION = eINSTANCE.getMunition();

        /**
         * The meta object literal for the '<em><b>Damage Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUNITION__DAMAGE_TYPE = eINSTANCE.getMunition_DamageType();

        /**
         * The meta object literal for the '<em><b>Damage Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUNITION__DAMAGE_MOD = eINSTANCE.getMunition_DamageMod();

        /**
         * The meta object literal for the '<em><b>Armor Mod</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MUNITION__ARMOR_MOD = eINSTANCE.getMunition_ArmorMod();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MUNITION__TYPE = eINSTANCE.getMunition_Type();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ModifikatorAttribute <em>Modifikator Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ModifikatorAttribute
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModifikatorAttribute()
         * @generated
         */
        EClass MODIFIKATOR_ATTRIBUTE = eINSTANCE.getModifikatorAttribute();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.GebundenerGeistImpl <em>Gebundener Geist</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.GebundenerGeistImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGebundenerGeist()
         * @generated
         */
        EClass GEBUNDENER_GEIST = eINSTANCE.getGebundenerGeist();

        /**
         * The meta object literal for the '<em><b>Dienste</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEBUNDENER_GEIST__DIENSTE = eINSTANCE.getGebundenerGeist_Dienste();

        /**
         * The meta object literal for the '<em><b>Geist</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GEBUNDENER_GEIST__GEIST = eINSTANCE.getGebundenerGeist_Geist();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.StufenPersona <em>Stufen Persona</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.StufenPersona
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getStufenPersona()
         * @generated
         */
        EClass STUFEN_PERSONA = eINSTANCE.getStufenPersona();

        /**
         * The meta object literal for the '<em><b>Stufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STUFEN_PERSONA__STUFE = eINSTANCE.getStufenPersona_Stufe();

        /**
         * The meta object literal for the '<em><b>Skill Groups</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STUFEN_PERSONA__SKILL_GROUPS = eINSTANCE.getStufenPersona_SkillGroups();

        /**
         * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STUFEN_PERSONA__SKILLS = eINSTANCE.getStufenPersona_Skills();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.GeistImpl <em>Geist</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.GeistImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getGeist()
         * @generated
         */
        EClass GEIST = eINSTANCE.getGeist();

        /**
         * The meta object literal for the '<em><b>Konstitution Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__KONSTITUTION_BASIS = eINSTANCE.getGeist_KonstitutionBasis();

        /**
         * The meta object literal for the '<em><b>Geschicklichkeit Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__GESCHICKLICHKEIT_BASIS = eINSTANCE.getGeist_GeschicklichkeitBasis();

        /**
         * The meta object literal for the '<em><b>Reaktion Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__REAKTION_BASIS = eINSTANCE.getGeist_ReaktionBasis();

        /**
         * The meta object literal for the '<em><b>Staerke Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__STAERKE_BASIS = eINSTANCE.getGeist_StaerkeBasis();

        /**
         * The meta object literal for the '<em><b>Charisma Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__CHARISMA_BASIS = eINSTANCE.getGeist_CharismaBasis();

        /**
         * The meta object literal for the '<em><b>Willenskraft Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__WILLENSKRAFT_BASIS = eINSTANCE.getGeist_WillenskraftBasis();

        /**
         * The meta object literal for the '<em><b>Intuition Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__INTUITION_BASIS = eINSTANCE.getGeist_IntuitionBasis();

        /**
         * The meta object literal for the '<em><b>Logik Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GEIST__LOGIK_BASIS = eINSTANCE.getGeist_LogikBasis();

        /**
         * The meta object literal for the '<em><b>Powers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GEIST__POWERS = eINSTANCE.getGeist_Powers();

        /**
         * The meta object literal for the '<em><b>Optional Powers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GEIST__OPTIONAL_POWERS = eINSTANCE.getGeist_OptionalPowers();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Identifiable <em>Identifiable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Identifiable
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getIdentifiable()
         * @generated
         */
        EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

        /**
         * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIABLE__PARENT_ID = eINSTANCE.getIdentifiable_ParentId();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CredstickTransactionImpl <em>Credstick Transaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CredstickTransactionImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCredstickTransaction()
         * @generated
         */
        EClass CREDSTICK_TRANSACTION = eINSTANCE.getCredstickTransaction();

        /**
         * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CREDSTICK_TRANSACTION__AMOUNT = eINSTANCE.getCredstickTransaction_Amount();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CREDSTICK_TRANSACTION__DATE = eINSTANCE.getCredstickTransaction_Date();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CREDSTICK_TRANSACTION__DESCRIPTION = eINSTANCE.getCredstickTransaction_Description();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SpezialisierungImpl <em>Spezialisierung</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SpezialisierungImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSpezialisierung()
         * @generated
         */
        EClass SPEZIALISIERUNG = eINSTANCE.getSpezialisierung();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes <em>Matrix Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MatrixAttributes
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixAttributes()
         * @generated
         */
        EClass MATRIX_ATTRIBUTES = eINSTANCE.getMatrixAttributes();

        /**
         * The meta object literal for the '<em><b>Geraetestufe</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX_ATTRIBUTES__GERAETESTUFE = eINSTANCE.getMatrixAttributes_Geraetestufe();

        /**
         * The meta object literal for the '<em><b>Firewall</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX_ATTRIBUTES__FIREWALL = eINSTANCE.getMatrixAttributes_Firewall();

        /**
         * The meta object literal for the '<em><b>Datenverarbeitung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX_ATTRIBUTES__DATENVERARBEITUNG = eINSTANCE.getMatrixAttributes_Datenverarbeitung();

        /**
         * The meta object literal for the '<em><b>Current Modus</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX_ATTRIBUTES__CURRENT_MODUS = eINSTANCE.getMatrixAttributes_CurrentModus();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MatrixDevice <em>Matrix Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MatrixDevice
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixDevice()
         * @generated
         */
        EClass MATRIX_DEVICE = eINSTANCE.getMatrixDevice();

        /**
         * The meta object literal for the '<em><b>Pan</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATRIX_DEVICE__PAN = eINSTANCE.getMatrixDevice_Pan();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CommonProgramImpl <em>Common Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CommonProgramImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCommonProgram()
         * @generated
         */
        EClass COMMON_PROGRAM = eINSTANCE.getCommonProgram();

        /**
         * The meta object literal for the '<em><b>Program Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMON_PROGRAM__PROGRAM_TYPE = eINSTANCE.getCommonProgram_ProgramType();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.WeaponMountImpl <em>Weapon Mount</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.WeaponMountImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getWeaponMount()
         * @generated
         */
        EClass WEAPON_MOUNT = eINSTANCE.getWeaponMount();

        /**
         * The meta object literal for the '<em><b>Weapon</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WEAPON_MOUNT__WEAPON = eINSTANCE.getWeaponMount_Weapon();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.LifestyleOptionImpl <em>Lifestyle Option</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.LifestyleOptionImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getLifestyleOption()
         * @generated
         */
        EClass LIFESTYLE_OPTION = eINSTANCE.getLifestyleOption();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PercentLifestyleOptionImpl <em>Percent Lifestyle Option</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PercentLifestyleOptionImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPercentLifestyleOption()
         * @generated
         */
        EClass PERCENT_LIFESTYLE_OPTION = eINSTANCE.getPercentLifestyleOption();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice <em>Active Matix Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getActiveMatixDevice()
         * @generated
         */
        EClass ACTIVE_MATIX_DEVICE = eINSTANCE.getActiveMatixDevice();

        /**
         * The meta object literal for the '<em><b>Angriff</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVE_MATIX_DEVICE__ANGRIFF = eINSTANCE.getActiveMatixDevice_Angriff();

        /**
         * The meta object literal for the '<em><b>Schleicher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVE_MATIX_DEVICE__SCHLEICHER = eINSTANCE.getActiveMatixDevice_Schleicher();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CommlinkImpl <em>Commlink</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CommlinkImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCommlink()
         * @generated
         */
        EClass COMMLINK = eINSTANCE.getCommlink();

        /**
         * The meta object literal for the '<em><b>Stored Programs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMLINK__STORED_PROGRAMS = eINSTANCE.getCommlink_StoredPrograms();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor <em>Matix Condition Monitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatixConditionMonitor()
         * @generated
         */
        EClass MATIX_CONDITION_MONITOR = eINSTANCE.getMatixConditionMonitor();

        /**
         * The meta object literal for the '<em><b>Matrix Zustand Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX = eINSTANCE.getMatixConditionMonitor_MatrixZustandMax();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.CyberdeckImpl <em>Cyberdeck</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.CyberdeckImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCyberdeck()
         * @generated
         */
        EClass CYBERDECK = eINSTANCE.getCyberdeck();

        /**
         * The meta object literal for the '<em><b>Program Slots</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERDECK__PROGRAM_SLOTS = eINSTANCE.getCyberdeck_ProgramSlots();

        /**
         * The meta object literal for the '<em><b>Attribute1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERDECK__ATTRIBUTE1 = eINSTANCE.getCyberdeck_Attribute1();

        /**
         * The meta object literal for the '<em><b>Attribute2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERDECK__ATTRIBUTE2 = eINSTANCE.getCyberdeck_Attribute2();

        /**
         * The meta object literal for the '<em><b>Attribute3</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERDECK__ATTRIBUTE3 = eINSTANCE.getCyberdeck_Attribute3();

        /**
         * The meta object literal for the '<em><b>Attribute4</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERDECK__ATTRIBUTE4 = eINSTANCE.getCyberdeck_Attribute4();

        /**
         * The meta object literal for the '<em><b>Configuration</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CYBERDECK__CONFIGURATION = eINSTANCE.getCyberdeck_Configuration();

        /**
         * The meta object literal for the '<em><b>Stored Programs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CYBERDECK__STORED_PROGRAMS = eINSTANCE.getCyberdeck_StoredPrograms();

        /**
         * The meta object literal for the '<em><b>Running Programs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CYBERDECK__RUNNING_PROGRAMS = eINSTANCE.getCyberdeck_RunningPrograms();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SoftwareAgentImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSoftwareAgent()
         * @generated
         */
        EClass SOFTWARE_AGENT = eINSTANCE.getSoftwareAgent();

        /**
         * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOFTWARE_AGENT__RATING = eINSTANCE.getSoftwareAgent_Rating();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.HostImpl <em>Host</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.HostImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getHost()
         * @generated
         */
        EClass HOST = eINSTANCE.getHost();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren <em>Cyberware Modifikatioren</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.CyberwareModifikatioren
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCyberwareModifikatioren()
         * @generated
         */
        EClass CYBERWARE_MODIFIKATIOREN = eINSTANCE.getCyberwareModifikatioren();

        /**
         * The meta object literal for the '<em><b>Direct Neural Interface</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERWARE_MODIFIKATIOREN__DIRECT_NEURAL_INTERFACE = eINSTANCE.getCyberwareModifikatioren_DirectNeuralInterface();

        /**
         * The meta object literal for the '<em><b>Universal Data Connector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERWARE_MODIFIKATIOREN__UNIVERSAL_DATA_CONNECTOR = eINSTANCE.getCyberwareModifikatioren_UniversalDataConnector();

        /**
         * The meta object literal for the '<em><b>Control Rig</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERWARE_MODIFIKATIOREN__CONTROL_RIG = eINSTANCE.getCyberwareModifikatioren_ControlRig();

        /**
         * The meta object literal for the '<em><b>Sim Rig</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERWARE_MODIFIKATIOREN__SIM_RIG = eINSTANCE.getCyberwareModifikatioren_SimRig();

        /**
         * The meta object literal for the '<em><b>Rigger Interface</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CYBERWARE_MODIFIKATIOREN__RIGGER_INTERFACE = eINSTANCE.getCyberwareModifikatioren_RiggerInterface();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl <em>Rigger Command Console</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.RiggerCommandConsoleImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getRiggerCommandConsole()
         * @generated
         */
        EClass RIGGER_COMMAND_CONSOLE = eINSTANCE.getRiggerCommandConsole();

        /**
         * The meta object literal for the '<em><b>Rauschunterdrueckung</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG = eINSTANCE.getRiggerCommandConsole_Rauschunterdrueckung();

        /**
         * The meta object literal for the '<em><b>Zugriff</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RIGGER_COMMAND_CONSOLE__ZUGRIFF = eINSTANCE.getRiggerCommandConsole_Zugriff();

        /**
         * The meta object literal for the '<em><b>Datenverarbeitung Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS = eINSTANCE.getRiggerCommandConsole_DatenverarbeitungBasis();

        /**
         * The meta object literal for the '<em><b>Firewall Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS = eINSTANCE.getRiggerCommandConsole_FirewallBasis();

        /**
         * The meta object literal for the '<em><b>Zugriff Basis</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS = eINSTANCE.getRiggerCommandConsole_ZugriffBasis();

        /**
         * The meta object literal for the '<em><b>Stored Programs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS = eINSTANCE.getRiggerCommandConsole_StoredPrograms();

        /**
         * The meta object literal for the '<em><b>Running Programs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS = eINSTANCE.getRiggerCommandConsole_RunningPrograms();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.AutoSoftImpl <em>Auto Soft</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.AutoSoftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAutoSoft()
         * @generated
         */
        EClass AUTO_SOFT = eINSTANCE.getAutoSoft();

        /**
         * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AUTO_SOFT__RATING = eINSTANCE.getAutoSoft_Rating();

        /**
         * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTO_SOFT__SKILL = eINSTANCE.getAutoSoft_Skill();

        /**
         * The meta object literal for the '<em><b>Weapon</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTO_SOFT__WEAPON = eINSTANCE.getAutoSoft_Weapon();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTO_SOFT__MODEL = eINSTANCE.getAutoSoft_Model();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.Software <em>Software</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.Software
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSoftware()
         * @generated
         */
        EClass SOFTWARE = eINSTANCE.getSoftware();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MatrixProgram <em>Matrix Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MatrixProgram
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixProgram()
         * @generated
         */
        EClass MATRIX_PROGRAM = eINSTANCE.getMatrixProgram();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.TutorsoftImpl <em>Tutorsoft</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.TutorsoftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getTutorsoft()
         * @generated
         */
        EClass TUTORSOFT = eINSTANCE.getTutorsoft();

        /**
         * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TUTORSOFT__RATING = eINSTANCE.getTutorsoft_Rating();

        /**
         * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TUTORSOFT__SKILL = eINSTANCE.getTutorsoft_Skill();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl <em>Skill Soft</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.SkillSoftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSkillSoft()
         * @generated
         */
        EClass SKILL_SOFT = eINSTANCE.getSkillSoft();

        /**
         * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SKILL_SOFT__SKILL = eINSTANCE.getSkillSoft_Skill();

        /**
         * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SKILL_SOFT__RATING = eINSTANCE.getSkillSoft_Rating();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand <em>Fahrzeug Zustand</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.FahrzeugZustand
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFahrzeugZustand()
         * @generated
         */
        EClass FAHRZEUG_ZUSTAND = eINSTANCE.getFahrzeugZustand();

        /**
         * The meta object literal for the '<em><b>Zustand Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAHRZEUG_ZUSTAND__ZUSTAND_MAX = eINSTANCE.getFahrzeugZustand_ZustandMax();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl <em>Personal Area Network</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.PersonalAreaNetworkImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getPersonalAreaNetwork()
         * @generated
         */
        EClass PERSONAL_AREA_NETWORK = eINSTANCE.getPersonalAreaNetwork();

        /**
         * The meta object literal for the '<em><b>Slaves</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSONAL_AREA_NETWORK__SLAVES = eINSTANCE.getPersonalAreaNetwork_Slaves();

        /**
         * The meta object literal for the '<em><b>Master</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSONAL_AREA_NETWORK__MASTER = eINSTANCE.getPersonalAreaNetwork_Master();

        /**
         * The meta object literal for the '<em><b>Slave Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSONAL_AREA_NETWORK__SLAVE_MAX = eINSTANCE.getPersonalAreaNetwork_SlaveMax();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.BasicProgramImpl <em>Basic Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.BasicProgramImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getBasicProgram()
         * @generated
         */
        EClass BASIC_PROGRAM = eINSTANCE.getBasicProgram();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.DatasoftImpl <em>Datasoft</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.DatasoftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getDatasoft()
         * @generated
         */
        EClass DATASOFT = eINSTANCE.getDatasoft();

        /**
         * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATASOFT__SKILL = eINSTANCE.getDatasoft_Skill();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.AbstractMatrixDevice <em>Abstract Matrix Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.AbstractMatrixDevice
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getAbstractMatrixDevice()
         * @generated
         */
        EClass ABSTRACT_MATRIX_DEVICE = eINSTANCE.getAbstractMatrixDevice();

        /**
         * The meta object literal for the '<em><b>Device Rating</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_MATRIX_DEVICE__DEVICE_RATING = eINSTANCE.getAbstractMatrixDevice_DeviceRating();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.impl.ConsumerSoftImpl <em>Consumer Soft</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.impl.ConsumerSoftImpl
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getConsumerSoft()
         * @generated
         */
        EClass CONSUMER_SOFT = eINSTANCE.getConsumerSoft();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSUMER_SOFT__TYPE = eINSTANCE.getConsumerSoft_Type();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.RiggerProgram <em>Rigger Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.RiggerProgram
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getRiggerProgram()
         * @generated
         */
        EClass RIGGER_PROGRAM = eINSTANCE.getRiggerProgram();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.FeuerModus <em>Feuer Modus</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.FeuerModus
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFeuerModus()
         * @generated
         */
		EEnum FEUER_MODUS = eINSTANCE.getFeuerModus();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.SchadensTyp <em>Schadens Typ</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.SchadensTyp
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSchadensTyp()
         * @generated
         */
		EEnum SCHADENS_TYP = eINSTANCE.getSchadensTyp();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MagazinTyp <em>Magazin Typ</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MagazinTyp
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagazinTyp()
         * @generated
         */
		EEnum MAGAZIN_TYP = eINSTANCE.getMagazinTyp();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung <em>Feuwerwaffen Erweiterung</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getFeuwerwaffenErweiterung()
         * @generated
         */
		EEnum FEUWERWAFFEN_ERWEITERUNG = eINSTANCE.getFeuwerwaffenErweiterung();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ModifikatorType <em>Modifikator Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ModifikatorType
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModifikatorType()
         * @generated
         */
		EEnum MODIFIKATOR_TYPE = eINSTANCE.getModifikatorType();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.SmartgunType <em>Smartgun Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.SmartgunType
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getSmartgunType()
         * @generated
         */
		EEnum SMARTGUN_TYPE = eINSTANCE.getSmartgunType();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ZauberArt <em>Zauber Art</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ZauberArt
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberArt()
         * @generated
         */
		EEnum ZAUBER_ART = eINSTANCE.getZauberArt();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ZauberReichweite <em>Zauber Reichweite</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ZauberReichweite
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberReichweite()
         * @generated
         */
		EEnum ZAUBER_REICHWEITE = eINSTANCE.getZauberReichweite();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ZauberDauer <em>Zauber Dauer</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ZauberDauer
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getZauberDauer()
         * @generated
         */
		EEnum ZAUBER_DAUER = eINSTANCE.getZauberDauer();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MagischeTradition <em>Magische Tradition</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MagischeTradition
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMagischeTradition()
         * @generated
         */
		EEnum MAGISCHE_TRADITION = eINSTANCE.getMagischeTradition();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.CritterHandlung <em>Critter Handlung</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.CritterHandlung
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterHandlung()
         * @generated
         */
		EEnum CRITTER_HANDLUNG = eINSTANCE.getCritterHandlung();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.CritterReichweite <em>Critter Reichweite</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.CritterReichweite
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterReichweite()
         * @generated
         */
		EEnum CRITTER_REICHWEITE = eINSTANCE.getCritterReichweite();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.CritterDauer <em>Critter Dauer</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.CritterDauer
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getCritterDauer()
         * @generated
         */
		EEnum CRITTER_DAUER = eINSTANCE.getCritterDauer();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ResonanzZiel <em>Resonanz Ziel</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ResonanzZiel
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getResonanzZiel()
         * @generated
         */
		EEnum RESONANZ_ZIEL = eINSTANCE.getResonanzZiel();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.InterfaceModus <em>Interface Modus</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.InterfaceModus
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getInterfaceModus()
         * @generated
         */
        EEnum INTERFACE_MODUS = eINSTANCE.getInterfaceModus();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.ProgramType <em>Program Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ProgramType
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getProgramType()
         * @generated
         */
        EEnum PROGRAM_TYPE = eINSTANCE.getProgramType();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.MatrixProgramType <em>Matrix Program Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.MatrixProgramType
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getMatrixProgramType()
         * @generated
         */
        EEnum MATRIX_PROGRAM_TYPE = eINSTANCE.getMatrixProgramType();

        /**
         * The meta object literal for the '<em>Shr Date</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.util.Date
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getShrDate()
         * @generated
         */
		EDataType SHR_DATE = eINSTANCE.getShrDate();

		/**
         * The meta object literal for the '<em>Modification Manager</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.ModSetter
         * @see de.urszeidler.eclipse.shr5.impl.Shr5PackageImpl#getModificationManager()
         * @generated
         */
		EDataType MODIFICATION_MANAGER = eINSTANCE.getModificationManager();

	}

} //Shr5Package
