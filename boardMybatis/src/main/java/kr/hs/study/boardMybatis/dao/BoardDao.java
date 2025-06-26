package kr.hs.study.boardMybatis.dao;

import kr.hs.study.boardMybatis.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    public void insert(BoardDto dto);
    public void update(BoardDto dto);
    public void delete(int idx);
    public List<BoardDto> listAll();

    public BoardDto selectOne(int idx);
}
