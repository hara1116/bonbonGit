package sa.bonbon.action;

import javax.annotation.Resource;

import org.h2.util.StringUtils;
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

		// 社員CD
		if (StringUtils.isNullOrEmpty(employeeRegistForm.employeeCd)) {
			message = "社員CDが入力されていません";
			return "index.jsp";
		}
		// 名前
		if (StringUtils.isNullOrEmpty(employeeRegistForm.employeeName)) {
			message = "名前が入力されていません";
			return "index.jsp";
		}
		// 所属店舗
		if (StringUtils.isNullOrEmpty(employeeRegistForm.shozokuShop)) {
			message = "所属店舗が入力されていません";
			return "index.jsp";
		}
		// 生年月日
		if (StringUtils.isNullOrEmpty(employeeRegistForm.birthDay)) {
			message = "生年月日が入力されていません";
			return "index.jsp";
		}
		// 性別
		if (StringUtils.isNullOrEmpty(employeeRegistForm.sex)) {
			message = "性別を選択してください";
			return "index.jsp";
		}
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