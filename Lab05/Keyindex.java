// Key index counting sorting for Char
public class Keyindex{

	public void Counting(char[] a){
		int N = a.length;
		int R=256;
		char[] aux = new char[N];
		int[] count = new int[R+1];
		
		for (int i = 0; i < N; i++){
		   count[a[i] + 1]++;
		}

		for (int r = 0; r < R; r++){
		   count[r+1] += count[r];
		}
		
		for (int i = 0; i < N; i++){
		   aux[count[a[i]]++] = a[i];
		}
		
		for (int i = 0; i < N; i++){
		   a[i] = aux[i];
		}
	}

	public static void main(String[] args) {
		char[] a={'c','a','b','z','a','r'};
		Keyindex obj = new Keyindex();
		obj.Counting(a);
		for (int i=0;i<a.length;i++){
			System.out.println(" "+a[i]);
		}
	}
}