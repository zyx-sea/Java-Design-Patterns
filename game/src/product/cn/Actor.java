package product.cn;

import java.util.ArrayList;
import java.util.List;


public abstract class Actor {
	protected List<String> parts=new ArrayList<String>();
	public void add(String part){
		parts.add(part);
		
	}
	
	public void show(){
		System.out.println("ÓÎÏ·½ÇÉ«£º");
		for(String part:parts){
			System.out.println(part);
		}
	}

}
