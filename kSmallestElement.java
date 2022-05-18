package inbuiltpriorityqueue;
import java.util.*;
import java.io.*;
public class kSmallestElement {
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator. reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }
        for(int i=k;i<n;i++){
            if(pq.peek()>input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
		ArrayList<Integer> output=new ArrayList<>(pq);
        return output;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		int k = Integer.parseInt(br.readLine());
		ArrayList<Integer> output = kSmallest(n, input, k);
		Collections.sort(output);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}
}
