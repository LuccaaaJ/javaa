package chapter02;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		int age = scan.nextInt();
		System.out.print("�ð� �Է� >>");
		int time = scan.nextInt();
		
		int price = 0;
		
		if( time >=9 && time <=18) //�ְ���
		{ if(age<=7 || age>=65) price = 15000; //����
		else 					price = 30000; //����
		}
			
		else if (time >18&&time <=22) //�߰���
		{
			if(age<=7 || age>=65) price = 10000; //����
			else				  price = 20000; //����
		}
			System.out.println("�����" + price + "�� �Դϴ�.");
		
		
	}

}