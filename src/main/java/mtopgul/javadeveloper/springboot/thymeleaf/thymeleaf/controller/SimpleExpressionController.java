package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Address;
import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Muhammed Topgul.
 * Date: 13.05.2020
 * Time: 21:47
 */

@Controller
public class SimpleExpressionController {

    @GetMapping("/simpleExpression")
    public String simpleExpression(Model model) {
        Address address = new Address( "Turkey","102 Çankaya", "520510" );
        Person muhammed = new Person( 1, "Muhammed","Topgul", address );

        model.addAttribute( "person", muhammed );
        return "simpleExpression";
    }
}
