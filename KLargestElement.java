package inbuiltpriorityqueue;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {
	public static ArrayList<Integer> kLargest(int input[], int k) {
	int n=input.length;
    PriorityQueue <Integer> pq=new PriorityQueue<>();
    for(int i=0;i<k;i++){
        pq.add(input[i]);
    }
    for(int i=k;i<n;i++){
        if(input[i]>pq.peek()){
            pq.poll();
            pq.add(input[i]);
        }
    }
    ArrayList<Integer> output=new ArrayList<>(pq);
    return output;
	
}
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int j = 0; j < n; j++) {
			input[j] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> output = kLargest(input, k);
		for(int i : output) {
			System.out.println(i);
		}
		
	}
}
