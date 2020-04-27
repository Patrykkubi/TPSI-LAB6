
package wizut.tpsi.springlab1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class calculatorController {
    
    @RequestMapping("/calculator")
    public String calculator(Model model, CalculatorForm calculator){
        
        
        if(calculator.getMethod().equals("+")){
          
          calculator.setWynik(calculator.getX()+calculator.getY());
        }
        else if (calculator.getMethod().equals("-")){
            
            calculator.setWynik(calculator.getX()-calculator.getY());
        }
        else if (calculator.getMethod().equals("*")){
           
            calculator.setWynik(calculator.getX()*calculator.getY());
        }
         
        model.addAttribute("cal",calculator);
       
        return "calculator";
    }
    
    

}