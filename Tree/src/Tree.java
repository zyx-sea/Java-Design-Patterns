//����������
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
	
	//�õ�����Ҷ�ӵ���ϸ��Ϣ
	public void getTreeInfo(){
		System.out.println("�������֣�"+getName());
		if(this.leftChild instanceof Leaf){
			System.out.println(getName()+"��ڵ��ǣ�"+this.leftChild.getName());
		}
		if(this.leftChild instanceof Tree){
			System.out.println(getName()+"��ڵ��ǣ�"+this.leftChild.getName()+"������");
			this.leftChild.getTreeInfo();
		}
		if(this.leftChild ==null){
			System.out.println(getName()+"��ڵ��ǿյ�");
		}
		
		if(this.rightCild instanceof Leaf){
			System.out.println(getName()+"�ҽڵ��ǣ�"+this.rightCild.getName());
		}
		if(this.rightCild instanceof Tree){
			System.out.println(getName()+"�ҽڵ��ǣ�"+this.rightCild.getName()+"������");
			this.rightCild.getTreeInfo();
		}
		if(this.rightCild ==null){
			System.out.println(getName()+"�ҽڵ��ǿյ�");
		}
		
	}
	@Override
	public int getLength() {
		// �Ƚ����Һ��ӵĸ߶ȣ�˭����+1����
		//�պ��ӵĴ���
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
