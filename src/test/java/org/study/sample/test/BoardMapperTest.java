package org.study.sample.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.BoardMapper;
import org.study.sample.model.PostDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	   @Autowired
	   private BoardMapper mapper;
	   
	   @Test
	   public void boardInsertTest() {
		   PostDTO dto = new PostDTO("테스트 제목", "테스트 내용", "qwer");
	   }
}
