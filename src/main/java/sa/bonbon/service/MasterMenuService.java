package sa.bonbon.service;

import javax.annotation.Resource;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.BeanMap;

import sa.bonbon.form.MasterMenuForm;

/**
 * マスタメニュー画面のサービス
 * @author t.hara
 *
 */
public class MasterMenuService {

	@Resource
	private JdbcManager jdbcManager;
}
