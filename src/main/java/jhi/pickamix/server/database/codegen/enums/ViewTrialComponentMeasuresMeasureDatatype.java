/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ViewTrialComponentMeasuresMeasureDatatype implements EnumType {

    number("number"),

    date("date"),

    text("text");

    private final String literal;

    private ViewTrialComponentMeasuresMeasureDatatype(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "view_trial_component_measures_measure_datatype";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ViewTrialComponentMeasuresMeasureDatatype lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ViewTrialComponentMeasuresMeasureDatatype.class, literal);
    }
    // @formatter:on
}
