package d1105;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

		try {

			int a = 10/0;
			data1 = args[0];
			data2 = args[1];
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);

			int rs = val1 + val2;

			System.out.println(data1 + " + " + data2 + " = " + rs);
			

		} catch (ArrayIndexOutOfBoundsException e) {

			
			System.out.println("실행 매개 값이 부족합니다.");

		} catch (NumberFormatException e) {
			
			System.out.println("숫자로 변환할 수 없음.");

		} catch(Exception e) {
			
			System.out.println(e);
			
		} finally {
			
			System.out.println("다시 실행 ");

		}
		
		

	}

}
