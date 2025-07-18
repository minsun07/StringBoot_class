package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.dto.CommentDto;
import kr.hs.study.boardMybatis.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class CommentController {
    @Autowired
    private CommentService service;

    @PostMapping("/comment/save")
    public String comment(CommentDto dto){
        service.insert(dto);
        System.out.println("comment dto: "+dto);
        return "redirect:/board/" + dto.getBoardId();
    }

//    @GetMapping("/{id}/comment")
//    public String commentList(Model model){
//        List<CommentDto> allList = service.select();
//        model.addAttribute("commentListData", allList);
//        return "contents";
//    }

}
