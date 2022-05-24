<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 보기</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>

<button onclick="location.href='/'">HOME</button>

<span>번호: ${dto.b_no}</span>
<h1>${dto.b_title}</h1>
<span>${dto.b_writer}님이 ${dto.b_regDate}에 작성</span>
<div style="border: 4px #448 solid; padding: 10px;">${dto.b_content}</div>

<button onclick="location.href='editPost?no=${dto.b_no}'">수정</button>
<button onclick="location.href='deletePost?no=${dto.b_no}'">삭제</button>

<ul id="commentList">
</ul>

<c:if test="${not empty sessionScope.login}">
<form id="commentForm" method="post" action="">
       <input type="hidden" name="c_writer" id="c_writer">
       <textarea name="content" id="content"></textarea>
       <button type="button" onclick="newCommentButtonClick()">댓글 쓰기</button>
</form>
</c:if>

</body>
</html>