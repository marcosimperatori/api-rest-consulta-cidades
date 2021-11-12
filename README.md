# api-rest-consulta-cidades


API consulta cidades - BOOTCAMP TQI JAVA DEVELOPER

Neste projeto é criada uma api rest para CONSULTAS de cidades do Brasil.

Ferramentas utilizadas:

- Linux
- IntelliJ Community
- Java 8
- Postman
- GitHub
- Docker

Inicialmente é criada uma imagem do PostgreSQL, por meio do Docker e são inseridos um conjunto de cidades, estados e países, tudo retirado deste repositório: https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL 

Para popular o banco de dados, utilizei os comandos:

cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;


Durante o processo de desenvolvimento, os testes de consumo dos endpoint's foram feitos por meio do Postman.

Por meio do Heroku cli, é possível espelhar o repositório git com o app Heroku e fazer um push para ele. Também é necessário criar e popular o banco de dados no Heroku. Feito isso a API está pronta, para fins didáticos, claro.



 
