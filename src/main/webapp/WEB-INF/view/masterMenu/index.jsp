<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${f:url('/css/mastermenu.css')}" />
<title>カラオケBonBon管理システム</title>
</head>
<body>
<div id="pagebody">
	<!-- ヘッダ -->
	<div id="header"><h1><a href="index.jsp">カラオケBonBonマスタ管理</a></h1></div>

	<!-- サブメニュー（左カラム） -->
	<div id="submenu">
		<div align="left">
			<s:form method="POST"><html:submit property="logout" value="ログアウト"/></s:form>
			<table border="0">
				<tr>
					<td align="right">従業員CD:</td>
					<td>${f:h(adminCd)}</td>
				</tr>
				<tr>
					<td align="right">従業員名:</td>
					<td>${f:h(adminName)}</td>
				</tr>
			</table>
		</div>
		<div Align="left">
			<img src=${f:url('/images/office.gif')} width="300" height="320"/>
		</div>
	</div>

	<div id="content">
		<!-- MENU一覧（メインカラム） -->
		<div id="main">
			<div Align="center">
				<h2>MENU一覧</h2>
			</div>
			<div class="nav" align="center">
				<s:form method="POST">
					<span style="cursor: hand; cursor:pointer;">
						<ul class="nl">
							<html:hidden property="adminCd" value="${f:h(adminCd)}"/>
							<li><a onclick="window.open('/bonbon/employeeRegist/employeeRegist?adminCd=${f:h(adminCd)}', '社員登録', 'width=500,height=500');">・社員登録</a></li><br>
							<li><a onclick="window.open('/bonbon/shopRegister/shopRegister?adminCd=${f:h(adminCd)}', '店舗登録', 'width=500,height=500');">・店舗登録</a></li><br>
							<li><a onclick="window.open('/bonbon/employeeSearch/employeeSearch?adminCd=${f:h(adminCd)}', '社員検索', 'width=1000,height=600');">・社員検索</a></li><br>
							<li><a onclick="window.open('/bonbon/shopSearch/shopSearch?adminCd=${f:h(adminCd)}', '店舗検索', 'width=1000,height=600');">・店舗検索</a></li><br>
						</ul>
					</span>
				</s:form>
			</div>
		</div>
	</div>

	<!-- フッタ -->
	<div id="footer">
		<address>Copyright (c) SA CONSULTING All Rights Reserved.</address>
	</div>
</div>
</body>
</html>