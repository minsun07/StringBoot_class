package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dto.CommentDto;

import java.util.List;

public interface CommentService {
    public void insert(CommentDto dto);
    public List<CommentDto> select(int boardId);
}
