CREATE TABLE `eventos` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`data_inicio` DATETIME NOT NULL,
	`data_termino` DATETIME NOT NULL,
	`criado_em` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `locais` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`capacidade` INT(11) NOT NULL,
	`endereco_id` INT(11) NOT NULL,
	`contato_id` INT(11) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `enderecos` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`cep` varchar(9) NOT NULL,
	`rua` varchar(100) NOT NULL,
	`bairro` varchar(100) NOT NULL,
	`cidade` varchar(100) NOT NULL,
	`uf` varchar(2) NOT NULL,
	`numero` varchar(11) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `atracoes` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`contato_id` INT(11) NOT NULL,
	`endereco_id` INT(11),
	PRIMARY KEY (`id`)
);

CREATE TABLE `contatos` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`telefone` varchar(30) NOT NULL,
	`celular` varchar(30) NOT NULL,
	`whatsapp` varchar(30) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `eventos_atracoes` (
	`evento_id` INT NOT NULL,
	`atracao_id` INT NOT NULL ,
	`valor` DECIMAL(15,2) NOT NULL,
	PRIMARY KEY (`evento_id`,`atracao_id`)
);

CREATE TABLE `eventos_funcionarios` (
	`evento_id` INT NOT NULL ,
	`pessoa_id` INT NOT NULL ,
	`valor` DECIMAL(15,2) NOT NULL,
	PRIMARY KEY (`evento_id`,`pessoa_id`)
);

CREATE TABLE `buffets` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`endereco_id` INT NOT NULL,
	`contato_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `decoracoes` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`endereco_id` INT NOT NULL,
	`contato_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `eventos_buffets` (
	`evento_id` INT NOT NULL ,
	`buffet_id` INT NOT NULL ,
	`valor` DECIMAL(15,2) NOT NULL,
	PRIMARY KEY (`evento_id`,`buffet_id`)
);

CREATE TABLE `eventos_decoracoes` (
	`evento_id` INT NOT NULL ,
	`decoracao_id` INT NOT NULL ,
	`valor` DECIMAL(15,2) NOT NULL,
	PRIMARY KEY (`evento_id`,`decoracao_id`)
);

CREATE TABLE `pessoas` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`sobrenome` varchar(100) NOT NULL,
	`cpf_cnpj` varchar(30) NOT NULL,
	`rg` varchar(20) NOT NULL,
	`contato_id` INT NOT NULL,
	`endereco_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `eventos_locais` (
	`evento_id` INT NOT NULL ,
	`local_id` INT NOT NULL ,
	`valor` DECIMAL(15,2) NOT NULL,
	PRIMARY KEY (`evento_id`,`local_id`)
);

ALTER TABLE `locais` ADD CONSTRAINT `locais_fk0` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos`(`id`);

ALTER TABLE `locais` ADD CONSTRAINT `locais_fk1` FOREIGN KEY (`contato_id`) REFERENCES `contatos`(`id`);

ALTER TABLE `atracoes` ADD CONSTRAINT `atracoes_fk0` FOREIGN KEY (`contato_id`) REFERENCES `contatos`(`id`);

ALTER TABLE `atracoes` ADD CONSTRAINT `atracoes_fk1` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos`(`id`);

ALTER TABLE `eventos_atracoes` ADD CONSTRAINT `eventos_atracoes_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos`(`id`);

ALTER TABLE `eventos_atracoes` ADD CONSTRAINT `eventos_atracoes_fk1` FOREIGN KEY (`atracao_id`) REFERENCES `atracoes`(`id`);

ALTER TABLE `eventos_funcionarios` ADD CONSTRAINT `eventos_funcionarios_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos`(`id`);

ALTER TABLE `eventos_funcionarios` ADD CONSTRAINT `eventos_funcionarios_fk1` FOREIGN KEY (`pessoa_id`) REFERENCES `pessoas`(`id`);

ALTER TABLE `buffets` ADD CONSTRAINT `buffets_fk0` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos`(`id`);

ALTER TABLE `buffets` ADD CONSTRAINT `buffets_fk1` FOREIGN KEY (`contato_id`) REFERENCES `contatos`(`id`);

ALTER TABLE `decoracoes` ADD CONSTRAINT `decoracoes_fk0` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos`(`id`);

ALTER TABLE `decoracoes` ADD CONSTRAINT `decoracoes_fk1` FOREIGN KEY (`contato_id`) REFERENCES `contatos`(`id`);

ALTER TABLE `eventos_buffets` ADD CONSTRAINT `eventos_buffets_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos`(`id`);

ALTER TABLE `eventos_buffets` ADD CONSTRAINT `eventos_buffets_fk1` FOREIGN KEY (`buffet_id`) REFERENCES `buffets`(`id`);

ALTER TABLE `eventos_decoracoes` ADD CONSTRAINT `eventos_decoracoes_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos`(`id`);

ALTER TABLE `eventos_decoracoes` ADD CONSTRAINT `eventos_decoracoes_fk1` FOREIGN KEY (`decoracao_id`) REFERENCES `decoracoes`(`id`);

ALTER TABLE `pessoas` ADD CONSTRAINT `pessoas_fk0` FOREIGN KEY (`contato_id`) REFERENCES `contatos`(`id`);

ALTER TABLE `pessoas` ADD CONSTRAINT `pessoas_fk1` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos`(`id`);

ALTER TABLE `eventos_locais` ADD CONSTRAINT `eventos_locais_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos`(`id`);

ALTER TABLE `eventos_locais` ADD CONSTRAINT `eventos_locais_fk1` FOREIGN KEY (`local_id`) REFERENCES `locais`(`id`);

