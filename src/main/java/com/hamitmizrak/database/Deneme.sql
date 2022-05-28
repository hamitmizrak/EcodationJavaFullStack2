CREATE SCHEMA `employee_management_system` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

use employee_management_system;

CREATE TABLE `employee_management_system`.`admin` (
                                                      `id` INT NOT NULL AUTO_INCREMENT,
                                                      `name` VARCHAR(150) NULL,
                                                      `surname` VARCHAR(150) BINARY NULL,
                                                      `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
                                                      PRIMARY KEY (`id`));

SELECT * FROM employee_management_system.admin;
