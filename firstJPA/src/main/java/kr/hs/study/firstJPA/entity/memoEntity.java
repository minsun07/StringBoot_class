package kr.hs.study.firstJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
//@NoArgsConstructor // (매개변수 없는)기본 생성자
//@AllArgsConstructor //여러 생성자
@Table(name="MEMO_JPA")
public class memoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, unique = true)
    private String title;

    @Column
    private String content;
}
