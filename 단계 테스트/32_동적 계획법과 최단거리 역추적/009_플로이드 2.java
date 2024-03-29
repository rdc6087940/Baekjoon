import java.io.*;
import java.util.*;

public class Main {
	static int n,m,INF = 10000001;
	static int[][] arr,next;		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	Stack<Integer> stack = new Stack<Integer>();
    	StringTokenizer st;
    	n = Integer.parseInt(br.readLine());
    	m = Integer.parseInt(br.readLine());
    	arr = new int[n+1][n+1];
    	next = new int[n+1][n+1];
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(i!=j)
    				arr[i][j] = INF;
    		}
    	}
    	for(int i=0;i<m;i++) {
    		st = new StringTokenizer(br.readLine()," ");
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int c = Integer.parseInt(st.nextToken());
    		arr[a][b] = Math.min(arr[a][b], c);
    		next[a][b] = a;
    	}
    	cal();		
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(arr[i][j] ==INF)
    				bw.write("0 ");
    			else	
    				bw.write(arr[i][j] + " ");
    		}
    		bw.newLine();
    	}
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(next[i][j]==0)		
    				bw.write("0\n");
    			else {		
    				int e = j;
    				stack.add(e);
    				while(next[i][e] != i) {
    					stack.add(next[i][e]);
    					e = next[i][e];
    				}
    				bw.write(stack.size() + 1 + " ");
    				bw.write(i + " ");
    				while(!stack.isEmpty()) 
    					bw.write(stack.pop() + " ");
    				bw.newLine();
    			}
    		}
    	}
    	bw.flush();		
    	bw.close();
    	br.close();
    }
    static void cal() {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			for(int k=1;k<=n;k++) {
    				if(arr[j][k] > arr[j][i] + arr[i][k]) {
    					arr[j][k] = arr[j][i] + arr[i][k];
    					next[j][k] = next[i][k];		
    				}
    			}
    		}
    	}
    	return;
    }
}
