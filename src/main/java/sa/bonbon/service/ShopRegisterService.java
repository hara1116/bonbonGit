package sa.bonbon.service;

import javax.annotation.Resource;
import org.seasar.extension.jdbc.JdbcManager;

public class ShopRegisterService {

	@Resource
	private JdbcManager jdbcManager;

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
	public int shopRegistration(String shopCd, String shopName, String eriaCd,
			String postNo, String address) {
        String sql = "INSERT INTO SA.SA.M_SHOP VALUES ('" + shopCd + "',19000101, 99991231, '" + shopName + "',";
        String sql2 = "'" + eriaCd + "','" + postNo + "','" + address + "',";
        String sql3 = "'TEST', GETDATE(), 'TEST', GETDATE())";
        String insertSql = sql + sql2 + sql3;
        int result = jdbcManager.updateBySql(insertSql)
                .execute();
        return result;
    }
}
