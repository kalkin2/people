
1. docker 에 postgres 설치 
$ docker pull postgres:11.7
docker run -d -p 5432:5432 --name pgsql -e POSTGRES_PASSWORD=1q2w3e4r5t! postgres:11.7
docker ps
