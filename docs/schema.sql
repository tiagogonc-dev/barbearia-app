CREATE DATABASE barberdata;
USE barberdata;

CREATE TABLE IF NOT EXISTS Cliente
(
    id       int            NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome     varchar(80)    NOT NULL,
    telefone varchar(20)    NOT NULL,
    email varchar(80) # opcional
);

CREATE TABLE IF NOT EXISTS Barbeiro
(
    id      int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome    varchar(80) NOT NULL,
    especialidade varchar(80)
);

CREATE TABLE IF NOT EXISTS Servico
(
    id      int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome    varchar(80) NOT NULL,
    duracaoMin int      UNSIGNED,
    preco double        UNSIGNED
);

CREATE TABLE IF NOT EXISTS Agendamento
(
    agendid  int        NOT NULL AUTO_INCREMENT PRIMARY KEY,
    clienteid int       NOT NULL,
    barbeiroid int      NOT NULL,
    servicoid int       NOT NULL,
    horario DATETIME    NOT NULL,
    status enum('Confirmado', 'Cancelado', 'Concluido') NOT NULL,

    FOREIGN KEY (clienteid) REFERENCES cliente(id),
    FOREIGN KEY (barbeiroid) REFERENCES barbeiro(id),
    FOREIGN KEY (servicoid) REFERENCES servico(id)
);