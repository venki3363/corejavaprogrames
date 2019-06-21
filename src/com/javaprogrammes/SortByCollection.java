package com.javaprogrammes;

import java.util.ArrayList;
import java.util.Collections;

public class SortByCollection 
{
public static void main(String[] args) 
{
	
	ArrayList<String> al=new  ArrayList<>();
	
	al.add("venkatesh");
	al.add("sai");
	
	al.add("prasad");
	al.add("vignesh");
	
	Collections.sort(al);
	System.out.println(al.toString());
	
	
	
}
}
