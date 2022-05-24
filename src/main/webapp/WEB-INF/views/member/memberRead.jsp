<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member read</title>
</head>
<body>
<button onclick="location.href='/'">HOME</button>

<h1>${dto.m_id}님의 정보</h1>
<table>
	<tr><th>번호</th><td>${dto.m_no}</td></tr>
	<tr><th>비번</th><td>${dto.m_pw}</td></tr>
	<tr><th>주소</th><td>${dto.m_address}</td></tr>
	<tr><th>등록일</th><td>${dto.m_regDate}</td></tr>
</table>
<button onclick="location.href='/memberUpdate?no=${dto.m_no}'">수정하기</button>
</body>
</html>