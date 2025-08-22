package kr.hs.study.signJpa.repository;

import kr.hs.study.signJpa.entity.SigninEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SigninRepository extends JpaRepository<SigninEntity, Long> {
}
