//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖：

package HW5;

public class HW5 {
	public void genAuthCode() {
		String[] x = {"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n",
				"o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H",
				"I","J","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0;i<=7;i++) {
			int y =(int)(Math.random()*61);
			String z = x[y];
			System.out.print(z);
		}
	}

public static void main(String[] args) {
	System.out.print("本次隨機產生驗證碼為:"+"\n");
	HW5 ran = new HW5();
	ran.genAuthCode();
	}
}