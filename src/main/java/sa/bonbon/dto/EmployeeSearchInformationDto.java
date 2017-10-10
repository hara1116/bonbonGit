package sa.bonbon.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class EmployeeSearchInformationDto implements Serializable {

	/** 従業員CD */
	public String adminCd;
	/** パスワード */
	public String password;
	/** 名前 */
	public String adminName;
	/** 電話番号 */
	public String telNo;
}