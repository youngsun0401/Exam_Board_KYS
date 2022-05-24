package org.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.study.sample.model.MemberDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public List<MemberDTO> memberSelectAll();
	public void memberDelete(String ryrtyrtht);
	public MemberDTO memberSelect(@Param("ppp") String no );
	public void memberUpdate(String no);
	public MemberDTO login(MemberDTO dto);
	public String getRealPassword(String m_pw);
}
