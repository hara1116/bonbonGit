package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.dto.ShopRegisterDto;
import sa.bonbon.dto.UserregistDto;
import sa.bonbon.form.UserregistForm;
import sa.bonbon.service.UserregistService;

public class UserregistAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected UserregistForm userregistForm;

	@Resource
	public UserregistDto userregistDto;

	@Resource
	protected UserregistService userregistService;

	/**入力画面の実行メソッド*/
    @Execute(validator = false)
	public String userregist() {
        return "index.jsp";
	}
    /**
     * 登録処理
     * @return
     */
    @Execute(validator = false)
	public String userRegistration() {
    	userregistService.userRegistration(userregistForm.adminCd, userregistForm.password,
    			userregistForm.adminName, userregistForm.telNo);
    	return "index.jsp";
	}
}