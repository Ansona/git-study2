package com.LinkedList.util;
/**
 * ����һ��ArrayList������,
 * Ȼ��������ַ��������򣬷���Collections ���Ϲ������а���������ȹ��ܣ�
         ��Iterator��������

 * @author dell
 *@version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
public class ArrayListTest01 {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		//���Ԫ��
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("f");
		list.add("e");
		list.add("d");
		list.add("g");
		//�������˳����������
		System.out.println(list);
		//����
	//	Object list1 = reverseOrder();
		//Collections cl = (Collections)Collections.reverseOrder();
		Collections.sort(list);
		System.out.println(list);
		
		
		
		/*��Iterator����*/
		/*�ӿڲ���ʵ������ֻ������ʵ�ֻ�������ת��*/
		
		Iterator it = list.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

	
}
