/**
 * 测试<br>
 * create:2017-06-08 11:36
 *
 * @author zhou
 */
public class Clien {
     public  static  void main(String[] args){
           Context context=new Context(new ConcreteStateA());
           context.Request();
           context.Request();
         context.Request();
         context.Request();

    }

}
