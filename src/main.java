
public class main {
	public static void main(String[] args) {
	int averageWeight = 32;
	if (averageWeight < 30) {
		System.out.println("Средний вес ниже допустимого");
	} else {
		System.out.println("Средний вес выше допустимого");
	}
	
	
		//task1
		int cube = 7; // 1-6
		switch (cube) {
			case 2:
			case 4:
			case 6:
				System.out.println("У тебя чётное число");
				break;
			case 1:
			case 3:
			case 5:
				System.out.println("У тебя нечётное число");
				break;
			default:
				System.out.println("Хм... да ты везунчик!");
<<<<<<< HEAD
				System.out.println("Покупал удачу?");
				System.out.println("Так держать салага!");
=======
>>>>>>> 4ea3b392ea878fc38a0186bc9a97570b0a2d5e19
		}
	}
}
