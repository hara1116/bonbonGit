package sa.bonbon.form;

import org.seasar.struts.annotation.Required;

public class EmployeeRegistForm {

	/** 従業員CD */
	@Required
	public String adminCd;
	/** パスワード */
	@Required
	public String password;
	/** 社員CD */
	@Required
	public String employeeCd;
	/** 名前 */
	@Required
	public String employeeName;
	/** 生年月日 */
	@Required
	public String birthDay;
	/** 所属店舗 */
	@Required
	public String shozokuShop;
	/** 電話番号 */
	@Required
	public String telNo;
	/** 性別 */
	@Required
	public String sex;

}