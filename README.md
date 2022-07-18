# Perfume Shop

### 개요
#### Maven 기반 Spring-MVC Framework를 사용하여 전반적인 홈쇼핑 사이트의 기능과 view 구현 

### 개발 환경
* Windows 10
* SpringToolSuite v4.14(Eclipse)
* Maven
* SQL Developer
* Git


### 적용 기술
1. Language : JAVA
2. Framework : Spring, MyBatis, Bootstrap(v5.1.3)
3. Server : Apache Tomcat v9.0
4. DB : Oracle 11g
5. Web : CSS, Tiles, HTML5, JQuery, JSP, Ajax
6. Open-API :  Daum 우편번호 서비스

### 주요 기능
* 회원 : 회원가입 / Session을 사용하여 로그인 상태 유지 / 아이디, 비밀번호 찾기

* 마이페이지 : 회원정보 수정 / 작성한 상품리뷰 목록 / 장바구니 / 관심상품 목록

* 상품주문 : 주문 페이지 / 주문처리

* 관리자 페이지 : 공지사항, 이벤트 등의 게시판 관리 / 상품목록 추가, 삭제, 수정

* Ajax 기법을 적용하여 장바구니 추가, 댓글등록 등에 대한 비동기 통신 구현

### 필요 개선사항
* 일부 jQuery 동작의 불안정성 해결
* 로그인 페이지, 리뷰작성 팝업 페이지 등의 UI 테마 통일
* 추후 업데이트 시 소스의 용이한 식별을 위해 MVC(java) 소스파일명의 전반적인 통일성 개선 

### 사용 예시
* 메인 페이지
![메인페이지](https://user-images.githubusercontent.com/102974272/179472811-e82a9607-9d91-4391-a484-889269689914.JPG)
* 상품 목록
![상품목록](https://user-images.githubusercontent.com/102974272/179473996-143bfabf-3967-4871-b3d4-114897d02cf1.JPG)
* 상품 상세(로그인 후에만 접근가능)
![상세페이지](https://user-images.githubusercontent.com/102974272/179474058-773e2e2a-5646-4162-a933-239dd8b657a1.JPG)
* 상품리뷰 등록 팝업창
![상품상세_리뷰등록창](https://user-images.githubusercontent.com/102974272/179474180-79ba1337-0632-4611-a2cd-7f25728c8b6a.JPG)
* 리뷰 등록 결과
![리뷰등록결과](https://user-images.githubusercontent.com/102974272/179474304-1f0aab0b-11c9-425a-93a0-696a55e19faf.JPG)
* 장바구니 및 주문페이지
![카트](https://user-images.githubusercontent.com/102974272/179474561-d270b1df-17f6-4952-ac8d-d778bca3ba25.JPG)
![주문결제](https://user-images.githubusercontent.com/102974272/179474859-10d5c47c-4c14-4812-bfe6-3294dd8ad6d0.JPG)
* 마이페이지
![마이페이지1](https://user-images.githubusercontent.com/102974272/179476151-540191f0-6f5f-4047-8fb5-1130cdb1578a.JPG)
![마이페이지2](https://user-images.githubusercontent.com/102974272/179476160-29572ff3-b256-402e-9607-f9fae8187d13.JPG)
![리뷰목록](https://user-images.githubusercontent.com/102974272/179476511-a8292479-512d-4fe5-a2f0-fa2d3804e169.JPG)
