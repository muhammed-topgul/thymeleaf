package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Muhammed Topgul.
 * Date: 14.05.2020
 * Time: 02:44
 */

@Controller
public class LayoutIncludeController {

    @GetMapping("/include")
    public String goToLayoutInclude1(){
        return "layouts/include/index";
    }

    @GetMapping("/include/user")
    public String goToLayoutInclude2(){
        return "layouts/include/user";
    }

    @GetMapping("/include/admin/index")
    public String goToLayoutInclude3(){
        return "layouts/include/admin";
    }
}
