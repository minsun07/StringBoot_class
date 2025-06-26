package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dao.BoardDao;
import kr.hs.study.boardMybatis.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardDao dao;

    @Override
    public void insert(BoardDto dto) {
        dao.insert(dto);
    }

    @Override
    public void update(BoardDto dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<BoardDto> listAll() {
        return dao.listAll();
    }

    @Override
    public BoardDto selectOne(int id) {
        return dao.selectOne(id);
    }

}
