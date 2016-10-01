package tw.rw.componets.api;

public abstract class Componet {
	public abstract void printstruct(String prestr) ;
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
