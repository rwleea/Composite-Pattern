package tw.rw.app.parent;

import tw.rw.componets.model.parent.Composite;
import tw.rw.componets.model.parent.Leaf;

public class App {
	public static void main(String args[]){
		Composite root = new Composite("服裝");
		Composite mancatelog = new Composite("男裝");
		Composite womancatelog = new Composite("女裝");
		
		Leaf manshirt = new Leaf("襯衫");
		Leaf manjacket = new Leaf("夾克");
		
		
		Leaf womanskirt = new Leaf("裙子");
		Leaf womansuit = new Leaf("套裝");
		
		
		root.addChild(mancatelog);
		root.addChild(womancatelog);
		mancatelog.addChild(manjacket);
		mancatelog.addChild(manshirt);
		womancatelog.addChild(womansuit);
		womancatelog.addChild(womanskirt);
		
		
		root.printstruct("");
		
		root.removeChild(womancatelog);
		
		root.printstruct("");
		
		
	}
}
