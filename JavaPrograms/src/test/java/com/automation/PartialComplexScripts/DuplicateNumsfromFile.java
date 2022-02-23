package com.automation.PartialComplexScripts;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumsfromFile {

	public static void main(String[] args) {
		final Set<Integer> duplicates = new LinkedHashSet<Integer>();
		try{
		FileInputStream fstream = new FileInputStream("F:\\Practice\\Duplicates");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String str;
		int i;
		while((str = br.readLine())!=null){
		//i = Integer.toString(str);
	
		//duplicates.add(i);
		}
		in.close();
		for (final int dup: duplicates)
		System.out.println(dup);
		} catch(Exception e) {
		System.out.println(e);
		}}
}