CREATE SCHEMA `cs532_jstl_zuniv` ;
USE cs532_jstl_zuniv;

CREATE TABLE `cs532_jstl_zuniv`.`student` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `age` TINYINT ZEROFILL NULL,
  PRIMARY KEY (`id`));
  
  