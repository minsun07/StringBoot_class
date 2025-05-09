package kr.hs.study.Redirect_Forward.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/forward")
    public String forward(){
        return "forward:/sub1"; // sub1의 주소로 이동해라
                                // 얘는 주소!!
    }

    @GetMapping("/sub1")
    public String sub1(){
        return "sub1"; //얘는 타임리프 파일!!(html)
    }

    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:/sub1";
    }
}
