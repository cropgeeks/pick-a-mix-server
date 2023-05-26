DROP VIEW IF EXISTS `view_trials`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_trials` AS SELECT `trials`.`id` AS `trial_id`, `trials`.`name` AS `trial_name`, `trials`.`description` AS `trial_description`, `trials`.`latitude` AS `trial_latitude`, `trials`.`longitude` AS `trial_longitude`, `trials`.`created_on` AS `trial_created_on`, `trials`.`farm_management` AS `trial_farm_management`, `trials`.`weed_incidence` AS `trial_weed_incidence`, `trials`.`disease_incidence` AS `trial_disease_incidence`, `trials`.`pest_incidence` AS `trial_pest_incidence`, `trials`.`soil_health` AS `trial_soil_health`, `trials`.`biodiversity` AS `trial_biodiversity`, `trials`.`cpr` AS `trial_cpr`, cast( concat( '[', group_concat( DISTINCT json_object( 'id', `components`.`id`, 'crop', `components`.`crop`, 'variety', `components`.`variety` ) SEPARATOR ',' ), ']' ) AS JSON ) AS `trial_components`, cast( concat( '[', group_concat( DISTINCT json_object( 'id', `measures`.`id`, 'name', `measures`.`name`, 'value', `trial_measures`.`value` ) SEPARATOR ',' ), ']' ) AS JSON ) AS `trial_measures` FROM `trials` LEFT JOIN `plots` ON `plots`.`trial_id` = `trials`.`id` LEFT JOIN `plot_components` ON `plot_components`.`plot_id` = `plots`.`id` LEFT JOIN `components` ON `components`.`id` = `plot_components`.`component_id` LEFT JOIN `trial_measures` ON `trial_measures`.`trial_id` = `trials`.`id` LEFT JOIN `measures` ON `measures`.`id` = `trial_measures`.`measure_id` GROUP BY `trials`.`id`;


DROP VIEW IF EXISTS `view_trial_component_measures`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_trial_component_measures` AS SELECT `components`.`id` AS `component_id`, `components`.`crop` AS `component_crop`, `components`.`variety` AS `component_variety`, `measures`.`id` AS `measure_id`, `measures`.`name` AS `measure_name`, `measures`.`datatype` AS `measure_datatype`, `plots`.`measurement_type` AS `plot_measurement_type`, `plot_measures`.`value` AS `measure_value`, `trials`.`id` AS `trial_id`, `trials`.`name` AS `trial_name` FROM `components` LEFT JOIN `plot_components` ON `plot_components`.`component_id` = `components`.`id` LEFT JOIN `plots` ON `plots`.`id` = `plot_components`.`plot_id` LEFT JOIN `trials` ON `trials`.`id` = `plots`.`trial_id` LEFT JOIN `plot_measures` ON `plots`.`id` = `plot_measures`.`plot_id` LEFT JOIN `measures` ON `measures`.`id` = `plot_measures`.`measure_id` WHERE NOT ISNULL(`measures`.`id`) ORDER BY `components`.`crop`, `components`.`variety`;