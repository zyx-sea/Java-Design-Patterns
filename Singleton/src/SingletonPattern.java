
public class SingletonPattern {

	public static void main(String[] args) {
		RecycleBin re=RecycleBin.getInstance();
		re.clearbin();
		RecycleBin bi=RecycleBin.getInstance();
		if(re==bi){
			System.out.println("��������ͬ�Ļ���վ��������");
		}

	}

}
