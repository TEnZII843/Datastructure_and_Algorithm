public class SequentialSearchSTtest{	
	public static void main(String[] args) {
		SequentialSearchST<String,Integer> sym = new SequentialSearchST<String,Integer>();
		
		assert(sym.isEmpty()==true);
		sym.put("karma",9);
		sym.put("Dorji",6);
		sym.put("Sonam",1);
		sym.put("Yangzo",4);
		sym.put("Tenzii",7);

		System.out.print(sym.keys());
		System.out.print("\n");

		assert(sym.contains("karma")==true);
		assert(sym.contains("kinga")==false);

		assert(sym.size()==5);
		assert(sym.get("karma")==9);
		assert(sym.get("Dorji")==6);

		sym.delete("karma");


		assert(sym.size()==4);


		System.out.println("all test case pass");

        
    }
}    