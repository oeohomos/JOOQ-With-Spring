/**
 * This class is generated by jOOQ
 */
package example.dao.layer.rdbms.base.model;


import example.dao.layer.rdbms.base.model.tables.Order;
import example.dao.layer.rdbms.base.model.tables.OrderLog;
import example.dao.layer.rdbms.base.model.tables.SchemaVersion;
import example.dao.layer.rdbms.base.model.tables.User;
import example.dao.layer.rdbms.base.model.tables.records.OrderLogRecord;
import example.dao.layer.rdbms.base.model.tables.records.OrderRecord;
import example.dao.layer.rdbms.base.model.tables.records.SchemaVersionRecord;
import example.dao.layer.rdbms.base.model.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>study</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<OrderRecord, Integer> IDENTITY_ORDER = Identities0.IDENTITY_ORDER;
    public static final Identity<OrderLogRecord, Integer> IDENTITY_ORDER_LOG = Identities0.IDENTITY_ORDER_LOG;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = UniqueKeys0.KEY_ORDER_PRIMARY;
    public static final UniqueKey<OrderLogRecord> KEY_ORDER_LOG_PRIMARY = UniqueKeys0.KEY_ORDER_LOG_PRIMARY;
    public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = UniqueKeys0.KEY_SCHEMA_VERSION_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_INDEX_MOBILE = UniqueKeys0.KEY_USER_INDEX_MOBILE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<OrderRecord, Integer> IDENTITY_ORDER = createIdentity(Order.ORDER, Order.ORDER.ORDER_ID);
        public static Identity<OrderLogRecord, Integer> IDENTITY_ORDER_LOG = createIdentity(OrderLog.ORDER_LOG, OrderLog.ORDER_LOG.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.UID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = createUniqueKey(Order.ORDER, "KEY_order_PRIMARY", Order.ORDER.ORDER_ID);
        public static final UniqueKey<OrderLogRecord> KEY_ORDER_LOG_PRIMARY = createUniqueKey(OrderLog.ORDER_LOG, "KEY_order_log_PRIMARY", OrderLog.ORDER_LOG.ID);
        public static final UniqueKey<SchemaVersionRecord> KEY_SCHEMA_VERSION_PRIMARY = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "KEY_schema_version_PRIMARY", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.UID);
        public static final UniqueKey<UserRecord> KEY_USER_INDEX_MOBILE = createUniqueKey(User.USER, "KEY_user_index_mobile", User.USER.MOBILE);
    }
}
