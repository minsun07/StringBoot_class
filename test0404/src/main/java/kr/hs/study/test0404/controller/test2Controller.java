package kr.hs.study.test0404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class test2Controller {
    @PostMapping("/index2")
    public String test2(@RequestParam("N") Integer N){
            for(int i=1; i<=100; i++){
                if(i % N==0){
                    System.out.println(i);
                }
            }
            return "result";

    }
}
