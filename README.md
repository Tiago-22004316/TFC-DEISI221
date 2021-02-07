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