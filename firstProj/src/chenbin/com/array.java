package chenbin.com;
import java.util.*;
public class array {
	public static void main(String[] args){
		int[] score=new int[]{12,2,35,14};
		for(int i=0;i<score.length;i++){
		System.out.println(score[i]);
		}
		Arrays.sort(score);
		for(int i=0;i<score.length;i++){
			System.out.println(score[i]);
			}
	}
	
	
}
