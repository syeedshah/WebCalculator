package webcalculator.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
	 
	@Controller
	public class HomeController {
	 
	    @RequestMapping("/home")
	    public ModelAndView home() {
	 
	        String message = "Hello World, Spring 3.0!";
	        return new ModelAndView("home", "message", message);
	    }
	}
	
	

