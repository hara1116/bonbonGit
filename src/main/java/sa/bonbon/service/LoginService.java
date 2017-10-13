package sa.bonbon.service;

import javax.annotation.Resource;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.BeanMap;

public class LoginService {

	@Resource
	private JdbcManager jdbcManager;

	String adminName = "";
	/**
	 * ログイン認証
	 * @param userId
	 * @param password
	 * @return
	 */
	public int login(String userId, String password) {
        String sql = "SELECT COUNT(*) FROM M_ADMIN WHERE ADMIN_CD = '" + userId + "' AND PASSWORD = '" + password + "'";
        Integer count =
        	    jdbcManager
        	        .selectBySql(
        	            Integer.class,
        	            sql)
        	        .getSingleResult();
        return count;
    }

	/**
	 * 従業員名の取得
	 * @param adminCd
	 * @return
	 */
	public String getAdminName (String adminCd) {
		String sql = "SELECT ADMIN_NAME FROM M_ADMIN WHERE ADMIN_CD = '" + adminCd+ "'";
		BeanMap result =
        	    jdbcManager
        	        .selectBySql(
        	            BeanMap.class,
        	            sql)
        	        .getSingleResult();
			adminName = String.valueOf(result.get("adminName"));
		return adminName;
	}
}