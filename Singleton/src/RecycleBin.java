//������
public class RecycleBin {
	private static RecycleBin instance=null;//��̬˽�г�Ա
	private RecycleBin(){  //˽�й��캯��
		
	}
	
	public static RecycleBin getInstance(){//��̬���й�������
		if(instance==null){
			instance=new RecycleBin();
		}else{
			System.out.println("ϵ�y��ֻ����һ������վ���������}��վ����");
		}
		return instance;
	}
	void clearbin(){
		System.out.println("����վ����գ���");
	}

}
