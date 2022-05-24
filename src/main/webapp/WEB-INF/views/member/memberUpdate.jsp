<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member update</title>
</head>
<body>
<button onclick="location.href='/'">HOME</button>

<h1>${dto.m_id}님의 정보 고치기</h1>
<form method="post" action="memberUpdate">
	<table>
		<tr><th>비번</th><td><input type="text" name="m_pw" value="${dto.m_pw}"></td></tr>
		<tr><th>주소</th><td><input type="text" name="m_address" value="${dto.m_address}"></td></tr>
	</table>
	<input type="hidden" name="no" value="${dto.m_no}">
	<button type="submit">수정하기</button>
</form>
</body>
</html>