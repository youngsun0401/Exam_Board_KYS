<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>B O A R D</title>
</head>
<body>
<button onclick="location.href='/'">HOME</button>

<button onclick="location.href='newPost'">글쓰기</button>
<table>
	<tr><th>번호</th><th>제목</th><th>작성자</th><th>날짜</th></tr>
<c:forEach var="dto" items="${postList}">
	<tr>
		<td>${dto.b_no}</td>
		<td><a href="viewPost?no=${dto.b_no}">${dto.b_title}</a></td>
		<td>${dto.b_writer}</td>
		<td>${dto.b_regDate}</td>
	</tr>
</c:forEach>
</table>

</body>
</html>