package massivi;

public class massivi {

	public static void main(String[] args) {
		String end = "Массив создан и отсортирован. Конец программы.";
		int[] mass;
		int i = 0;
		int h = 0; //показатель перемещения
		mass = new int [100000];
		for (i=0; i<mass.length; i++) {
			double k = Math.random();
			int n = (int) (k*100+1);
			mass [i] = n;
		}
//		for (i=0; i<mass.length; i++) {
//			System.out.print(mass[i] + " ");
//		}
	System.out.println ();
		do {
			for (i=0; i<(mass.length-1); i++) {
			//h =0; показатель перемещения
			if (mass[i]>mass[i+1]) {
				int m = 0;
				m = mass[i+1];
				mass[i+1] = mass[i];
				mass[i] = m;
				h ++;
			}
			} 
			h--;
			}while (h>0);
			for (i=0; i<mass.length; i++) {
				System.out.print(mass[i] + " ");
			}
			System.out.println ();
			System.out.println (end);
			}
}
