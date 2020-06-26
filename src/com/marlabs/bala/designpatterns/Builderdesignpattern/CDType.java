package com.marlabs.bala.designpatterns.Builderdesignpattern;

import java.util.*;

public class CDType 
{  
	private List< Packing > items=new ArrayList<Packing>();  
	public void addItem(Packing packs) 
	{    
		items.add(packs);  
	}  
	public void getPrice()
	{  
		for (Packing pack : items) 
		{  
			pack.price();
		}   
	}  
	public void showItems(){  
		for (Packing packing : items){  
			System.out.print("CD name : "+packing.pack());  
			System.out.println(", Price : "+packing.price());  
		}       
	}     
}