package org.study.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.study.sample.model.CommentDTO;
import org.study.sample.model.PostDTO;
import org.study.sample.service.BoardService;

@Controller
public class BoardController {
	@Autowired private BoardService boardService;
	
	//// 전체 게시물 보기
	@GetMapping("board")
	public String board( Model model ) {
		List<PostDTO> list = boardService.getBoard();// 게시글 목록을 가져온다
		model.addAttribute("postList", list);
		return "board/board";
	}
	
	//// 새 게시물 작성 페이지
	@GetMapping("newPost")
	public String newPost( PostDTO dto ) {
		return "board/writePost";
	}

	//// 새 게시물 작성 
	@PostMapping("newPost")
	public String newPostPost( PostDTO dto ) {
		boardService.newPost(dto);
		return "redirect:/board";// 글목록 화면으로 가기
	}
	
	//// 게시물 상세 보기 페이지
	@GetMapping("viewPost")
	public String viewPost( @RequestParam("no") String no, Model model  ) {
		model.addAttribute("dto", 
				boardService.selectPost(no) // 게시글 번호로 게시글 가져오기
				);
		return "board/viewPost";
	}
	
	//// 게시물 수정 페이지
	@GetMapping("editPost")
	public String editPost( @RequestParam("no") String no, Model model ) {
		model.addAttribute(
				"post", 
				boardService.selectPost(no) // 게시글 번호로 게시글 가져오기
				);
		return "board/updatePost";
	}
	//// 게시물 수정
	@PostMapping("editPost")
	public String editPostPost( PostDTO dto ) {
		boardService.editPost(dto);
		return "redirect:/viewPost?no="+dto.getB_no();// 수정한 해당 게시글 상세보기 페이지로
	}
	
	//// 게시물 삭제
	@GetMapping("deletePost")
	public String deletePost( @RequestParam("no") String no ) {
		boardService.deletePost(no);
		return "redirect:/board";// 글목록 화면으로 가기
	}
	
	//// ajax용 댓글목록 항목들 불러오기
	@GetMapping("getCommentList")
	public String getCommentList( @RequestParam("no") String no, Model model ) {
		model.addAttribute(
				"comments",
				boardService.selectComment(no)
				);
		return "board/commentItems";
	}
	
	//// 새 댓글 쓰기
	@PostMapping("newComment")
	@ResponseBody
	public String newComment( CommentDTO dto, Model model ) {
		boardService.newCommentPost(dto);
		return null;
	}
	//// 댓글 삭제
	@PostMapping("commentDelete")
	@ResponseBody
	public String commentDelete( @RequestParam("no") String no ) {
		boardService.commentDelete(no);
		return null;
	}
}
