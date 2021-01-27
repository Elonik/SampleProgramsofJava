import java.util.*;

public class MockTest {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distances covered by racers in Marathon (Kilometers) please (press q toterminate)");
		List<Float> arr = new ArrayList<>();
		float[] arr1 = new float[3];
		float first = 0;
		float second = 0;
		float third = 0;
		String val = null;
		boolean flag = true;
		do {
			val = sc.next();
			if (!("q").equals(val)) {
				arr.add(Float.parseFloat(val));
			}
		} while (!("q").equals(val));
		sc.close();
		if (arr != null && arr.size() > 0) {
			for (int l = 0; l < arr.size(); l++) {
				if (arr.get(l) > 0.0 && arr.get(l) <= 42.195) {
					if (arr.get(l) < 42.195) {
						if (arr.get(l) > first) {
							third = second;
							second = first;
							first = arr.get(l);
						} else if (arr.get(l) > second) {
							third = second;
							second = arr.get(l);

						} else if (arr.get(l) > third) {
							third = arr.get(l);
						}
						arr1[0] = first;
						arr1[1] = second;
						arr1[2] = third;
					}
				}else{
					flag = false;
					System.out.println("Invalid Input");
					break;
				}
			}
			if(flag){
				System.out.println(arr1[0]);
				System.out.println(arr1[1]);
				System.out.println(arr1[2]);
			}
		}
	}
}
