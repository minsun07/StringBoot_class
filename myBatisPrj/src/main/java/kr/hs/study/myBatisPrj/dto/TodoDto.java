package kr.hs.study.myBatisPrj.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TodoDto {
    private int idx;
    private String content;
    private String password;
    private String status;
    private LocalDateTime post_date;
}
