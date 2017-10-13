package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.dto.EmployeeRegistDto;
import sa.bonbon.form.EmployeeRegistForm;
import sa.bonbon.service.EmployeeRegistService;

public class EmployeeRegistAction {
	/** アクションフォーム */
	@Resource
	@ActionForm
	protected EmployeeRegistForm employeeRegistForm;

	/** Dto */
	@Resource
	public EmployeeRegistDto employeeRegistDto;

	/** Service */
	@Resource
	protected EmployeeRegistService employeeRegistService;

	/** 登録処理後のメッセージ */
	public String message;

	/** 初期表示 */
	@Execute(validator = false)
	public String employeeRegist() {
		return "/employeeRegist/index.jsp";
	}

	/**
	 * 登録処理
	 *
	 * @return
	 */
	@Execute(validator = true, input = "index.jsp")
	public String employeeRegistration() throws Exception {

		try {
			employeeRegistService.employeeRegist(employeeRegistForm);
			message = "登録が完了しました。";
			return "after.jsp";
		} catch (Exception e) {
			message = "登録に失敗しました。";
			return "index.jsp";
		}
	}
}