<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách khoáng sản</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<h1>Nguyễn Chung Hữu</h1>
	<a href="/add"><button type="button" class="btn btn-success">Add</button></a>

	<form action="./search" method="get">
		<input type="text" name="key">
		<input type="submit" value="Search">
	</form> 

	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th scope="col">Mã khoáng sản</th>
				<th scope="col">Tên khoáng sản</th>
				<th scope="col">Số lượng</th>
				<th scope="col">Tên mỏ khoáng sản</th>
				<th scope="col">Tên Tỉnh</th>
				<th scope="col">Lưu ý</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ks" items="${list}">
				<tr>
					<th scope="row">${ks.getMaks()}</th>
					<td>${ks.getTenKS()}</td>
					<td>${ks.getSoLuong()}</td>
					<td>${ks.getTenMoKS()}</td>
					<td>${ks.getTenTinh()}</td>
					
					<td>${ (ks.getTenTinh() == 'Lai Châu' && ks.getSoLuong() > 10000)   ? 'Đặc biệt' : 'Bình thường'}</td>
					
					<td><a href="del/${ks.getMaks()}"
					onclick="if(!(confirm('Are you sure you want to delete this item?'))) return false">Xóa</a>
					|<a href="update/${ks.getMaks()}">Sửa</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>