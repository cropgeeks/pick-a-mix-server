/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.pickamix.server.database.codegen.tables.TrialMeasures;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrialMeasuresRecord extends UpdatableRecordImpl<TrialMeasuresRecord> implements Record6<Integer, Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pickamix_db.trial_measures.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pickamix_db.trial_measures.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pickamix_db.trial_measures.trial_id</code>.
     */
    public void setTrialId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pickamix_db.trial_measures.trial_id</code>.
     */
    public Integer getTrialId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pickamix_db.trial_measures.measure_id</code>.
     */
    public void setMeasureId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pickamix_db.trial_measures.measure_id</code>.
     */
    public Integer getMeasureId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pickamix_db.trial_measures.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pickamix_db.trial_measures.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pickamix_db.trial_measures.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>pickamix_db.trial_measures.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>pickamix_db.trial_measures.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>pickamix_db.trial_measures.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TrialMeasures.TRIAL_MEASURES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return TrialMeasures.TRIAL_MEASURES.TRIAL_ID;
    }

    @Override
    public Field<Integer> field3() {
        return TrialMeasures.TRIAL_MEASURES.MEASURE_ID;
    }

    @Override
    public Field<String> field4() {
        return TrialMeasures.TRIAL_MEASURES.VALUE;
    }

    @Override
    public Field<Timestamp> field5() {
        return TrialMeasures.TRIAL_MEASURES.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field6() {
        return TrialMeasures.TRIAL_MEASURES.UPDATED_ON;
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
    public Integer component3() {
        return getMeasureId();
    }

    @Override
    public String component4() {
        return getValue();
    }

    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component6() {
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
    public Integer value3() {
        return getMeasureId();
    }

    @Override
    public String value4() {
        return getValue();
    }

    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    @Override
    public TrialMeasuresRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TrialMeasuresRecord value2(Integer value) {
        setTrialId(value);
        return this;
    }

    @Override
    public TrialMeasuresRecord value3(Integer value) {
        setMeasureId(value);
        return this;
    }

    @Override
    public TrialMeasuresRecord value4(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TrialMeasuresRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public TrialMeasuresRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public TrialMeasuresRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TrialMeasuresRecord
     */
    public TrialMeasuresRecord() {
        super(TrialMeasures.TRIAL_MEASURES);
    }

    /**
     * Create a detached, initialised TrialMeasuresRecord
     */
    public TrialMeasuresRecord(Integer id, Integer trialId, Integer measureId, String value, Timestamp createdOn, Timestamp updatedOn) {
        super(TrialMeasures.TRIAL_MEASURES);

        setId(id);
        setTrialId(trialId);
        setMeasureId(measureId);
        setValue(value);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised TrialMeasuresRecord
     */
    public TrialMeasuresRecord(jhi.pickamix.server.database.codegen.tables.pojos.TrialMeasures value) {
        super(TrialMeasures.TRIAL_MEASURES);

        if (value != null) {
            setId(value.getId());
            setTrialId(value.getTrialId());
            setMeasureId(value.getMeasureId());
            setValue(value.getValue());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
