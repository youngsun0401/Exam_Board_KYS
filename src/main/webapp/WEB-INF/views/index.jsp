<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${not empty sessionScope.login}">
	<div>${sessionScope.login}님 환영합니다!</div>
	<button onclick="location.href='logout'">로그아웃</button>
</c:if>

<c:if test="${empty sessionScope.login}">
<h2>로그인</h2>
<form action="login" method="post">
	아이디: <input type="text" name="m_id"><br>
	비밀번호: <input type="text" name="m_pw"><br>
	<button type="submit">제출</button>
</form>
</c:if>


<a href="memberInsert">회원 등록하러 가기</a>
<a href="memberList">회원 보러 가기</a>
<a href="board">글 목록 보러 가기</a>

</body>
</html>