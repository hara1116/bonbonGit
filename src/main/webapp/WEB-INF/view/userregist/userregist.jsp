<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>従業員登録画面</title>
</head>
<body>
    <div align="center">
    	<div align="right">
		<s:form method="POST">
        <table table border="0" wtable align="right" idth="100"  cellspacing="0" cellpadding="3" bordercolor="#333333">
            <tr>
                <th>
                    <input type="submit" value="登録">
                </th>
                <th>
                    <input type="submit" value="閉じる" onClick="window.close()">
                </th>
                </tr>
        </table>
    	</s:form>
    	</div>
    	<br>
    	<br>
    	<br>
	<h1>従業員登録</h1>
		<s:form method="POST">
			入力ファーム
			<br>
			ログインID:<html:text maxlength="10" property="adminCd" /><br>
			パスワード:<html:password maxlength="10" property="password" /><br>
			名前:<html:password maxlength="10" property="adminName" /><br>
			電話番号:<html:password maxlength="10" property="telNo" /><br>
			<html:submit property="masterMenu" value="ログイン"/>
		</s:form>
	</div>
</body>
</html>