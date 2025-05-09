package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.MemoDto;
import kr.hs.study.myBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String Memo_input(){
        return "memo_list";
    }

//    @PostMapping("/memo")
//    public String memo_input(MemoDto dto){
//        service.insert(dto);
//        return "memoResult";
//    }

    @GetMapping("/memo/list")
    public String listAll(Model model){
        List<MemoDto> all = service.listAll();
        model.addAttribute("memoData", all);
        System.out.println("size: " + all.size());
        return "result";
    }


}
