# Aplicação exemplo em Spring Boot

## Passos a seguir

* Instalar MySQL e pôr a correr
* Ligar o Intellij ao MySQL através do separador Database > New Data Source (MySQL)
* Criar um schema XXX com o nome da aplicação (ex: "gestao-tfc") e criar um utilizador XXX com o mesmo nome da aplicação e 
dar-lhe permissões sobre o schema criado no passo anterior

```
create database trabalho;

create user 'trabalho'@'localhost' identified by 'passwordtrabalho';

grant all privileges on trabalho.* to 'trabalho'@'localhost';
```

* Alterar o src/resources/application.properties com o nome da BD, nome e pass do utilizador

## Autenticação através do orcid

* Verificar se foram acrescentadas as dependências spring-boot-starter-security e spring-security-oauth2-client no pom.xml 
* Descomentar todas as propriedades relacionadas com oauth no application.properties
* Descomentar o @Configuration no OauthSecurityConfiguration e retirar o exclude que está no TrabalhoApplication
* Registar o cliente na sandbox seguindo
 [estes passos](https://info.orcid.org/documentation/api-tutorials/api-tutorial-read-data-on-a-record/#Get_some_client_credentials)
 Nota: registar com um email @mailinator.com pois a sandbox só envia emails para esse provider
* Atualizar as credenciais (clientId, clientSecret) no application.properties
