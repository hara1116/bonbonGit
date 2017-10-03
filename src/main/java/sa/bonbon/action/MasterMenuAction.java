package sa.bonbon.action;

import javax.annotation.Resource;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.ActionForm;

import sa.bonbon.form.MasterMenuForm;
import sa.bonbon.dto.MasterMenuDto;
import sa.bonbon.service.MasterMenuService;
public class MasterMenuAction {

	@ActionForm
	@Resource
	protected MasterMenuForm loginForm;

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

}