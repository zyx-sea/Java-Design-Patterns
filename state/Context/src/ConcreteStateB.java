/**
 * <br>
 * create:2017-06-08 11:34
 *
 * @author zhou
 */
public class ConcreteStateB extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态为B");
        context.setState(new ConcreteStateA());
    }
}
