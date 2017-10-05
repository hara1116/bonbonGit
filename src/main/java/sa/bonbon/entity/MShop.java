package sa.bonbon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/10/05 0:33:12")
public class MShop implements Serializable{

	private static final long serialVersionUID = 1L;

	/** 店舗CD */
	@Column(name = "SHOP_CD")
	public String shopCd;
	/** 店舗名称 */
	@Column(name = "SHOP_NAME")
	public String shopName;
	/** 地区コード */
	@Column(name = "ERIA_CD")
	public String eriaCd;
	/** 郵便番号 */
	@Column(name = "POST_NO")
	public String postNo;
	/** 住所 */
	@Column(name = "address")
	public String address;
	/** 開始日 */
	@Column(name = "START_YMD")
	public int startYmd;
	/** 終了日 */
	@Column(name = "END_YMD")
	public int endYmd;
	/** 登録者 */
	@Column(name = "CREATE_USER")
	public String createUser;
	/** 登録日 */
	@Column(name = "CREATE_DATE")
	public Timestamp createDate;
	/** 登録者 */
	@Column(name = "LASTUPDATE_USER")
	public String lastupdateUser;
	/** 登録日 */
	@Column(name = "LASTUPDATE")
	public Timestamp lastupdate;
}
