package org.citi.model.crud;

import org.citi.model.ddl.Sequences;
import org.citi.model.util.JOOQUtil;
import org.jooq.Record;
import org.jooq.SelectWhereStep;
import org.jooq.Table;
import org.jooq.impl.DSL;

public class Operations extends JOOQUtil {

	private final static Operations _operations = new Operations();

	public static Operations getOperations() {
		return _operations;
	}

	public Operations() {
		super("LocalDB", "root", "toor");

		super.createSchema();
	}

	public void close() {
		super.closeConnection();
	}

	public Number Count(Table<?> t) {
		return create.select(DSL.count()).from(t).fetchOne(0, int.class);
	}

	public Record create(Table<?> t) {
		return create.newRecord(t);
	}

	public SelectWhereStep<?> findOn(Table<?> t) {
		return create.selectFrom(t);
	}

	public void recreateDataBase() {
		super.recreateSchema();
	}

	public Long getEagleAuditsNextID() {
		return create.nextval(Sequences.SYSTEM_SEQUENCE_20CBB021_ACCB_4660_896C_AD7B857F82CD);
	}

	public Long getAuditstepsNextID() {
		return create.nextval(Sequences.SYSTEM_SEQUENCE_205A61F8_CFCE_4731_82B5_D948F6362318);
	}

	public Long getLogstepNextID() {
		return create.nextval(Sequences.SYSTEM_SEQUENCE_62ADF8A1_25C6_4569_82AB_45BDF920DA2A);
	}

	public Long getNumtxNextID() {
		return create.nextval(Sequences.SYSTEM_SEQUENCE_7FF407BD_96F3_44C6_99C1_094D9C5B01A1);
	}

}
