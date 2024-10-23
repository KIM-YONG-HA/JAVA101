package sec06.exam03.pakage2;

import sec06.exam03.pakage1.*; // package1 하위의 모든 클래스 (classA, classB)

public class ClassC {
	
	//A a; 
	// default class A : The type A is not visible, 
	// default는 같은 패키지 클래스만 사용 가능   
	
	ClassB b; // public class B : 다른 패키지에서도 사용 가능 
	

}
