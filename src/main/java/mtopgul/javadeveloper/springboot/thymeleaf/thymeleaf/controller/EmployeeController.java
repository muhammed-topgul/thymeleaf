package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by Muhammed Topgul.
 * Date: 14.05.2020
 * Time: 00:26
 */

@Controller
public class EmployeeController {

    @GetMapping({"/add", "/addPerson"})
    public String getPersonForm(@ModelAttribute("person") Person person) {
        return "person/person-form";
    }

    @PostMapping({"/add", "addPerson"})
    public String savePerson(@ModelAttribute("person") Person person, RedirectAttributes redirectAttributes) {
        // assume save to database
        redirectAttributes.addFlashAttribute( "savedPerson", person );
        return "redirect:/detail";
    }

    @GetMapping("/detail")
    public String detail() {
        return "person/person-detail";
    }
}
