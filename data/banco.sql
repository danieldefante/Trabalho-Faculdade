-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 19-Maio-2017 às 22:49
-- Versão do servidor: 10.1.21-MariaDB
-- PHP Version: 7.0.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";
CREATE DATABASE gerenciamento_eventos;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gerenciamento_eventos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atracoes`
--

CREATE TABLE `atracoes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `contato_id` int(11) NOT NULL,
  `endereco_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `buffets`
--

CREATE TABLE `buffets` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `contato_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `contatos`
--

CREATE TABLE `contatos` (
  `id` int(11) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `whatsapp` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `decoracoes`
--

CREATE TABLE `decoracoes` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `contato_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos`
--

CREATE TABLE `enderecos` (
  `id` int(11) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `rua` varchar(100) NOT NULL,
  `bairro` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `numero` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos`
--

CREATE TABLE `eventos` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `data_inicio` datetime NOT NULL,
  `data_termino` datetime NOT NULL,
  `criado_em` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos_atracoes`
--

CREATE TABLE `eventos_atracoes` (
  `valor` decimal(15,2) NOT NULL,
  `evento_id` int(11) NOT NULL,
  `atracao_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos_buffets`
--

CREATE TABLE `eventos_buffets` (
  `evento_id` int(11) NOT NULL,
  `buffet_id` int(11) NOT NULL,
  `valor` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos_decoracoes`
--

CREATE TABLE `eventos_decoracoes` (
  `evento_id` int(11) NOT NULL,
  `decoracao_id` int(11) NOT NULL,
  `valor` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos_funcionarios`
--

CREATE TABLE `eventos_funcionarios` (
  `evento_id` int(11) NOT NULL,
  `pessoa_id` int(11) NOT NULL,
  `valor` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos_locais`
--

CREATE TABLE `eventos_locais` (
  `evento_id` int(11) NOT NULL,
  `local_id` int(11) NOT NULL,
  `valor` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `locais`
--

CREATE TABLE `locais` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `capacidade` int(11) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `contato_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoas`
--

CREATE TABLE `pessoas` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `cpf_cnpj` varchar(30) NOT NULL,
  `rg` varchar(20) NOT NULL,
  `contato_id` int(11) NOT NULL,
  `endereco_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atracoes`
--
ALTER TABLE `atracoes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `atracoes_fk0` (`contato_id`),
  ADD KEY `atracoes_fk1` (`endereco_id`);

--
-- Indexes for table `buffets`
--
ALTER TABLE `buffets`
  ADD PRIMARY KEY (`id`),
  ADD KEY `buffets_fk0` (`endereco_id`),
  ADD KEY `buffets_fk1` (`contato_id`);

--
-- Indexes for table `contatos`
--
ALTER TABLE `contatos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `decoracoes`
--
ALTER TABLE `decoracoes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `decoracoes_fk0` (`endereco_id`),
  ADD KEY `decoracoes_fk1` (`contato_id`);

--
-- Indexes for table `enderecos`
--
ALTER TABLE `enderecos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eventos_atracoes`
--
ALTER TABLE `eventos_atracoes`
  ADD PRIMARY KEY (`evento_id`,`atracao_id`),
  ADD KEY `eventos_atracoes_fk1` (`atracao_id`);

--
-- Indexes for table `eventos_buffets`
--
ALTER TABLE `eventos_buffets`
  ADD PRIMARY KEY (`evento_id`,`buffet_id`),
  ADD KEY `eventos_buffets_fk1` (`buffet_id`);

--
-- Indexes for table `eventos_decoracoes`
--
ALTER TABLE `eventos_decoracoes`
  ADD PRIMARY KEY (`evento_id`,`decoracao_id`),
  ADD KEY `eventos_decoracoes_fk1` (`decoracao_id`);

--
-- Indexes for table `eventos_funcionarios`
--
ALTER TABLE `eventos_funcionarios`
  ADD PRIMARY KEY (`evento_id`,`pessoa_id`),
  ADD KEY `eventos_funcionarios_fk1` (`pessoa_id`);

--
-- Indexes for table `eventos_locais`
--
ALTER TABLE `eventos_locais`
  ADD PRIMARY KEY (`evento_id`,`local_id`),
  ADD KEY `eventos_locais_fk1` (`local_id`);

--
-- Indexes for table `locais`
--
ALTER TABLE `locais`
  ADD PRIMARY KEY (`id`),
  ADD KEY `locais_fk0` (`endereco_id`),
  ADD KEY `locais_fk1` (`contato_id`);

--
-- Indexes for table `pessoas`
--
ALTER TABLE `pessoas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pessoas_fk0` (`contato_id`),
  ADD KEY `pessoas_fk1` (`endereco_id`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `atracoes`
--
ALTER TABLE `atracoes`
  ADD CONSTRAINT `atracoes_fk0` FOREIGN KEY (`contato_id`) REFERENCES `contatos` (`id`),
  ADD CONSTRAINT `atracoes_fk1` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos` (`id`);

--
-- Limitadores para a tabela `buffets`
--
ALTER TABLE `buffets`
  ADD CONSTRAINT `buffets_fk0` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos` (`id`),
  ADD CONSTRAINT `buffets_fk1` FOREIGN KEY (`contato_id`) REFERENCES `contatos` (`id`);

--
-- Limitadores para a tabela `decoracoes`
--
ALTER TABLE `decoracoes`
  ADD CONSTRAINT `decoracoes_fk0` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos` (`id`),
  ADD CONSTRAINT `decoracoes_fk1` FOREIGN KEY (`contato_id`) REFERENCES `contatos` (`id`);

--
-- Limitadores para a tabela `eventos_atracoes`
--
ALTER TABLE `eventos_atracoes`
  ADD CONSTRAINT `eventos_atracoes_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos` (`id`),
  ADD CONSTRAINT `eventos_atracoes_fk1` FOREIGN KEY (`atracao_id`) REFERENCES `atracoes` (`id`);

--
-- Limitadores para a tabela `eventos_buffets`
--
ALTER TABLE `eventos_buffets`
  ADD CONSTRAINT `eventos_buffets_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos` (`id`),
  ADD CONSTRAINT `eventos_buffets_fk1` FOREIGN KEY (`buffet_id`) REFERENCES `buffets` (`id`);

--
-- Limitadores para a tabela `eventos_decoracoes`
--
ALTER TABLE `eventos_decoracoes`
  ADD CONSTRAINT `eventos_decoracoes_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos` (`id`),
  ADD CONSTRAINT `eventos_decoracoes_fk1` FOREIGN KEY (`decoracao_id`) REFERENCES `decoracoes` (`id`);

--
-- Limitadores para a tabela `eventos_funcionarios`
--
ALTER TABLE `eventos_funcionarios`
  ADD CONSTRAINT `eventos_funcionarios_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos` (`id`),
  ADD CONSTRAINT `eventos_funcionarios_fk1` FOREIGN KEY (`pessoa_id`) REFERENCES `pessoas` (`id`);

--
-- Limitadores para a tabela `eventos_locais`
--
ALTER TABLE `eventos_locais`
  ADD CONSTRAINT `eventos_locais_fk0` FOREIGN KEY (`evento_id`) REFERENCES `eventos` (`id`),
  ADD CONSTRAINT `eventos_locais_fk1` FOREIGN KEY (`local_id`) REFERENCES `locais` (`id`);

--
-- Limitadores para a tabela `locais`
--
ALTER TABLE `locais`
  ADD CONSTRAINT `locais_fk0` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos` (`id`),
  ADD CONSTRAINT `locais_fk1` FOREIGN KEY (`contato_id`) REFERENCES `contatos` (`id`);

--
-- Limitadores para a tabela `pessoas`
--
ALTER TABLE `pessoas`
  ADD CONSTRAINT `pessoas_fk0` FOREIGN KEY (`contato_id`) REFERENCES `contatos` (`id`),
  ADD CONSTRAINT `pessoas_fk1` FOREIGN KEY (`endereco_id`) REFERENCES `enderecos` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
