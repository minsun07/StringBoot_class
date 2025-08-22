package kr.hs.study.signJpa.service;

import kr.hs.study.signJpa.dto.SigninDto;
import kr.hs.study.signJpa.entity.SigninEntity;
import kr.hs.study.signJpa.repository.SigninRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SigninServiceImpl implements SigninService{
    @Autowired
    private SigninRepository repo;

    @Override
    public void save(SigninDto dto) {
        SigninEntity si = SigninDto.toEntity(dto);
        repo.save(si);
    }

    @Override
    public List<SigninDto> findAll() {
        List<SigninEntity> lEntity = repo.findAll();
        List<SigninDto> dtoList = new ArrayList<>();
        for(SigninEntity txt : lEntity) {
            SigninDto dto = SigninEntity.toDTO(txt);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
