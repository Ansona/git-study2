package com.LinkedList.util;
import java.util.Arrays;
/**
 * ������һ��Student���class
Ȼ��object�У� 
С�� student1= new ("С��",15,"Ů","��ɳ")��
С�� student2= new ("С��",16,"����")��
С�� student3= new ("С��",17,"��","����","δ��")��
Ȼ�����Щ��Ϣ���ŵ�һ��LinkedList��
       1����ΪС������Ա���Ϣ
       2���뽫С��δ�����Ϣɾ��0

 * @author dell
 *@version 1.0
 */
import java.util.LinkedList;
import java.util.Arrays;
public class LinkedListTest01 {
	public static void main(String[] args){
		//ʹ�÷��ͣ���ʹ��һ�����͡�����ǿ��ת��
		LinkedList<Student> list = new LinkedList();
		list.add(new Student("С��",15,'Ů',"��ɳ"));
		list.add( new Student("С��",16,"����"));
		list.add(new Student("С��",17,'��',"����","δ��"));
		list.get(1).setSex('Ů');
		System.out.println(list.get(1).getSex());
		
		list.get(2).setMarital("0");
		System.out.println(list.get(2).getMarital());
	}
}
