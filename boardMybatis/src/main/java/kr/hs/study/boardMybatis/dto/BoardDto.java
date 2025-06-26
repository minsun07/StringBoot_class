package kr.hs.study.boardMybatis.dto;

import lombok.Data;

@Data
public class BoardDto {
    private int id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private String boardCreatedTime;
    private int boardHits;
    private int fileAttached;
}
