# 컬렉션 프레임워크(Collection framework)

자료구조를 사용해서 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 인터페이스와 구현 클래스를 java.util 패키지에서 제공하며 이것을 컬렉션 프레임워크라 한다.



## 목차
### 1. List 컬렉션
### 2. Set 컬렉션
### 3. Map 컬렉션
### 4. LIFO 컬렉션 - Stack(스택)
### 5. FIFO 컬렉션 - Queue(큐)



## 1. List 컬렉션

배열과 공통점
* 객체를 인덱스로 관리   

배열과 차이점
* 저장용량 자동 증가
* 객체를 저장할 때 자동 인덱스 부여
* 추가, 삭제, 검색을 위한 여러 메소드 제공

객체 자체를 저장하는 것이 아니라 번지를 참조   
중복 저장이 가능하며 중복 데이터는 동일한 번지 참조 
null도 저장 가능하며 개체를 참조하지 않음.





### 1-1. ArrayList

* 기본 생성자로 ArrayList 객체를 생성 초기용량은 10이다.
* 객체가 하나 삭제되면 인덱스를 앞으로 1씩 당겨지고
* 특정 인덱스에 객체가 하나 추가되면 뒤 객체들은 1씩 밀려난다.





ArrayList 생성

``` java

List<E> list = new ArrayList<E>();
List<E> list = new ArrayList<>(); // 타입 생략 가능 : 타입이 없을 경우 List의 타입을 사용

```

메소드 

* boolean add(E e) : 맨 끝에 추가 
``` java
List<String> list = new ArrayList<>();
list.add("text1");
list.add("text2");
```

* void add(int index, E element) : 지정한 인덱스에 추가
``` java
list.add(3, "text3");
list.add(4, "text4");
```

* boolean contains(Object o) : 객체가 저장되어 있는지 검색
``` java
System.out.println(list.contains("text4")); // true
``` 

* E get(int index) : index번째 값을 검색
``` java
System.out.println(list.get(0)); // text1
```

* boolean isEmpty() : 컬렉션이 비어있는지 확인
``` java
System.out.println(list.isEmpty()); // false
```

* int size() : 저장되어 있는 전체 객체 수 리턴
``` java
System.out.println(list.size()); // 4
```

* E remove(int index) : index번 째 객체 삭제, 삭제 후 인덱스 자동정렬
``` java
System.out.println(list); // [text1, text2, text3, text4]
list.remove(0);
System.out.println(list); // [text2, text3, text4]
list.remove(0);
System.out.println(list); // [text3, text4]

```

* boolean remove(Object o) : 주어진 객체를 삭제
``` java
list.remove("text3");
System.out.println(list); // [text4]
```

* void clear() : 저장된 모든 객체 삭제
``` java
list.clear();
System.out.println(list); // []
```


저장된 객체 출력

객체 저장
``` java
list.add("text1");
list.add("text2");
list.add("text3");
list.add("text4");
```

for문 사용
``` java
for(int i=0;i<list.size();i++) {
    
    System.out.print(list.get(i) + " "); //text1 text2 text3 text4 
    
}
```

향상된 for문 사용
``` java
for(String str : list) {
    
    System.out.print(str + " "); //text1 text2 text3 text4 
    
}

```



### 1-2. Vector

* ArrayList와 동일한 내부구조를 가지고 있어 **사용법은 동일**하다.
* 다른점은 동기화된 메소드(synchronized)로 구성 되어 있기 때문에 하나의 쓰레드가 완료되어야 벡터 메소드 실행할 수 있다(Thread Safe, 쓰레드에 안전하다)


Vector 예시
``` java
List<Board> list = new Vector<>();

list.add(new Board("제목1", "내용1", "작성자1"));
list.add(new Board("제목2", "내용2", "작성자2"));
list.add(new Board("제목3", "내용3", "작성자3"));
list.add(new Board("제목4", "내용4", "작성자4"));
list.add(new Board("제목5", "내용5", "작성자5"));

list.remove(1);
list.remove(3);


for(int i=0;i<list.size();i++) {
    
    Board b = list.get(i);
    System.out.printf("|%s|%s|%s|%n", b.getTitle(), b.getContent(), b.getTitle());

/// |제목1|내용1|제목1|
/// |제목3|내용3|제목3|
/// |제목4|내용4|제목4|

}

System.out.println();

Board b2 = null;

for(Board b : list) {
    
    if(list.size() > 0) {
        
        b2 = b;
        System.out.println(b2); // toString 메소드 실행 

    }
    
// Board [title=제목1, content=내용1, writer=작성자1]
// Board [title=제목3, content=내용3, writer=작성자3]
// Board [title=제목4, content=내용4, writer=작성자4]    
    
}



```




### 1-3. LinkedList

* LinkedList 또한 List의 구현 클래스이므로 ArrayList와 사용법은 같으나 내부구조는 다르다.

* ArrayList는 내부 배열에 객체를 저장해서 관리하지만 LinkedList는 인접참조를 링크해서 체인처럼 관리

* 객체를 중간에 추가, 삭제하는 경우 ArrayList보다 성능이 좋다(앞 뒤 링크 정보면 변경하기 때문)

* 순차적 추가/삭제, 검색은 ArrayList보다 느리다.

* 일반적으로 ArrayList 많이 사용 







## 2. Set 컬렉션

* Set 컬렉션은 저장 순서가 유지되지 않는다
* 객체를 중복해서 저장할 수 없다
* 하나의 null값 저장 가능
* 수학에서 집합과 비슷하다

* Set 컬렉션에는 HashSet, LinkedHashSet, TreeSet 등이 있고 인덱스로 관리하지 않기 때문에 인덱스를 파라미터값으로 사용하는 메소드가 없다
* 인덱스가 없기 때문에 List 컬렉션과 다른 방식으로 출력해야한다.



Set 컬렉션 메소드

* boolean add(E e) : 객체를 저장한다. 저장시 T, 중복시 F 리턴

* boolean contains(Object o) : 객체가 저장되어있는지 확인

* boolean isEmpty() : 컬렉션이 비어있는지 확인

* Iterator<E> interator() : 저장된 객체를 한 번씩 가져오는 반복자 리턴

* int size() : 저장되어있는 전체 객체 수

* void clear() : 컬렉션에 저장된 객체를 모두 삭제

* boolean remove(Object o) : 지정된 객체 삭제 



Iterator Interface

Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다.

**전체 객체**를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 사용한다.

반복자는 Iterator 인터페이스를 구현한 객체이고 interator() 메소드를 사용한다.


Iterator 인터페이스 메소드

* boolean hasNext() : 가져올 객체가 있으면 T, 없으면 F
* E next() : 컬렉션에서 객체 하나를 가져온다.
* void remove() : Set 컬렉션에서 객체를 제거

반복 예시

``` java
Set<String> set = new HashSet<>();

set.add("text1");
set.add("text2");
set.add("text3");
set.add("text4");


Iterator<String> ite = set.iterator();

while(ite.hasNext()) {
    
    String data = ite.next();
    System.out.print(data + " "); // text3 text4 text1 text2 
    
}

```


### 2-1. HashSet
* HashSet은 객체들을 순서 없이 저장하며 중복 저장하지 않는다
* HashSet이 판단하는 동일한 객체란 같은 인스턴스를 뜻하는 것만은 아니다.
* HashSet은 객체를 저장하기 전에 hashCode() 메소드를 호출해서 해시코드를 얻어내고 이미 저장되어 있는 객체들의 해시코드와 비교한다.

* 동일한 해시코드가 있다면 equals() 메소드로 두 객체를 비교하여 논리값을 리턴한다.







## 3. Map 컬렉션 

* Map 컬렉션은 키(Key)와 값(Value)으로 구성된 Map.Entry 객체를 저장하는 구조

* Entry는 Map 인터페이스 내부에 선언된 중첩인터페이스 

* 키와 값은 모두 객체.

* 키는 중복될 수 없고, 값은 중복 가능하다.

* 기존에 저장된 키로 값을 저장하면 새로운 값이 대체된다.



메소드 


* V put(K key, v Value) : 주어진 키로 값을 저장한다.   
새로운 키일 경우 null을 리턴하고 동일한 키가 있을 경우 값을 대체하고 이전 값을 리턴한다.

* boolean containsKey(Object key) : 키의 여부를 확인

* boolean containsValue(Object value) : 값의 여부를 확인

* Set<Map.Entry<K,V>> entrySet() : 키와 값의 쌍으로 구성된 모든 Map.Engry 객체를 Set에 담아서 리턴

* V get(Object key) : 키가 있는 값을 리턴

* boolean isEmpty() : 컬렉션이 비어있는지 확인

* Set<K> keySet<> : 모든 키를 Set 객체에 담아서 리턴

* int size() : 저장된 키의 총 개수

* Collectio<V> values() : 저장된 모든 값을 콜렉션에 담아서 리턴 

* void clear() : 모든 Map.Entry(키, 값)을 삭제

* V remove(Object key) :키와 일치하는 Map.Entry를 삭제하고 값을 리턴 















### 3-1. HashMap

HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션.

HashMap의 키로 사용할 객체는 hashCode(), equals()메소드로 재정의해서 동등 객체가 될 조건을
정의해야한다.   
중복 저장이 되지 않도록 객체가 달라도 동등 객체라면 같은 키로 간주한다.



Map 컬렉션 생성

``` java
Map<String, Integer> map = new HashMap<>();
```


객체 저장 

``` java

map.put("홍길동", 100);
map.put("유재석", 80);
map.put("정형돈", 10);
map.put("박명수", 77);
map.put("홍길동", 44); // 이름키가 중복되어 100->44로 변경 

System.out.println(map.size()); // 4 

```

객체 찾기 


``` java 
System.out.println("홍길동의 점수 : " + map.get("홍길동")); // 44
```
		


객체를 하나씩 처리 

``` java
Set<String> keySet = map.keySet(); // key set 얻기 
Iterator<String> keyIterator = keySet.iterator();

while(keyIterator.hasNext()) {


String key = keyIterator.next();
Integer value = map.get(key);

System.out.printf("[%s:%d]%n", key, value);

//			[정형돈:10]
//			[박명수:77]
//			[홍길동:44]
//			[유재석:80]

}

``` 
		












## 4. LIFO 컬렉션 - Stack(스택)
### LIFO(Last In First Out, 후입선출)

### Stack 클래스 메소드
* push(E item) : 주어진 객체를 스택에 넣는다.
* pop() : 스택의 맨 위 객체를 가져오고 제거한다.
* peek() : 스택의 맨 위 객체를 가져오기만 한다.


후입선출 예시

``` java
// Coin class
class Coin {
	
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
```

``` java
// main method
public static void main(String[] args) { 

    Stack<Coin> coinBox = new Stack<Coin>();

    coinBox.push(new Coin(500));
    coinBox.push(new Coin(100));
    coinBox.push(new Coin(50));
    coinBox.push(new Coin(10));

    while(!coinBox.isEmpty()) {

        Coin coin = coinBox.pop();
        System.out.println("꺼낸 동전 : " + coin.getValue());

        // 꺼낸 동전 : 10
        // 꺼낸 동전 : 50
        //꺼낸 동전 : 100
        // 꺼낸 동전 : 500

    }

}
```











## 5. FIFO 컬렉션 - 큐(Queue) 
### FIFO(First In First Out, 선입선출)

비동기방식 - ex) javascript ajax


### Queue Interface 정의 메소드 
* offer(E e) : 객체를 넣는다.
* poll() : 객체를 가져오고 큐에서 제거한다.
* peek() : 객체를 가져오기만 한다.


선입선출 예시

``` java
// Message Class
class Message {

    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

}
```

``` java
// 메인 메소드 

public static void main(String[] args) {

    Queue<Message> msgQ = new LinkedList<>();

    msgQ.offer(new Message("카톡", "정형돈"));
    msgQ.offer(new Message("메일", "유재석"));
    msgQ.offer(new Message("문자", "박명수"));

    while(!msgQ.isEmpty()) {

        Message msg = msgQ.poll();
        System.out.printf("%s에게 %s를 보냅니다.%n", msg.to, msg.command);

// 정형돈에게 카톡를 보냅니다.
// 유재석에게 메일를 보냅니다.
// 박명수에게 문자를 보냅니다.


    }

}

```