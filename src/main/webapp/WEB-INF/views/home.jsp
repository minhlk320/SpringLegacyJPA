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
		<ul>ddt
			<li><a href="${pageContext.request.contextPath }/tacpham">Danh
					sách</a></li>
			<li><a href="${pageContext.request.contextPath }/tacpham/add">Thêm
					tác phẩm mới</a></li>
			<li><a href="${pageContext.request.contextPath }/quanly">Chức
					năng quản lý</a></li>
		</ul>
	</nav>
	<div class="container">
		<div class="row">
			<table class="table">
				<thead>
					<th scope="col">Mã Tác Phẩm</th>
					<th scope="col">Tên Tác Phẩm</th>
					<th scope="col">Last</th>
					<th scope="col">Handle</th>
				</thead>
			</table>
		</div>
	</div>
	<footer class="footer">
		<span>@2018 Nhà sách Nhã Nam. All Rights Reserved.</span>
	</footer>
</body>
</html>
