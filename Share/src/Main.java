public class Main {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=FlyweightFactory.getInstance();
        Flyweight flyweight=flyweightFactory.getFlyweight(FlyweightFactory.KEY_CHAR_A);
        flyweight.show("字体：宋体");        //外部状态由客户端维护
        Flyweight flyweight1=flyweightFactory.getFlyweight(FlyweightFactory.KEY_CHAR_B);
        flyweight1.show("大小：12px");
        Flyweight flyweight2=flyweightFactory.getFlyweight(FlyweightFactory.KEY_CHAR_A);
        flyweight2.show("字体：隶书");        //外部状态由客户端维护
        Flyweight flyweight3=flyweightFactory.getFlyweight(FlyweightFactory.KEY_CHAR_B);
        flyweight2.show("大小：12px;字体：隶书");
        System.out.println("只生成了："+flyweightFactory.getcachesize()+"种享元模式！！");
    }
}
