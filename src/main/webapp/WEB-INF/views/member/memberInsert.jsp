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

<h1>회원 가입</h1>
<form action="/memberInsert" method="post">
	아이디: <input type="text" name="m_id" id="m_id"><br>
	비밀번호: <input type="password" name="m_pw" id="m_pw"><br>
	주소: <input type="text" name="m_address" id="m_addr"><br>
	<input type="submit" name="" value="가입하기">
</form>

</body>
</html>