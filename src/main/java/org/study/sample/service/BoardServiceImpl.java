package org.study.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.sample.mapper.BoardMapper;
import org.study.sample.model.CommentDTO;
import org.study.sample.model.PostDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void newPost(PostDTO dto) {
		mapper.newPost(dto);
	}

	@Override
	public List<PostDTO> getBoard() {
		return mapper.selectAll();
	}

	@Override
	public PostDTO selectPost(String no) {
		return mapper.select(no);
	}
	
	@Override
	public void editPost(PostDTO dto) {
		mapper.postUpdate(dto);
	}
	
	@Override
	public void deletePost(String no) {
		mapper.postDelete(no);
	}

	@Override
	public List<CommentDTO> selectComment(String no) {
		return mapper.commentsOnPost(no);
	}

	@Override
	public void newCommentPost(CommentDTO dto) {
		mapper.newComment(dto);
	}

	@Override
	public void commentDelete(String no) {
		mapper.commentDelete(no);
	}


}
