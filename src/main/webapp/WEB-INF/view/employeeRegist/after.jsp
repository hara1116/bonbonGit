<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<title>社員登録画面</title>
</head>
<body>
<div align="right">
	<s:form method="POST">
    	<html:submit property="employeeRegist" value="続けて登録" />
    	<input type="button" value="閉じる" onClick="window.close()"  />
		<div align="center">
			<html:errors />
			<h1>社員登録</h1>
			${f:h(message)}
			<table border="2">
				<tr>
					<td>社員CD</td>
					<td><html:text maxlength="10" property="employeeCd" disabled="true" /></td>
				</tr>
				<tr>
					<td>名前</td>
					<td><html:text maxlength="32" property="employeeName" disabled="true" /></td>
				</tr>
				<tr>
					<td>所属店舗</td>
					<td><html:text maxlength="8" property="shozokuShop" disabled="true" /></td>
				</tr>
				<tr>
					<td>生年月日</td>
					<td><html:text maxlength="8" property="birthDay" disabled="true" /></td>
				</tr>
				<tr>
					<td>性別</td>
					<td>男性：<html:radio property="sex" value="1" disabled="true"/>女性：<html:radio property="sex" value="2" disabled="true"/></td>
				</tr>
			</table>
		</div>
		<html:hidden property="adminCd" />
	</s:form>
</div>
</body>
</html>