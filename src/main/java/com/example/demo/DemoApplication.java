package com.example.demo;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import p2.P2;


interface Tax {
	public int getReceiveTax();
}

abstract class OutSoruce {
	int amount;
	abstract public int getTax();
}


class PersonalOutSource extends OutSoruce implements Tax{

	@Override
	public int getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getReceiveTax() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class CorporateOutSource extends OutSoruce {

	@Override
	public int getTax() {
		// TODO Auto-generated method stub
		return 0;
	}


}

//@SpringBootApplication
public class DemoApplication extends P2{

	public static void main(String[] args) {	
		
	}
	
	public void func1() {
		DemoApplication d = new DemoApplication();
		
		System.out.println(d.a);
	}
}
