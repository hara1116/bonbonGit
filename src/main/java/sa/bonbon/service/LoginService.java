package sa.bonbon.service;

import javax.annotation.Resource;
import org.seasar.extension.jdbc.JdbcManager;

public class LoginService {

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
	 * ログイン認証
	 * @param userId
	 * @param password
	 * @return
	 */
	public int login(String userId, String password)
    {
        String sql = "SELECT COUNT(*) FROM M_ADMIN WHERE ADMIN_CD = '" + userId + "' AND PASSWORD = '" + password + "'";
        Integer count =
        	    jdbcManager
        	        .selectBySql(
        	            Integer.class,
        	            sql)
        	        .getSingleResult();
        return count;
    }
}