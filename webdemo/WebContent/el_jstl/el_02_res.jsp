<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_02_res</title>
</head>
<body>
	<%
 //scriprlet
 String data = request.getParameter("data");
 out.print("<p>" + data + "</p>");
%>

	<p><%= data %></p>

	<p>${ param.data}</p>
	<%-- 파라미터명 변수 아님 --%>

<%
    String[]chk = request.getParameterValues("chk");
    if(chk != null){
    for(String sc : chk)
    	out.print("<p>" + sc + "</p>");
   }
%>

<p>${paramValues.chk[0]}</p>
<p>${paramValues.chk[1]}</p>
<p>${paramValues.chk[2]}</p> <%-- 넘어오는 값이 없어도 오류 안남 --%>
<%-- 
<p>부산</p>
<p>대전</p>
<p></p> 비어있는 p로 나옴 --%>

</body>
</html>