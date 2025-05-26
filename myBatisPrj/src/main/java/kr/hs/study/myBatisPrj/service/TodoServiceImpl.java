package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dao.TodoDao;
import kr.hs.study.myBatisPrj.dto.TodoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoDao dao;

    @Override
    public void insert(TodoDto dto) {
        dao.insert(dto);
    }

    @Override
    public void update(TodoDto dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    }

    @Override
    public List<TodoDto> listAll() {
        return dao.listAll();
    }

    @Override
    public TodoDto selectOne(int idx) {
        return dao.selectOne(idx);
    }
}
