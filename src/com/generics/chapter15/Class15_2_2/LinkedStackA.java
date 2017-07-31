package com.generics.chapter15.Class15_2_2;

public class LinkedStackA<T> {
	private  class Node<T>{
		T item;
		Node<T> next;
		Node(){
			item=null;
			next=null;
		}
		Node(T item,Node<T> next){
			this.item=item;
			this.next=next;
		}
		
		boolean end(){
			return item==null&&next==null;
		}
	}
	private Node<T> top=new Node<T>();
	public void push(T item){
		top=new Node<T>(item,top);
	}
	public T pop(){
		T result=top.item;
		if(!top.end())
			top=top.next;
		return result;
	}
	public static void main(String[] args){
		LinkedStackA<String> lss=new LinkedStackA<String>();
		for(String s: "Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while((s=lss.pop())!=null)
			System.out.println(s);
	}
}
