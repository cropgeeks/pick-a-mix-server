/*
 * This file is generated by jOOQ.
 */
package jhi.pickamix.server.database.codegen;


import java.util.Arrays;
import java.util.List;

import jhi.pickamix.server.database.codegen.tables.Components;
import jhi.pickamix.server.database.codegen.tables.Measures;
import jhi.pickamix.server.database.codegen.tables.PlotComponents;
import jhi.pickamix.server.database.codegen.tables.PlotMeasures;
import jhi.pickamix.server.database.codegen.tables.Plots;
import jhi.pickamix.server.database.codegen.tables.TrialMeasures;
import jhi.pickamix.server.database.codegen.tables.Trials;
import jhi.pickamix.server.database.codegen.tables.ViewTrialComponentMeasures;
import jhi.pickamix.server.database.codegen.tables.ViewTrials;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PickamixDb extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pickamix_db</code>
     */
    public static final PickamixDb PICKAMIX_DB = new PickamixDb();

    /**
     * No further instances allowed
     */
    private PickamixDb() {
        super("pickamix_db", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Components.COMPONENTS,
            Measures.MEASURES,
            PlotComponents.PLOT_COMPONENTS,
            PlotMeasures.PLOT_MEASURES,
            Plots.PLOTS,
            TrialMeasures.TRIAL_MEASURES,
            Trials.TRIALS,
            ViewTrialComponentMeasures.VIEW_TRIAL_COMPONENT_MEASURES,
            ViewTrials.VIEW_TRIALS
        );
    }
    // @formatter:on
}
