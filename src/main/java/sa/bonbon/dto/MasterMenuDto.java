package sa.bonbon.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

/**
 * マスタメニュー管理画面のDTO
 * @author t.hara
 *
 */
@Component(instance = InstanceType.SESSION)
public class MasterMenuDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 従業員CD */
	public String adminCd;
	/** 従業員パスワード */
	public String adminPassword;
	/** 従業員名 */
	public String adminName;
}
