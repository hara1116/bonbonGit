package sa.bonbon.action;

import javax.annotation.Resource;

import org.h2.util.StringUtils;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sa.bonbon.dto.EmployeeRegistDto;
import sa.bonbon.form.EmployeeRegistForm;
import sa.bonbon.service.EmployeeRegistService;

public class EmployeeInformationAction {
	/**アクションフォーム*/
	@Resource
	@ActionForm
	protected EmployeeRegistForm employeeRegistForm;

	/**Dto*/
	@Resource
	public EmployeeRegistDto employeeRegistDto;

	/**Service*/
	@Resource
	protected EmployeeRegistService employeeRegistService;

	/**登録処理後のメッセージ*/
	public String message;

	/**初期表示*/
    @Execute(validator = false)
	public String employeeInformation() {
        return "/employeeInformation/index.jsp";
	}
    /**
     * 社員情報更新処理
     * @return
     */
    @Execute(validator = true, input="index.jsp")
	public String employeeUpdate() throws Exception{

    	//名前
		if(StringUtils.isNullOrEmpty(employeeRegistForm.employeeName)){
    		message = "名前が入力されていません";
			return "index.jsp";
		}
    	//所属店舗
		if(StringUtils.isNullOrEmpty(employeeRegistForm.shozokuShop)){
    		message = "所属店舗が入力されていません";
			return "index.jsp";
		}
    	//生年月日
		if(StringUtils.isNullOrEmpty(employeeRegistForm.birthDay)){
    		message = "生年月日が入力されていません";
			return "index.jsp";
		}
    	try {
    		employeeRegistService.employeeRegist(employeeRegistForm);
    		message = "更新が完了しました。";
    		return "index.jsp";
    	} catch (Exception e) {
    		message = "更新に失敗しました。";
    		return "index.jsp";
    	}
    }
    /**
     * 社員情報削除処理
     * @return
     */
    @Execute(validator = true, input="index.jsp")
	public String employeeDelete() throws Exception{
    	try {
    		employeeRegistService.employeeRegist(employeeRegistForm);
    		message = "削除が完了しました。";
    		return "index.jsp";
    	} catch (Exception e) {
    		message = "削除に失敗しました。";
    		return "index.jsp";
    	}
    }
    /**
     * 社員情報画面を開く
     * @return
     */
    @Execute(validator = false)
	public String employeeSearch() {
        return "/employeeSearch/index.jsp";
	}
}