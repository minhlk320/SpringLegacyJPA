<%@page import="java.util.ArrayList"%>
<%@page import="se.iuh.jpaExample.model.TacGia"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css">
</head>
<body>
	<nav class="navbar">
		<ul>
			<li><a href="${pageContext.request.contextPath }/tacpham">Danh Sach</a></li>
			<li><a href="${pageContext.request.contextPath }/tacpham/add">Then</a></li>
			<li><a href="${pageContext.request.contextPath }/quanly">Chuc nang quan ly</a></li>
		</ul>
	</nav>
	<div class="container">
		<div class="row">
			<c:forEach var="tghh" items="${list }">
				<c:forEach var="tp" items="${tghh.dstp}">
					<c:out value="${tp.ma }"></c:out>
					<img  src="data:image/jpeg;base64,${tp.hinh}">
				</c:forEach>
			</c:forEach> 
		</div>
	</div>
	<footer class="footer">
		<span>@2018 NhÃ  sÃ¡ch NhÃ£ Nam. All Rights Reserved.</span>
	</footer>
</body>
</html>
