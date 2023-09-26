//請自行建立一個文字檔Sample.txt，內容如下：
//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料



package HW7;
import java.io.File;

public class HW1 {
	static void p(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		File f1 = new File("\\C:\\THA104_Workspace\\HomeWork_30\\files\\Sample.txt");
		p("檔案有"+f1.length()+"個位元組");
		p(f1.);
	}
}
