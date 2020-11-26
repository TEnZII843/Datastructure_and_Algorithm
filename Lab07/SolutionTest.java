public class SolutionTest{
	public static void main(String[] args) {
		Solution<String, Integer> BST = new Solution<String,Integer>();
		assert(BST.isEmpty()==true);
		BST.put("ABDUL",1);
		System.out.println(BST.get("ABDUL"));
		BST.put("HRITHIK",2);
		BST.put("SAI",3);
		BST.put("SAMAL",6);
		System.out.println(BST.get("SAI"));
		BST.put("TASHI",4);
		//assert(BST.contains("ABDUL")==true);
		System.out.println(BST.size());
		System.out.println(BST.min());
		System.out.println(BST.floor("HRITHIK"));
		System.out.println(BST.floor("HAHA"));
		System.out.println(BST.select(2));
		System.out.println(BST.keys("ABDUL","TASHI"));
		BST.put("CHIMI",5);
		BST.put("SAMAL",4);
		System.out.println(BST.get("SAMAL"));
		BST.put("NIMA",7);
		System.out.println(BST.size());
		System.out.println(BST.get("CHIMI"));
		System.out.println(BST.floor("CHIMA"));
		System.out.println(BST.keys("ABDUL","TASHI"));




		System.out.println("All test case pass");
	}
}
// PUT ABDUL 1
// GET ABDUL 
// PUT HRITHIK 2
// PUT SAI 3
// PUT SAMAL 6
// GET SAI
// PUT TASHI 4
// SIZE
// MIN
// FLOOR HRITHIK
// FLOOR HAHA
// SELECT 2
// KEYS ABDUL TASHI
// PUT CHIMI 5
// PUT SAMAL 4
// GET SAMAL