# 레벨에 따른 계산기

### Lv1 (클래스 없는 기본적인 계산기)
  

> ##### 구현 설명
> + Main
>   
> while문을 통해 양수의 값 두 개를 입력받아 switch문의 조건을 통해 연산
>
> ##### 에러
> 1. 입력받은 값이 양수가 아닌 어떤 것일 경우
> -> InputMismatchException 에러 발생
>    
> 2. 연산자를 잘못 받았을 경우
> -> switch 조건에 없는 연산자이므로 defalut 값으로 걸러줌
>    
> 3. 0으로 나눗셈을 시도할 경우
> -> RuntimeException 에러 발생
>
> 에러의 경우는 catch문으로 경고문 출력, 다시금 연산할 수 있도록 반복

### Lv2 (클래스를 적용한 계산기)


> ##### 구현 설명
> + Calculator 클래스
>   
> 속성을 통해 변수 캡슐화
> 계산 기능 메소드(calculate) 구현
> setter를 통한 초기화
> getter를 통해 ArrayList 결과값 반환
> ArrayList 수정 기능
>
> + Main 클래스
>   
> Calculator 클래스를 객체화한 calculator 사용
> while문을 통해 양수의 값 두 개를 입력받아 setter로 초기화, calculate로 연산, getter로 결과 리스트 반환
> 리스트 값의 개수는 5개가 넘어갈 경우 제일 처음 계산한 값이 자동제거됨
>
> ##### 에러
> 1. 입력받은 값이 양수가 아닌 어떤 것일 경우
> -> InputMismatchException 에러 발생
>    
> 2. 연산자를 잘못 받았을 경우
> -> Exception 에러 발생
>    
> 3. 0으로 나눗셈을 시도할 경우
> -> ArithmeticException 에러 발생
>
> 에러의 경우는 catch문으로 경고문 출력, 다시금 연산할 수 있도록 반복

### Lv3 (Enum, 제네릭, 람다&스트림을 이용한 계산기)


> ##### 구현 설명
> + OperatorType 클래스(Enum)
>   
> enum 열거형 생성자를 이용해 상수를 초기화
> getter로 캡슐화된 symbol 접근
> 연산자 비교 메서드 (fromSymbol)
>
> + Calculator 클래스
>   
> OperatorType의 fromSymbol로 연산자 비교
> 
