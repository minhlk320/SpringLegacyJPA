<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
		<form:form method="POST" modelAttribute="tacpham" class="form"
			action="${pageContext.request.contextPath}/tacpham/submit" enctype="multipart/form-data">
			<div class="form-group">
				<label for="id">Ma</label>
				<form:input path="ma" id="id" type="text" class="form-control" />
				<form:errors path="ma" element="div" cssClass="text-danger" />
			</div>
			<div class="form-group">
				<label for="name">Name</label>
				<form:input path="ten" id="name" type="text" class="form-control" />
				<form:errors path="ten" element="div" cssClass="text-danger" />
			</div>
			<div class="form-group">
				<label for="tomtat">tomtat</label>
				<form:input path="tomtat" id="tomtat" type="text"
					class="form-control" />
				<form:errors path="tomtat" element="div" cssClass="text-danger" />
			</div>
			<div class="form-group">
				<label for="page">SoTrang</label>
				<form:input path="sotrang" id="page" type="text"
					class="form-control" />
				<form:errors path="sotrang" element="div" cssClass="text-danger" />
			</div>
			<div class="form-group">
				<label for="hinh">Hinh</label>
				<input id="hinh" name="file" type="file" accept="image/*"
					class="form-control" />
			</div>
			<form:select path="tacGia.ma" class="form-control">
					<form:options items="${listTG}"></form:options>
			</form:select>
			<div class="form-group">
				<button class="btn btn-success" type="submit">Save</button>
				<button class="btn btn-light" type="reset">Reset</button>
			</div>
		</form:form>
	</div>
	<footer class="footer">
		<span>@2018 Nhà sách Nhã Nam. All Rights Reserved.</span>
	</footer>
</body>
</html>
