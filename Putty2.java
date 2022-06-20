// 定义构造方法(一个类可以有多个构造方法)

// 构造方法要与类同名

/*
public class Puppy{
	public Puppy(){
	};
	
	public Puppy(String name){
		// 这个构造器仅有一个参数：name
	};
}
*/

// 创建对象
public class Putty2{
	
	int puttyAge;
	// 构造器
	public Putty2(String name){
		System.out.println("小狗的名字是："+ name);
	};
	public void setAge(int age){
		puttyAge = age;
	};
	
	public int getAge(){
		System.out.println("小狗的年龄为："+puttyAge);
		return puttyAge;
	};
	
	
	public static void main(String[] args){
		// 这里是创建一个 Putty 对象
		Putty2 myPutty = new Putty2("tommy");
		
		// 通过setAge方法来设定 puttyAge
		myPutty.setAge(2);
		
		// 通过getAge()方法来获取 age
		myPutty.getAge();
		
		System.out.println("变量值："+myPutty.puttyAge);
	}
}

/*
知识总结：
一个源文件只能有一个public 类
一个源文件可以有多个非public 类
源文件的名称应该和public类的类名保持一致。
如果一个类定义在某个包中， 那么package 语句应该在源文件的首行
如果源文件包含import 语句， 那么应该放在package语句和类定义之间
import 和 package 语句对源文件中定义的所有类都有效。

*/


