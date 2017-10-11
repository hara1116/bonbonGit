<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<title>ログイン画面</title>
</head>
<body>
    <div align="center">
    	<div align="right">
		<s:form method="POST">
    		<s:submit value="従業員登録" onclick="window.open('/bonbon/userregist/userregist', '店舗登録', 'width=500,height=500');"/>
    	</s:form>
    	</div>
    	<br>
    	<br>
    	<br>
	<h1>カラオケBonBon管理システム</h1>
		<s:form method="POST">
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
			</table>
			<br>
			<html:submit property="masterMenu" value="ログイン"/>
			<html:hidden property="adminName"/>
		</s:form>
	</div>
</body>
</html>