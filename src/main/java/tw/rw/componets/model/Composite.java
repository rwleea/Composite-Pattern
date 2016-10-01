package tw.rw.componets.model;

import java.util.ArrayList;
import java.util.List;

import tw.rw.componets.api.Componet;

public class Composite extends Componet{
	
	List<Componet> childComponets;
	String name;
	
	public Composite(String name){
		this.name = name;
		childComponets = new ArrayList<Componet>();
	}
	@Override
	public void printstruct(String prestr) {
		
		System.out.println(prestr+"+"+name);
		
		if(childComponets!=null && childComponets.size() > 0){
			prestr+="	";
			for(Componet child:childComponets){
				child.printstruct(prestr);
			}
		}
	}
	@Override
	public void addChild(Componet c){
		childComponets.add(c);
	};
	@Override
	public  void removeChild(Componet c){
		childComponets.remove(c);
	};
	
	
	@Override
	public  Componet getComponet(int index){
		return childComponets.get(index);
				
	};

}
