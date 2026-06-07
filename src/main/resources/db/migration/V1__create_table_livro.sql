CREATE TABLE livro (
                       id UUID PRIMARY KEY,
                       titulo VARCHAR(255) NOT NULL,
                       autor VARCHAR(255) NOT NULL,
                       disponivel BOOLEAN NOT NULL
);