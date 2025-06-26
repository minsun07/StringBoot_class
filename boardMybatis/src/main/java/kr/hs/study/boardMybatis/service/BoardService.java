package kr.hs.study.boardMybatis.service;

import kr.hs.study.boardMybatis.dto.BoardDto;

import java.util.List;

public interface BoardService {
    public void insert(BoardDto dto);
    public void update(BoardDto dto);
    public void delete(int id);
    public List<BoardDto> listAll();

    public BoardDto selectOne(int id);
}
