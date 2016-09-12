package chenbin.com;
import java.util.*;
public class addNumber {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Please input the score:");
		int count=0;
		int score=input.nextInt();
		System.out.println("old score is "+score);
		while(score<60){
			score+=1;
			count++;
		}
		System.out.println("The New score is "+score);
		System.out.println("The Count is "+count);
	}}
