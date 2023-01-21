CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT,

nome_categoria VARCHAR(255),
Necessita_Receita BOOLEAN,
PRIMARY KEY (id)

);
 CREATE TABLE tb_produtos(
 id BIGINT AUTO_INCREMENT,
 nome VARCHAR(255),
 preço VARCHAR (255),
 tarja_preta BOOLEAN,
 comprimido BOOLEAN,
 categoria_id BIGINT,
 PRIMARY KEY (id),
 FOREIGN KEY (categoria_id ) REFERENCES tb_categorias(id)
 );
 
 INSERT INTO tb_categorias(nome_categoria,Necessita_Receita)
 VALUES ("Medicamento",False);
 
 INSERT INTO tb_categorias(nome_categoria,Necessita_Receita)
 VALUES ("Medicamento",True);
 
 INSERT INTO tb_categorias(nome_categoria,Necessita_Receita)
 VALUES ("Cosmético",False);
 

 
 
 
 
 
 SELECT * FROM tb_categorias;
 
 
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Dipirona",15,False,True,1);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Dorflex",10,False,True,1);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Clonazepam",18,True,False,2);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Merthiolate",45,False,False,1);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Creme dental",8,False,False,3);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Shampoo",36,False,False,3);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Condicionador",25,False,False,3);
 
 INSERT INTO tb_produtos(nome,preço,tarja_preta,comprimido,categoria_id)
 VALUES ("Escova de dentes",36,False,False,3);
 
 
SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE preço > 50;
SELECT * FROM tb_produtos WHERE preço > 5 AND preço < 60;
SELECT * FROM tb_produtos WHERE nome LIKE "%c%";


SELECT * FROM tb_produtos
INNER JOIN tb_categorias
ON tb_categorias.id = tb_produtos.categoria_id;


 
 
 
 
 