/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

import jhi.pickamix.server.pojo.TrialMeasure;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTrials implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer        trialId;
    private String         trialName;
    private String         trialDescription;
    private Double         trialLatitude;
    private Double         trialLongitude;
    private Timestamp      trialCreatedOn;
    private String         trialFarmManagement;
    private String         trialWeedIncidence;
    private String         trialDiseaseIncidence;
    private String         trialPestIncidence;
    private String         trialSoilHealth;
    private String         trialBiodiversity;
    private Double         trialCpr;
    private Components[]   trialComponents;
    private TrialMeasure[] trialMeasures;

    public ViewTrials() {}

    public ViewTrials(ViewTrials value) {
        this.trialId = value.trialId;
        this.trialName = value.trialName;
        this.trialDescription = value.trialDescription;
        this.trialLatitude = value.trialLatitude;
        this.trialLongitude = value.trialLongitude;
        this.trialCreatedOn = value.trialCreatedOn;
        this.trialFarmManagement = value.trialFarmManagement;
        this.trialWeedIncidence = value.trialWeedIncidence;
        this.trialDiseaseIncidence = value.trialDiseaseIncidence;
        this.trialPestIncidence = value.trialPestIncidence;
        this.trialSoilHealth = value.trialSoilHealth;
        this.trialBiodiversity = value.trialBiodiversity;
        this.trialCpr = value.trialCpr;
        this.trialComponents = value.trialComponents;
        this.trialMeasures = value.trialMeasures;
    }

    public ViewTrials(
        Integer        trialId,
        String         trialName,
        String         trialDescription,
        Double         trialLatitude,
        Double         trialLongitude,
        Timestamp      trialCreatedOn,
        String         trialFarmManagement,
        String         trialWeedIncidence,
        String         trialDiseaseIncidence,
        String         trialPestIncidence,
        String         trialSoilHealth,
        String         trialBiodiversity,
        Double         trialCpr,
        Components[]   trialComponents,
        TrialMeasure[] trialMeasures
    ) {
        this.trialId = trialId;
        this.trialName = trialName;
        this.trialDescription = trialDescription;
        this.trialLatitude = trialLatitude;
        this.trialLongitude = trialLongitude;
        this.trialCreatedOn = trialCreatedOn;
        this.trialFarmManagement = trialFarmManagement;
        this.trialWeedIncidence = trialWeedIncidence;
        this.trialDiseaseIncidence = trialDiseaseIncidence;
        this.trialPestIncidence = trialPestIncidence;
        this.trialSoilHealth = trialSoilHealth;
        this.trialBiodiversity = trialBiodiversity;
        this.trialCpr = trialCpr;
        this.trialComponents = trialComponents;
        this.trialMeasures = trialMeasures;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTrials (");

        sb.append(trialId);
        sb.append(", ").append(trialName);
        sb.append(", ").append(trialDescription);
        sb.append(", ").append(trialLatitude);
        sb.append(", ").append(trialLongitude);
        sb.append(", ").append(trialCreatedOn);
        sb.append(", ").append(trialFarmManagement);
        sb.append(", ").append(trialWeedIncidence);
        sb.append(", ").append(trialDiseaseIncidence);
        sb.append(", ").append(trialPestIncidence);
        sb.append(", ").append(trialSoilHealth);
        sb.append(", ").append(trialBiodiversity);
        sb.append(", ").append(trialCpr);
        sb.append(", ").append(Arrays.toString(trialComponents));
        sb.append(", ").append(Arrays.toString(trialMeasures));

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
