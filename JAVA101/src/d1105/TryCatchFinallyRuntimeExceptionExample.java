package d1105;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

		try {

			data1 = args[0];
			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("실행 매개 값이 부족합니다.");
			return;

		}

		try {

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);

			int rs = val1 + val2;

			System.out.println(data1 + " + " + data2 + " = " + rs);

		} catch (NumberFormatException e) {

			System.out.println("숫자로 변환할 수 없음.");

		} finally {
			
			System.out.println("다시 실행 ");

		}

	}

}
