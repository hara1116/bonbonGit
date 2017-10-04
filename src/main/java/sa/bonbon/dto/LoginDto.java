package sa.bonbon.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class LoginDto implements Serializable {
	private static final long serialVersionUID = 1L;

	public String id;
	public String userId;
	public String password;
	public String name;
	public String phoneno;
}