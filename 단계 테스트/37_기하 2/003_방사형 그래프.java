import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static int input[] = new int[8];
	public static int order[] = {0,1,2,3,4,5,6,7};
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<8;i++) {input[i] = Integer.parseInt(st.nextToken());}
		int answer=0;
		do {

		    boolean isPossible = true;
			for(int i=0;i<8;i++) {
			
				float result_ccw = ccw(
						                   new float[] { (float) - (input[order[i%8]] / Math.sqrt(2)),  (float) (input[order[i%8]] / Math.sqrt(2)) }
					                     , new float[] { (float)   0  ,  (float) (input[order[(i+1)%8]])}
					                     , new float[] { (float)  (input[order[(i+2)%8]] / Math.sqrt(2)),  (float) (input[order[(i+2)%8]] / Math.sqrt(2))}
					                   );
				if(result_ccw >= 0) {
					isPossible =false;
				}
				if(!isPossible) {
					break;
				}
			}
			
			
					
			
			if(isPossible) {
				answer++;
			}
		} while(nextPermutation(order));
		System.out.println(answer);
	}
	

	public static float ccw(float []a, float []b, float []c) {
		return (a[0]*b[1]+b[0]*c[1]+c[0]*a[1])-(b[0]*a[1]+c[0]*b[1]+a[0]*c[1]);
		
	}
	static boolean nextPermutation(int[] arr) {
		
		int i=7;
		while( i>0 && arr[i-1] >= arr[i] ) --i; 
		if(i==0) return false;
		
		int j = 7;
		while(arr[i-1]>=arr[j]) --j;
		
		int temp = order[i-1];
		order[i-1] = order[j];
		order[j] = temp;
		
		int k = 7;
		while(i<k) {
		    temp=order[i];
		    order[i]=order[k];
		    order[k]=temp;
			++i; --k;
		}
		return true;		
	}
}
