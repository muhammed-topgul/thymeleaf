package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Muhammed Topgul.
 * Date: 13.05.2020
 * Time: 18:24
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
