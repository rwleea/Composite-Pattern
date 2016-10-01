package tw.rw.componets.model.parent;

import java.util.ArrayList;
import java.util.List;

import tw.rw.componets.api.parent.Componet;

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
		c.setParent(this);
		childComponets.add(c);
	};
	@Override
	public  void removeChild(Componet c){

		int idx = childComponets.indexOf(c);
		if(idx!=-1){
			c.getChildren().forEach(
					component -> {
						component.setParent(this);	
						this.childComponets.add(component);
					});
			
			this.childComponets.remove(c);
			
		}
	}
	@Override
	public  Componet getComponet(int index){
		return childComponets.get(index);
				
	}
	@Override
	public List<Componet> getChildren() {
		return this.childComponets;
	};

}
