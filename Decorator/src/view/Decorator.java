package view;

/**
 * 抽象装饰者<br>
 * create:2017-06-27 16:05
 *
 * @author zhou
 */
public abstract  class Decorator extends View{

    private  View view;

    public Decorator(View view) {
        this.view = view;
    }
    public void  display(){
        view.display();
    }
}
