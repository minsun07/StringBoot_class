package kr.hs.study.firstJPA.service;

import kr.hs.study.firstJPA.dto.memoDto;
import kr.hs.study.firstJPA.entity.memoEntity;
import kr.hs.study.firstJPA.repository.memoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memoServiceImpl implements memoService{
    @Autowired
    private memoRepository repo;

    @Override
    public void save(memoDto dto) {
        // dto --> entity로 변환
        memoEntity me = memoDto.toEntity(dto);
        repo.save(me);

    }
}
