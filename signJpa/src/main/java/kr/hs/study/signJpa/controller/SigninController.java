package kr.hs.study.signJpa.controller;

import kr.hs.study.signJpa.dto.SigninDto;
import kr.hs.study.signJpa.repository.SigninRepository;
import kr.hs.study.signJpa.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SigninController {
    @Autowired
    private SigninService service;

    @GetMapping("/sign")
    public String register() {
        return "signinForm";
    }

    @PostMapping("/sign_done")
    public String signIn(SigninDto dto){
        service.save(dto);
        return "index";
    }

    @GetMapping("/member")
    public String memberList(SigninDto dto, Model model){
        List<SigninDto> members = service.findAll();
        model.addAttribute("members", members);
        return "list";
    }

    //내정보 수정하기
    @GetMapping("/member/update")
    public String reSign(Model model){
        SigninDto userDto = new SigninDto();
        return "signinUpdateForm";
    }
}
