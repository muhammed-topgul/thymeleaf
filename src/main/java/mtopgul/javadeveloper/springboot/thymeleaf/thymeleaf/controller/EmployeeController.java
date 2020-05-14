package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
    public String savePerson(@Valid @ModelAttribute("person") Person person, BindingResult result, RedirectAttributes redirectAttributes) {

        // if we have an error
        if (result.hasErrors()) {
            return "person/person-form";
        }

        // assume save to database
        redirectAttributes.addFlashAttribute( "savedPerson", person );
        return "redirect:/detail";
    }

    @GetMapping("/detail")
    public String detail() {
        return "person/person-detail";
    }
}
