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
<form method="post" action="/book/update"id="#frm">
<input type="hidden" name="b_num" value="${book.m_bum}">
<table border="1">
<tr>
<td>번호</td>
<td>${book.b_num}</td>
</tr>
<tr>
<td>도서명</td>
<td><input type="text" name="b_name" value="${book.b_name}"></td>
</tr>
<tr>
<td>저자명</td>
<td><input type="text" name="b_title" value="${book.b_title}"></td>
</tr>
<tr>
<td>설명</td>
<td><input type="text" name="b_credat" value="${book.b_credat}"></td>
</tr>
<tr>
<td>출판일</td>
<td>${book.b_credat}</td>
</tr>
<tr>
     <th colspan="2"><button>수정</button><button type="button" onclick="doDelete()">삭제</button></th>
</tr>
</table>
</form>
<script>
function doDelete(){
	var formObj = document.querySelector('#frm');
	formObj.action = '/book/delete';
	formObj.submit();
}
</script>
</body>
</html>