
# Product API

Este projeto é uma API de gerenciamento de produtos, desenvolvida usando Spring Boot. Ele permite criar, listar, atualizar e deletar produtos. Os dados dos produtos são armazenados em um banco de dados PostgreSQL.

## Estrutura do Projeto

O projeto está organizado nas seguintes pastas:

- **controllers**: Contém os controladores REST para gerenciar as requisições.
- **dtos**: Contém os Data Transfer Objects (DTOs) usados para transferir dados.
- **models**: Contém as entidades JPA que representam os produtos no banco de dados.
- **repositories**: Contém os repositórios JPA para acessar o banco de dados.
- **resources**: Contém as configurações do projeto, incluindo as configurações do banco de dados.

## Tecnologias Utilizadas

- Java 11
- Spring Boot
- Spring Data JPA
- PostgreSQL
- HATEOAS
- Lombok

## Configuração do Banco de Dados

As configurações do banco de dados estão no arquivo `application.properties` dentro da pasta `resources`. Certifique-se de configurar o `spring.datasource.url`, `spring.datasource.username`, e `spring.datasource.password` com as credenciais do seu banco de dados PostgreSQL.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/products-api
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
## Executando o Projeto
Clone o repositório para sua máquina local:
```
git clone https://github.com/seu-usuario/seu-repositorio.git
```
Navegue até o diretório do projeto:
```
cd seu-repositorio
```
Execute o projeto usando o Maven:
``` 
./mvnw spring-boot:run
```
Endpoints da API
A API expõe os seguintes endpoints para gerenciar os produtos:

POST /products: Cria um novo produto.
GET /products: Lista todos os produtos.
GET /products/{id}: Obtém os detalhes de um produto específico.
PUT /products/{id}: Atualiza os dados de um produto existente.
DELETE /products/{id}: Deleta um produto.

Exemplo de Uso
Criar um Produto
```
curl -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name": "Produto A", "value": 10.50}'
```
Listar Todos os Produtos
```
curl -X GET http://localhost:8080/products
```
Obter um Produto por ID
```
curl -X GET http://localhost:8080/products/{id}
```
Atualizar um Produto
```
curl -X PUT http://localhost:8080/products/{id} -H "Content-Type: application/json" -d '{"name": "Produto A", "value": 15.00}'
```
Deletar um Produto
```
curl -X DELETE http://localhost:8080/products/{id}
```

## Estrutura dos Arquivos

- Controladores
- DTOs
- Repositories




