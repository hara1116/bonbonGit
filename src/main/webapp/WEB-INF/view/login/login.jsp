<%@page pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8">
        <title>ログイン画面</title>
    </head>
    <body>
        <h1 align="center">カラオケBonBon管理システム</h1>
                        <s:submit property="userRegist" value="従業員登録" />
        <html:button property="userregist" value="従業員登録" style="position: absolute; right: 15px; top: 15px" />

        <div align="center">
            <form action="list.html" method="get">
                <table table border="0" width="500"  cellspacing="0" cellpadding="3" bordercolor="#333333">
                	<caption>ログイン</caption>
                    <tr>
                        <th align = "right">
                            ユーザID：
                        </th>
                        <td>
                            <input type="text" name="user_id" value="" size="24">
                        </td>
                    </tr>
                    <tr>
                        <th align = "right">
                            パスワード：
                        </th>
                        <td>
                            <input type="password" name="password" value="" size="24">
                        </td>
                    </tr>
                </table>
                <br>
                <input type="submit" value="ログイン" style="width:10%;">
            </form>
        </div>
        <s:form method="POST">
        お名前をどうぞ！
                <html:text property="name" />
                <s:submit property="userregist" value="送信" />
        </s:form>


    </body>
</html>