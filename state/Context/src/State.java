/**
 * 抽象状态类，定义一个接口以封装与Context的特定状态相关的行为<br>
 * create:2017-06-08 11:30
 *
 * @author zhou
 */
public abstract class State {
    public abstract void Handle(Context context);

}
