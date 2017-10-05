package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.form.LoginForm;

public class LoginAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected LoginForm loginForm;

	/**ログイン画面の実行メソッド*/
    @Execute(validator = false)
	public String index() {
        return "login.jsp";
	}

	/**従業員登録画面への遷移実行メソッド*/
    @Execute(validator = false)
	public String userregist() {
        return "/userregist/index.jsp";
	}

	/**ログイン画面の実行メソッド*/
    @Execute(validator = false)
	public String masterMenu() {
        return "/masterMenu/index.jsp";
	}
}