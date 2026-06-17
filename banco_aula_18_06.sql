create database banco_api;
 use banco_api;
 
 create table tb_usuario(
    id_usuario int auto_increment primary key,
    nome_usuario varchar(100) not null,
    tel_usuario char(14) not null,
    cpf_usuario char(11) not null,
    email_usuario varchar(50) not null,
    data_nasc date not null,
    ende_usuario varchar(100) not null
 );
 
 insert into tb_usuario(nome_usuario, tel_usuario, cpf_usuario, email_usuario, data_nasc, ende_usuario) values
 ("Gaby Silva", "115698741521", "12365478954", "gaby@email,com", "1980-02-21", "Rua das acácias"),
 ("Silvano Salles", "115698741123", "12365472554", "silvano@email,com", "1984-02-21", "Rua das ameixas"),
 ("Gabriel Souza", "115698741525", "12365478922", "gabriel@email,com", "1990-04-21", "Rua das acácias do galo"),
 ("Ryan Santos", "115698741521", "12365478914", "ryan@email,com", "1970-08-21", "Rua do galo"),
 ("Fabio Sobrinho", "115698741154", "12365478978", "fabio@email,com", "1985-04-28", "Rua da maça"),
 ("Laura silva", "115698741521", "12365478954", "laurasilva@email,com", "1980-02-21", "Rua das acácias"),
 ("Luiz Souza", "115698741521", "12365478954", "luizsouza@email,com", "1980-02-21", "Rua das acácias"),
 ("Luiza Silva", "115698741521", "12365478954", "luizasilva@email,com", "1980-02-21", "Rua das acácias"),
 ("Messi da Silva", "115698741521", "12365478954", "messisilva@email,com", "1980-02-21", "Rua das acácias"),
 ("Luizinho", "115698741521", "12365478954", "luizinho@email,com", "1980-02-21", "Rua das acácias");
 
 select * from tb_usuario;
 