<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>店舗登録画面</title>
</head>
<body>
<div align="right">
	<s:form method="POST">
    	<input type="button" value="閉じる" onClick="window.close()"  />
		<div align="center">
		<html:errors />
		<h1>店舗登録</h1>
			${f:h(message)}
			<table border="2">
				<tr>
					<td>店舗CD</td>
					<td><html:text maxlength="10" property="shopCd"/></td>
				</tr>
				<tr>
					<td>店舗名称</td>
					<td><html:text maxlength="24" property="shopName"/></td>
				</tr>
				<tr>
					<td>地区CD</td>
					<td><html:text maxlength="3" property="eriaCd"/></td>
				</tr>
				<tr>
					<td>郵便番号</td>
					<td><html:text maxlength="7" property="postNo"/></td>
				</tr>
				<tr>
					<td>住所</td>
					<td><html:text maxlength="64" property="address"/></td>
				</tr>
			</table><br>
			<html:submit property="shopInsert" value="登録" />
		</div>
		<html:hidden property="adminCd" />
	</s:form>
</div>
</body>
</html>