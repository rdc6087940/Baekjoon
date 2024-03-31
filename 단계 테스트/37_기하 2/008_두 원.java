import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws  IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double x1 = Double.parseDouble(st.nextToken());
		double y1 = Double.parseDouble(st.nextToken());
		double r1 = Double.parseDouble(st.nextToken());
		double x2 = Double.parseDouble(st.nextToken());
		double y2 = Double.parseDouble(st.nextToken());
		double r2 = Double.parseDouble(st.nextToken());
		
		double dis = getDis(x1, y1, x2, y2);
		double result = 0;
		if(Math.abs(r1 - r2) >= dis) { 
			result = Math.PI * Math.pow(Math.min(r1, r2), 2);
		} else if(r1+r2 > dis) {
			double theta1 = Math.acos((r1 * r1 + dis * dis- r2 * r2) / (2 * r1 * dis));
			double theta2 = Math.acos((r2 * r2 + dis* dis- r1 * r1) / (2 * r2 * dis));

			double w1 = (r1 * r1 * theta1) - (r1 * r1 * Math.sin(2 * theta1) / 2);
			double w2 = (r2 * r2 * theta2) - (r2 * r2 * Math.sin(2 * theta2) / 2);
			result = w1+w2;
		}
		System.out.println(String.format("%.3f", result));
	}
	static double getDis(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
