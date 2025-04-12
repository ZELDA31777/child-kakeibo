# child-kakeibo
child-kakeibo는 어린이도 쉽게 사용할 수 있도록 설계된 토이 가계부 웹 애플리케이션입니다.

## 프로젝트 구조
- `backend/` : Spring Boot + JPA 기반의 REST API 서버
- `frontend/` : React 기반의 클라이언트 애플리케이션 (추후 도입 예정)

## 사용 기술
- Java 21 / Spring Boot / JPA (Hibernate)
- React / TailwindCSS
- H2 (개발용 DB), MySQL (운영용 DB)

## 주요 기능 (추후 검토 예정)
- 날짜별 지출 등록 및 수정
- 지출 항목 삭제
- 월별 가계부 보기
- 주 단위 및 카테고리 통계 시각화

## 🔧 현재 개발 방식
현재는 Spring Boot의 **RestController**를 활용하여 REST API 기반의 백엔드를 구축하고 있습니다. 이를 통해 초기에는 서버 측에서 기본 HTML과 JavaScript를 이용하여 화면을 구성하고, 클라이언트와 데이터를 주고받습니다.

향후에는 프론트엔드와 백엔드를 완전히 분리할 계획입니다. 이를 위해 API 설계를 보다 엄격하게 REST 원칙에 따라 리팩토링하여, 프론트엔드(React 등)와의 RESTful 통신 구조를 구현할 예정입니다!

잘 됐으면 좋겠습니다!

---

> "子供と一緒に、楽しい家計簿！"
