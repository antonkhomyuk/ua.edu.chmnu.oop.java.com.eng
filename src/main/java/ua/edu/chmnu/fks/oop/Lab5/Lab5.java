package ua.edu.chmnu.fks.oop.Lab5;

import java.util.*;
import java.io.*;

class DequeException extends Exception {}
 
class Node <T>
{
	T val;
	Node prev, next;
	
	Node(T v, Node p, Node n) {val = v; prev = p; next = n;}
}
 
class MyDeque <T>
{
	int size;
	Node<T> first, last;
	
	MyDeque() {
		size = 0;
		first = null;
		last = null;
	}
	
	String pushBack(T val) {
		if (size > 0) {
			Node currentNode = new Node<T> (val, last, null);
			last.next = currentNode;
			last = currentNode;
			size++;
		}
		else {
			Node currentNode = new Node<T> (val, null, null);
			last = currentNode;
			first = currentNode;
			size++;
		}
		return "ok";
	}
	
	String pushFront(T val) {
		if (size > 0) {
			Node currentNode = new Node<T> (val, null, first);
			first.prev = currentNode;
			first = currentNode;
			size++;
		}
		else {
			Node currentNode = new Node<T> (val, null, null);
			last = currentNode;
			first = currentNode;
			size++;
		}
		return "ok";
	}
	
	T popFront() throws DequeException {
		if(size == 0) throw new DequeException();
		T v = first.val;
		first = first.next;
		size--;
		return v;
	}
	
	T popBack() throws DequeException {
		if(size == 0) throw new DequeException();
		T v = last.val;
		last = last.prev;
		size--;
		return v;
	}
	
	T front() throws DequeException {
		if(size == 0) throw new DequeException();
		return first.val;
	}
	
	T back() throws DequeException {
		if(size == 0) throw new DequeException();
		return last.val;
	}
	
	int getSize() {
		return size;
	}
	
	String clear() {
		size = 0;
		return "ok";
	}
	
	String ex() {
		return "bye";
	}
}
 
class Main
{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		MyDeque<String> deque = new MyDeque<String>();
		String s, val;
		
		while(in.hasNext()) {
			s = in.next();
			if (s.equals("exit")) out.println(deque.ex());
			else if (s.equals("clear")) out.println(deque.clear());
			else if (s.equals("size")) out.println(deque.getSize());
			else if (s.equals("back")) {
				try {
					out.println(deque.back());
				} catch(DequeException e) {
					out.println("error");
				}
			}
			else if(s.equals("front")) {
				try {
					out.println(deque.front());
				} catch(DequeException e) {
					out.println("error");
				}
			}
			else if (s.equals("pop_back")) {
				try {
					out.println(deque.popBack());
				} catch(DequeException e) {
					out.println("error");
				}
			}
			else if (s.equals("pop_front")) {
				try {
					out.println(deque.popFront());
				} catch(DequeException e) {
					out.println("error");
				}
			}
			else if(s.equals("push_back")) {
				val = in.next();
				out.println(deque.pushBack(val));
			}
			else if(s.equals("push_front")) {
				val = in.next();
				out.println(deque.pushFront(val));
			}
			out.flush();	
		}
	}
}