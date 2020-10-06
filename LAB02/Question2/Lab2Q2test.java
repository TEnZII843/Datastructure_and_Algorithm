public class Lab2Q2test{
	public static void main(String[] args) {
	
		
		Lab2Q2 obj2 = new Lab2Q2(8);
		obj2.enqueue(1);
		obj2.enqueue(2);
		obj2.enqueue(3);

		assert(obj2.len()==2);
		assert(obj2.isEmpty()== false);
				
		System.out.println(obj2.isEmpty());
		System.out.println(obj2.len());
		System.out.println(obj2.first());
		System.out.println(obj2.dequeue());
		System.out.println(obj2.len());
		System.out.println("Test pass");
	}

}
