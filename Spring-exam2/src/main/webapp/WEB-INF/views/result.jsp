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
	<p>検索結果</p>
	<p>${fn:escapeXml(name)}が下記の商品を選択しました。  </p>
	<p>商品:${fn:escapeXml(product.getProductName())}</p>
	<p>金額:${fn:escapeXml(product.getPrice())}</p>
	<a href="index">戻る</a>
</body>
</html>
