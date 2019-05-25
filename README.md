## pwh_sts
  ● Spring boot 기반의 프레임워크활용한 API 기능명세 (spring-boot + maven + mybatis + mysql)

## 개발환경
  ● spring boot 2.1.5
  ● STS 3.9.8
  ● MariaDB 10.2
  ● mybatis 3.4.6
  ● jdk 1.8

## 문제해결 방법: 
 - 제공된 데이터는 DB 테이블에 인서트 되어있다는 가정하에 PC에 마리아DB를 설치하여 
   제공된 CSV파일 import하여 3개 파일에 맞는 3개 테이블의 데이터를 세팅하였습니다.
  
  ● application.properties 파일에서 DB 접속 정보 설정 가능
  ● 테이블 구성현황
    고객 거래내역 데이터 - TS_TBL_TRD
    고객 데이터 - TS_TBL_ACNT
    지점 데이터 - TS_TBL_MGMT_BRN

## 빌드 및 실행방법
  ● Maven을 통해 빌드 수행.
  ● jar파일을 통해 실행 --> java -jar pwh-0.0.1-SNAPSHOT.jar 
  ● jar파일 구동 시 
    - API기능명세1: http://localhost:8080/api1
    - API기능명세2: http://localhost:8080/api2
    - API기능명세3: http://localhost:8080/api3
    - API기능명세4: http://localhost:8080/api4
  

#참고. API 기능에 대한 상세제공하는 툴 활용
    - Api Documentation: http://localhost:8080/swagger-ui.html
