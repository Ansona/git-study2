package com.LinkedList.util;
import java.util.Arrays;
/**
 * 现在有一个Student类的class
然后object有： 
小红 student1= new ("小红",15,"女","长沙")；
小白 student2= new ("小白",16,"广州")；
小黄 student3= new ("小黄",17,"男","深圳","未婚")；
然后把这些信息都放到一个LinkedList中
       1）请为小白添加性别信息
       2）请将小黄未婚的信息删除0

 * @author dell
 *@version 1.0
 */
import java.util.LinkedList;
import java.util.Arrays;
public class LinkedListTest01 {
	public static void main(String[] args){
		//使用泛型，即使用一种类型。不用强制转型
		LinkedList<Student> list = new LinkedList();
		list.add(new Student("小红",15,'女',"长沙"));
		list.add( new Student("小白",16,"广州"));
		list.add(new Student("小黄",17,'男',"深圳","未婚"));
		list.get(1).setSex('女');
		System.out.println(list.get(1).getSex());
		
		list.get(2).setMarital("0");
		System.out.println(list.get(2).getMarital());
	}
}
