package HW2;

public class Student {
	int score=90;
	
	public void play(int hours) {
		score-=hours;
		}
		
	public void study(int hours) {
		score+=hours;
		}
	
	public static void main(String[] args) {
		Student William=new Student();
		Student Bo=new Student();
		
		William.play(5);
		William.study(20);
		Bo.play(20);
		Bo.study(40);
		System.out.println(William.score);
		System.out.println(Bo.score);
		
		
	}
}
