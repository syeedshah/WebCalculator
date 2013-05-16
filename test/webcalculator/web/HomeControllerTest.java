package webcalculator.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHandleRequestView() throws Exception{
		
        HomeController controller = new HomeController();
        
        ModelAndView modelAndView = controller.home();
        
        //assertEquals("calculator.jsp", modelAndView.getViewName());
        
        //New Test for JSTL and new Directory
        assertEquals("home", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
       
    }

}
