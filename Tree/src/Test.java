//测试类
public class Test {

	public static void main(String[] args) {
		Component tree=new Tree("A");
		Component left=new Leaf("A1");
		Component right=new Leaf("A2");
		
		tree=tree.addChild(left, right);
		tree.getTreeInfo();
		
		Component tree1=new Tree("A2");
		tree1.addChild(tree, left);
		tree1.getTreeInfo();
		
		Component tree2=new Tree("A3");
		tree2.addChild(tree, null);
		tree2.getTreeInfo();
		
		Component tree4=new Tree("A4");
		tree4.addChild(null,tree);
		tree4.getTreeInfo();
		
		System.out.println(tree4.getName()+"高度是："+tree4.getLength());
		

	}

}
