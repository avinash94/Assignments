package MaxPathSum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problem67{
	public static void main(String[] args) throws IOException {
		BufferedReader buffer= new BufferedReader(new FileReader("/home/zemoso01/p067_triangle.txt"));
		String s,x;
		int lines=0;
		while(((s=buffer.readLine())) !=null){
			lines++;
		}
		BufferedReader br= new BufferedReader(new FileReader("/home/zemoso01/p067_triangle.txt"));
		int triangle[][]= new int[lines][];
		for (int i=0;i<lines;i++){
			triangle[i]=new int[i+1];
		}
		int k=0;
		String[] arr;
		while((x=(br.readLine())) !=null){
			{     arr=x.split(" ");
				for(int j=0;j<k+1;j++){
				triangle[k][j]=Integer.parseInt(arr[j]);	
				
			}k++;
		}
		
	}
		MaxSumPath max = new MaxSumPath(triangle,lines);
		System.out.println(max.maxsum());
		buffer.close();
		br.close();
		
		
}}