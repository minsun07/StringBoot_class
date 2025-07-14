package kr.hs.study.boardMybatis.dto;

import lombok.Data;

@Data
public class CommentDto {
    private int id;
    private String commentWriter;
    private String commentContents;
    private int boardId;
    private String commentCreatedTime;

}
