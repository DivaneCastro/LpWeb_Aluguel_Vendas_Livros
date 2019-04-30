create table livro (
   id int not null auto_increment primary key,
   isbn varchar (255) not null,
   titulo varchar (255) not null,
   editora varchar (255) not null,
   autor varchar (255),
   anoPublicacao int unsigned,
   assunto longtext,
   precoVenda decimal (11,2),
   precoAluguel decimal (11,2),
   precoRenovacaoAluguel decimal(11,2),
   isNacional smallint  default true,
   quantidade int default 5
);

insert into livro (isbn, titulo, editora, autor, anoPublicacao, assunto, precoVenda, precoAluguel, precoRenovacaoAluguel, isNacional)
values ('12345', 'Ingles para a vida', 'Lewis', 'Henrique Brain', 1998, 'ingles', 25.0, 10.0, 5.0, 1 ),
       ('56789', 'Amore di Dio', 'Libera', 'Martini Visciano', 2018, 'Religioso', 50.0, 15.0, 8.0, 0),
       ('98765', 'Pequeno Principe', 'Aprile', 'Antony de Saint', 1943, 'Aventura', 35.0, 10.0, 5.0, 0);