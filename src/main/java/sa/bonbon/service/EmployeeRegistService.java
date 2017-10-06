package sa.bonbon.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;

import sa.bonbon.entity.MAdmin;
import sa.bonbon.form.UserregistForm;

public class EmployeeRegistService {

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
	public int userRegistration(UserregistForm userregistForm) {

		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = new Date();
        String today = df1.format(date1);

        MAdmin entity = new MAdmin();
        entity.adminCd = userregistForm.adminCd;                        //従業員CD
        entity.password = userregistForm.password;                      //パスワード
        entity.adminName = userregistForm.adminName;                    //名前
        entity.telNo = userregistForm.telNo;                            //電話番号

        entity.startYmd = Integer.parseInt(today);                      //開始日
        entity.endYmd = 99991231;                                       //終了日

        entity.createUser = userregistForm.adminCd;                     //登録者
        entity.lastupdateUser = userregistForm.adminCd;                 //最終更新者
        entity.createDate = new Timestamp(System.currentTimeMillis());  //更新日
        entity.lastupdate = new Timestamp(System.currentTimeMillis());  //最終更新日

        return jdbcManager.insert(entity).execute();
    }
}