package kr.hs.study.signJpa.dto;

import kr.hs.study.signJpa.entity.SigninEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SigninDto {
    private Long id;
    private String email;
    private String pw;
    private String name;

    public static SigninEntity toEntity(SigninDto dto){
        return SigninEntity.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .pw(dto.getPw())
                .name(dto.getName())
                .build();
    }
}
