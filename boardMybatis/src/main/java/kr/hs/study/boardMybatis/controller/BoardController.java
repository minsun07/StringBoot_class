package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.dto.BoardDto;
import kr.hs.study.boardMybatis.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService service;

    @GetMapping()
    public String boart(){
        return "write";
    }

    @PostMapping("/save")
    public String board(BoardDto dto){
        service.insert(dto);
        return "writeResult";
    }

    @GetMapping("/list")
    public String listBoard(Model model){
        List<BoardDto> allList = this.service.listAll();
        model.addAttribute("ListData", allList);
        return "list";
    }
}
