package org.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.study.sample.model.CommentDTO;
import org.study.sample.model.MemberDTO;
import org.study.sample.model.PostDTO;

@Mapper
public interface BoardMapper {
	public List<PostDTO> selectAll();
	public void newPost(PostDTO dto);
	public PostDTO select( String no );
	public void postUpdate(PostDTO dto);
	public void postDelete(String no);
	public List<CommentDTO> commentsOnPost(String no);
	public void newComment(CommentDTO dto);
	public void commentDelete(String no);
}
