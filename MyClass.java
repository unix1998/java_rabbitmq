package my_name.features.reflection;
 
import java.lang.reflect.Method;
 
/**
 *  * Created by xiang on 02/06/2017.
 *   */
public class MyClass {
    private String var1;
    private String var2;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public static void main(String[] args) {
        Method[] methods = MyClass.class.getMethods();

        for (Method method: methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
