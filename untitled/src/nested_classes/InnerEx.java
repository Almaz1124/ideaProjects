package nested_classes;

public class InnerEx {

    class ABC {}


}

class TestInner {
//    InnerEx.ABC inner = new InnerEx.ABC();//так можно если только наследоваться от внешнего класса
    InnerEx inner = new InnerEx();
    InnerEx.ABC aa = inner.new ABC();
}
