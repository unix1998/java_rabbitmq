interface INew{
	public void print();
}
class Person implements INew{
	@Override  //覆写
	public void print() {
		System.out.println("覆写方法输出!");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.print();
	}
}
