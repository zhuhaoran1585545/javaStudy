<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setAttribute("amt", 11234.342);
		request.setAttribute("html", "<a href='index.html'>index</a>");
		request.setAttribute("now", new java.util.Date());
		request.setAttribute("nothing", null);
	%>
	
	<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:hh:ss:SSS"/>
	
	<h2>${amt }</h2>
	<fmt:formatNumber value="${amt }" pattern="￥0,000.00元"></fmt:formatNumber>
	<h2>null默认值是  <c:out value="${nothing }" default="无"></c:out></h2>
	<h2>
		<c:out value="${html }" escapeXml="true"></c:out>	
	</h2> 	
</body>
</html>