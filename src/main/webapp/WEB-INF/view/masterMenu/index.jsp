<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script>
$(function() {
	// 1.ボタン1が押されたときの動作
	$("#id1").click(function() {
		$("#profile").dialog({
			modal:true, //モーダル表示
			height: 260,
			width: 550,
			title:"プロフィール情報", //タイトル
			buttons: { //ボタン
			"確認": function() {
				$(this).dialog("close");
				},
			"キャンセル": function() {
				$(this).dialog("close");
				}
			}
		});
	});
});

</script>
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
		<p align="left">従業員CD:TEST000001</p>
		<p align="left">従業員名:テスト 太郎</p>
			<div align="left">
			<s:form method="POST"><html:submit property="logout" value="ログアウト"/></s:form>
			</div>
	<br>
		<div Align="left">
			<a href="i${f:url('/images/office.gif')}" data-lightbox="オフィス"><img src=${f:url('/images/office.gif')} width="300" height="320"/></a>
		</div>
	</div>

	<!-- コンテンツ（中央と右の2カラム） -->
	<div id="content">
		<!-- ニュース（中央カラム） -->
		<div id="news">
			<div Align="center">
			<h2>MENU一覧</h2>
			</div>
			<div class="nav" align="center">
			<s:form method="POST">
			<span style="cursor: hand; cursor:pointer;">
				<ul class="nl">
				<li><a href="#">・社員登録</a></li><br>
				<li><a onclick="window.open('/bonbon/shopRegister/shopRegister', '店舗登録', 'width=800,height=700');">・店舗登録</a></li><br>
				<li><a href="#">・社員検索</a></li><br>
				<li><a href="#">・店舗検索</a></li><br>
				</ul>
			</span>
			</s:form>
			</div>
		</div>
	</div>
	<!-- フッタ -->
	<div id="footer"><address>Copyright (c) SA CONSULTING All Rights Reserved.</address></div>
</div>
</body>
</html>