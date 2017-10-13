package sa.bonbon.form;

import org.seasar.struts.annotation.Required;

public class UserregistForm {

	/** 従業員CD */
	@Required
	public String adminCd;
	/** パスワード */
	@Required
	public String password;
	/** 名前 */
	@Required
	public String adminName;
	/** 電話番号 */
	@Required
	public String telNo;
}