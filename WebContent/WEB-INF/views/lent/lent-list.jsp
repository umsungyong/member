<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>대여번호</th>
			<th>대여일자</th>
			<th>반납일자</th>
			<th>대여자</th>
			<th>대여도서</th>
		</tr>
		<c:forEach items="LentList" var="lent">
		<tr>
		  <td>${Lent.l_num}</td>
		  <td>${Lent.l_lentdate}</td>
		  <td>${Lent.l_recdate}</td>
		  <td>${Lent.l_num}</td>
		  <td>${Lent.l_num}</td>
		  <td>${lent.b_title}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>