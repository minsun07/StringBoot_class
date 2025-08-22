package kr.hs.study.signJpa.entity;

import jakarta.persistence.*;
import kr.hs.study.signJpa.dto.SigninDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "signin")
public class SigninEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column
    private String pw;

    @Column
    private String name;

    public static SigninDto toDTO(SigninEntity e){
        return SigninDto.builder()
                .id(e.getId())
                .email(e.getEmail())
                .pw(e.getPw())
                .name(e.getName())
                .build();
    }

}
