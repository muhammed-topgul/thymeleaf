package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Muhammed Topgul.
 * Date: 13.05.2020
 * Time: 23:27
 */

@Controller
public class IterationExpressionController {

    @GetMapping("/iterationExpression")
    public String iterationExpression(Model model) {
        List<Person> people = Arrays.asList(
                new Person( 1, "Muhammed" ),
                new Person( 2, "Cenk" ),
                new Person( 3, "Marcus" )
        );

        model.addAttribute( "people", people );

        return "iterationExpression";
    }
}
