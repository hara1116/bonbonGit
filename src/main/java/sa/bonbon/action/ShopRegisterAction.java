package sa.bonbon.action;

import javax.annotation.Resource;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.util.ActionMessagesUtil;
import org.seasar.struts.util.MessageResourcesUtil;

import sa.bonbon.form.ShopRegisterForm;
import sa.bonbon.dto.ShopRegisterDto;
import sa.bonbon.service.ShopRegisterService;

public class ShopRegisterAction {

	@ActionForm
	@Resource
	protected ShopRegisterForm shopRegisterForm;

	@Resource
	public ShopRegisterDto shopRegisterDto;

	@Resource
	protected ShopRegisterService shopRegisterService;

	public String message;
	/**
	 * 初期表示
	 * @return
	 */
    @Execute(validator = false)
	public String shopRegister() {
        return "index.jsp";
	}

    /**
     * 登録処理
     * @return
     */
    @Execute(validator = true, input="index.jsp")
	public String shopInsert() {
    	shopRegisterService.shopRegistration(shopRegisterForm);
    	message = "登録が完了しました。";
    	return "after.jsp";
	}
}
