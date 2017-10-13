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
    	<html:submit property="employeeRegistration" value="登録" />
    	<input type="button" value="閉じる" onClick="window.close()"  />
		<div align="center">
			<h1>社員登録</h1>
			<html:errors />
			${f:h(message)}
			<table border="2">
				<tr>
					<td>社員CD</td>
					<td><html:text maxlength="10" property="employeeCd" /></td>
				</tr>
				<tr>
					<td>パスワード</td>
					<td><html:text maxlength="10" property="password" /></td>
				</tr>
				<tr>
					<td>名前</td>
					<td><html:text maxlength="32" property="employeeName" /></td>
				</tr>
				<tr>
					<td>電話番号</td>
					<td><html:text maxlength="10" property="telNo" /></td>
				</tr>
				<tr>
					<td>所属店舗</td>
					<td><html:text maxlength="8" property="shozokuShop" /></td>
				</tr>
				<tr>
					<td>生年月日</td>
					<td><html:text maxlength="8" property="birthDay" /></td>
				</tr>
				<tr>
					<td>性別</td>
					<td>男性：<html:radio property="sex" value="1"/>女性：<html:radio property="sex" value="2"/></td>
				</tr>
			</table>
		</div>
		<html:hidden property="adminCd" />
	</s:form>
</div>
</body>
</html>