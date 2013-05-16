package webcalculator.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webcalculator.form.Calculator;



@Controller
@SessionAttributes
public class CalculatorController {
	
	@RequestMapping(value = "/addNumbers", method = RequestMethod.POST)
    public String addNumbers(Calculator calculator, BindingResult result, Model model) {
    
        //System.out.println(calculator.getA() + calculator.getB());
		
        model.addAttribute("calculator", calculator);
        //System.out.println(calculator.getAddSum());
        return "result"; 
    
    }
	
	@RequestMapping(value = "/subtractNumbers", method = RequestMethod.POST)
	
	public String subtractNumbers(Calculator calculator, BindingResult result, Model model) {
	    
		
		//System.out.println(calculator.getA() - calculator.getB());
		model.addAttribute("calculator", calculator);
		return "result";
 
	}
	
	@RequestMapping("/calculator")
    public ModelAndView showCalculator() {
         
        return new ModelAndView("calculator", "command", new Calculator());
    }

	

}
