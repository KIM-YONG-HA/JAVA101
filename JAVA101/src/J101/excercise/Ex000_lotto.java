package J101.excercise;

import java.util.Arrays;
import java.util.Comparator;

public class Ex000_lotto {

	public static void main(String[] args) {
		
		
		
		
		// 가장 많이 나온 로또 번호를 찾아라.
		// 1~45까지 난수를 100만번 생성하여서 1~45가 각각 몇 회 나왔는지 출력
		// 가장 많이 나온 횟수로 순위를 매겨라.
		
		int[] lottoCount = new int[45];
        
        // 100만 번의 난수 생성
        for (int i = 0; i < 100000000; i++) {
            int ran = (int) (Math.random() * 45) + 1;
            lottoCount[ran - 1]++;
        }

        // 출현 횟수를 기준으로 번호와 횟수를 쌍으로 저장
        Integer[][] counts = new Integer[45][2];
        for (int i = 0; i < 45; i++) {
            counts[i][0] = i + 1;  // 번호 (1번부터 45번까지)
            counts[i][1] = lottoCount[i];  // 출현 횟수
        }

        // 출현 횟수를 기준으로 내림차순 정렬
        Arrays.sort(counts, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                return b[1] - a[1]; // 출현 횟수를 기준으로 내림차순 정렬
            }
        });

        // 출현 횟수와 랭킹 출력
        System.out.println("로또 번호 랭킹 (내림차순):");
        for (int i = 0; i < 45; i++) {
            System.out.println("랭크 " + (i + 1) + ": " + counts[i][0] + "번 (" + counts[i][1] + "회)");
        }
		
		
		
		

	}

}
