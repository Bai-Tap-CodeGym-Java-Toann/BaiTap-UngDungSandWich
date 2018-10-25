package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sandwich")
public class sandWichController {

    @GetMapping
    private String orderSandwich(Model model){
        return "sandwich";
    }

    @PostMapping
    private ModelAndView makeSandwich(@RequestParam String[] nhan){
        ModelAndView model = new ModelAndView("serviceSandwich");
        model.addObject("nhan",nhan);
        return model;
    }

}
