package tw.rw.app;

import tw.rw.componets.model.Composite;
import tw.rw.componets.model.Leaf;

public class App {
	public static void main(String args[]){
		Composite root = new Composite("�A��");
		Composite mancatelog = new Composite("�k��");
		Composite womancatelog = new Composite("�k��");
		
		Leaf manshirt = new Leaf("Ũ�m");
		Leaf manjacket = new Leaf("���J");
		
		
		Leaf womanskirt = new Leaf("�Ȥl");
		Leaf womansuit = new Leaf("�M��");
		
		
		root.addChild(mancatelog);
		root.addChild(womancatelog);
		mancatelog.addChild(manjacket);
		mancatelog.addChild(manshirt);
		womancatelog.addChild(womansuit);
		womancatelog.addChild(womanskirt);
		
		
		root.printstruct("");
		
	}
}
