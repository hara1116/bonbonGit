package sa.bonbon.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;

import sa.bonbon.entity.MShop;
import sa.bonbon.form.ShopRegisterForm;

public class ShopRegisterService {

	@Resource
	private JdbcManager jdbcManager = SingletonS2Container.getComponent("jdbcManager");

	/**
	 * テスト用パスワード更新
	 * @param userId
	 * @param password
	 * @return
	 */
	//public int updateSort(String userId, String password)
    {
        //String sql = "UPDATE M_USER SET PASSWORD = '" + password + "' Where ID = '1'";
        //int result = jdbcManager.updateBySql(sql)
                //.execute();
        //return result;
    }

	/**
	 * 店舗登録
	 * @param userId
	 * @param password
	 * @return
	 */
	public int shopRegistration(ShopRegisterForm shopRegisterForm) {
		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = new Date();
        //String sql = "INSERT INTO SA.SA.M_SHOP VALUES ('" + shopRegisterForm.shopCd + "','" + df1.format(date1) + "', 99991231, '" + shopRegisterForm.shopName + "',";
        //String sql2 = "'" + shopRegisterForm.eriaCd + "','" + shopRegisterForm.postNo + "','" + shopRegisterForm.address + "',";
        //String sql3 = "'TEST', GETDATE(), 'TEST', GETDATE())";
        //String insertSql = sql + sql2 + sql3;
        //int result = jdbcManager.updateBySqlFile(insertSql, sql)
        //      .execute();

        MShop entity = new MShop();
        entity.shopCd = shopRegisterForm.shopCd;
        entity.shopName = shopRegisterForm.shopName;
        entity.eriaCd = shopRegisterForm.eriaCd;
        entity.address = shopRegisterForm.address;
        entity.postNo = shopRegisterForm.postNo;
        entity.startYmd = 20171010;
        entity.endYmd = 99991231;
        entity.createUser = "test";
        entity.lastupdateUser = "test";
        entity.createDate = new Timestamp(System.currentTimeMillis());
        entity.lastupdate = new Timestamp(System.currentTimeMillis());

        return jdbcManager.insert(entity).execute();
    }
}
