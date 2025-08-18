package kr.hs.study.firstJPA.controller;

import kr.hs.study.firstJPA.dto.memoDto;
import kr.hs.study.firstJPA.service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class memoController {
    @Autowired
    private memoService service;

    @GetMapping("/input")
    public String dataAdd(){
        return "inform";
    }

    @PostMapping("/input_done")
    public void dataInput(memoDto dto){
        service.save(dto);
    }
}
