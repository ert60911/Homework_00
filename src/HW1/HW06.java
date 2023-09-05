//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

package HW1;
public class HW06 {
public static void main(String[] args) {
	System.out.println(5+5); //為整數加法
	System.out.println(5+'5'); //'5'為UNIcode
	System.out.println(5+"5"); // "5"為字串
}
}
