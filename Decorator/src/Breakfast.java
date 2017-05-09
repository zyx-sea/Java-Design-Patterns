//抽象构建类
public abstract class Breakfast {
	public String description="未知";

	public String getDescription(){//获得所定商品的描述
		return description;
	}
	public abstract double cost();

}
