<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ include file="/WEB-INF/views/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서명</title>
</head>
<body>
<table border="1">
<tr>
   <td>도서번호<td>
   <td>도서명<td>
   <td>저자명</td>
   <td>출판일</td>
</tr>
   <c:forEach items="${bookList}" var="book">
   <tr>    
           <td>${book.b_no}</td>
           <td><a href="/book/view/m_num">${book.b_no}">${book.b_title}</a></td>
           <td>${book.b_eser}</td>
           <td>${book.b_creat}</td>
           
   </tr>
</c:forEach>
</table>
</body>
</html>