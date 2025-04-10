package kr.hs.study.myBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class T_TableController {
    @GetMapping("/Times_Table")
    public String ttable(){
        return "table_input";
    }

    @PostMapping("/table_input")
    public String ttable(@RequestParam("gugu")  Integer gugu, Model model){
        String result = "";

        for (int i=1; i<10; i++){
            result +=  gugu + " X " + i + " = " + gugu*i;
            //System.out.println(gugu + " X " + i + " = " + gugu*i);
        }
        model.addAttribute("list", result);

        return "result";
    }
}
