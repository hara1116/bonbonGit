package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.form.LoginForm;
import sa.bonbon.service.LoginService;

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
    		// 存在チェック
    		count =loginService.login(loginForm.adminCd,loginForm.password);
    		// 従業員名の取得
    		if (count != 0) {
    			loginForm.adminName = loginService.getAdminName(loginForm.adminCd);
    		}

    		if(count == 0){
        		message = "登録されていません";
    			return "login.jsp";
    		}
    	} catch (Exception e) {
    		return "/error/SystemError.jsp";
    	}

		return "/masterMenu/index.jsp";
    }
}