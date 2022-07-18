CREATE database db_cadastro_cliente;

USE db_cadastro_cliente;

CREATE TABLE cliente(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(80) NOT NULL
);

INSERT INTO cliente(nome) VALUES ('Estevan');

SELECT * FROM cliente;