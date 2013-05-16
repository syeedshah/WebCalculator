package webcalculator.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



import webcalculator.form.Calculator;

public class CalculatorControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddSum() throws Exception{
		
        Calculator controller = new Calculator();
        
        controller.setA(10);
        controller.setB(10);
        
        //assertEquals("calculator.jsp", modelAndView.getViewName());
        
        //New Test for JSTL and new Directory
        assertEquals(20, controller.getAdd());
       
       
    }
	
	public void testSubtractSum() throws Exception{
		
        Calculator controller = new Calculator();
        
        controller.setA(10);
        controller.setB(5);
        
        //assertEquals("calculator.jsp", modelAndView.getViewName());
        
        //New Test for JSTL and new Directory
        assertEquals(5, controller.getSubtract());
       
       
    }
}


