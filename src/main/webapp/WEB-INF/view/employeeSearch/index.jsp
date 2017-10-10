<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">

<title>社員検索画面</title>
</head>
<body>
<div align="right">
	<s:form method="POST">
    	<html:submit property="employeeSearchImp" value="検索 "/>
    	<html:submit property="employeeInformation" value="社員情報" />
    	<input type="button" value="閉じる" onClick="window.close()"  />
		<div align="center">
			<h1>社員検索</h1>
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
				<tr>
					<td>性別<td>
					<td>男性：<html:radio property="sex" value="1"/>女性：<html:radio property="sex" value="2"/></td>
				</tr>
			</table>
			<s:submit value="社員検索" onclick="window.open('/bonbon/employeeInformation/employeeInformation', '社員検索', 'width=500,height=500');"/>
		</div>
	</s:form>
</div>
</body>
</html>