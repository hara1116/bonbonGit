package sa.bonbon.form;

import org.seasar.struts.annotation.Required;

import antlr.collections.List;

public class ShopRegisterForm {

	/** 店舗CD */
	@Required
	public String shopCd;
	/** 店舗名称 */
	@Required
	public String shopName;
	/** 地区コード */
	@Required
	public String eriaCd;
	/** 郵便番号 */
	@Required
	public String postNo;
	/** 住所 */
	@Required
	public String address;

}