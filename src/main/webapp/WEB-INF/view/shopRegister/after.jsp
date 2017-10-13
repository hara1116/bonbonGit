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
		<html:submit property="shopRegister" value="続けて登録" />
    	<input type="button" value="閉じる" onClick="window.close()"  />
		<div align="center">
		<html:errors />
		<h1>店舗登録</h1>
			${f:h(message)}
			<table border="2">
				<tr>
					<td>店舗CD</td>
					<td><html:text maxlength="10" property="shopCd" value="${f:h(shopCd)}" disabled="true"/></td>
				</tr>
				<tr>
					<td>店舗名称</td>
					<td><html:text maxlength="24" property="shopName" value="${f:h(shopName)}" disabled="true"/></td>
				</tr>
				<tr>
					<td>地区CD</td>
					<td><html:text maxlength="3" property="eriaCd" value="${f:h(eriaCd)}" disabled="true"/></td>
				</tr>
				<tr>
					<td>郵便番号</td>
					<td><html:text maxlength="7" property="postNo" value="${f:h(postNo)}" disabled="true"/></td>
				</tr>
				<tr>
					<td>住所</td>
					<td><html:text maxlength="64" property="address" value="${f:h(address)}" disabled="true"/></td>
				</tr>
			</table>
		</div>
		<html:hidden property="adminCd" />
	</s:form>
</div>
</body>
</html>