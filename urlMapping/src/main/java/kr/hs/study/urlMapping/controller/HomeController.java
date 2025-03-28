package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // @Component를 사용해도 되지만 정확한 역할을 알기위해.
//@ResponseBody   // 브라우저에 index출력됨.
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";  // index.html을 반환해라.
    }

}
