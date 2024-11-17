# Scanner 클래스

java.util 패키지에서 제공하는 Scanner 클래스를 이용하여 화면에서 입력받을 수 있다.

자바를 공부하면서 프로그램 입력처리할 때 가장 많이 사용한다.




## 1. import
아래와 같이 import 선언
``` java
import java.util.Scanner;
```

## 2. 객체 생성
``` java
// 키보드 입력
Scanner scanner = new Scanner(System.in);

// 파일 입력
Scanner scanner = new Scanner(new File("파일경로"));

// 문자열 입력
Scanner scanner = new Scanner("입력 문자열");

```


## 3. 주요 메소드
### next() 
### 공백을 기준으로 하나의 문자열을 읽음
공백을 기준으로 한 번에 입력 가능하다.

``` java

import java.util.Scanner;

public class J101_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터를 입력 : ");
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
		
	}

}

```

**실행결과**

```
데이터를 입력 > 
a b c
a
b
c
```



## nextLine()

### 한 줄을 읽음(공백도 포함)

``` java
import java.util.Scanner;

public class J101_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터를 입력 > ");
		String a = sc.nextLine();
		System.out.println("데이터를 입력 > ");
		String b = sc.nextLine();
		System.out.println("데이터를 입력 > ");
		String c = sc.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
		
	}

}

```
**실행결과**

```
데이터를 입력 > 
a b c
데이터를 입력 > 
x y z
데이터를 입력 > 
1 2 3
a b c
x y z
1 2 3

```


## 자주 사용하는 타입별 메소드 
### 필요한 입력값에 맞춰서 아래의 메소드를 사용

* nextByte()
* nextInt()
* nextFloat()
* nextDouble()



## hasNext()
### 입력에 데이터가 남아 있는지 확인

## hasNextInt() 
### 다음 입력값이 정수인지 확인

``` java

import java.util.Scanner;

public class J101_Scanner_has {

	public static void main(String[] args) {
		
		String data = "1 q 2 w 3 e 4 r";
        Scanner sc = new Scanner(data);

		while (sc.hasNext()) {
			
			if (sc.hasNextInt()) {
				
				System.out.println("숫자: " + sc.nextInt());
				
			} else {
				
				System.out.println("문자열: " + sc.next());
			}
			
		}

        sc.close(); 
	}

}


```

```
숫자: 1
문자열: q
숫자: 2
문자열: w
숫자: 3
문자열: e
숫자: 4
문자열: r
```



## 형변환 필요할 때

next와, nextLine 메소드는 문자이기 때문에 숫자를 입력 받으면 형변환이 필요하다
nextInt를 사용하지 않고 정수 값이 필요할 때는 형변환을 한다.

``` java

// string -> Integer
String a = sc.next();
System.out.println(Integer.parseInt(a));

// Integer -> String
int b = sc.nextInt();
System.out.println(String.valueOf(b));

```


<table>
    <tr>
        <th>변환 방향</th>
        <th>사용 방법</th>
        <th>메서드/기법</th>
    </tr>
    <tr>
        <td>문자 → 정수</td>
        <td>
            <code>Character.getNumericValue()</code>,
            <code>Integer.parseInt()</code>
        </td>
        <td>단일 문자 또는 문자열 처리</td>
    </tr>
    <tr>
        <td>정수 → 문자</td>
        <td>캐스팅 <code>(char)</code>,
            <code>Character.forDigit()</code>
        </td>
        <td>ASCII 활용 또는 변환 함수</td>
    </tr>
    <tr>
        <td>문자열 → 정수</td>
        <td><code>Integer.parseInt()</code></td>
        <td>문자열 전체 처리</td>
    </tr>
    <tr>
        <td>정수 → 문자열</td>
        <td><code>String.valueOf()</code>, <code>Integer.toString()</code></td>
        <td>문자열 변환 함수</td>
    </tr>
</table>