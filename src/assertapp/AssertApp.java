/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertapp;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;				
import org.junit.Test;	
/**
 *
 * @author Crazian
 */
public class AssertApp {

    /**
     * @param args the command line arguments
     */
     @Test		
    public void testAssert(){					
        		
        int[] Arrary1 = { 111, 222, 333 };					
        int[] Arrary2 = { 111, 222, 333 };		
        String a ="Same";					
        String b ="Same";					
        String c ="Same1";					
        String d ="Same1";					
        String tf =null;
        Boolean fls = false; 
        Boolean tru = true;
        int var1=1;			       
        int var2=1;	
        int var3=3;
        
        					
        		
        assertArrayEquals(Arrary1, Arrary2);		
        assertEquals(a,b);
        assertFalse(fls);
        assertNotNull(var1);
        assertNotSame(a,c);
        assertNull(tf);
        assertSame(c, d);
        assertThat(var1, equalTo(var2));
        assertThat(var1, equalTo(var3));
        assertTrue(tru);
        
        					
        					
        			
        					
        					
    }		
    
}
