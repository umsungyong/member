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
   <td>책이름<td>
   <td>작가<td>
   <td>빌린일</td>
   <td>비고</td>
</tr>
   <c:forEach items="${bookList}" var="book">
   <tr>
           <td><a href="/book/view?b_num>${book.b_num}">${book.b_title}</a></td>
           <td>${book.b_eser}</td>
           <td>${book.b_creat}</td>
           <td>${book.b_desc}</td>
   </tr>
</c:forEach>
</table>
<a href="/views/book/book-insert"><button>회원추가</button></a>
</body>
</html>