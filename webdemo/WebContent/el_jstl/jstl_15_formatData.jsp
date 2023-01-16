<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_15_formatData</title>
</head>
<body>
<c:set var="today" value="<%=new Date() %>" />
<p>${data}</p>

<p>
<!-- 2023. 1. 16. 오전 10:20:21 -->
<fmt:formatDate value="${today}" type="both" dateStyle="default" timeStyle="default"/>
</p>

<p>
<!-- 2023. 1. 16. 오전 10:20:21 -->
<fmt:formatDate value="${today}" type="both" dateStyle="medium" timeStyle="medium"/>
</p>

<p>
<!-- 23. 1. 16. 오전 10:20 -->
<fmt:formatDate value="${today}" type="both" dateStyle="short" timeStyle="short"/>
</p>

<p>
<!-- 2023년 1월 16일 오전 10시 20분 21초 KST -->
<fmt:formatDate value="${today}" type="both" dateStyle="long" timeStyle="long"/>
</p>

<p>
<!-- 2023년 1월 16일 월요일 오전 10시 20분 21초 대한민국 표준시 -->
<fmt:formatDate value="${today}" type="both" dateStyle="full" timeStyle="full"/>
</p>

</body>
</html>