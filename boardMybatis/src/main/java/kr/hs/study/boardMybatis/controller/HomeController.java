package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private BoardService service;

    @GetMapping("/")
    public String main(){
        return "index";
    }
}
