CREATE DATABASE colaboradores;

USE colaboradores;
  
  CREATE TABLE funcionarios (
   id BIGINT auto_increment,
   
   nome VARCHAR (30),
   
   salario DECIMAL ( 7,2  ),
   
   cargo VARCHAR (40),
   
   tempo_de_empresa VARCHAR (6),
   
   idade INT (2),
   
   PRIMARY KEY (id)
   
   );
   
   INSERT INTO funcionarios(nome,salario,cargo,tempo_de_empresa,idade)
   
   VALUES ("Maria",2300.00,"Diretora financeira","17anos","54");
   
   INSERT INTO funcionarios(nome,salario,cargo,tempo_de_empresa,idade)
   
   VALUES ("Mario","4300.00","Manobrista","2anos","23" );
   
   INSERT INTO funcionarios(nome,salario,cargo,tempo_de_empresa,idade)
   VALUES ("Mariana","80000.00","Tia da limpeza","7anos","44");
   
   INSERT INTO funcionarios(nome,salario,cargo,tempo_de_empresa,idade)
   VALUES ("Marina","16000.00","Gerente de marketing","3anos","21");
   
   INSERT INTO funcionarios(nome,salario,cargo,tempo_de_empresa,idade)
   VALUES ("Marineide","93000.00","auxiliar de cozinha","15anos","60");
    
    
    SELECT * FROM funcionarios;
    
    SELECT * FROM funcionarios WHERE salario < 2000.00;
    
    SELECT * FROM funcionarios WHERE salario > 2000.00;
    
    UPDATE funcionarios
SET nome = "Mario"
WHERE id=1;
   
   
   
   
   