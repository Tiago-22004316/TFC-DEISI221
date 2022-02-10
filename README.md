# Trabjus

## Pré-requisitos

* JDK 11 ou superior instalado
* MySQL 8 ou superior instalado

## Passos a seguir

* Instalar MySQL e pôr a correr (anotar a password associada ao root!)
* Ligar o Intellij ao MySQL através do separador Database > New Data Source (MySQL), colocando as credencias do root. Se der erro de timezone, na opção Advanced, adicionar serverTimezone com o valor UTC.
* Criar um schema XXX com o nome da aplicação (ex: "gestao-tfc") e criar um utilizador XXX com o mesmo nome da aplicação e 
dar-lhe permissões sobre o schema criado no passo anterior

```
create database trabjus;

create user 'trabjus'@'localhost' identified by 'trabjus123';

grant all privileges on trabjus.* to 'trabjus'@'localhost';
```

* Se necessário, alterar o src/main/resources/application.properties com o nome da BD, nome e pass do utilizador

## Docker

* Correr o mvn clean package para gerar o jar do projeto
* Correr docker build -t trabjus .
* Correr docker compose up