# Sistema de Gerenciamento de Alunos e Cursos

Este projeto é uma aplicação Spring Boot com MariaDB que permite o gerenciamento de **Alunos** e **Cursos**, incluindo operações CRUD completas para ambas as entidades. O relacionamento entre as entidades é totalmente funcional e persistido no banco de dados.

## ⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Lombok
- MariaDB
- Maven

## 🗃️ Estrutura do Projeto

- `model/`: Contém as entidades JPA `Aluno` e `Curso`, com relacionamento `@ManyToOne` e `@OneToMany`.
- `repository/`: Interfaces que estendem `JpaRepository` para persistência.
- `service/`: Regras de negócio para as entidades.
- `controller/`: Endpoints REST para interação com o sistema.

## 🔁 Relacionamento entre Entidades

- Um **Curso** pode ter vários **Alunos**.
- Um **Aluno** está associado a apenas um **Curso**.

## 🔨 Endpoints da API

### Alunos (`/alunos`)
- `GET /alunos`: Lista todos os alunos.
- `GET /alunos/{id}`: Retorna um aluno pelo ID.
- `POST /alunos`: Cria um novo aluno.
- `DELETE /alunos/{id}`: Remove um aluno.

### Cursos (`/cursos`)
- `GET /cursos`: Lista todos os cursos.
- `GET /cursos/{id}`: Retorna um curso pelo ID.
- `POST /cursos`: Cria um novo curso.
- `DELETE /cursos/{id}`: Remove um curso.

## ✅ Requisitos Atendidos

- Relacionamento entre entidades implementado corretamente.
- CRUD completo funcional.
- Uso adequado de Lombok para reduzir boilerplate.
- Projeto segue boas práticas de organização e estrutura RESTful.

## 🧪 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/seuprojeto.git
   cd seuprojeto

2.Configure o application.properties com suas credenciais do MariaDB:
spring.datasource.url=jdbc:mariadb://localhost:3306/seubanco
spring.datasource.username=usuario
spring.datasource.password=senha

3.Execute o projeto:
./mvnw spring-boot:run

