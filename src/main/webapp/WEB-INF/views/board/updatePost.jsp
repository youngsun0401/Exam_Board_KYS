<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script></head>
<body>
<button onclick="location.href='/'">HOME</button>

<form id="form" method="post" action="editPost">
	<input type="hidden" name="b_no" value="${post.b_no}">
	제목: <input type="text" name="b_title" value="${post.b_title}">
	<textarea name="b_content">${post.b_content}</textarea>
	작성자<input type="hidden" name="b_writer" id="writer" value="${post.b_writer}">
	<button type="button" onclick="mysubmit()">다썼다!</button>
</form>

<script>
function mysubmit(){
	$('#writer').val('${sessionScope.login}');
	$('#form').submit();
}
</script>

</body>
</html>