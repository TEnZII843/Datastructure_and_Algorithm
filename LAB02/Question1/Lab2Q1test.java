public class Lab2Q1test{		
	public static void main(String[] args) {
		Lab2Q1 obj1 = new Lab2Q1(5);


		obj1.push(1);
		obj1.push(2);
		obj1.push(3);
		obj1.pop();

		assert(obj1.size()==2);
		assert(obj1.isEmpty()== false);
		assert(obj1.pop() ==2);

		System.out.println("Test pass");

		}
}		