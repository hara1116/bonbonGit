<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<title>社員情報画面</title>
</head>
<body>
<div align="right">
	<s:form method="POST">
    	<html:submit property="employeeRegistration" value="登録" />
    	<html:submit property="employeeSearch" value="閉じる" />
		<div align="center">
			<h1>社員情報変更</h1>
			<table border="0">
				<caption>${f:h(message)}</caption>
				<tr>
					<td>社員CD<td>
					<td><html:text maxlength="10" property="employeeCd" /></td>
				</tr>
				<tr>
					<td>名前<td>
					<td><html:text maxlength="10" property="employeeName" /></td>
				</tr>
				<tr>
					<td>所属店舗<td>
					<td><html:text maxlength="10" property="shozokuShop" /></td>
				</tr>
				<tr>
					<td>生年月日<td>
					<td><html:text maxlength="10" property="birthDay" /></td>
				</tr>
			</table>
		</div>
	</s:form>
</div>
</body>
</html>