package kr.hs.study.signJpa.service;

import kr.hs.study.signJpa.dto.SigninDto;

import java.util.List;

public interface SigninService {
    public void save(SigninDto dto);
    public List<SigninDto> findAll();

    SigninDto login(SigninDto dto);
    SigninDto findById(Long id);
}
