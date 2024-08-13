
-- INSERT INTO country(codecountry, namecountry) VALUES ("P01", "COLOMBIA");
-- INSERT INTO country(codecountry, namecountry) VALUES ("P02", "PANAMA");

-- INSERT INTO region(codereg, namereg, codecountryregion) VALUES ("R01", "SANTANDER", "P01");
-- INSERT INTO region(codereg, namereg, codecountryregion) VALUES ("R02", "CUNDINAMARCA", "P01");

-- INSERT INTO city(codecity, namecity,coderegcity) VALUES ("C01", "BUCARAMANGA", "R01");
-- INSERT INTO city(codecity, namecity,coderegcity) VALUES ("C02", "FLORIDABLANCA", "R01");

-- {
-- 		"codecity" : "C01",
-- 		"namecity" : "BUCARAMANGA",
-- 		"coderegcity" :{
-- 			"codereg": "R01",
-- 			"namereg": "SANTANDER",
-- 			"codecountryregion": {
-- 				"codecountry" : "P01",
-- 				"namecountry" : "COLOMBIA"
-- 			}
-- 		}
-- 	}