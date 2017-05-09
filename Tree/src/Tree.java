//容器构件类
public class Tree extends Component {

	private String name;
	private Component leftChild;
	private Component rightCild;
	
	
	public Tree(String name, Component leftChild, Component rightCild) {
		this.name = name;
		this.leftChild = leftChild;
		this.rightCild = rightCild;
	}

	public Tree(String name) {
		this.name = name;
		this.leftChild = null;
		this.rightCild = null;
	}

	
	@Override
	public Component addChild(Component leftChild, Component rightChild) {
		// TODO Auto-generated method stub
		this.leftChild=leftChild;
		this.rightCild=rightChild;
		return this;
	}

	public String getName(){
		return name;
	}
	
	//得到树或叶子的详细信息
	public void getTreeInfo(){
		System.out.println("树的名字："+getName());
		if(this.leftChild instanceof Leaf){
			System.out.println(getName()+"左节点是："+this.leftChild.getName());
		}
		if(this.leftChild instanceof Tree){
			System.out.println(getName()+"左节点是："+this.leftChild.getName()+"它是树");
			this.leftChild.getTreeInfo();
		}
		if(this.leftChild ==null){
			System.out.println(getName()+"左节点是空的");
		}
		
		if(this.rightCild instanceof Leaf){
			System.out.println(getName()+"右节点是："+this.rightCild.getName());
		}
		if(this.rightCild instanceof Tree){
			System.out.println(getName()+"右节点是："+this.rightCild.getName()+"它是树");
			this.rightCild.getTreeInfo();
		}
		if(this.rightCild ==null){
			System.out.println(getName()+"右节点是空的");
		}
		
	}
	@Override
	public int getLength() {
		// 比较左右孩子的高度，谁大，则+1返回
		//空孩子的处理
		if(this.leftChild==null){
			if(this.rightCild==null){
				return 1;
			}else{
				return this.rightCild.getLength()+1;
			}
		}else{
			if(this.rightCild==null){
				return this.leftChild.getLength()+1;
			}else{
				if((this.leftChild.getLength())>=(this.rightCild.getLength())){
					return this.leftChild.getLength()+1;
				}else{
					return this.rightCild.getLength()+1;
				}
			}
		}
	}

}
