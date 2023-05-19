/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.pickamix.server.database.codegen.enums.PlotsMeasurementType;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plots implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer              id;
    private Integer              trialId;
    private PlotsMeasurementType measurementType;
    private Timestamp            createdOn;
    private Timestamp            updatedOn;

    public Plots() {}

    public Plots(Plots value) {
        this.id = value.id;
        this.trialId = value.trialId;
        this.measurementType = value.measurementType;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Plots(
        Integer              id,
        Integer              trialId,
        PlotsMeasurementType measurementType,
        Timestamp            createdOn,
        Timestamp            updatedOn
    ) {
        this.id = id;
        this.trialId = trialId;
        this.measurementType = measurementType;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Plots (");

        sb.append(id);
        sb.append(", ").append(trialId);
        sb.append(", ").append(measurementType);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
