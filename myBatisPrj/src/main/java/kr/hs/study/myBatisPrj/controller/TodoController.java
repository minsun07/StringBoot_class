package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.TodoDto;
import kr.hs.study.myBatisPrj.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping()
    public String todo(Model model){
        List<TodoDto> todo_all = service.listAll();
        model.addAttribute("todoData", todo_all);
        return "todo_input";
    }

    @PostMapping("/todo_done")
    public String todo_input(TodoDto dto){
        service.insert(dto);
        return "redirect:/Todo";
    }

    @GetMapping("/edit/{idx}")
    public String edit_todo(@PathVariable("idx") int idx, Model model){
        TodoDto dto = service.selectOne(idx);
        model.addAttribute("todo_one", dto);
        return "todo_edit_form";
    }

    @PostMapping("/todo_edit")
    public String todoEdit(TodoDto dto){
        String pw = dto.getPassword();  // input받은 pw
        TodoDto todo = service.selectOne(dto.getIdx()); // 기존에 있던 idx

        if(pw.equals(todo.getPassword())){
            service.update(dto);
            return "redirect:/Todo";

        }
        System.out.println("비밀번호가 일치하지 않습니다.");
        return "redirect:/Todo/edit/" + dto.getIdx();
    }

    @GetMapping("/delete/{idx}")
    public String deleteTodo(@PathVariable("idx") int idx){
        service.delete(idx);
        return "redirect:/Todo";
    }

}
