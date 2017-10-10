package sa.bonbon.action;

import javax.annotation.Resource;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.ActionForm;

import sa.bonbon.form.MasterMenuForm;
import sa.bonbon.dto.MasterMenuDto;
import sa.bonbon.service.MasterMenuService;

/**
 * マスタ管理メニューのアクション
 * @author t.hara
 *
 */
public class MasterMenuAction {

	@ActionForm
	@Resource
	protected MasterMenuForm masterMenuForm;

	@Resource
	public MasterMenuDto masterMenuDto;

	@Resource
	protected MasterMenuService masterMenuService;

	/**
	 * 初期表示
	 * @return
	 */
    @Execute(validator = false)
	public String masterMenu() {
        return "index.jsp";
	}

    /**
     * ログアウト
     * @return
     */
    @Execute(validator = false)
	public String logout() {
        return "/login/login.jsp";
	}

    /**
     * 店舗登録画面を開く
     * @return
     */
    @Execute(validator = false)
	public String shopRegister() {
        return "/shopRegister/index.jsp";
	}
    /**
     * 社員登録画面を開く
     * @return
     */
    @Execute(validator = false)
	public String employeeRegist() {
        return "/employeeRegist/index.jsp";
	}

}