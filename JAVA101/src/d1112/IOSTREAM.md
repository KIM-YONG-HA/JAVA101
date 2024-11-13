# 입출력 스트림
자바에서 데이터는 스트림을 통해 입출력된다.


출발지->입력스트림->도착지 -> 프로그램 -> 출발지 -> 출력스트림 ->도착지


출발지 : 키보드, 파일, 프로그램
도착지 : 모니터, 파일 , 프로그램 



## 입출력 스트림의 종류 
1. 바이트 기반 스트림 : 그림 멀티미디어 등의 바이너리 데이터를 읽고 출력

* InputStream 

* OutPutStream

2. 문자 기반 스트림 : 문자데이터를 읽고 출력

* Reader

* Writer 




## 바이트 출력 스트림: OutputStream

OutputStream은 바이트 기반 출력스트림의 최상위 클래스(추상클래스)

### OutputStream 하위 클래스
* FileOutputStream
* PrintStream
* BufferedOutputStream
* DataOutputStream


### 메소드
* void | write(int b) : 1byte를 출력
* void | write(byte[] b) : 배열 b의 모든 바이트 출력
* void | write(byte[] b, int off, int len) : 배열 b[off] 부터 len개까지의 바이트 출력
* void | flush() : 출력버퍼의 잔류하는 모든 바이트 출력
* void | close() : 출력 스트림 닫기


### write(int b) 메소드

인트형 변수는 4바이트인데 끝 1바이트만 출력 스트림으로 보낸다

``` java

import java.io.*;

public class OutputStreamExam1 {

    public static void main(String[] args){

        OutputStream os = new FileOutputStream("C:/tmp/test1.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();


    }


}

```

클래스 실행 후 c:\\tmp 폴더에 test1.db 파일이 생성된다.



### write(byte[] b) 메소드

``` java


import java.io.*;

public class OutputStreamExam2 {

    public static void main(String[] args){

        OutputStream os = new FileOutputStream("C:/tmp/test2.db");

        byte[] arr = { 10, 20, 30 };

        os.write(arr);
        os.flush();
        os.close();

    }


}



```


## write(byte[] b, int off, int len) 메소드

``` java


import java.io.*;

public class OutputStreamExam3 {

    public static void main(String[] args){

        OutputStream os = new FileOutputStream("C:/tmp/test3.db");

        byte[] arr = { 10, 20, 30, 40, 50 };

        os.write(arr,1,3); // 20, 30, 40
        os.flush();
        os.close();

    }


}

```




## 바이트 출력 스트림: InputStream

I
InputStream 바이트 기반 출력스트림의 최상위 클래스(추상클래스)

### InputStream 하위 클래스
* FileInputStream
* BufferedInputStream
* DataInputStream





### InputStrea 메소드

* int | read() : 1byte를 읽고 리턴
* int | read(byte[] b) : 읽은 바이트를 매객밧으로 주어진 배열에 저장 후 바이트 개수를 리턴
* int | read(byte[] b, int off, int len) : len개까지 바이트를 읽고 b[off]부터 len개까지 저장, 바이트 개수 리턴 

* void | close() : 입력 스트림을 닫음



### read() 메소드 

입력스트림으로 부터 1byte를 읽고 int(4byte)타입으로 리턴한다
4byte중 끝 1byte에만 데이터가 들어가 있다.


더 이상 입력스트림으로 부터 바이트를 읽을 수 없을 때 read()메소드는 -1을 리턴한다 




``` java


public class InputStreamExam1 {

    public static void main(String[] args){

        InputStream is = new FileInputStream("C:/tmp/test1.db");

        while(true){

            int data = is.read();
            if(data == -1) break;

            System.out.println(data);



        }





    }




}


```











