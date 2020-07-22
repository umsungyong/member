<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>이름</td>
			<td>아이디</td>
			<td>패스워드</td>
			<td>가입일</td>
		</tr>
		<c:forEach items="${memberList}" var="member">
			<tr>
				<td>%{member.m_name}</td>
				<td><a href="">${member.m_id}</a></td>
				<td>%{member.m_pwd}</td>
				<td>%{member.m_joindate}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>