package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dto.TodoDto;

import java.util.List;

public interface TodoService {
    public void insert(TodoDto dto);
    public void update(TodoDto dto);
    public void delete(int idx);
    public List<TodoDto> listAll();
    public TodoDto selectOne(int idx);

}
