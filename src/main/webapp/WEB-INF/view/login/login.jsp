<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
    <div align="center">
    	<div align="right">
		<s:form method="POST">
    		<li><a onclick="window.open('/bonbon/userregist/index', '店舗登録', 'width=500,height=500');">・店舗登録</a></li><br>
    	</s:form>
    	</div>
    	<br>
    	<br>
    	<br>
	<h1>カラオケBonBon管理システム</h1>
		<s:form method="POST">
			ログインID:<html:text maxlength="10" property="adminCd" /><br>
			パスワード:<html:password maxlength="10" property="password" /><br>
			<br>
			<html:submit property="masterMenu" value="ログイン"/>
		</s:form>
	</div>
</body>
</html>