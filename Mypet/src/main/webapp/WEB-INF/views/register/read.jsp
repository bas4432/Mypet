<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath}" />



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>AdminLTE 3 | Starter</title>
<!-- Font Awesome Icons -->
<link rel="stylesheet"
	href="/resources/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/resources/dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
<script type="text/javascript" src="/resources/js/jquery.js"></script>
<script type="text/javascript" src="/resources/js/jquery.form.js"></script>	
<script type="text/javascript">
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		console.log(formObj);
		$(".modBtn").on("click", function() {
			formObj.attr("action", "${path}/register/modify");
			formObj.attr("method", "get");
			formObj.submit();
		});
		$(".delBtn").on("click", function() {
			formObj.attr("action", "${path}/register/remove");
			formObj.submit();
		});
		$(".listBtn").on("click", function() {
			self.location = "${path}/register/list"
		});
	});
</script>
	

</head>

<body>
	<div class="col-lg-12">
		<div class="card">
			<div class="card-header">
				<h3 class="card-title">글제목 : ${register.title}</h3>
			</div>
			<div class="card-body" style="height: 700px">
				${register.content}</div>
			<div class="card-footer">
				<div class="user-block">
					<img class="img-circle img-bordered-sm"
						src="${path}/dist/img/user1-128x128.jpg" alt="user image"> <span
						class="username"> <a href="#">${register.writer}</a>
					</span> <span class="description"><fmt:formatDate
							pattern="yyyy-MM-dd" value="${register.regDate}" /></span>
				</div>
			</div>
			<div class="card-footer">
				<form role="form" method="post">
					<input type="hidden" name="register_no"
						value="${register.register_no}">
				</form>
				<button type="submit" class="btn btn-primary listBtn">
					<i class="fa fa-list"></i> 목록
				</button>
				<div class="float-right">
					<button type="submit" class="btn btn-warning modBtn">
						<i class="fa fa-edit"></i> 수정
					</button>
					<button type="submit" class="btn btn-danger delBtn">
						<i class="fa fa-trash"></i> 삭제
					</button>
				</div>
			</div>
		</div>
	</div>


</body>
</html>