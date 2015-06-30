package MaxPathSum;

public class MaxSumPath {
int triangle[][];
int lines;
	

public MaxSumPath(int[][] triangle, int lines) {
	this.triangle=triangle;
	this.lines=lines;
}
int maxsum(){
	for(int i=lines-2;i>-1;i--){
		for(int j=0;j<i+1;j++){
			triangle[i][j]=triangle[i][j]+Math.max(triangle[i+1][j],triangle[i+1][j+1]);
		}
	}
	return(triangle[0][0]);
	
}
}
