package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Address;
import mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Muhammed Topgul.
 * Date: 13.05.2020
 * Time: 23:09
 */

@Controller
public class ConditionalExpression {

    @GetMapping("/conditionalExpression")
    public String conditionalExpression(Model model) {
        Address address1 = new Address( "102 Çankaya", "520510" );
        Person muhammed = new Person( 1, "Muhammed Topgul", address1 );

        Address address2 = new Address( "103 Kızılay", "520510" );
        Person cenk = new Person( 2, "Cenk Çelik", address2 );

        Address address3 = new Address( "104 Cebeci", "520510" );
        Person marcus = new Person( 3, "Marcus Vitos", null );

        model.addAttribute( "person1", muhammed );
        model.addAttribute( "person2", cenk );
        model.addAttribute( "person3", marcus );

        model.addAttribute( "gender", "Male" );

        return "conditionalExpression";
    }
}
