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
	 * 会員登録
	 * @param userId
	 * @param password
	 * @return
	 */
	//public int memberRegistration(String userId, String password)
    {
        //String sql = "INSERT INTO M_USER VALUES ('2', '" + userId + "', '" + password + "');";
        //int result = jdbcManager.updateBySql(sql)
                //.execute();
        //return result;
    }
}
