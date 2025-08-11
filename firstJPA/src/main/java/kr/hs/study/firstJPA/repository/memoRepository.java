package kr.hs.study.firstJPA.repository;

import kr.hs.study.firstJPA.dto.memoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memoRepository extends CrudRepository<memoDto, Long> {
}
