package d1101.ex01;

public class AnonyExample {

	public static void main(String[] args) {

		
		// 익명 객체 
		// 이벤트 처리에 자주 쓰임
		// 유지보수성 최악.
		
		Anonymous anony = new Anonymous();

		// anony.field.wake();
		anony.method1();

		anony.method2(

				new Person() {

					void study() {

						System.out.println("공부합니다.");

					}

					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}

				}

		);

	}

}
