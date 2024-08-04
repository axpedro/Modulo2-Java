--criando antes o endereco para nao quebrar o codigo ao gerar FK
CREATE TABLE Endereco (
    ID_Endereco SERIAL PRIMARY KEY,
    Logradouro VARCHAR(255),
    Estado VARCHAR(50),
    Cidade VARCHAR(100),
    Numero VARCHAR(10),
    CEP VARCHAR(20)
);

CREATE TABLE Funcionario (
    ID_Funcionario SERIAL PRIMARY KEY,
    Matricula VARCHAR(50),
    TempoExperiencia INT,
    ID_Endereco INT,
    FOREIGN KEY (ID_Endereco) REFERENCES Endereco(ID_Endereco)
);

CREATE TABLE Nutricionista (
    ID_Nutricionista SERIAL PRIMARY KEY,
    CRN VARCHAR(30),
    Especialidade VARCHAR(255)
);


CREATE TABLE Paciente (
    ID_Paciente SERIAL PRIMARY KEY,
    Nome VARCHAR(255),
    DataNascimento DATE,
    CPF VARCHAR(20),
    Telefone VARCHAR(20),
    Email VARCHAR(255),
    ID_Endereco INT,
    FOREIGN KEY (ID_Endereco) REFERENCES Endereco(ID_Endereco)
);

CREATE TABLE Consulta (
    ID SERIAL PRIMARY KEY,
    ID_Nutricionista INT,
    ID_Paciente INT,
    DataConsulta DATE,
    Observacoes TEXT,
    FOREIGN KEY (ID_Nutricionista) REFERENCES Nutricionista(ID_Nutricionista),
    FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente)
);

INSERT INTO Endereco (Logradouro, Estado, Cidade, Numero, CEP) VALUES
('Rua da esperanca', 'SC', 'Florianopolis', '80', '88063-038'),
('Rua Felipe shcimidt', 'SC', 'Florianopolis', '123', '8800-100'),
('Avenida Beiramar', 'SC', 'Florianopolis', '432', '8801-101');


INSERT INTO Funcionario (Matricula, TempoExperiencia, ID_Endereco) VALUES
('891671F', 1, 7),
('466534F', 2, 8),
('879672F', 3, 9);


INSERT INTO Nutricionista (CRN, Especialidade) VALUES
('CRN-1988', 'Saude e bem estar'),
('CRN-2024', 'Nutrição Esportiva Olympics'),
('CRN-0001', 'Nutri Infanto');


INSERT INTO Paciente (Nome, DataNascimento, CPF, Telefone, Email, ID_Endereco) VALUES
('João Silva', '1988-11-24', '123.456.789-01', '(48) 91234-5678', 'joao@google.com', 7),
('Maria Oliveira', '1990-08-22', '987.654.321-09', '(48) 99876-5432', 'maria@bol.com', 8),
('Ana Souza', '2000-02-10', '456.789.123-45', '(48) 98765-4321', 'ana@hotmail.com', 9);


INSERT INTO Consulta (ID_Nutricionista, ID_Paciente, DataConsulta, Observacoes) VALUES
(1, 1, '2024-01-01', 'Intolerante a lacote'),
(2, 2, '2024-02-02', 'Celiaco'),
(3, 3, '2024-03-03', 'Perda de peso acentuada');

--update no paciente pois nutricionista nao tem telefone
UPDATE Paciente
SET Telefone = '(48) 9999-9999'
WHERE ID_Paciente = 1;

DELETE FROM Consulta
WHERE ID = 3;
