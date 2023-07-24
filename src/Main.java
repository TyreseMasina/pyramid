public class Main {
	public static void main(String[] args) {

		//triangle(5);


		for(int i = 1; i <5; i++){
			for(int j=5; j>i; j--){
				System.out.println("* ");
			}
			System.out.println( );
		}


	}
	public static void triangle(int n){
		for(int i = 0; i<n; i++){
			int space = i;
			for(int j=0; j<2*n-i-1;j++) {
				System.out.println("* ");
			}
			System.out.println(" ");
		}
	}
}
