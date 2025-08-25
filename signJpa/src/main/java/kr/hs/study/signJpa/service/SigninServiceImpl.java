package kr.hs.study.signJpa.service;

import kr.hs.study.signJpa.dto.SigninDto;
import kr.hs.study.signJpa.entity.SigninEntity;
import kr.hs.study.signJpa.repository.SigninRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public SigninDto login(SigninDto dto) {
        //repo의 findBy...호출해서 optional<SignEntity> email에 대입
        Optional<SigninEntity> memberEmail = repo.findByemail(dto.getEmail());
        if(memberEmail.isPresent()){
            SigninEntity me = memberEmail.get(); //optional을 벗긴다(가져온다.)
            if(me.getPw().equals(dto.getPw())){
                SigninDto a = SigninEntity.toDTO(me); // a: email. pw
                System.out.println("email, password : " + a);
                return a;
            }
            else{
                return null;
            }
        }else {
            return null;
        }
    }

    @Override
    public SigninDto findById(Long id) {
        return SigninEntity.toDTO(repo.getReferenceById(id));
    }
}
