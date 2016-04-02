package com.LinkedList.util;
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
 *@version1.0
 */
public class Student {
	public String name;
	public int age;
	public char sex;
	public String whereTown;
	public String marital;
	Student(String name,int age,char sex,String whereTown){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.whereTown = whereTown;
	}
	
	Student(String name,int age,String whereTown){
		this.name = name;
		this.age = age;
		this.whereTown = whereTown;
	}
	
	
	Student(String name,int age,char sex,String whereTown,String marital){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.whereTown = whereTown;
		this.marital = marital;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSex(char sex){
		this.sex = sex;
	}
	public char getSex(){
		return sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setWhereTown(String whereTown){
		this.whereTown = whereTown;
	}
	public String getWhereTown(){
		return whereTown;
	}
	public void setMarital(String marital){
		this.marital = marital;
	}
	public String getMarital(){
		return marital;
	}
}




















