package section6;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop = 0;
		while(true) {
			System.out.println("Hello" + loop);
			if(loop==4) {
				break;
			}
			loop ++;
			System.out.println("World" + loop);
		}

	}

}
