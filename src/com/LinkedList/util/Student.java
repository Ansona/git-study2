package com.LinkedList.util;
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




















