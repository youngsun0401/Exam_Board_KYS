package org.study.sample.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.MemberMapper;
import org.study.sample.model.MemberDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
   
   @Autowired
   private MemberMapper mapper;
   
   //@Test
   public void memberInsertTest() {
      log.info("memberInsertTest() 시작");
      MemberDTO dto = new MemberDTO();
      dto.setM_id("testID");
      dto.setM_pw("testPW");
      dto.setM_address("대구");
      log.info("dto 값 확인: " + dto);
      mapper.memberInsert(dto);
      log.info("memberInsertTest() 끝");
   }
   
   @Test
   public void memberSelect() {
	   MemberDTO dto = mapper.memberSelect("1");
	   log.info(dto);
   }
}
