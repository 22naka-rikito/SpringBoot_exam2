<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演習課題2 基本</title>
</head>
<body>
	<form:form action="result" modelAttribute="index">
		<p>名前:<form:input path="name" /></p>
		<p>商品:<form:input path="productName" /></p>
		<form:button>送信</form:button>
	</form:form>
</body>
</html>
