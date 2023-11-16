package patterns;

public class MyJavaProject {

	public static void main(String[] args) {
		
		int n=5;
		//outer loop to handle rows
		for(int i=1; i<=n; i++) {
			//outer loop to handle rows
			for (int j=1;j<=n;j++) {
				System.out.print("*  ");
			}
			//printing new line for each row
			System.out.println();
		}
	}
}