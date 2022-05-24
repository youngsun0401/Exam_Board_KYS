package org.study.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.study.sample.mapper.MemberMapper;
import org.study.sample.model.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper mapper;
	@Autowired
	private BCryptPasswordEncoder pwEncoder;

	@Override
	public MemberDTO login( MemberDTO dto ) {
		if( pwEncoder.matches(
				dto.getM_pw(), 
				mapper.getRealPassword( dto.getM_id() )
				) 
			){// 로긴 성공
			return mapper.login(dto);
		}else {
			return null;
		}
	}
	
	@Override
	public void memberInsert(MemberDTO dto) {
		dto.setM_pw(
				pwEncoder.encode( dto.getM_pw() )
				);// 비밀번호 암호화
		mapper.memberInsert(dto);
	}

	@Override
	public List<MemberDTO> memberSelectAll() {
		return mapper.memberSelectAll();
	}

	@Override
	public void memberDelete(String no) {
		mapper.memberDelete(no);
	}

	@Override
	public MemberDTO memberSelect(String no) {
		return mapper.memberSelect(no);
	}

	@Override
	public void memberUpdate(String no) {
		mapper.memberUpdate(no);
	}

}
