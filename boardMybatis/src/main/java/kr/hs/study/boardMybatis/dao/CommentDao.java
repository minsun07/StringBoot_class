package kr.hs.study.boardMybatis.dao;

import kr.hs.study.boardMybatis.dto.BoardDto;
import kr.hs.study.boardMybatis.dto.CommentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    public void insert(CommentDto dto);
}
