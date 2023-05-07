//java program to compute quaratic roots
//scanner is class whisch contains input functions
import java.util.Scanner; 

public class qudratic_roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double root1, root2;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of 'a': ");
		double a = input.nextDouble();
		System.out.println("enter the value of 'b': ");
		double b = input.nextDouble();
		System.out.println("enter the value of 'c': ");
		double c = input.nextDouble();

		if (a == 0) {
			System.out.println("Roots cannot be determined");
		} else {
			double d = Math.sqrt(b * b - 4 * a * c);
			if (d > 0) {
				System.out.println("Roots are real and distinct \n");
				root1 = (-b + d) / (2 * a);
				root2 = (-b - d) / (2 * a);
				System.out.println("The roots are: \nroot1=" +root1 + "\n" + "root2=" + root2);
			} else if (d == 0) {
				System.out.println("Roots are real and equal");
				root1 = root2 = -b / 2 * a;
				System.out.println("The roots are: \nroot1=root2=" + root1);
			} else {
				System.out.println("Roots are not real");
			}
		}

	}
}
