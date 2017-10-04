package sa.bonbon.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class ShopRegisterDto implements Serializable {

	/** 店舗コード */
	public String shopCd;
	/** 店舗名称 */
	public String shopName;
	/** 地区コード */
	public String eriaCd;
	/** 郵便番号 */
	public String postNo;
	/** 住所 */
	public String address;
}