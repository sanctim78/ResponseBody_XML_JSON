<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
<h3>인덱스 페이지 입니다.</h3>
<ul>
	<li><a href="json01.do">json응답</a></li>
	<li><a href="json02.do">json응답2</a></li>
	<li><a href="json03.do">json응답3</a></li>
	<li><a href="json04.do">json응답4</a></li>
	<li><a href="json05.do">json응답5</a></li>
	<li><a href="json06.do">json응답6</a></li>
		<li><a href="json07.do">json응답7</a></li>
		<li><a href="json08.do">json응답8</a></li>
	
</ul>
<h4>공지사항</h4>
<ul>
	<c:forEach var="tmp" items="${noticeList }">
		<li>${tmp }</li>
	</c:forEach>
</ul>
</body>
</html>





