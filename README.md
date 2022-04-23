# Trabjus

## Pré-requisitos

* JDK 11 ou superior instalado
* MySQL 8 ou superior instalado
* IntelliJ IDEA Ultimate 
* Web Browser

## Passos a seguir

* Instalar MySQL e pôr a correr (anotar a password associada ao root!)
  * https://dev.mysql.com/downloads/installer/
* Ligar o Intellij ao MySQL através do separador Database > New Data Source (MySQL), colocando as credencias do root. Teste a conecção (canto inferior), se pedir para instalar drivers, aceite. Se der erro de timezone, na opção Advanced, adicionar serverTimezone com o valor UTC.
* Após criada uma base de dados, se não abriu uma consola imediatamente à criação da base de dados, carregue com o lado direito do rato na mesma, selecione "Jump to Query Console..." e selecione "Open Default Console".
  * Copie o texto abaixo para a consola, selecione o texto todo e corra o código.

```
create database trabjus;

create user 'trabjus'@'localhost' identified by 'trabjus123';

grant all privileges on trabjus.* to 'trabjus'@'localhost';
```

* Verifique se na pasta src/main/resources/application.properties, o nome da Base de Dados, o nome e a pass do utilizador estão corretos.
* Vá ate à pasta src/main/kotlin/TrabalhoApplication e corra a classe.
  * Se der algum erro de código, exprimente reiniciar o Intelij.
* Após a execução do programa, dirija-se a um browser e escreva no URL localhost:8080.
  * Os dados para o login na aplicação, são os seguintes:
    * Username: avaliador
    * Password: avaliador123


## Vídeo no youtube sobre a aplicação
* https://youtu.be/H5koQdvP3pM
