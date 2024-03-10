# 개요
* 파이프라인 테스트용 스프링부트 프로젝트

# 배포 방법

* jar파일 생성

```sh
mvn package -DskipTests
```

* 도커 이미지 생성

```
docker build -t {도커 이미지 이름} .
```

# 테스트 확인 방법
* curl -X GET localhost:9991/hello
