<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body>
<button onclick="location.href='/'">HOME</button>

<h1>회원 목록</h1>
<table border=1>
	<tr><th>회원 번호</th><th>회원 아이디</th><th>비밀번호</th><th>주소</th><th>등록일</th><th>X</th></tr>
	<c:forEach var="list" items="${list}">
	<tr>
		<td>${list.m_no}</td>
		<td><a href="memberSelect?no=${list.m_no}">${list.m_id}</a></td>
		<td>${list.m_pw}</td>
		<td>${list.m_address}</td>
		<td>${list.m_regDate}</td>
		<td><a href="memberDelete?no=${list.m_no}">X</a></td>
	</tr>
	</c:forEach>
</table>

<button onclick="location.href='/'">홈으로</button>

</body>
</html>