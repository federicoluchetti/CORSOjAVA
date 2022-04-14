<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
UTENTE: <c:out value="${username}"></c:out>
QUANTITÀ: <c:out value="${quantità}"></c:out>
TAGLIO: <c:out value="${taglio}"></c:out>
</body>
</html>