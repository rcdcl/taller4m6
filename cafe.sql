-- MySQL Script generated by MySQL Workbench
-- Fri Dec 15 09:02:54 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema cafe
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cafe
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cafe` DEFAULT CHARACTER SET utf8 ;
USE `cafe` ;

-- -----------------------------------------------------
-- Table `cafe`.`cafe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cafe`.`cafe` (
  `id_coffe` INT NOT NULL AUTO_INCREMENT,
  `cafe` VARCHAR(45) NOT NULL,
  `stock_c` INT NOT NULL,
  PRIMARY KEY (`id_coffe`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cafe`.`tipo_cafe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cafe`.`tipo_cafe` (
  `id_cafe` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cafe`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cafe`.`leche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cafe`.`leche` (
  `id_leche` INT NOT NULL AUTO_INCREMENT,
  `tipo_leche` VARCHAR(45) NOT NULL,
  `stock_leche` INT NOT NULL,
  PRIMARY KEY (`id_leche`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cafe`.`endulzante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cafe`.`endulzante` (
  `id_end` INT NOT NULL AUTO_INCREMENT,
  `tipo_end` VARCHAR(45) NOT NULL,
  `stock_end` INT NOT NULL,
  PRIMARY KEY (`id_end`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cafe`.`vaso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cafe`.`vaso` (
  `id_vaso` INT NOT NULL AUTO_INCREMENT,
  `tipo_vaso` VARCHAR(45) NOT NULL,
  `stock_vaso` INT NOT NULL,
  PRIMARY KEY (`id_vaso`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cafe`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cafe`.`venta` (
  `id_venta` INT NOT NULL AUTO_INCREMENT,
  `ext_end` TINYINT NOT NULL,
  `descuento` TINYINT NOT NULL,
  `tipo_cafe_id_cafe` INT NOT NULL,
  `cafe_id_coffe` INT NOT NULL,
  `endulzante_id_end` INT NOT NULL,
  `leche_id_leche` INT NOT NULL,
  `vaso_id_vaso` INT NOT NULL,
  `valor_venta` INT NOT NULL,
  PRIMARY KEY (`id_venta`),
  INDEX `fk_venta_tipo_cafe_idx` (`tipo_cafe_id_cafe` ASC),
  INDEX `fk_venta_cafe1_idx` (`cafe_id_coffe` ASC),
  INDEX `fk_venta_endulzante1_idx` (`endulzante_id_end` ASC),
  INDEX `fk_venta_leche1_idx` (`leche_id_leche` ASC),
  INDEX `fk_venta_vaso1_idx` (`vaso_id_vaso` ASC),
  CONSTRAINT `fk_venta_tipo_cafe`
    FOREIGN KEY (`tipo_cafe_id_cafe`)
    REFERENCES `cafe`.`tipo_cafe` (`id_cafe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_cafe1`
    FOREIGN KEY (`cafe_id_coffe`)
    REFERENCES `cafe`.`cafe` (`id_coffe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_endulzante1`
    FOREIGN KEY (`endulzante_id_end`)
    REFERENCES `cafe`.`endulzante` (`id_end`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_leche1`
    FOREIGN KEY (`leche_id_leche`)
    REFERENCES `cafe`.`leche` (`id_leche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_vaso1`
    FOREIGN KEY (`vaso_id_vaso`)
    REFERENCES `cafe`.`vaso` (`id_vaso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE USER 'root' IDENTIFIED BY '123456';

GRANT ALL ON `cafe`.* TO 'root';
GRANT SELECT ON TABLE `cafe`.* TO 'root';
GRANT SELECT, INSERT, TRIGGER ON TABLE `cafe`.* TO 'root';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `cafe`.* TO 'root';
GRANT EXECUTE ON ROUTINE `cafe`.* TO 'root';
CREATE USER 'erick';

GRANT EXECUTE ON ROUTINE `cafe`.* TO 'erick';
GRANT ALL ON `cafe`.* TO 'erick';
GRANT SELECT ON TABLE `cafe`.* TO 'erick';
GRANT SELECT, INSERT, TRIGGER ON TABLE `cafe`.* TO 'erick';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `cafe`.* TO 'erick';
CREATE USER 'rafa' IDENTIFIED BY '123456';

GRANT ALL ON `cafe`.* TO 'rafa';
GRANT SELECT ON TABLE `cafe`.* TO 'rafa';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `cafe`.* TO 'rafa';
GRANT EXECUTE ON ROUTINE `cafe`.* TO 'rafa';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
