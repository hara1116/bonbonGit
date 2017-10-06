<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<title>店舗登録画面</title>
</head>
<body>
<div align="right">
	<s:form method="POST">
    	<html:submit property="userRegistration" value="登録" />
    	<input type="button" value="閉じる" onClick="window.close()"  />
		<div align="center">
			<h1>従業員登録</h1>
			<table border="0">
				<caption>${f:h(message)}</caption>
				<tr>
					<td>ログインID<td>
					<td><html:text maxlength="10" property="adminCd" /></td>
				</tr>
				<tr>
					<td>パスワード<td>
					<td><html:password maxlength="10" property="password" /></td>
				</tr>
				<tr>
					<td>名前<td>
					<td><html:text maxlength="10" property="adminName" /></td>
				</tr>
				<tr>
					<td>電話番号<td>
					<td><html:text maxlength="10" property="telNo" /></td>
				</tr>
			</table>
		</div>
	</s:form>
</div>
</body>
</html>