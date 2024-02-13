CREATE TABLE IF NOT EXISTS `accounts` (

    `id` bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(20)

);

INSERT INTO `accounts` (`name`)
VALUES ('n1'), ('n2')