# JavaRefactoringStudy
KOSTA 외부 교육 과정 리펙토링 수업 정리 (강사 : 엄기영)
-> 스프링 메이븐 버전으로 변환하여 수업내용 재구성하여 공부

# 리펙토링
- 코드의 기능을 바꾸지 않고 내부 구조를 이해하기 쉽고 고치기 쉽게 개선하는 작업
- 소스코드를 청소하는 활동으로, 코딩 작어의 일부이자 습관이다.
- 가독성, 재사용성, 유지보수성을 향상시킨다.
- 성능 최적화와는 상반되는 개념

# 리펙토링의 필요성
- 소스 코드는 시간에 따라 노후화 된다
- 코드는 한번에 완성되지 않는다.
- 나쁜 코드에 대한 기억 -> 이해불가 -> 재개발 -> 차세대 프로젝트
- SI 업계의 개발환경으로 인해 시간에 쫒겨 나쁜코드를 양산하는 현실

# 나쁜 코드의 결과
- 소스읽는 시간 증가 -> 코드 읽는 시간(90%) vs 코드 작성시간(10%)
- 유지보수 불가능, 생산성저하, 반복되는 재개발, 재구축(해외에는 없는 개념) 업그레이드, 출시 주기의 상승 
- 얽혀있는 소스 코드(스파게티코드) - > 잦은 오류
- 계속되는 덧 붙이기 -> 코드 복잡도 증가
- 원 개발의도와 변경된 내용 구별 불가 -> 추가적인 기능 추가, 변경 불가

# 코드의 구린내
1. 중복코드(Duplicated Code) : 하나만 고친다고 끝나지 않는다.
2. 장황한 메서드(Long Method)
3. 방대한 클래스(Long Class)
4. 과다한 매개변수(Long Parameter List)
5. 수정의 산발(Divergent Change) : 클래스가 다양한 원인, 다양한 방식으로 수정 될때
6. 기능의 산재(Shotgun Surgery) : 수정할 때마다 여러 클래스를 고쳐야할 때
7. 잘못된 소속(Feature Envy) : 필드, 메서드가 다른 클래스에 더 많이 사용될 때
8. 데이터 뭉치(Data Clumps)
9. Switch 문 : 객체지향 언어에서 switch 문의 재정의가 필요
10. 직무유기 클래스(Lazy Class) : 기능이 축소, 쓸모 없어진 클래스 정리필요
11. 막연한 범용코드(Speculative Generality)
12. 임시 필드(Temporary Field)
13. 메세지 체인(Message Chains) : 다수의 객체가 연쇄적인 요청이 발생할 때
14. 과잉 중계 메서드(Midle Man)
15. 지나친 관여(Inappropriate Intimacy) 
16. 인터페이스가 다른 대용 클래스
17. 미흡한 라이브러리 클래스(Incomplete Library Class)
18. 데이터 클래스(Data Class)
19. 방치된 상속물(Refused Bequest)
20. 불필요한 주석들(Comments)

# 리팩토링의 효과
- 소프트웨어 설계가 개선된다.
- 소프트웨어를 이해하기 쉬워진다.
- 버그를 찾기 쉬워진다.
- 프로그래밍 속도가 빨라진다.

# 리펙토링의 목표
* 중복이 없다. 클래스/메서드를 최대한 줄인다. 코드를 읽으면서 짐작했던 기능을 각 루틴이 그대로 수행한다. 코드가 그 문제를 풀기 위한 언어 처럼 보인다면 아름다운 코드이다. - 론 제프리. 워드 커닝햄

* 깨끗한 코드는 작성자가 아닌 사람도 읽기 쉽고 고치기 쉽다. 깨끗한 코드에는 의미 있는 이름이 붙는다. 의존성은 최소이며 명확히 정의한다. - 데이비드 A 토마스

# 클린 코드의 원칙
1. 가독성 : 쉬운 용어 사용
2. 단순성 : 한번에 한가지의 로직/처리 사용
3. 의존성 : 영향도 최소화
4. 중복성 최소화
5. 작게 추상화 : 상세 내용은 하위 클래스/메서드/함수에서 구현

# 리펙토링이 필요한 시점
개발중 틈틈히, 기능을 추가할때, 버그를 수정할때, 코드를 검수할 때




