//单例类
public class RecycleBin {
	private static RecycleBin instance=null;//静态私有成员
	private RecycleBin(){  //私有构造函数
		
	}
	
	public static RecycleBin getInstance(){//静态公有工厂方法
		if(instance==null){
			instance=new RecycleBin();
		}else{
			System.out.println("系統中只能有一個回收站，不能重複建站！！");
		}
		return instance;
	}
	void clearbin(){
		System.out.println("回收站被清空！！");
	}

}
