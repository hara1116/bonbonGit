package sa.bonbon.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;

import sa.bonbon.entity.MShop;
import sa.bonbon.form.ShopRegisterForm;

/**
 * 店舗登録画面のサービス
 * @author t.hara
 *
 */
public class ShopRegisterService {

	@Resource
	private JdbcManager jdbcManager = SingletonS2Container.getComponent("jdbcManager");

	/**
	 * 店舗登録
	 * @param userId
	 * @param password
	 * @return
	 */
	public int shopRegistration(ShopRegisterForm shopRegisterForm) {

		// 当日日付をYYYYMMDD形式で取得
		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = new Date();
        String today = df1.format(date1);

        // Entityに値を詰める
        MShop entity = new MShop();
        entity.shopCd = shopRegisterForm.shopCd;						// 店舗CD
        entity.shopName = shopRegisterForm.shopName;					// 店舗名称
        entity.eriaCd = shopRegisterForm.eriaCd;						// 地区CD
        entity.address = shopRegisterForm.address;						// 住所
        entity.postNo = shopRegisterForm.postNo;						// 郵便番号
        entity.startYmd = Integer.parseInt(today);						// 開始日(YYYYMMDD)
        entity.endYmd = 99991231;										// 終了日(YYYYMMDD)
        entity.createUser = shopRegisterForm.adminCd;					// 登録者
        entity.lastupdateUser = shopRegisterForm.adminCd;				// 最終更新者
        entity.createDate = new Timestamp(System.currentTimeMillis());	// 登録日
        entity.lastupdate = new Timestamp(System.currentTimeMillis());	// 最終更新日

        // 登録処理
        return jdbcManager.insert(entity).execute();
    }
}
