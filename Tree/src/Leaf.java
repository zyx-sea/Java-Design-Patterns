//叶子构件类
public class Leaf extends Component {

	private String name;
	private Component leaf=null;
	public Leaf(String name){
		this.name=name;
	}
	@Override
	public Component addChild(Component leftChild, Component rightChild) {
		// TODO Auto-generated method stub
		return this;
	}

	public String getName(){
		return name;
	}
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 1;
	}

}
