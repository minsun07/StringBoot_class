package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login_form(Model model, @ModelAttribute LoginDto dto){
        String result = "";

        if (dto.getId().equals("lay") & dto.getPw().equals("1234")){
            result = "로그인 성공";
        }else{
            result = "로그인 실패";
        }

        model.addAttribute("loginData", result);

        return "loginResult";
    }
}
