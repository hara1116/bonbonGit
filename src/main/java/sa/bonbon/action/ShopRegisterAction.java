package sa.bonbon.action;

import javax.annotation.Resource;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.ActionForm;

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
    @Execute(validator = false)
	public String shopInsert() {
    	shopRegisterService.shopRegistration(shopRegisterForm.shopCd, shopRegisterForm.shopName,
    			shopRegisterForm.eriaCd, shopRegisterForm.postNo, shopRegisterForm.address);
    	return "index.jsp";
	}

}
