package sa.bonbon.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;

import sa.bonbon.entity.MEmployee;
import sa.bonbon.entity.MAdmin;
import sa.bonbon.form.EmployeeRegistForm;
import sa.bonbon.form.UserregistForm;

public class EmployeeSearchService {

	@Resource
	private JdbcManager jdbcManager = SingletonS2Container.getComponent("jdbcManager");

	/**
	 * 従業員登録
	 * @param adminCd     従業員CD
	 * @param password    パスワード
	 * @param adminName   名前
	 * @param password    電話番号
	 * @return 登録数
	 */
	public int employeeRegist(EmployeeRegistForm employeeRegistForm) {

		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = new Date();
        String today = df1.format(date1);

        MEmployee entity = new MEmployee();
        entity.employeeCd = employeeRegistForm.employeeCd;              //社員CD
        entity.password = employeeRegistForm.password;                  //パスワード
        entity.employeeName = employeeRegistForm.employeeName;          //名前
        entity.birthday = employeeRegistForm.birthDay;                  //生年月日
        entity.telNo = employeeRegistForm.telNo;                        //電話番号
        entity.sex = employeeRegistForm.sex;                            //性別
        entity.syozokuShop = employeeRegistForm.shozokuShop;            //所属店舗
        entity.status = employeeRegistForm.status;                      //ステータス

        entity.startYmd = Integer.parseInt(today);                      //開始日
        entity.endYmd = 99991231;                                       //終了日

        entity.createUser = employeeRegistForm.adminCd;                 //登録者
        entity.lastupdateUser = employeeRegistForm.adminCd;             //最終更新者
        entity.createDate = new Timestamp(System.currentTimeMillis());  //更新日
        entity.lastupdate = new Timestamp(System.currentTimeMillis());  //最終更新日

        return jdbcManager.insert(entity).execute();
    }
}