package d1017;

public class Home1_t {

	public static void main(String[] args) {
		
		

				// 길이 20의 배열 2개를 선언한다.
				// -2000 부터 2000 사이의 랜덤한 값을 저장한다.
				// 1번째 ~ 20번까지 출력하는데
				// 숫자가 큰 순서로 1~20위 까지도 함께 출력한다.
				
				int[] ar=new int[20];
				int[] rank=new int[20];
				
				for(int i=0; i<ar.length ; i++) {
					ar[i]=(int)(Math.random()*4001)-2000;
				}
				
				for(int i=0 ; i<ar.length ; i++) {
					int cnt=1;
					for(int j=0; j<ar.length ; j++) {
						if(ar[i]<ar[j]) {
							cnt++;
						}
					}
					rank[i]=cnt;
				}
				
				for(int i=0 ; i<ar.length ; i++) {
					System.out.printf("%2d 번째 값 : %5d", i+1, ar[i]);
					System.out.printf(", 순위 : %3d ",rank[i]);
					
					
					for(int j=rank[i];j>0;j--) {
						System.out.print("*");
					}
					
					System.out.println();
				}


	}

}
