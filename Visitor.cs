//抽象元素,产品
public abstract class Product{
	public abstract void accept(Visitor visitor);
}

//具体元素,苹果
public class Apple ：Product{
	public override void accept(Visitor visitor)
	{
		visitor.visitor(this);
	}
}

//具体元素,书
public class Book ：Product{
	public override void accept(Visitor visitor)
	{
		visitor.visitor(this);
	}
}

//抽象访问者：Visitor
public abstract class Visitor{
	public abstract void visit(Apple apple);
	public abstract void visit(Book book);
}

//具体访问者：顾客
public class Customer ：Visitor{
	public override void visit(Apple apple){
		Console.WriteLine("顾客购买苹果");
	}
	public override void visit(Book book){
		Console.WriteLine("顾客购买书");
	}
}

//通过ObjectStruct把元素和访问者串联
public class ObjectStruct{
	private ArrayList list=new ArrayList();
	//增加产品
	public void addProduct(Product product){
		list.Add(product);
	}
	//移除产品
	public void removeProduct(Product product){
		list.Remove(product);
	}
	//访问者访问
	public void Accept(Visitor visitor){
		foreach(Product p in list)
		p.accept(product);
	}
}

static void Main(string[] args)
{
	ObjectStruct os=new ObjectStruct();
	os.addProduct(new Apple());
	os.addProduct(new Book());
	
	Customer one=new Customer();
	saler two=new saler();
	os.Accept(one);
	os.Accept(two);
	
	Console.ReadLine();
}