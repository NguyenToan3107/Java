
public class main {
    public static void main(String[] args) {
		MayTinhCasioFX500 mfx1 = new MayTinhCasioFX500();
		System.out.println("5+3= "+mfx1.cong(5, 3));
		double[] arr = new double[] {5, 1, 3, 4, 5, 8, 0};
		SapXepInterface sx1 = new SapXepChen();
		sx1.sawpXepTang(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
