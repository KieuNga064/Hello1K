package nguyenthikieunga.com;

import java.util.Scanner;

//import sun.jvm.hotspot.tools.SysPropsDumper;

public class Test1K {
	/**
	 * đây là hàm để cộng hai số
	 * @param a là biến a có kiểu int
	 * @param b là biến b có kiểu int
	 * @return trả về tổng hai số
	 */
static int congHaiSo(int a , int b) 
{
	//đây là lệnh để cộng 2 số
	int c=a+b;
	return c;
}


	public static void main(String[] args) {
		int c=congHaiSo(3,5);
		
		System.out.println("Xin chào \n lớp 1K khóa 2");
		System.out.print("Obama");
		System.out.println();
		System.out.print("Putin");
		System.out.println();
		System.out.println("Nguyễn Thị \t Kiều Nga");
		System.out.println("\"dhgfjghf\"");
		
		System.out.println("Phương trình bậc 1: ax+b=0");
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập a:");
		a=sc.nextDouble();
		System.out.println("Nhập b:");
		b=sc.nextDouble();
		String kq=giaiPhuongTrinhBacMot(a, b);	
		System.out.println(kq);
		
		
	}
	/**
	 * đây là hàm giải phương trình bậc 1
	 * @param a là hệ số a có kiểu int
	 * @param b là hệ số b có kiểu int
	 * @return chuỗi biện luận giải phương trình bậc 1
	 */

	static String giaiPhuongTrinhBacMot(double a, double b) 
	{ 
		if(a==0 && b==0)
			return "Vô số nghiệm";
		if(a==0 && b!=0)
			return "Vô nghiệm";
		double x=-b/a;
		return "x="+x;
	}

}
