package tw.rw.componets.api.parent;


import java.util.List;

public abstract class Componet {
	private Componet parent = null;
	
	public abstract void printstruct(String prestr) ;

	
	public Componet getParent() {
		return parent;
	}


	public void setParent(Componet parent) {
		this.parent = parent;
	}

	public List<Componet> getChildren(){
		throw new UnsupportedOperationException("unsupport");
	};

	public void addChild(Componet c){
		throw new UnsupportedOperationException("unsupport");
	};
	public  void removeChild(Componet c){
		throw new UnsupportedOperationException("unsupport");
	};
	public  Componet getComponet(int index){
		throw new UnsupportedOperationException("unsupport");
	};
}
