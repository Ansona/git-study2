package com.LinkedList.util;
/**
 * 定义一个ArrayList集合类,
 * 然后放入多个字符串，排序，反序（Collections 集合工具类中包含了排序等功能）
         用Iterator遍历集合

 * @author dell
 *@version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
public class ArrayListTest01 {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		//添加元素
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("f");
		list.add("e");
		list.add("d");
		list.add("g");
		//按照添加顺序排序的输出
		System.out.println(list);
		//反序
	//	Object list1 = reverseOrder();
		//Collections cl = (Collections)Collections.reverseOrder();
		Collections.sort(list);
		System.out.println(list);
		
		
		
		/*用Iterator遍历*/
		/*接口不能实例化，只能用于实现或者引用转型*/
		
		Iterator it = list.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

	
}
