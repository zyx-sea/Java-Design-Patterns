//���󹹼���
public abstract class Component {
	
	private String name;
	public abstract Component addChild(Component leftChild,Component rightChild);
	public String getName(){
		return name;
	}
	public void getTreeInfo(){
		
	}

	public abstract int getLength();
}
