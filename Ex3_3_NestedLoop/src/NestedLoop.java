
public class NestedLoop {
	public static void main(String[] argv) {
		int i, j;
		for(i=1; i<10; i++) {
			for(j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
	}
}
