
# 형 변환(Type Casting)


# 자동 형 변환(Promotion), 묵시적형변환

```
큰 허용 범위타입 = 작은 허용 범위타입
```

## 기본타입 허용 범위 크기 
### byte < short < int < long < float < double



``` java

byte byteVal = 10;
int intVal = byteVal;
System.out.println(intVal); // 10

long longVal = 5000000000L;
float floatVal = longVal;
double doubleVal = longVal;

System.out.println(floatVal); // 5.0E9
System.out.println(doubleVal); // 5.0E9

```

* 예외 : byte to char
* 허용범위가 다르다 (byte타입 : -128 ~ 127 / char타입은 0 ~ 65533) 

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

```




``` java

byte b1 = 10;
byte b2 = 20;
int byteResult = b1 + b2;

System.out.println(byteResult);

```







//		float f1 = 1.5F;
//		double d1 = 1.52;
//		double doubleResult = f1 + d1;
//		
//		//System.out.println(doubleResult);
//		
//		
//		float f2 = 2.2f;
//		float f3 = 2.2f;
//		double doubleResult2 = f2 + f3;
//		
//		//System.out.println(doubleResult2);
//		
//		








## 강제형변환

// 작은 허용범위 타입 = (작은 허용범위 타입) 큰허용범위타입
``` java

int intValue = 10;
byte byteValue = (byte) intValue;
System.out.println(byteValue); // 10

```

* int타입은 char타입보다 더 큰 허용범위를 가지나 자동 타입변환 되지 않는다.

* 정수값으로 char타입에서 문자를 출력하기 위해 변환한다

``` java
int intValue1 = 65;
char charValue1 = (char) intValue1;
System.out.println(charValue1);
```

// 실수(float, double)은 정수타입(byte, short, int, long)으로 자동변환 되지 않는다.
// 소수점 부분은 버려지고 정수부분만 저장된다.

``` java
double doubleValue2 = 3.14;
int intValue2 = (int) doubleValue2;
System.out.println(intValue2);
```







#

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
