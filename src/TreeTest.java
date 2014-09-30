import java.util.Random;

public class TreeTest {

	public static void main(String[] args) {

		Tree tree = new Tree();
		Random r = new Random();
		long startTime, stopTime, elapsedTime1 = 0, elapsedTime2 = 0;
		int i = 0;
		int[] array = new int[2000000];
		// int[] array1 = { 10, 5, 6, 15, 14, 20 };
		// int[] array2 = { 100, 50, 200, 20, 60, 150, 250, 15, 55, 70, 120,
		// 230,
		// 500, 10, 17, 52, 57, 245 };

		for (i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10000000);
		}
		System.out.println("nor---------");
		startTime = System.currentTimeMillis();
		for (i = 0; i < array.length; i++) {
			tree.insert(array[i]);

		}
		stopTime = System.currentTimeMillis();
		elapsedTime1 = stopTime - startTime;

		tree.clearTree(); //root = null;

		System.out.println("rec---------");
		startTime = System.currentTimeMillis();
		for (i = 0; i < array.length; i++) {
			tree.insertRecursively(array[i]);

		}
		stopTime = System.currentTimeMillis();
		elapsedTime2 = stopTime - startTime;

		System.out.println("First execution: " + elapsedTime1 + "ms");
		System.out.println("Second execution: " + elapsedTime2 + "ms");

	}
}
