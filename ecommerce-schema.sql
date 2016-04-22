#schema for ecommerce app
CREATE SCHEMA `ecommerce`;

#customer
CREATE TABLE `ecommerce`.`customer` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `streetName` VARCHAR(255) NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  `zip` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

#product
CREATE TABLE `ecommerce`.`product` (
  `product_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `price` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`product_id`));

#Order
CREATE TABLE `ecommerce`.`order` (
  `order_id` INT NOT NULL AUTO_INCREMENT,
  `price` VARCHAR(45) NOT NULL,
  `customer_id` INT NULL,
  `order_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `ecommerce`.`customer` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

#order-product-relation
CREATE TABLE `ecommerce`.`order_product_rel` (
  `order_product_rel_id` INT NOT NULL AUTO_INCREMENT,
  `order_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`order_product_rel_id`),
  INDEX `order_id_idx` (`order_id` ASC),
  INDEX `product_id_idx` (`product_id` ASC),
  CONSTRAINT `order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `ecommerce`.`order` (`order_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `ecommerce`.`product` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

#shipping
CREATE TABLE `ecommerce`.`shipping` (
  `shipping_id` INT NOT NULL AUTO_INCREMENT,
  `order_id` INT NOT NULL,
  `ship_by` VARCHAR(255) NOT NULL,
  `ship_date` VARCHAR(45) NOT NULL DEFAULT 'CURRENT_TIMESTAMP',
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`shipping_id`),
  INDEX `order_id_idx` (`order_id` ASC),
  CONSTRAINT `shipping_order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `ecommerce`.`order` (`order_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

#returns

 CREATE TABLE `ecommerce`.`returns` (
  `return_id` INT NOT NULL AUTO_INCREMENT,
  `order_id` INT NOT NULL,
  `return_for` VARCHAR(50) NOT NULL COMMENT 'returned for values could be ‘refund’ or ‘exchange’',
  PRIMARY KEY (`return_id`),
  INDEX `returns_order_id_idx` (`order_id` ASC),
  CONSTRAINT `returns_order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `ecommerce`.`order` (`order_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

#refund
CREATE TABLE `ecommerce`.`refund` (
  `refund_id` INT NOT NULL AUTO_INCREMENT,
  `return_id` INT NOT NULL,
  `completed` INT NOT NULL,
  `completed_date` DATETIME NOT NULL,
  PRIMARY KEY (`refund_id`),
  INDEX `return_id_idx` (`return_id` ASC),
  CONSTRAINT `return_id`
    FOREIGN KEY (`return_id`)
    REFERENCES `ecommerce`.`returns` (`return_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
