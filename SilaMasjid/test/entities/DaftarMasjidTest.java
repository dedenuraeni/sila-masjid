/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sumurmunding
 */
public class DaftarMasjidTest {

    public DaftarMasjidTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getEntityManager method, of class DaftarMasjid.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        DaftarMasjid instance = new DaftarMasjid();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class DaftarMasjid.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        String email = "";
        String password = "";
        DaftarMasjid instance = new DaftarMasjid();
        boolean expResult = false;
        boolean result = instance.check(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkId method, of class DaftarMasjid.
     */
    @Test
    public void testCheckId() {
        System.out.println("checkId");
        Long id = null;
        DaftarMasjid instance = new DaftarMasjid();
        boolean expResult = false;
        boolean result = instance.checkId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkEmail method, of class DaftarMasjid.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        String email = "";
        DaftarMasjid instance = new DaftarMasjid();
        boolean expResult = false;
        boolean result = instance.checkEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMasjid method, of class DaftarMasjid.
     */
    @Test
    public void testGetMasjid() {
        System.out.println("getMasjid");
        String email = "a@mail.com";
        String password = "sepatu";
        DaftarMasjid instance = new DaftarMasjid();
        //   Masjid expResult = (mail.com,sepatu);
        Masjid result = instance.getMasjid(email, password);
        System.out.println(result);
        //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findMasjid method, of class DaftarMasjid.
     */
    @Test
    public void testFindMasjid() {
        System.out.println("findMasjid");
        Long id = Long.parseLong("1");
        DaftarMasjid instance = new DaftarMasjid();
        Long expResult = Long.parseLong("1");
        Masjid result = instance.findMasjid(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMasjids method, of class DaftarMasjid.
     */
    /*  @Test
    public void testGetMasjids() {
    System.out.println("getMasjids");
    Long id = 1;
    DaftarMasjid instance = new DaftarMasjid();
    List expResult = 1;
    List result = instance.getMasjids(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
    }*/
    /**
     * Test of editMasjid method, of class DaftarMasjid.
     */
    @Test
    public void testEditMasjid() {
        System.out.println("editMasjid");
        Masjid masjid = null;
        DaftarMasjid instance = new DaftarMasjid();
        instance.editMasjid(masjid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMasjid method, of class DaftarMasjid.
     */
    @Test
    public void testAddMasjid() {
        System.out.println("addMasjid");
        Masjid masjid = new Masjid();
        
        masjid.setNmMasjid("Masjid Agung");
        masjid.setEmail("a@mail.com");
        masjid.setAlmtMasjid("Jalan Surabaya");
        masjid.setKotaMasjid("Surabaya");
        masjid.setPassword("password");
        masjid.setTelpMasjid("08176549288");
        DaftarMasjid instance = new DaftarMasjid();
        instance.addMasjid(masjid);
        try {
            assertEquals(1, instance.getMasjids(Long.parseLong("251")).size());
        } catch (Exception e) {
            // assertEquals(1, instance.getMasjids(Long.parseLong("1")).size());
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of deleteMasjid method, of class DaftarMasjid.
     */
    @Test
    public void testDeleteMasjid() throws Exception {
        System.out.println("deleteMasjid");
        Long id = null;
        DaftarMasjid instance = new DaftarMasjid();
        instance.deleteMasjid(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmf method, of class DaftarMasjid.
     */
    @Test
    public void testGetEmf() {
        System.out.println("getEmf");
        DaftarMasjid instance = new DaftarMasjid();
        EntityManagerFactory expResult = null;
        EntityManagerFactory result = instance.getEmf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmf method, of class DaftarMasjid.
     */
    @Test
    public void testSetEmf() {
        System.out.println("setEmf");
        EntityManagerFactory emf = null;
        DaftarMasjid instance = new DaftarMasjid();
        instance.setEmf(emf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
