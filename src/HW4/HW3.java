//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)

package HW4;

public class HW3 {
	public static void main(String[] args) {
			int count=0;
		String[] s1 ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		for(int i=0;i<s1.length;i++) {
			String s = s1[i];
					for(int j=0;j<s.toCharArray().length;j++) {
				char c =s.charAt(j);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
					count++;
				}
		}
	}
		System.out.println("總共有"+count+"個母音");
}
}
