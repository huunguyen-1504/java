<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<form method="post">
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Mã khoáng sản</label>
	    <input type="text" name="maks" class="form-control" id="exampleFormControlInput1" value="${ks.getMaks()}">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput2">Tên ks</label>
	    <input type="text" name="tenks" class="form-control" id="exampleFormControlInput2" value="${ks.getTenKS()}">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput3">Số lượng</label>
	    <input type="number" name="soluong" class="form-control" id="exampleFormControlInput3" value="${ks.getSoLuong()}">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput4">Tên mỏ khoáng sản</label>
	    <input type="text" name="tenmoks" class="form-control" id="exampleFormControlInput4" value="${ks.getTenMoKS()}">
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlInput5">Tên tỉnh</label>
	    <input type="text" name="tentinh" class="form-control" id="exampleFormControlInput5" value="${ks.getTenTinh()}">
	  </div>
	  
	  <button type="submit" class="btn btn-primary mb-2">Thêm</button>
	</form>
</body>
</html>