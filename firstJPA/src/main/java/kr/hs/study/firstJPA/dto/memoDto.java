package kr.hs.study.firstJPA.dto;

import kr.hs.study.firstJPA.entity.memoEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class memoDto {
    private Long id;
    private String title;
    private String content;

    // dto -> entity로 변환
    public static memoEntity toEntity(memoDto dto){
        return memoEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }
}
