CREATE TABLE `Pessoa` (
  `Id` int PRIMARY KEY,
  `nome` String,
  `endereco` int,
  `sexo` char(1)
);

CREATE TABLE `Aluno` (
  `Id` int PRIMARY KEY,
  `Curso` int,
  `periodo` int,
  `status` varchar(255),
  `Credenciais` int
);

CREATE TABLE `Funcionario` (
  `Id` int PRIMARY KEY,
  `curso` int,
  `DataAdimissao` datetime,
  `Credenciais` int
);

CREATE TABLE `Credenciais` (
  `Id` int PRIMARY KEY,
  `Login` varchar(255),
  `Senha` varchar(255)
);

CREATE TABLE `Endereco` (
  `Id` int PRIMARY KEY,
  `rua` varchar(255),
  `numero` int,
  `bairro` varchar(255),
  `cidade` varchar(255),
  `estado` char(2),
  `cep` varchar(255)
);

CREATE TABLE `Curso` (
  `Id` int PRIMARY KEY,
  `nome` varchar(255)
);

CREATE TABLE `emprestimo` (
  `Id` int PRIMARY KEY,
  `Id_Livro` int,
  `Id_aluno` int,
  `DataEmprestimo` datetime,
  `DataDevolucao` datetime,
  `Multa` double
);

CREATE TABLE `Livro` (
  `Id` int PRIMARY KEY,
  `Tipo` char,
  `Titulo` String,
  `Autor` String,
  `AreaRalecionada` String,
  `Editora` String,
  `AnoPublicacao` date,
  `issn` String
);

ALTER TABLE `Pessoa` ADD FOREIGN KEY (`endereco`) REFERENCES `Endereco` (`Id`);

ALTER TABLE `Aluno` ADD FOREIGN KEY (`Id`) REFERENCES `Pessoa` (`Id`);

ALTER TABLE `Curso` ADD FOREIGN KEY (`Id`) REFERENCES `Aluno` (`Curso`);

ALTER TABLE `Aluno` ADD FOREIGN KEY (`Credenciais`) REFERENCES `Credenciais` (`Id`);

ALTER TABLE `Funcionario` ADD FOREIGN KEY (`Id`) REFERENCES `Pessoa` (`Id`);

ALTER TABLE `Curso` ADD FOREIGN KEY (`Id`) REFERENCES `Funcionario` (`curso`);

ALTER TABLE `Funcionario` ADD FOREIGN KEY (`Credenciais`) REFERENCES `Credenciais` (`Id`);

ALTER TABLE `emprestimo` ADD FOREIGN KEY (`Id_Livro`) REFERENCES `Livro` (`Id`);

ALTER TABLE `emprestimo` ADD FOREIGN KEY (`Id_aluno`) REFERENCES `Aluno` (`Id`);
