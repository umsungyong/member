<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/views/Common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/member/update" id="#frm">
<input type="hidden" name="m_num" value="${member.m_num}">
 <table border="1">
<tr>
<td>번호</td>
<td>${member.m_num}</td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" name="m_name" value="${member.m_name}"></td>
</tr>
<tr>
<td>아이디</td>
<td><input type="text" name="m_id" value="${member.m_id}"></td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="text" name="m_pwd" value="${member.m_pwd}"></td>
</tr>

<tr>
<td>가입일</td>
<td>${member.m_joindate}</td>
</tr>
<tr>
     <th colspan="2"><button>수정</button><button type="button" onclick="doDelete()">삭제</button></th>
</tr>
</table>
</form>
<script>
function doDelete(){
	var formObj = document.querySelector('#frm');
	formObj.action = '/member/delete';
	formObj.submit();
}
</script>
</body>
</html>