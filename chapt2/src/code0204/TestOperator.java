/**
 * 
 */
package code0204;

/**
 * TestOperator.java Copyright (c) 2016 ChongQing University All rights
 * reserved.
 */
public class TestOperator {
	public static void main(String[] args) {
		int i = 29;
		int j = 3;
		float a = 23.5f;
		double b = 4.0;
		System.out.println("i+a=" + (i + a)); // �����븡�������
		System.out.println("i*j=" + (i * j)); // �����������
		System.out.println("i/j=" + (i / j)); // ����������������Ϊ����
		System.out.println("i%j=" + (i % j)); // ������
		System.out.println("a*b=" + (a * b)); // �������������
		System.out.println("a/b=" + (a / b)); // ���ڸ�������������Ϊ������
		System.out.println("a%b=" + (a % b)); // ���������࣬���Ϊ������
		System.out.println("i++=" + (i++)); // ��ʹ�ã�������
		System.out.println("++i=" + (++i)); // ����������ʹ��
	}

}