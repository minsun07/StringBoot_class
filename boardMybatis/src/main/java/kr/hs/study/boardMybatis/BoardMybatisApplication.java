package kr.hs.study.boardMybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("kr.hs.study.boardMybatis.dao")
public class BoardMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardMybatisApplication.class, args);
	}

}
