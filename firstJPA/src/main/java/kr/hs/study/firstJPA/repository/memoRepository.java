package kr.hs.study.firstJPA.repository;

import kr.hs.study.firstJPA.entity.memoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memoRepository extends JpaRepository<memoEntity, Long> {

}
