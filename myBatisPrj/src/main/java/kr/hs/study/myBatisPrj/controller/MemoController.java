package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.MemoDto;
import kr.hs.study.myBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String listAll(Model model){
        List<MemoDto> all = service.listAll();
        model.addAttribute("memoData", all);
        System.out.println("size: " + all.size());
        return "memo_list";
    }

    @PostMapping("/write_done")
    public String memo_input(MemoDto dto){
        service.insert(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/edit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model){
        System.out.println("idx : " + idx);
        MemoDto dto = service.selectOne(idx);
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String memo_re_input(MemoDto dto){
        service.update(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/delete/{idx}")
    public String memo_del(@PathVariable("idx") int idx){
        service.delete(idx);
        return "redirect:/Memo";
    }



}
