package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // @Component를 사용해도 되지만 정확한 역할을 알기위해.
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";  // index.html을 반환해라.
    }
}
