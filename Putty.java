// 定义构造方法(一个类可以有多个构造方法)

// 构造方法要与类同名

public class Puppy{
	public Puppy(){
	};
	
	public Puppy(String name){
		// 这个构造器仅有一个参数：name
	};
}


// 创建对象
public class Puppy{
	public Puppy(String name){
		System.out.println("小狗的名字是：", name);
	};
	
	public static void main(String[] args){
		// 这里是创建一个 Putty 对象
		Puppy myPutty = new Puppy("tommy");
	}
}
