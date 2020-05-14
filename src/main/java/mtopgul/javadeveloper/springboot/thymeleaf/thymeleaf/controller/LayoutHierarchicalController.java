package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Muhammed Topgul.
 * Date: 14.05.2020
 * Time: 02:44
 */

@Controller
public class LayoutHierarchicalController {

    @GetMapping("/hierarchical")
    public String goToLayoutInclude1(){
        return "layouts/hierarchical/index";
    }

    @GetMapping("/hierarchical/user")
    public String goToLayoutInclude2(){
        return "layouts/hierarchical/user";
    }

    @GetMapping("/hierarchical/admin/index")
    public String goToLayoutInclude3(){
        return "layouts/hierarchical/admin/index";
    }
}
