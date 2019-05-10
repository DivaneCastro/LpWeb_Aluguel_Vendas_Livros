create table livro
(
    id            int          not null auto_increment primary key,
    isbn          varchar(255) not null,
    titulo        varchar(255) not null,
    editora       varchar(255) not null,
    autor         varchar(255),
    ano_publicacao year,
    assunto       longtext,
    preco_venda    decimal(11, 2),
    is_nacional    smallint default true,
    quantidade    int      default 5
);

insert into livro (isbn, titulo, editora, autor, ano_publicacao, assunto, preco_venda, is_nacional)
values ('12345', 'Ingles para a vida', 'Lewis', 'Henrique Brain', 1998, 'ingles', 25.0, 1),
       ('56789', 'Amore di Dio', 'Libera', 'Martini Visciano', 2018, 'Religioso', 50.0, 0),
       ('98765', 'Pequeno Principe', 'Aprile', 'Antony de Saint', 1943, 'Aventura', 35.0, 0);
