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

		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = new Date();
        String today = df1.format(date1);

        MShop entity = new MShop();
        entity.shopCd = shopRegisterForm.shopCd;
        entity.shopName = shopRegisterForm.shopName;
        entity.eriaCd = shopRegisterForm.eriaCd;
        entity.address = shopRegisterForm.address;
        entity.postNo = shopRegisterForm.postNo;
        entity.startYmd = Integer.parseInt(today);
        entity.endYmd = 99991231;
        entity.createUser = shopRegisterForm.adminCd;
        entity.lastupdateUser = shopRegisterForm.adminCd;
        entity.createDate = new Timestamp(System.currentTimeMillis());
        entity.lastupdate = new Timestamp(System.currentTimeMillis());

        return jdbcManager.insert(entity).execute();
    }
}
