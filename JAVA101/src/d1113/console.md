# 입출력 API


InputStream System.in

System.out




## System.in 필드
```
InputStream is = System.in;
```


## System.out 필드


System.out.print() : 괄호 안에 내용만 출력 
System.out.println() : 괄호 안에 내용 출력 후 줄바꿈
System.out.printf("형식문자열", 값1, 값2, ...) : 



## Scanner 클래스 

입출력 스트림, 보조스트림이 아님.

문자파일이나 바이트기반 입력스트림에서 라인단위로 문자열을 읽는다
java.util 패키지에서 제공하는 클래스 


## File 클래스 

java.io에서 제공하는 클래스    
파일 및 폴더 정보제공역할

``` java
File file = new File("C:/tmp/file.txt");
File file = new File("C:\\tmp\\file.txt");
```

### 경로 구분자
* 윈도우 : /, \ 모두 사용
* 유닉스, 리눅스 : / 사용





