# springboot-profile
Aplicação Demo Spring Boot Profile



### 1. Comandos para rodar a aplicação

```sh
mvn clean package
```
> Nota: rodar esse comando no diretório do projeto.

```sh
cd target
```
> Nota: Entrar na pasta target onde se encontra o jar da aplicação.

```sh
java -jar springboot-profile-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev

```

> Nota: rodar a aplicação escolhendo o ambiente { dev | uat | prod }

### 2. Formas de usar profiles

2.1. Criando arquivos properties de acordo com o ambiente

```sh
application.properties
application-dev.properties
application-uat.properties
application-prod.properties
```
> Nota: A configuração do ambiente é feita no arquivo application.properties setando o ambiente na propriedade spring.profiles.active={dev | uat | prod}

2.2. Criando classes adicionando a anotações abaixo

```sh
@Component
@Profile("dev")
```
> Nota: Na anotação @Profile pode ser informado os ambientes dev | uat | prod
> Verificar a estrutura criada na pasta datasource

   
