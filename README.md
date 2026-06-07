# Biblioteca API

# Integrantes:

-João Victor Soares

-Lucas Luna Accioly Cruz

-Maria Eduarda Maia Santos

API REST desenvolvida em Java com Spring Boot para gerenciamento de livros.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5
- Maven
- PostgreSQL
- Flyway
- JUnit 5
- GitHub Actions
- Qodana

## Funcionalidades

- Cadastro de livros
- Consulta de livros
- Consulta de livro por ID
- Controle de disponibilidade

## Estrutura do Projeto

src/main/java
├── controller
├── service
├── repository
└── model

## Endpoints

### Cadastrar Livro

POST /livros

Exemplo:

```json
{
  "titulo": "Clean Code",
  "autor": "Robert Martin"
}
```

### Listar Livros

GET /livros

### Buscar Livro por ID

GET /livros/{id}

## Banco de Dados

PostgreSQL

Migrações controladas pelo Flyway.

## Executar Localmente

1. Criar banco:

```sql
CREATE DATABASE biblioteca;
```

2. Configurar:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5433/biblioteca
spring.datasource.username=postgres
spring.datasource.password=postgres
```

3. Executar:

```bash
mvn spring-boot:run
```

## Pipeline CI/CD

O projeto utiliza GitHub Actions para:

- Build
- Testes automatizados
- Verificação de qualidade de código
