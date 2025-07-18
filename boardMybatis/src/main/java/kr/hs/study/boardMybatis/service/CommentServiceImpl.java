package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dao.CommentDao;
import kr.hs.study.boardMybatis.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentDao dao;

    @Override
    public void insert(CommentDto dto) {
        dao.insert(dto);
    }

    @Override
    public List<CommentDto> select(int boardId) {
        return dao.select(boardId);
    }
}
