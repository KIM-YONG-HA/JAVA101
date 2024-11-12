# 참조형 타입(Reference Type)




## 목차
1. 자바 변수의 타입
2. 문자열 선언 및 초기화
3. 배열 
4. 열거식
5. 인터페이스




## 1. 자바 변수의 타입
1. 기본형 타입(Primitive Type), 8개

* 정수타입 : byte, char, short, int, long
* 실수타입 : float, double
* 논리타입 : boolean


2. 참조형 타입(Reference Type), 4개

* 배열(Array)

* 열거형(Enum)

* 클래스(Class)

* 인터페이스(Interface)



## 2. 문자열의 선언 및 초기화 

문자열은 아래와 같은 형식으로 선언 및 초기화가 가능하다.
작은따옴표를 사용하는 byte와는 다르게 String 타입은 큰따옴표이다.


```

String 변수명 = "문자열";

```


``` java

String str = "문자열";

```

문자는 char타입, 문자열은 String 타입에 저장된다.

기존에 보았던 기본형들은 타입을 소문자로 작성하였지만 String 타입은 대문자(S)라는 차이점이 있다.


이클립스에서 String 입력 후 ctrl + click을 하게되면 

``` java

public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc {

...
...
...
             

```

String은 클래스임를 확인할 수 있고 클래스이기 때문에 참조형에 속한다.

추후에 메모리나 조건식 쪽에서 자세히 다루겠지만 str이라는 변수에 "문자열"이라는 값이 저장되는 것이 아니라 "문자열"이라는 값이 저장된 곳의 주소(번지)가 저장이 된다.

* 스택 영역 : str 변수에는 "문자열"이 저장된 힙 영역의 주소(n번지)
* 힙 영역 : n번지 "문자열" 저장



## 3. 배열(Array)



## 4. 열거식(Enum)


## 5. 인터페이스(Interface)














