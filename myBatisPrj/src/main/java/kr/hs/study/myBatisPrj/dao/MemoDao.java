package kr.hs.study.myBatisPrj.dao;

import kr.hs.study.myBatisPrj.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // dao는 쿼리와 연결되기 때문에 어노테이션을 붙여준다.
public interface MemoDao { // 프로젝트 규모가 작기때문에 서비스와 같은 역할을 한다.
    // crud : 삽입, 조회, 수정, 삭제
    // 1. insert (create)
    public void insert(MemoDto dto);
    // 2. update
    public void update(MemoDto dto); // id로 수정
    // 3. delete
    public void delete(int idx);
    // 4. select
    public List<MemoDto> listAll();  // return타입이 ArryList

    public MemoDto selectOne(int idx);
}
