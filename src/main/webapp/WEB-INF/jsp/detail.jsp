<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>馆藏数量</td>
    </tr>
        <tr>
            <td>${book.bookId}</td>
            <td><a href="/ssm/book/${book.bookId}/detail">${book.name}</a></td>
            <td>${book.number}</td>

        </tr>
</table>
<div>
    <a href="/ssm/book/list">Book List</a>
</div>
</body>
</html>
