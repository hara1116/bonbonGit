package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.dto.UserregistDto;
import sa.bonbon.form.UserregistForm;
import sa.bonbon.service.UserregistService;

public class UserregistAction {
	/** アクションフォーム */
	@Resource
	@ActionForm
	protected UserregistForm userregistForm;

	/** Dto */
	@Resource
	public UserregistDto userregistDto;

	/** Service */
	@Resource
	protected UserregistService userregistService;

	/** 登録処理後のメッセージ */
	public String message;

	/** 初期表示 */
	@Execute(validator = false)
	public String userregist() {
		return "index.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = true, input = "index.jsp")
	public String userRegistration() throws Exception {
		try {
			userregistService.userRegistration(userregistForm);
			message = "登録が完了しました。";
			return "after.jsp";
		} catch (Exception e) {
			message = "登録に失敗しました。";
			return "index.jsp";
		}
	}
}