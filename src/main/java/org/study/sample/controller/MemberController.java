package org.study.sample.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.sample.model.MemberDTO;
import org.study.sample.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@PostMapping("/login")
	public String djhkcjhvk( MemberDTO dto, HttpSession session ) {
		MemberDTO result = memberService.login(dto);
		session.setAttribute("login", result.getM_id());
		return "redirect:/";
	}

	@GetMapping("/logout")
	public String testa( Model model, HttpSession session ) {
		session.removeAttribute("login");
		return "redirect:/";
	}
	
	@GetMapping("/memberInsert")
	public String asdfdfsdf() {
		return "member/memberInsert";
	}
	@PostMapping("/memberInsert")
	public String skucvhksj( MemberDTO dto ) {// 매개변수를 id, pw, addr로 주는 걸 MemberDTO로 받는데 됨.
		memberService.memberInsert(dto);
		return "redirect:/board";
	}
	
	@GetMapping("/memberList")
	public String memberList(Model model) {
		List<MemberDTO> list = memberService.memberSelectAll();
		model.addAttribute("list", list);// list 가지고
		return "member/memberList";// 여기로 가기
	}
	
	@GetMapping("/memberDelete")
	public String afdsfdfsd(@RequestParam("no") String no) {// 매개변수를 id, pw, addr로 주는 걸 MemberDTO로 받는데 됨. 왠진 나도 모르게어
		memberService.memberDelete(no);
		return "redirect:/";
	}
	
	@GetMapping("/memberSelect")
	public String dfsdlboixc9iwkkku(@RequestParam("no") String no, Model model) {
		MemberDTO dto = memberService.memberSelect(no);
		model.addAttribute("dto", dto);
		return "member/memberRead";
	}
	
	@GetMapping("/memberUpdate")
	public String cvnisundiuhvdiuf(@RequestParam("no") String no, Model model) {
		MemberDTO dto = memberService.memberSelect(no);
		model.addAttribute("dto", dto);
		return "member/memberUpdate";
	}
	@PostMapping("/memberUpdate")
	public String cvndvdiudfdf(@RequestParam("no") String no) {
		memberService.memberUpdate(no);
		return "redirect:/";
	}
}
