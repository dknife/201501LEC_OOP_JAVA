
public class ArrayBasic {
	public static void main(String[] args) {
		int iArray[][] = {
				{90, 90, 110, 110},
				{120, 110, 150, 160},
				{110, 100, 145, 170}
		};
		
		double sum=0;
		double yearlyAvg;
		double quaterlyAvg[] = {0,0,0,0};
		
		for(int year=0; year < iArray.length; year++) {
			for(int quater=0; quater < iArray[year].length; quater++) {
				sum += iArray[year][quater];
				quaterlyAvg[quater] += iArray[year][quater];
			}
		}
		yearlyAvg = sum / iArray.length;
		for(int quater=0;quater<iArray[0].length;quater++) {
			quaterlyAvg[quater]/=iArray.length;
		}
		System.out.println("Yearly Average = " + yearlyAvg);
		System.out.println("Quaterly Average");
		System.out.println("1\t\t\t2\t\t\t3\t\t\t4");
		for(int quater=0;quater<iArray[0].length;quater++) {
			System.out.print((int)quaterlyAvg[quater]+"\t\t\t");
		}
	}
}
