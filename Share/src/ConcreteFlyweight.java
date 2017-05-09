/**
 * 具体享元类<br>
 * create:2017-04-27 11:00
 *
 * @author zhou
 */
public class ConcreteFlyweight extends Flyweight {

    private  char value;        //内部状态

    public ConcreteFlyweight(char internalState) {
        this.value = internalState;
    }
    //外部状态通过参数传给享元对象，从而改变享元对象的行为，但是对享元对象的内部状态没有任何影响
    @Override
    public void show(String externState) {
        System.out.println("字母："+this.value+"；外部状态【"+externState+"】");
    }
}
