<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_16_function</title>
</head>
<body>
<c:set var="str1" value="Functions" />
<c:set var="str2" value="java test" />

<p>${fn:length(str1)}</p>
<p>${fn:toUpperCase(str1)}</p>
<p>${fn:replace(str2, "java", "jsp")}</p>
<p>${fn:indexOf(str2, "a")}</p> <!-- a라는 문자열의 인덱스 값을 가져와라 -->
<p>${fn:contains(str1, stl2)}</p>
</body>
</html>
<!-- el파일 1~7번 파일 내용까지는 외워야함 -->