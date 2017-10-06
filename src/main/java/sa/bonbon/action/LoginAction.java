package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.form.LoginForm;
import sa.bonbon.service.LoginService;
import sa.bonbon.service.UserregistService;

public class LoginAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected LoginForm loginForm;

	/**Service*/
	@Resource
	protected LoginService loginService;

	/**承認処理後のメッセージ*/
	public String message;

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
    	int count=0;
    	try {
    		count =loginService.login(loginForm.adminCd,loginForm.password);
    	} catch (Exception e) {
    		message = "検索に失敗しました。";
    		return "login.jsp";
    	}
		if(count == 0){
    		message = "登録されておりませんよ";
			return "login.jsp";
		}
		return "/masterMenu/index.jsp";
    }
}