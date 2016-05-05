
public class prime {
public static void main(String[] args) {
	int a;
	System.out.println("The Prime numbers from 1 to 100 are: ");
	
	for(int i=1; i<=100; i++){
		a=0;
		for(int j=2;j<i;j++){
			
			if(i%j==0){
				a=1;
				break;
			}
		}
		if(a==0){
			System.out.println(i);
			}
		}
	}
}
