package sa.bonbon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.dto.EmployeeRegistDto;
import sa.bonbon.form.EmployeeSearchForm;
import sa.bonbon.service.EmployeeSearchService;

public class EmployeeSearchAction {
	/** アクションフォーム */
	@Resource
	@ActionForm
	protected EmployeeSearchForm employeeSearchForm;

	/** Dto */
	@Resource
	public EmployeeRegistDto employeeRegistDto;

	/** Service */
	@Resource
	protected EmployeeSearchService employeeSearchService;

	/** 登録処理後のメッセージ */
	public String message;

	/** 初期表示 */
	@Execute(validator = false)
	public String employeeSearch() {
		return "/employeeSearch/index.jsp";
	}

	/**
	 * 検索処理
	 *
	 * @return
	 */
	@Execute(validator = true, input = "index.jsp")
	public String employeeSearchImp() throws Exception {

		try {
			employeeSearchService.employeeSearch(employeeSearchForm);
			message = "登録が完了しました。";
			return "index.jsp";
		} catch (Exception e) {
			message = "登録に失敗しました。";
			return "index.jsp";
		}
	}

	/**
	 * 社員情報画面を開く
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String employeeInformation() {
		return "/employeeInformation/index.jsp";
	}
}