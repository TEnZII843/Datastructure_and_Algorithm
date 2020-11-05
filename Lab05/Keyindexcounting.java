//key index counting sorting for int 
public class Keyindexcounting{

	public void Counting(int[] a){
		int N = a.length;
		int R=9;
		int[] aux = new int[N];
		int count[] = new int[R+1];
		
		for (int i = 0; i < N; i++)
		   count[a[i] + 1]++;

		for (int r = 0; r < R; r++)
		   count[r+1] += count[r];
		
		for (int i = 0; i < N; i++)
		   aux[count[a[i]]++] = a[i];
		
		for (int i = 0; i < N; i++)
		   a[i] = aux[i];
	}

	public static void main(String[] args) {
		int[] a={7,2,1};
		Keyindexcounting obj = new Keyindexcounting();
		obj.Counting(a);
		for (int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}

	}
}