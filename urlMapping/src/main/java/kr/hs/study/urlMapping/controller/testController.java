package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub1")
public class testController {
//    @RequestMapping(value = "/test1", method = RequestMethod.GET)
//    public String test1(){
//        return "test1";
//    }
//
//    @RequestMapping(value = "/test2", method = RequestMethod.GET)
//    public String test2(){
//        return "test2";
//    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public String test3(){
        return "sub1/test3";
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    public String test4(){
        return "sub1/test4";
    }

    @PostMapping("/test6")
    public String test6(){
        return "sub1/test6";
    }
}
