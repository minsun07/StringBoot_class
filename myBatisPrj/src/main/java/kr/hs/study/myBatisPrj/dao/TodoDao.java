package kr.hs.study.myBatisPrj.dao;

import kr.hs.study.myBatisPrj.dto.TodoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDao {
    public void insert(TodoDto dto);
    public void update(TodoDto dto);
    public void delete(int idx);
    public List<TodoDto> listAll();
    public TodoDto selectOne(int idx);
}
