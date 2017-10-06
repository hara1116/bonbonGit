<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${f:url('/css/mastermenu.css')}" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/lightbox.css')}">
<script src="${f:url('/js/lightbox.min.js')}"></script>
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
			従業員CD:${f:h(adminCd)}<br>
			従業員名:${f:h(adminName)}
		</div>
		<div Align="left">
			<a href="i${f:url('/images/office.gif')}" data-lightbox="オフィス"><img src=${f:url('/images/office.gif')} width="300" height="320"/></a>
		</div>
	</div>

	<div id="content">
		<!-- MENU一覧（中央カラム） -->
		<div id="news">
			<div Align="center">
				<h2>MENU一覧</h2>
			</div>
			<div class="nav" align="center">
				<s:form method="POST">
					<span style="cursor: hand; cursor:pointer;">
						<ul class="nl">
							<html:hidden property="adminCd" value="${f:h(adminCd)}"/>
							<li><a href="#">・社員登録</a></li><br>
							<!--  <li><a onclick="window.open('/bonbon/shopRegister/shopRegister', '店舗登録', 'width=500,height=500');">・店舗登録</a></li><br> -->
							<li><a property="shop">・店舗登録</a></li><br>
							<li><a href="#">・社員検索</a></li><br>
							<li><a href="#">・店舗検索</a></li><br>
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