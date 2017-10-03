package sa.bonbon.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class MasterMenuDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public String adminCd;
	public String adminPassword;
	public String employeeCd;
	public String employeePassword;
}
