package com.sazonov.app;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		System.out.println("Enter name: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String Name = reader.readLine();
		System.out.println("Name " + Name);
	}
}
