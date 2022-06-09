package kz.sultan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/emplayee")
public class MyController {

    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("emplayee", new Emplayee());
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("emplayeeName");
//        empName = "Mr." + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("descAttribute", "Java Developer");
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("emplayee") Emplayee emp,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "ask-emp-details-view";
        return "show-emp-details-view";
    }
}
