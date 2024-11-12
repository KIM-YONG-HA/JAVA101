
# 형변환(Type Casting)

형변환이란 한 데이터 타입의 값을 다른 데이터 타입으로 변환하는 과정이다.


## 목차 
1. 기본타입 허용 범위 크기
2. 자동형변환(묵시적형변환)
3. 자동형변환 예외
4. 자동형변환 예시 
5. 강제형변환(명시적형변환)
6. 강제형변환 예시


## 1. 기본타입 허용 범위 크기 
* byte < short < int < long < float < double


## 2. 자동형변환(묵시적형변환)

작은 데이터 타입에서 큰 데이터 타입으로의 변환이 발생할 때 Java가 자동으로 처리하는 것을 자동형변환이라고하고 데이터 손실이 없다.  
기본적으로 int형보다 작은 byte, short는 자동으로 타입변환 된다.


```
큰 허용 범위타입 = 작은 허용 범위타입
```
``` java
byte b = 10
int num = b;
```


**예시) byte -> int**

* byte가 더해지는 과정에서 int로 자동형변환

``` java

byte b1 = 10;
byte b2 = 10;
int result = b1 + b2;
System.out.println(result); // 20

```

**예시) int -> long**
* int가 더해지는 과정에서 long으로 자동형변환
``` java
int i1 = 10;
int i2 = 10;
long result = i1 + i2;
System.out.println(result); // 20
```

**예시) long -> float, double**

``` java

long l1 = 5000000000L;
float f1 = l1;
double d1 = l1;

System.out.println(f1); // 5.0E9
System.out.println(d1); // 5.0E9

```

**예시) float -> double**

``` java

float f1 = 1.5F;
double d1 = 1.52;
double doubleResult1 = f1 + d1;
System.out.println(doubleResult1); // 3.02

```


## 3. 자동형변환 예외(byte->char)

* byte에서 char로 자동형변환을 시도하면 각각 허용범위가 다르기 때문에 Type mismatch 에러가 나온다.

* byte : -128 ~ 127 / char : 0 ~ 65533


``` java

byte b1 = 10;
byte b2 = 10;
char result = b1 + b2; 
// Type mismatch: cannot convert from int to char

```



## 4. 자동형변환 예시

``` java

char charValue = '가';
int intValue = charValue;
System.out.println(intValue); // 유니코드로 출력 44032


int intValue1 = 11;
long longValue1 = intValue1;
System.out.println(longValue1); // 11


long longValue2 = 100;
float floatValue2 = longValue2;
System.out.println(floatValue2); // 100.0

float floatValue3 = 100.5F;
double doubleValue3 = floatValue3;
System.out.println(doubleValue3); // 100.5


float f2 = 2.2f;
float f3 = 2.2f;
double doubleResult2 = f2 + f3;

System.out.println(doubleResult2); // 4.400000095367432


```



## 5. 강제형변환(명시적 형변환)

큰 데이터 타입에서 작은 데이터 타입으로 변환할 때는 명시적으로 형변환을 해야한다.   
이 경우 데이터 손실이 발생할 수 있다.


* 작은 허용범위 타입 = (작은 허용범위 타입) 큰허용범위타입



### 5-1. int타입은 byte타입보다 더 큰 허용범위를 가지고 있어 명시적형변환이 필요하다.

``` java

int intValue = 10;
byte byteValue = (byte) intValue;
System.out.println(byteValue); // 10

```


### 5-2. 정수값으로 char타입에서 문자를 출력하기 위해 변환한다.

``` java

int intValue1 = 65;
char charValue1 = (char) intValue1;
System.out.println(charValue1);

```


### 5-3. 실수(float, double)은 정수타입(byte, short, int, long)으로 자동형변환 되지 않는다.

**소수점 부분은 버려지고 정수부분만 저장된다.**

``` java

double doubleValue2 = 3.14;
int intValue2 = (int) doubleValue2;
System.out.println(intValue2);

```



## 6. 강제형변환 예시

``` java
int intValue = 44032;
char charValue = (char) intValue;
System.out.println(charValue); // 가


long longValue = 500;
intValue = (int) longValue;
System.out.println(intValue); // 500


double doubleValue = 3.14;
intValue = (int) doubleValue;
System.out.println(intValue); // 3

```
