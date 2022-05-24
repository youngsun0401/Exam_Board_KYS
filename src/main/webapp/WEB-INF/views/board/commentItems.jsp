<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:forEach var="commentItem" items="${comments}">
<li>
	<span class="c_writer">${commentItem.c_writer}</span>: 
	${commentItem.c_content}
	<span class="c_date">${commentItem.c_regDate}</span>
	<c:if test="${sessionScope.login == commentItem.c_writer}"><button type="button" onclick="commentDeleteBtn(${commentItem.c_id})">X</button></c:if>
</li>
</c:forEach>
	