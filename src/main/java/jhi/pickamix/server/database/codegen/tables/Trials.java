/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.pickamix.server.database.codegen.PickamixDb;
import jhi.pickamix.server.database.codegen.tables.records.TrialsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Trials extends TableImpl<TrialsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pickamix_db.trials</code>
     */
    public static final Trials TRIALS = new Trials();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrialsRecord> getRecordType() {
        return TrialsRecord.class;
    }

    /**
     * The column <code>pickamix_db.trials.id</code>.
     */
    public final TableField<TrialsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>pickamix_db.trials.name</code>.
     */
    public final TableField<TrialsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>pickamix_db.trials.description</code>.
     */
    public final TableField<TrialsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pickamix_db.trials.postcode</code>.
     */
    public final TableField<TrialsRecord, String> POSTCODE = createField(DSL.name("postcode"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>pickamix_db.trials.contact_email</code>.
     */
    public final TableField<TrialsRecord, String> CONTACT_EMAIL = createField(DSL.name("contact_email"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pickamix_db.trials.latitude</code>.
     */
    public final TableField<TrialsRecord, Double> LATITUDE = createField(DSL.name("latitude"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pickamix_db.trials.longitude</code>.
     */
    public final TableField<TrialsRecord, Double> LONGITUDE = createField(DSL.name("longitude"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pickamix_db.trials.farm_management</code>.
     */
    public final TableField<TrialsRecord, String> FARM_MANAGEMENT = createField(DSL.name("farm_management"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.trials.weed_incidence</code>.
     */
    public final TableField<TrialsRecord, String> WEED_INCIDENCE = createField(DSL.name("weed_incidence"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.trials.disease_incidence</code>.
     */
    public final TableField<TrialsRecord, String> DISEASE_INCIDENCE = createField(DSL.name("disease_incidence"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.trials.pest_incidence</code>.
     */
    public final TableField<TrialsRecord, String> PEST_INCIDENCE = createField(DSL.name("pest_incidence"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.trials.soil_health</code>.
     */
    public final TableField<TrialsRecord, String> SOIL_HEALTH = createField(DSL.name("soil_health"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.trials.biodiversity</code>.
     */
    public final TableField<TrialsRecord, String> BIODIVERSITY = createField(DSL.name("biodiversity"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.trials.cpr</code>.
     */
    public final TableField<TrialsRecord, Double> CPR = createField(DSL.name("cpr"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pickamix_db.trials.created_on</code>.
     */
    public final TableField<TrialsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>pickamix_db.trials.updated_on</code>.
     */
    public final TableField<TrialsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    private Trials(Name alias, Table<TrialsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Trials(Name alias, Table<TrialsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pickamix_db.trials</code> table reference
     */
    public Trials(String alias) {
        this(DSL.name(alias), TRIALS);
    }

    /**
     * Create an aliased <code>pickamix_db.trials</code> table reference
     */
    public Trials(Name alias) {
        this(alias, TRIALS);
    }

    /**
     * Create a <code>pickamix_db.trials</code> table reference
     */
    public Trials() {
        this(DSL.name("trials"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PickamixDb.PICKAMIX_DB;
    }

    @Override
    public Identity<TrialsRecord, Integer> getIdentity() {
        return (Identity<TrialsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TrialsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Trials.TRIALS, DSL.name("KEY_trials_PRIMARY"), new TableField[] { Trials.TRIALS.ID }, true);
    }

    @Override
    public Trials as(String alias) {
        return new Trials(DSL.name(alias), this);
    }

    @Override
    public Trials as(Name alias) {
        return new Trials(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Trials rename(String name) {
        return new Trials(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Trials rename(Name name) {
        return new Trials(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Integer, String, String, String, String, Double, Double, String, String, String, String, String, String, Double, Timestamp, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
    // @formatter:on
}
