package sa.bonbon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/10/05 0:33:12")
public class MAdmin implements Serializable{

	private static final long serialVersionUID = 1L;

	/** 従業員CD */
	@Column(name = "ADMIN_CD")
	public String adminCd;
	/** パスワード */
	@Column(name = "PASSWORD")
	public String password;
	/** 名前 */
	@Column(name = "ADMIN_NAME")
	public String adminName;
	/** 電話番号 */
	@Column(name = "TEL_NO")
	public String telNo;
	/** 開始日*/
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
	/** 最終更新者 */
	@Column(name = "LASTUPDATE_USER")
	public String lastupdateUser;
	/** 最終登録日 */
	@Column(name = "LASTUPDATE")
	public Timestamp lastupdate;
}