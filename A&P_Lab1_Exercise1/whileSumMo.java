public class whileSumMo {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		int count = 0;
		num = (int)(Math.random()*10);
		System.out.println("O ariumos einai: " + num);
		while ( num > 0){
			sum = sum + num;
			count++;
			num = (int)(Math.random()*10);
			System.out.println("O ariumos einai: " + num);
		}
		System.out.println("\n Dimiourgiuikan " + count + " mi mideniki ariumoi kai to aurima toys einai " + sum + "\n");
	}
}