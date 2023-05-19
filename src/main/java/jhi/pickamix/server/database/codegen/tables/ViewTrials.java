/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.pickamix.server.database.binding.TrialComponentBinding;
import jhi.pickamix.server.database.codegen.PickamixDb;
import jhi.pickamix.server.database.codegen.tables.pojos.Components;
import jhi.pickamix.server.database.codegen.tables.records.ViewTrialsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTrials extends TableImpl<ViewTrialsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pickamix_db.view_trials</code>
     */
    public static final ViewTrials VIEW_TRIALS = new ViewTrials();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTrialsRecord> getRecordType() {
        return ViewTrialsRecord.class;
    }

    /**
     * The column <code>pickamix_db.view_trials.trial_id</code>.
     */
    public final TableField<ViewTrialsRecord, Integer> TRIAL_ID = createField(DSL.name("trial_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_name</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_NAME = createField(DSL.name("trial_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_description</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_DESCRIPTION = createField(DSL.name("trial_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_latitude</code>.
     */
    public final TableField<ViewTrialsRecord, Double> TRIAL_LATITUDE = createField(DSL.name("trial_latitude"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_longitude</code>.
     */
    public final TableField<ViewTrialsRecord, Double> TRIAL_LONGITUDE = createField(DSL.name("trial_longitude"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_created_on</code>.
     */
    public final TableField<ViewTrialsRecord, Timestamp> TRIAL_CREATED_ON = createField(DSL.name("trial_created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_farm_management</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_FARM_MANAGEMENT = createField(DSL.name("trial_farm_management"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_weed_incidence</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_WEED_INCIDENCE = createField(DSL.name("trial_weed_incidence"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_disease_incidence</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_DISEASE_INCIDENCE = createField(DSL.name("trial_disease_incidence"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_pest_incidence</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_PEST_INCIDENCE = createField(DSL.name("trial_pest_incidence"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_soil_health</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_SOIL_HEALTH = createField(DSL.name("trial_soil_health"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_biodiversity</code>.
     */
    public final TableField<ViewTrialsRecord, String> TRIAL_BIODIVERSITY = createField(DSL.name("trial_biodiversity"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>pickamix_db.view_trials.trial_components</code>.
     */
    public final TableField<ViewTrialsRecord, Components[]> TRIAL_COMPONENTS = createField(DSL.name("trial_components"), SQLDataType.JSON, this, "", new TrialComponentBinding());

    private ViewTrials(Name alias, Table<ViewTrialsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTrials(Name alias, Table<ViewTrialsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_trials` as select `pick_a_mix`.`trials`.`id` AS `trial_id`,`pick_a_mix`.`trials`.`name` AS `trial_name`,`pick_a_mix`.`trials`.`description` AS `trial_description`,`pick_a_mix`.`trials`.`latitude` AS `trial_latitude`,`pick_a_mix`.`trials`.`longitude` AS `trial_longitude`,`pick_a_mix`.`trials`.`created_on` AS `trial_created_on`,`pick_a_mix`.`trials`.`farm_management` AS `trial_farm_management`,`pick_a_mix`.`trials`.`weed_incidence` AS `trial_weed_incidence`,`pick_a_mix`.`trials`.`disease_incidence` AS `trial_disease_incidence`,`pick_a_mix`.`trials`.`pest_incidence` AS `trial_pest_incidence`,`pick_a_mix`.`trials`.`soil_health` AS `trial_soil_health`,`pick_a_mix`.`trials`.`biodiversity` AS `trial_biodiversity`,cast(concat('[',group_concat(distinct json_object('id',`pick_a_mix`.`components`.`id`,'crop',`pick_a_mix`.`components`.`crop`,'variety',`pick_a_mix`.`components`.`variety`) separator ','),']') as json) AS `trial_components` from (((`pick_a_mix`.`trials` left join `pick_a_mix`.`plots` on((`pick_a_mix`.`plots`.`trial_id` = `pick_a_mix`.`trials`.`id`))) left join `pick_a_mix`.`plot_components` on((`pick_a_mix`.`plot_components`.`plot_id` = `pick_a_mix`.`plots`.`id`))) left join `pick_a_mix`.`components` on((`pick_a_mix`.`components`.`id` = `pick_a_mix`.`plot_components`.`component_id`))) group by `pick_a_mix`.`trials`.`id`"));
    }

    /**
     * Create an aliased <code>pickamix_db.view_trials</code> table reference
     */
    public ViewTrials(String alias) {
        this(DSL.name(alias), VIEW_TRIALS);
    }

    /**
     * Create an aliased <code>pickamix_db.view_trials</code> table reference
     */
    public ViewTrials(Name alias) {
        this(alias, VIEW_TRIALS);
    }

    /**
     * Create a <code>pickamix_db.view_trials</code> table reference
     */
    public ViewTrials() {
        this(DSL.name("view_trials"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PickamixDb.PICKAMIX_DB;
    }

    @Override
    public ViewTrials as(String alias) {
        return new ViewTrials(DSL.name(alias), this);
    }

    @Override
    public ViewTrials as(Name alias) {
        return new ViewTrials(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTrials rename(String name) {
        return new ViewTrials(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTrials rename(Name name) {
        return new ViewTrials(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, String, Double, Double, Timestamp, String, String, String, String, String, String, Components[]> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
    // @formatter:on
}
