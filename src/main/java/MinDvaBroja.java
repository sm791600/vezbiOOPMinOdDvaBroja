/*Напиши програма во која ќе употребиш метод кој наоѓа минимум од два
броја. Минимумот да се испечати на екран.

Домашна работа: Напиши програма во која внесуваш три броја од тастатура
и со помош на метод за наоѓање за минимум најди го најмалиот и испечати
го на екран.*/

import java.util.Scanner;
public class MinDvaBroja {

	
	public static int findMin(int a, int b, int c) {
		int min=a;
		if(a<b && a<c) min=a;
		else if(b<a && b<c) min=b;
		else if(c<a && c<b) min=c;
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Vnesi tri broja");
int x,y,z;
Scanner vnes = new Scanner(System.in);
x=vnes.nextInt();
y=vnes.nextInt();
z=vnes.nextInt();
System.out.println("Najmaliot broj od "+x+", "+y+", "+z+" e: "+findMin(x,y,z));
}

}
