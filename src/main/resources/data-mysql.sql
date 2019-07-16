DROP TABLE db_water.beer_style;
CREATE TABLE db_water.beer_style (id bigint, alkalinity_range varchar(30), bjcp_style_id varchar(4), calcium_range varchar(10), chloride_range varchar(10), magnesium_range varchar(10), sodium_range varchar(10), sulfate_range varchar(10), color varchar(10), name varchar(30), residual_alkalinity_range varchar(30) );
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (1, '0-40', '1A', '50-60', '50-100', '4-6', '0-30', 'Lite American Lager', '(-)60-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (2, '0-40', '1B', '50-60', '50-100', '4-8', '0-30', 'Standard American', '(-)60-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (3, '0-40', '1C', '50-75', '50-100', '4-12', '0-30', 'Premium American', '(-)60-0', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (4, '0-40', '1D', '50-60', '50-100', '6-10', '0-30', 'Munich Helles', '(-)60-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (5, '40-80', '1E', '75-150', '50-100', '8-12', '0-30', 'Dortmunder Export', '(-)30-30', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (6, '0-40', '2A', '50-75', '50-100', '4-10', '0-30', 'German Pilsner (Pils)', '(-)60-0', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (7, '0-40', '2B', '50-60', '50-100', '7-12', '0-30', 'Bohemian Pilsener', '(-)60-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (8, '0-40', '2C', '50-75', '50-100', '6-12', '0-30', 'Classic American Pilsner', '(-)60-0', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (9, '40-120', '3A', '50-75', '50-150', '20-32', '0-30', 'Vienna Lager', '0-60', '<100', '0-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (10, '40-120', '3B', '50-75', '50-150', '14-28', '0-30', 'Oktoberfest/Märzen', '0-60', '<100', '0-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (11, '80-120', '4A', '50-75', '50-150', '28-44', '0-30', 'Dark American Lager', '40-80', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (12, '80-120', '4B', '50-75', '50-150', '28-56', '0-30', 'Munich Dunkel', '40-80', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (13, '80-120', '4C', '50-75', '50-150', '34-60', '0-30', 'Schwarzbier', '40-80', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (14, '40-80', '5A', '50-75', '50-150', '12-22', '0-30', 'Helles Bock', '0-60', '<100', '0-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (15, '40-80', '5B', '50-75', '50-150', '28-44', '0-30', 'Traditional Bock', '0-60', '<100', '0-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (16, '80-150', '5C', '50-100', '50-100', '12-50', '0-30', 'Doppelbock', '60-120', '<100', '0-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (17, '80-150', '5D', '50-100', '50-100', '36-60', '0-30', 'Eisbock', '60-120', '<100', '0-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (18, '0-80', '6A', '50-100', '0-100', '5-10', '0-30', 'Cream Ale', '(-)30-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (19, '0-80', '6B', '50-100', '50-100', '6-12', '0-30', 'Blonde Ale', '(-)60-0', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (20, '0-80', '6C', '50-100', '0-100', '7-10', '0-30', 'Kölsch', '(-)30-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (21, '0-80', '6D', '50-100', '50-100', '6-12', '0-30', 'American Wheat / Rye', '(-)60-0', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (22, '40-120', '7A', '50-150', '50-100', '26-38', '0-30', 'N. German Altbier', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (23, '40-120', '7B', '50-150', '50-100', '20-28', '0-30', 'California Common Beer', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (24, '40-120', '7C', '50-150', '50-100', '22-34', '0-30', 'Düsseldorf Altbier', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (25, '0-80', '8A', '50-100', '50-100', '2-28', '0-30', 'Ordinary Bitter', '(-)60-0', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (26, '40-120', '8B', '50-150', '50-100', '10-32', '0-30', 'Special Bitter', '0-60', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (27, '40-120', '8C', '50-150', '50-100', '12-36', '0-30', 'Strong Bitter', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (28, '40-120', '9A', '50-150', '50-100', '18-34', '0-30', 'Scottish 60/-', '0-60', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (29, '40-120', '9B', '50-150', '50-100', '18-34', '0-30', 'Scottish 70/-', '0-60', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (30, '40-120', '9C', '50-150', '50-100', '18-34', '0-30', 'Scottish 80/-', '0-60', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (31, '40-120', '9D', '50-150', '50-100', '18-36', '0-30', 'Irish Red Ale', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (32, '40-120', '9E', '50-100', '50-150', '28-50', '0-30', 'Strong Scotch Ale', '0-60', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (33, '40-120', '10A', '50-150', '0-100', '10-28', '0-30', 'American Pale Ale', '(-)30-30', '<100', '100-400');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (34, '40-120', '10B', '50-150', '50-100', '20-34', '0-30', 'American Amber Ale', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (35, '80-160', '10C', '50-75', '50-150', '36-70', '0-30', 'American Brown Ale', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (36, '40-120', '11A', '50-150', '50-100', '24-50', '0-30', 'Mild', '0-60', '<100', '100-200');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (37, '80-150', '11B', '50-75', '50-100', '38-70', '0-30', 'S. English Brown', '30-90', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (38, '80-150', '11C', '50-75', '50-100', '24-44', '0-30', 'N. English Brown', '30-90', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (39, '80-150', '12A', '50-75', '50-100', '40-60', '0-30', 'Brown Porter', '30-90', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (40, '80-160', '12B', '50-75', '50-150', '44-70', '0-30', 'Robust Porter', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (41, '80-160', '12C', '50-75', '50-150', '34-60', '0-30', 'Baltic Porter', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (42, '80-150', '13A', '50-75', '50-100', '50-80', '0-30', 'Dry Stout', '30-90', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (43, '80-160', '13B', '50-75', '50-150', '60-80', '0-30', 'Sweet Stout', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (44, '80-160', '13C', '50-75', '50-150', '44-80', '0-30', 'Oatmeal Stout', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (45, '80-160', '13D', '50-75', '50-150', '60-80', '0-30', 'Foreign Extra Stout', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (46, '80-160', '13E', '50-75', '50-150', '60-80', '0-30', 'American Stout', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (47, '120-200', '13F', '50-75', '50-150', '60-80', '0-30', 'Imperial Stout', '120-200', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (48, '40-120', '14A', '50-150', '50-100', '16-28', '0-30', 'English IPA', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (49, '40-120', '14B', '50-150', '0-100', '12-30', '0-30', 'American IPA', '(-)30-30', '<100', '100-400');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (50, '40-120', '14C', '50-150', '0-100', '16-30', '0-30', 'Imperial IPA', '(-)30-30', '<100', '100-400');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (51, '0-80', '15A', '50-100', '0-100', '4-16', '0-30', 'Weizen', '(-)30-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (52, '80-160', '15B', '50-75', '50-150', '28-46', '0-30', 'Dunkelweizen', '60-120', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (53, '120-200', '15C', '50-75', '50-150', '24-50', '0-30', 'Weizenbock', '120-200', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (54, '40-120', '15D', '50-150', '50-100', '28-38', '0-30', 'Roggenbier', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (55, '0-80', '16A', '50-100', '0-100', '4-8', '0-30', 'Witbier', '(-)30-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (56, '40-120', '16B', '50-150', '50-100', '16-28', '0-30', 'Belgian Pale Ale', '0-60', '<100', '100-300');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (57, '40-120', '16C', '50-150', '0-100', '10-28', '0-30', 'Saison', '(-)30-30', '<100', '100-400');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (58, '40-120', '16D', '50-100', '50-150', '12-38', '0-30', 'Bière de Garde', '0-60', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (59, '0-80', '17A', '50-100', '0-100', '4-6', '0-30', 'Berliner Weisse', '(-)100-(-)30', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (60, '0-120', '17B', '50-100', '0-100', '20-32', '0-30', 'Flanders Red Ale', '0-60', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (61, '0-100', '17C', '50-100', '0-100', '30-44', '0-30', 'Oud Bruin', '0-60', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (62, '0-80', '17D', '50-100', '0-100', '6-14', '0-30', 'Straight Lambic', '(-)100-(-)30', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (63, '0-80', '17E', '50-100', '0-100', '6-14', '0-30', 'Gueuze', '(-)100-(-)30', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (64, '0-80', '17F', '50-100', '0-100', '6-14', '0-30', 'Fruit Lambic', '(-)100-(-)30', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (65, '0-80', '18A', '50-100', '0-100', '8-14', '0-30', 'Belgian Blond Ale', '(-)30-0', '<100', '0-50');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (66, '40-120', '18B', '50-100', '50-150', '20-34', '0-30', 'Belgian Dubbel', '0-60', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (67, '0-40', '18C', '50-100', '50-100', '9-14', '0-30', 'Belgian Tripel', '(-)30-0', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (68, '0-40', '18D', '50-100', '50-100', '6-12', '0-30', 'Golden Strong Ale', '(-)30-0', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (69, '120-200', '18E', '50-75', '50-150', '24-44', '0-30', 'Dark Strong Ale', '120-200', '<100', '50-150');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (70, '40-120', '19A', '50-100', '50-150', '20-44', '0-30', 'Old Ale', '0-60', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (71, '40-120', '19B', '50-100', '50-150', '16-44', '0-30', 'English Barleywine', '0-60', '<100', '50-100');
INSERT INTO db_water.beer_style (id, alkalinity_range, bjcp_style_id, calcium_range, chloride_range, color, magnesium_range, name, residual_alkalinity_range, sodium_range, sulfate_range) VALUES (72, '40-120', '19C', '50-100', '50-150', '20-38', '0-30', 'American Barleywine', '0-60', '<100', '50-100');

DROP TABLE db_water.grain_type;
CREATE TABLE db_water.grain_type (id bigint, name varchar(20), pH decimal(4,2), malt_type integer);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (1, 'PALE', 5.70, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (2, '6-ROW', 5.79, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (3, 'MARIS OTTER', 5.77, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (4, 'MUNICH', 5.43, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (5, 'PILSNER', 5.75, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (6, 'WHEAT', 6.04, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (7, 'VIENNA', 5.56, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (8, 'OTHER', 5.70, 1);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (9, 'CRYSTAL', null, 2);
INSERT INTO db_water.grain_type (id, name, pH, malt_type) VALUES (10, 'ROASTED', 4.71, 3);
