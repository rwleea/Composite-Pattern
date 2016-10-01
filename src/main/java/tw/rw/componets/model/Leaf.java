package tw.rw.componets.model;

import tw.rw.componets.api.*;

public class Leaf extends Componet{
	
	private String name;
	public Leaf(String name){
		this.name = name;
	}
	@Override
	public void printstruct(String prestr) {
		System.out.println(prestr+"-"+name);
	}



}
