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
<script>
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		console.log(formObj);
		$(".modBtn").on("click", function() {
			formObj.submit();
		});
		$(".cancelBtn").on("click", function() {
			history.go(-1);
		});
		$(".listBtn").on("click", function() {
			self.location = "${path}/register/list"
		});
	});

	
</script>
</head>
<body>
	<div class="col-lg-12">
		<form role="form" id="writeForm" method="post" action="${path}/register/modify">
			<div class="card">
				<div class="card-header">
					<h3 class="card-title">게시글 작성</h3>
				</div>
				<div class="card-body">
					<input type="hidden" name="register_no" value="${register.register_no}">
					<div class="form-group">
						<label for="title">제목</label> <input class="form-control" id="title" name="title" placeholder="제목을 입력해주세요"
							value="${register.title}">
					</div>
					<div class="form-group">
						<label for="content">내용</label>
						<textarea class="form-control" id="content" name="content" rows="30" placeholder="내용을 입력해주세요" style="resize: none;">${register.content}</textarea>
					</div>
					<div class="form-group">
						<label for="writer">작성자</label> <input class="form-control" id="writer" name="writer" value="${register.writer}" readonly>
					</div>
				</div>
				<div class="card-footer">
					<button type="button" class="btn btn-primary">
						<i class="fa fa-list"></i> 목록
					</button>
					<div class="float-right">
						<button type="button" class="btn btn-warning cancelBtn">
							<i class="fa fa-trash"></i> 취소
						</button>
						<button type="submit" class="btn btn-success modBtn">
							<i class="fa fa-save"></i> 수정 저장
						</button>
				  </div>
				</div>
			</div>
		</form>
	</div>



</body>
</html>