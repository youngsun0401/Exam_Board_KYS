package org.study.sample.service;

import java.util.List;

import org.study.sample.model.MemberDTO;

public interface MemberService {

	void memberInsert(MemberDTO dto);
	List<MemberDTO> memberSelectAll();
	void memberDelete(String no);
	MemberDTO memberSelect(String no);
	void memberUpdate(String no);
	MemberDTO login(MemberDTO dto);
}
