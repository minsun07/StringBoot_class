package kr.hs.study.signJpa.controller;

import jakarta.servlet.http.HttpSession;
import kr.hs.study.signJpa.dto.SigninDto;
import kr.hs.study.signJpa.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private SigninService service;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login_done(SigninDto dto, HttpSession session){
        SigninDto re = service.login(dto);
        if(re!=null){
            session.setAttribute("loginEnail", re.getEmail());
            return "main";
        }else{
            return "index";
        }
    }


}
