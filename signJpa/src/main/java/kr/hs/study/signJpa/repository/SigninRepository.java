package kr.hs.study.signJpa.repository;

import kr.hs.study.signJpa.entity.SigninEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SigninRepository extends JpaRepository<SigninEntity, Long> {
    Optional<SigninEntity> findByemail(String email); //내가 기능을 만든거임
}
