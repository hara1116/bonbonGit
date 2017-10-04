package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.form.UserregistForm;

public class UserregistAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected UserregistForm userregistForm;

	/**入力画面の実行メソッド*/
    @Execute(validator = false)
	public String index() {
        return "userregist.jsp";
	}
}