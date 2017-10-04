package sa.bonbon.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

public class UserregistService {

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
	 * 従業員登録
	 * @param userId
	 * @param password
	 * @return
	 */
	public int userRegistration(String adminCd, String password, String adminName,
			String telNo) {
        String sql = "INSERT INTO SA.SA.M_ADMIN VALUES ('" + adminCd + "',19000101, 99991231, '" + password + "',";
        String sql2 = "'" + adminName + "','" + telNo + "',";
        String sql3 = "'TEST', GETDATE(), 'TEST', GETDATE())";
        String insertSql = sql + sql2 + sql3;
        int result = jdbcManager.updateBySql(insertSql)
                .execute();
        return result;
    }
}