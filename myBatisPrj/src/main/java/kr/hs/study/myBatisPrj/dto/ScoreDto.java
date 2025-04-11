package kr.hs.study.myBatisPrj.dto;

import lombok.Data;

@Data
public class ScoreDto {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private double avg;


}
