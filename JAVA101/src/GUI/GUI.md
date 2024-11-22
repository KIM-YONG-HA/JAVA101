# GUI(Graphical User Interface)

## GUI 목적

## GUI 특징

## JAVA GUI 프로그래밍 방법
GUI 컴포넌트와 그래픽 이용

AWT패키지와 Swing 패키지에서 제공되는 매커니즘 이용

AWT - java.awt 패키지
Swing - javax.swing 패키지



## AWT(Abstract Windowing Toolkit)

중량 컴포넌트(Heavy Weight Component)이나 처리속도는 빠름   
native(peer) os의 gui 컴포넌트 도움을 받아 작동



## Swing

AWT 기술을 기반으로 순수 JAVA로 만들어진 라이브러리    
native(peer) 운영체제에 의존하지 않음
접두사 J로 시작하는 클래스  

1. JComponent는 상속 받는 클래스
2. AWT의 Container를 상속 받는 클래스 



## 컨테이너
java.awt.Container 상속


AWT 컨테이너 :
Swing 컨테이너 :  


## 최상위 컨포넌트
다른 컨테이너에 속하지않고 독립적으로 출력이 가능한 컨테이너    
JFrame, JDialog, JApplet   
모든 컴포넌트는 컨테이너에 포함되어야 출력이 가능    
   

## 컴포넌트 



## import문

import java.awt.* : 
import java.awt.event.* : awt 이벤트

import javax.swing.* :
import javax.swing.event.* : 스윙 이벤트




## JFrame 스윙 프레임 

1. JFrame의 상속을 받아 구현한다.

2. 스윙 프레임에 컴포넌트를 부착하는 방식


* 프레임 : 스윙 프로그램의 기본 틀
* 메뉴바 : 메뉴들이 부착되는 공간
* 컨테트 팬 : GUI 컴포넌트들이 부착되는 공간 

프레임 위에 메뉴바+컨텐트 팬이 위치하고
컨텐트 팬에 모든 컴포넌트들이 부착된다.


``` java

import javax.swing.*;


public class MyFrame extends JFrame {

    public MyFrame(){
        setTitle("프로그램 상단 타이틀");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        setSize(300,300); // 프로그램 창 사이즈
        setVisual(true); // 

    }

    public static void main(String[] args){
        new MyFrame(); // 메인메소드로 클래스 실행
    }

}


```

### 1. setTtitle(String) : 프로그램의 타이틀 설정

setTitle() 메소드 호출 또는 JFrame 생성자를 호출하여 타이틀 설정 가능

``` java
setTitle("프로그램 상단 타이틀");
```
``` java
super("프로그램 상단 타이틀");
```

### 2. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JFrame 생략 가능   
설정하지않으면 프로그램 창을 닫아도 화면에서 사라지지만 종료되지 않음

프로그램 실행시 메인 스레드 + 이벤트 분배 스레드가 실행되는데
창을 닫을 경우 메인 스레드만 종료되고 이벤트 분배 스레드가 살아있음.

메인스레드 
* main() 메소드를 실행하는 스레드
* 자바 프로그램을 실행을 시작한 스레드

이벤트 분배 스레드 : 프레임, 버튼 등의 GUI화면 그리기, 이벤트 처리 코드 호출
* 스윙 프로그램이 실행될 때 자동으로 실행되는 스레드


``` java
setDefaultCloseOperation(EXIT_ON_CLOSE);
```

3. setSize(int width, int height) : 프로그램의 너비, 높이 설정
4. setVisual(Boolean) : true로 설정시 컴포넌트가 출력

5. main() : 일반적으로 메인메소드에서 실행 



## 프레임에 컴포넌트 부착하기


``` java
public class MyFame extends JFrame {

    public MyFrame(){

        setTitle("컴포넌트 부착 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        JButton btn = new Button("버튼");
        c.add(btn);


    }



}



```









## 컨테이너의 배치

1. 각 컨테이너 마다 하나의 Layout Manager(배치관리자)가 있으며 추가되는 컴포넌트의 위치와 크기를 결정
2. 컨테이너의 크기가 변하면 컴포넌트들의 위치와 크기를 재조절 및 재배치


``` java
Container c = getContentPane();

```


## Layout Manager(배치관리자) 유형
* flowLayout : 순차적으로 overflow시 줄바꿈
* borderLayout : 동,서,남,북,중앙
* gridLayout : flowLayout과 유사 
* cardLayout : 카드처럼 겹침




### FlowLayout 

new FloatLayout( ,int a, int b)
FloatLayout.LEFT
FloatLayout.CENTER
FloatLayout.RIGHT


hGap : 좌우 컴포넌트 수평 간격, 픽셀단위, 디폴트 5px
vGap : 상하 컴포넌트 수직 간격, 픽셀단위, 디폴트 5px



### BorderLayout 

void add(Component comp, int index)

BorderLayout.EAST
BorderLayout.WEST
BorderLayout.SOUTH
BorderLayout.NORTH
BoarderLayout.CENTER

vGap :    
hGap : 

ex) 가운데에 버튼을 두개 넣고 싶으면 컨테이너를 위치시킨다.   




### GridLayout 

컨테이너 공간을 그리드로 분할하여 각 셀에 하나의 컴포넌트 배치 

그리드 구성은 행, 열의 수를 지정


GridLayout()
GridLayout(int rows, int columns)
GridLayout(int rows, int columns, int hGap, int vGap)


```
new GridLayout(4,3,5,5) // 4행 3열, 좌우상하 간격 5px
```





## 배치관리자가 없는 컨테이너

```
JPanel p = new JPanel();
p.setLayout(null); // 
```

default BorderLayout이 있기 때문에 null값 지정



## 컴포넌트의 절대크기 절대위치 설정

프로그램 내에서 메소드 사용
컴포넌트 크기 : component.setSize(int width, int height)
컴포넌트 위치 : component.setLocation(int x, int y)
컴포넌트 위치와 크기 : component.setBounds(int x, int y, int width, int height)





- - - 




# 이벤트 기반 프로그래밍 

## 이벤트 종류


## 




1. 이벤트 발생
2. JVM
3. 이벤트 분배 스레드 
4. ActionEvent 생성 




## 이벤트 소스 : 이벤트를 발생시킨 GUI 컴포넌트 

## 이벤트 객체 : 발생한 이벤트에 대한 정보



interface ActionListener{


}



interface mouse {



}



컴포넌트는 다른 이벤트에 대한 리스너를 동시에 가질 수 있다.  
여러개일 경우 마지막 이벤트리스터부터 실행




## 이벤트 리스너 작성법

1. 독립클래스로 작성

2. 내부 클래스로 작성

3. 익명 클래스로 작성 






## Key 이벤트와 포커스

### 조건
1. 키를 누르는 순간
2. 누른 키를 떼는 순간



키 이벤트는 포커스가 필요하다.   




```
setVisible(true); // 스윙 프레임 출력 

component.setFocusable(true);
component.

```



## 마우스 이벤트 




## GUI 구성 방법 

### 컴포넌트 기반 GUI 프로그래밍

스윙 패키지에 주어진 GUI 컴포넌트 이용   
GUI 구성이 쉽다.

### 그래픽 기반 GUI 프로그래밍
선, 원, 도형 이미지를 직접 그려넣는다.  
자바 패키지에 없는 독특한 GUI 구현 가능




## JComponent의 메소드 




## JLable 컴포넌트


JLable()
JLable(Icon image)
JLable(String text)
JLable(String text, Icon image, int hAlign)

hAlign
SwingConstant.LEFT
SwingConstant.RIGHT
SwingConstant.CENTER











# GUI - 3

# Graphics 객체
javax.awt.Graphics

배경 이미지 
도형 

``` java
@Override
public void paintComponent(Graphics g){

}
```




컴포넌트로 이미지 그리기
간편하고 쉽다.
이벤트 편리
리사이징 불가 


Graphics 메소드 
리사이징, 일부만 그리기 가능한
컴포넌트로 관리되지 않음


1. 원본크기로 그리기
2. 크기 조절하여 그리기
3. 일부분만 그리기 