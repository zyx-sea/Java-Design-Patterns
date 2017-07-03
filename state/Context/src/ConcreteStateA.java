/**
 * 具体状态类，每个子类实现一个与Context相关的状态<br>
 * create:2017-06-08 11:32
 *
 * @author zhou
 */
public class ConcreteStateA extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态为A:");
        context.setState(new ConcreteStateB());
    }
}
