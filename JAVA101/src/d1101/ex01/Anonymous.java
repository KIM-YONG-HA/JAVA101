package d1101.ex01;

public class Anonymous {

	// 부모클래스 Person을 상속을 받아서
	Person field = new Person() {

		@Override
		void wake() {

			System.out.println("새벽 5시에 일어납니다.");

		}

		void work() {

			System.out.println("출근함...");

		}

		
	};
	
	
		void method1() {

			Person localVar = new Person() {

				@Override
				void wake() {

					System.out.println("method  새벽 5시에 일어납니다.");

				}

				void work() {

					System.out.println("method 출근함...");
					work();

				}

			};

			localVar.wake();

		}
		
		
		void method2(Person person) {
			
			person.wake();
			
		}
		
		

	
	
	
	
	

}
