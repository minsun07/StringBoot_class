package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dao.MemoDao;
import kr.hs.study.myBatisPrj.dto.MemoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService{
    @Autowired
    private MemoDao dao;

    @Override
    public void insert(MemoDto dto) {
        dao.insert(dto);
    }

    @Override
    public void update(MemoDto dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {

    }

    @Override
    public List<MemoDto> listAll() {
        return dao.listAll();
    }

    @Override
    public MemoDto selectOne(int idx) {
        return dao.selectOne(idx);
    }
}
