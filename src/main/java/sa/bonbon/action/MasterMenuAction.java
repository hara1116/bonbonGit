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
     * ログアウト
     * @return
     */
    @Execute(validator = false)
	public String logout() {
        return "/login/login.jsp";
	}

}