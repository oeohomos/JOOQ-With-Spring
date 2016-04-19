/**
 * This class is generated by jOOQ
 */
package example.dao.layer.rdbms.base.model.tables;


import example.dao.layer.rdbms.base.model.Keys;
import example.dao.layer.rdbms.base.model.Study;
import example.dao.layer.rdbms.base.model.tables.records.OrderLogRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 订单状态变化表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderLog extends TableImpl<OrderLogRecord> {

	private static final long serialVersionUID = 1034596336;

	/**
	 * The reference instance of <code>study.order_log</code>
	 */
	public static final OrderLog ORDER_LOG = new OrderLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<OrderLogRecord> getRecordType() {
		return OrderLogRecord.class;
	}

	/**
	 * The column <code>study.order_log.id</code>.
	 */
	public final TableField<OrderLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>study.order_log.order_id</code>.
	 */
	public final TableField<OrderLogRecord, Integer> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>study.order_log.status</code>.
	 */
	public final TableField<OrderLogRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>study.order_log.change_time</code>. 变化时间
	 */
	public final TableField<OrderLogRecord, Timestamp> CHANGE_TIME = createField("change_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "变化时间");

	/**
	 * Create a <code>study.order_log</code> table reference
	 */
	public OrderLog() {
		this("order_log", null);
	}

	/**
	 * Create an aliased <code>study.order_log</code> table reference
	 */
	public OrderLog(String alias) {
		this(alias, ORDER_LOG);
	}

	private OrderLog(String alias, Table<OrderLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private OrderLog(String alias, Table<OrderLogRecord> aliased, Field<?>[] parameters) {
		super(alias, Study.STUDY, aliased, parameters, "订单状态变化表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<OrderLogRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ORDER_LOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<OrderLogRecord> getPrimaryKey() {
		return Keys.KEY_ORDER_LOG_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<OrderLogRecord>> getKeys() {
		return Arrays.<UniqueKey<OrderLogRecord>>asList(Keys.KEY_ORDER_LOG_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderLog as(String alias) {
		return new OrderLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public OrderLog rename(String name) {
		return new OrderLog(name, null);
	}
}