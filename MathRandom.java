package Projects;

public class MathRandom {

	public static void main(String[] args) {
		int random = (int) (Math.random()* 11 + 5);
		int random2 = (int) (Math.random()* 13 - 5);
		int random3 = (int) (Math.random()* 7 + 12);
		
		System.out.println(random);
		System.out.println(random2);
		System.out.println(random3);

	}

}
