<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演習課題2 発展 ログイン画面</title>
</head>
<body>
	<form:form action="menu" modelAttribute="index">
		<p>ログインID:<form:input path="loginId" /></p>
		<p>パスワード:<form:password path="password" /></p>
		<form:button>送信</form:button>
	</form:form>
</body>
</html>
