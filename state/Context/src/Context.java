/**
 * 维护一个ConcreteState子类的实例，这个实例定义当前的状态<br>
 * create:2017-06-08 11:26
 *
 * @author zhou
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    /*对请求做出处理，并设置下一状态*/
    public void Request(){
        state.Handle(this);
    }
}
