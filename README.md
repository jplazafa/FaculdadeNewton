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
- ![image](https://github.com/user-attachments/assets/a1305a81-ef85-40c5-8402-060990656b78)


### Cursos (`/cursos`)
- `GET /cursos`: Lista todos os cursos.
- `GET /cursos/{id}`: Retorna um curso pelo ID.
- `POST /cursos`: Cria um novo curso.
- `DELETE /cursos/{id}`: Remove um curso.
- ![image](https://github.com/user-attachments/assets/0c1e5679-485a-480c-8194-4b063d2218b3)





