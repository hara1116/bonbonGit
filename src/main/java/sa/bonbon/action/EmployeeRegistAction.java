package sa.bonbon.action;

import javax.annotation.Resource;

import org.h2.util.StringUtils;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.dto.ShopRegisterDto;
import sa.bonbon.dto.UserregistDto;
import sa.bonbon.form.UserregistForm;
import sa.bonbon.service.UserregistService;

public class EmployeeRegistAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected UserregistForm userregistForm;

	/**Dto*/
	@Resource
	public UserregistDto userregistDto;

	/**Service*/
	@Resource
	protected UserregistService userregistService;

	/**登録処理後のメッセージ*/
	public String message;

	/**初期表示*/
    @Execute(validator = false)
	public String userregist() {
        return "index.jsp";
	}
    /**
     * 登録処理
     * @return
     */
    @Execute(validator = true, input="index.jsp")
	public String userRegistration() throws Exception{

    	//ログインID
		if(StringUtils.isNullOrEmpty(userregistForm.adminCd)){
    		message = "ログインIDが入力されていません";
			return "index.jsp";
		}
    	//パスワード
		if(StringUtils.isNullOrEmpty(userregistForm.password)){
    		message = "パスワードが入力されていません";
			return "index.jsp";
		}
    	//名前
		if(StringUtils.isNullOrEmpty(userregistForm.adminName)){
    		message = "名前が入力されていません";
			return "index.jsp";
		}
    	//電話番号
		if(StringUtils.isNullOrEmpty(userregistForm.telNo)){
    		message = "電話番号が入力されていません";
			return "index.jsp";
		}
    	try {
    		userregistService.userRegistration(userregistForm);
    		message = "登録が完了しました。";
    		return "index.jsp";
    	} catch (Exception e) {
    		message = "登録に失敗しました。";
    		return "index.jsp";
    	}
    }
}