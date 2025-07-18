package kr.hs.study.boardMybatis.controller;

import kr.hs.study.boardMybatis.dto.BoardDto;
import kr.hs.study.boardMybatis.dto.CommentDto;
import kr.hs.study.boardMybatis.service.BoardService;
import kr.hs.study.boardMybatis.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService service;

    @Autowired
    private CommentService commentService;


    @GetMapping()
    public String board(){
        return "write";
    }

    // 글 작성하기
    @PostMapping("/save")
    public String insertBoard(BoardDto dto){
        service.insert(dto);
        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public String listBoard(Model model){
        List<BoardDto> allList = this.service.listAll();
        model.addAttribute("ListData", allList);
        return "list";
    }

    @GetMapping("/{id}")
    public String countHits(@PathVariable("id") int id, Model model){
        service.countHits(id);
        BoardDto dto = service.selectOne(id);
        List<CommentDto> comDto = commentService.select(id);
        model.addAttribute("posts", dto);
        model.addAttribute("commentListData", comDto);
        return "contents";
    }

    @GetMapping("/update/{id}")
    public String update_form(@PathVariable("id") int id, Model model){
        BoardDto updateBoard = service.selectOne(id);
        model.addAttribute("upboardone", updateBoard);
        return "updateBoard";
    }

    @PostMapping("/update")
    public String update(BoardDto dto){
        BoardDto boardValue = service.selectOne(dto.getId());

        if(boardValue.getBoardPass().equals(dto.getBoardPass())){
            service.update(dto);
            return "redirect:/board/" + dto.getId();
        }

        return "redirect:/board/update/" + dto.getId();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model){
        BoardDto dto = service.selectOne(id);
        model.addAttribute("posts", dto);
        return "deleteBoard";
    }

    @PostMapping("/delete")
    public String delete_from(BoardDto dto){
        BoardDto existingPosts = service.selectOne(dto.getId());

        if(dto.getBoardPass().equals(existingPosts.getBoardPass())){
            service.delete(dto.getId());
            return "redirect:/board/list";
        }

        return "redirect:/board/delete/" + dto.getId();
    }

}
