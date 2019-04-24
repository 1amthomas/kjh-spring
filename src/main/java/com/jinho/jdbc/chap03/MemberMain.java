package com.jinho.jdbc.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("zkhsz@naver.com");
		req.setPassword("xxxx");
		req.setName("jinho");

		// 회원 등록
		regService.regist(req);
	}
}
