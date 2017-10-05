package sa.bonbon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MShop}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/10/05 0:33:12")
public class BonItemNames {

    /**
     * shopCdのプロパティ名を返します。
     * 
     * @return shopCdのプロパティ名
     */
    public static PropertyName<String> shopCd() {
        return new PropertyName<String>("shopCd");
    }

    /**
     * shopNameのプロパティ名を返します。
     * 
     * @return shopNameのプロパティ名
     */
    public static PropertyName<String> shopName() {
        return new PropertyName<String>("shopName");
    }

    /**
     * eriaCdのプロパティ名を返します。
     * 
     * @return eriaCdのプロパティ名
     */
    public static PropertyName<String> eriaCd() {
        return new PropertyName<String>("eriaCd");
    }

    /**
     * postNoのプロパティ名を返します。
     * 
     * @return postNoのプロパティ名
     */
    public static PropertyName<String> postNo() {
        return new PropertyName<String>("postNo");
    }

    /**
     * addressのプロパティ名を返します。
     * 
     * @return addressのプロパティ名
     */
    public static PropertyName<String> address() {
        return new PropertyName<String>("address");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _BonItemNames extends PropertyName<MShop> {

        /**
         * インスタンスを構築します。
         */
        public _BonItemNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _BonItemNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _BonItemNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * shopCdのプロパティ名を返します。
         *
         * @return shopCdのプロパティ名
         */
        public PropertyName<String> shopCd() {
            return new PropertyName<String>(this, "shopCd");
        }

        /**
         * shopNameのプロパティ名を返します。
         *
         * @return shopNameのプロパティ名
         */
        public PropertyName<String> shopName() {
            return new PropertyName<String>(this, "shopName");
        }

        /**
         * eriaCdのプロパティ名を返します。
         *
         * @return eriaCdのプロパティ名
         */
        public PropertyName<String> eriaCd() {
            return new PropertyName<String>(this, "eriaCd");
        }

        /**
         * postNoのプロパティ名を返します。
         *
         * @return postNoのプロパティ名
         */
        public PropertyName<String> postNo() {
            return new PropertyName<String>(this, "postNo");
        }

        /**
         * addressのプロパティ名を返します。
         *
         * @return addressのプロパティ名
         */
        public PropertyName<String> address() {
            return new PropertyName<String>(this, "address");
        }
    }
}