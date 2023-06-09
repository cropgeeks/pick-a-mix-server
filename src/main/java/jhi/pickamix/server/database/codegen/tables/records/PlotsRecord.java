/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.pickamix.server.database.codegen.enums.PlotsMeasurementType;
import jhi.pickamix.server.database.codegen.tables.Plots;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlotsRecord extends UpdatableRecordImpl<PlotsRecord> implements Record5<Integer, Integer, PlotsMeasurementType, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pickamix_db.plots.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pickamix_db.plots.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pickamix_db.plots.trial_id</code>.
     */
    public void setTrialId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pickamix_db.plots.trial_id</code>.
     */
    public Integer getTrialId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pickamix_db.plots.measurement_type</code>.
     */
    public void setMeasurementType(PlotsMeasurementType value) {
        set(2, value);
    }

    /**
     * Getter for <code>pickamix_db.plots.measurement_type</code>.
     */
    public PlotsMeasurementType getMeasurementType() {
        return (PlotsMeasurementType) get(2);
    }

    /**
     * Setter for <code>pickamix_db.plots.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>pickamix_db.plots.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>pickamix_db.plots.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>pickamix_db.plots.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, PlotsMeasurementType, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, PlotsMeasurementType, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Plots.PLOTS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Plots.PLOTS.TRIAL_ID;
    }

    @Override
    public Field<PlotsMeasurementType> field3() {
        return Plots.PLOTS.MEASUREMENT_TYPE;
    }

    @Override
    public Field<Timestamp> field4() {
        return Plots.PLOTS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field5() {
        return Plots.PLOTS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getTrialId();
    }

    @Override
    public PlotsMeasurementType component3() {
        return getMeasurementType();
    }

    @Override
    public Timestamp component4() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component5() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getTrialId();
    }

    @Override
    public PlotsMeasurementType value3() {
        return getMeasurementType();
    }

    @Override
    public Timestamp value4() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value5() {
        return getUpdatedOn();
    }

    @Override
    public PlotsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PlotsRecord value2(Integer value) {
        setTrialId(value);
        return this;
    }

    @Override
    public PlotsRecord value3(PlotsMeasurementType value) {
        setMeasurementType(value);
        return this;
    }

    @Override
    public PlotsRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public PlotsRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public PlotsRecord values(Integer value1, Integer value2, PlotsMeasurementType value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlotsRecord
     */
    public PlotsRecord() {
        super(Plots.PLOTS);
    }

    /**
     * Create a detached, initialised PlotsRecord
     */
    public PlotsRecord(Integer id, Integer trialId, PlotsMeasurementType measurementType, Timestamp createdOn, Timestamp updatedOn) {
        super(Plots.PLOTS);

        setId(id);
        setTrialId(trialId);
        setMeasurementType(measurementType);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised PlotsRecord
     */
    public PlotsRecord(jhi.pickamix.server.database.codegen.tables.pojos.Plots value) {
        super(Plots.PLOTS);

        if (value != null) {
            setId(value.getId());
            setTrialId(value.getTrialId());
            setMeasurementType(value.getMeasurementType());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
