<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>ログイン画面</title>
</head>
<body>
    <div align="center">
    	<div align="right">
    		<s:submit property="userRegist" value="従業員登録" />
    	</div>
    	<br>
    	<br>
    	<br>
	<h1>カラオケBonBon管理システム</h1>
		<s:form method="POST">
			ログインID:<html:text maxlength="10" property="userId" /><br>
			パスワード:<html:password maxlength="10" property="password" /><br>
			<html:submit property="masterMenu" value="ログイン"/>
		</s:form>
	</div>
</body>
</html>