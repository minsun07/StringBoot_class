package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dto.MemoDto;
import org.springframework.stereotype.Service;

import java.util.List;

//인터페이스이기 때문에 @Service를 붙이면x, 객체를 만들어서 붙이기
public interface MemoService {
    // crud : 삽입, 조회, 수정, 삭제
    // 1. insert (create)
    public void insert(MemoDto dto);
    // 2. update
    public void update(int idx); // id로 수정
    // 3. delete
    public void delete(int idx);
    // 4. select
    public List<MemoDto> listAll();  // return타입이 ArryList
}
