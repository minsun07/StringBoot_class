package kr.hs.study.LoginTest.controller;

import kr.hs.study.LoginTest.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    // 이건 모순적이다...
//    @PostMapping("/login")
//    public String test(@RequestParam("id1") String id,
//                       @RequestParam("pw1") String pw){
//
//        if(id.equals("lay") & pw.equals("1111")){
//            System.out.println("'login!!");
//            return "result";
//        } else {
//            System.out.println("not login");
//            return "result2";
//        }
//
//    }

    @PostMapping("/login")
    public String login(LoginDto dto){
        if(dto.getId1().equals("lay") & (dto.getPw1()).equals("1111")){
            System.out.println("'login!!");
            return "result";
        } else {
            System.out.println("not login");
            return "result2";
        }
    }

}
