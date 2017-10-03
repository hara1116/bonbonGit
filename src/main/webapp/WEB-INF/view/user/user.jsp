<%@page pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8">
        <title>従業員登録画面</title>
    </head>
    <body>
        <h1 align="center">従業員登録</h1>
        <hr>
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
        <div align="center">
                <table table border="0" width="500"  cellspacing="0" cellpadding="3" bordercolor="#333333">
                    	<caption>入力フォーム</caption>
                <form action="list.html" method="get">
                    <tr>
                        <th  align = "right"height="20">
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
                    <tr>
                        <th align = "right">
                            名前：
                        </th>
                        <td>
                            <input type="text" name="name" value="" size="24">
                        </td>
                    </tr>
                    <tr>
                        <th  align = "right">
                            電話番号：
                        </th>
                        <td>
                            <input type="text" name="callnomber" value="" size="24">
                        </td>
                    </tr>
                    <tr>
                    </tr>
                </form>
            </table>
        </div>
        こんにちは、${f:h(name)}さん！
    </body>
</html>