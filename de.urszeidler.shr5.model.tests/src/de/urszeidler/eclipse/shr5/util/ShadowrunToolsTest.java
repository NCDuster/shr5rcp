package de.urszeidler.eclipse.shr5.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Assert;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools.DamageCode;

public class ShadowrunToolsTest extends TestCase {

    public void testParseDamagecode() {
        DamageCode damageCode = ShadowrunTools.parseDamageCode("9P");
        
        assertEquals(damageCode.getPower(),9);
        assertEquals(damageCode.getType(),SchadensTyp.KOERPERLICH);
        
        damageCode = ShadowrunTools.parseDamageCode("9M");
        
        assertEquals(damageCode.getPower(),9);
        assertEquals(damageCode.getType(),SchadensTyp.GEISTIG);
    }
    
    public void testParseDamagecode_1() {
        DamageCode damageCode = ShadowrunTools.parseDamageCode("(STR+1)P");
        
        assertEquals(damageCode.getPower(),1);
        assertEquals(damageCode.getType(),SchadensTyp.KOERPERLICH);
        
        damageCode = ShadowrunTools.parseDamageCode("(STR+1)M");
        
        assertEquals(damageCode.getPower(),1);
        assertEquals(damageCode.getType(),SchadensTyp.GEISTIG);
    }
    
    public void testFilterSkillGroups() {
        ArrayList<FertigkeitsGruppe> arrayList = new ArrayList<FertigkeitsGruppe>();
        
        FertigkeitsGruppe fertigkeitsGruppe = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);        
        arrayList.add(fertigkeitsGruppe);
        
        fertigkeitsGruppe = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        arrayList.add(fertigkeitsGruppe);
        
        
        fertigkeitsGruppe = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        arrayList.add(fertigkeitsGruppe);
        
        
        ArrayList<FertigkeitsGruppe> filterSkillGroups = ShadowrunTools.filterSkillGroups(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE, arrayList);
        assertEquals("",2, filterSkillGroups.size());
        
        
    }

    
    public void testPermutation() {

        ArrayList<Integer> prefix = new ArrayList<Integer>();
        ArrayList<Integer> src = new ArrayList<Integer>();
        Set<List<Integer>> target = new HashSet<List<Integer>>();
       
        src.add(1);
        src.add(2);
        src.add(3);
        src.add(4);
        
        ShadowrunTools.permutation(prefix, src, target);
        Assert.assertEquals(24, target.size());
        System.out.println(target.size() +"  "+target);
        
        //ShadowrunTools.permutation("", "1234");
    }
    
    public void testPermutation1() {

        ArrayList<Integer> prefix = new ArrayList<Integer>();
        ArrayList<Integer> src = new ArrayList<Integer>();
        Set<List<Integer>> target = new HashSet<List<Integer>>();
       
        src.add(1);
        src.add(2);
        src.add(2);
        src.add(4);
        
        ShadowrunTools.permutation(prefix, src, target);
        Assert.assertEquals(12, target.size());
        System.out.println(target.size() +"  "+target);
        
        //ShadowrunTools.permutation("", "1234");
    }

}
