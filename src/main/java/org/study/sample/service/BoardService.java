package org.study.sample.service;

import java.util.List;

import org.study.sample.model.CommentDTO;
import org.study.sample.model.PostDTO;

public interface BoardService {

	List<PostDTO> getBoard();
	void newPost( PostDTO dto );
	PostDTO selectPost(String no);
	void editPost(PostDTO dto);
	void deletePost(String no);
	List<CommentDTO> selectComment(String no);
	void newCommentPost(CommentDTO dto);
	void commentDelete(String no);
}
