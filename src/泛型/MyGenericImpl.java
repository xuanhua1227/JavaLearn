package 泛型;

public class MyGenericImpl implements MyInterface<String>{

    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }
}
