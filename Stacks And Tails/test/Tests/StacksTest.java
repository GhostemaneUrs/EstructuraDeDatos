/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import educ.cuc.stacks.Stacks;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ajaramil
 */
public class StacksTest {
    
    public StacksTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testPushEnPilaVacia(){
        Stacks<String> stacks = new Stacks();
        stacks.push("Valeria <3");
        assertEquals("Top no es igual al nodo creado",stacks.getTop(), stacks.peekNode());
        assertEquals("Tamaño inicial no es uno",stacks.getSize(), 1);
        assertEquals("El link no es nulo",stacks.getTop().getLink(), null);
       
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
