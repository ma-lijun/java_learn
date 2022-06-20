/**
* @author mlj
*/

public class InstanceCounter{
	private static int numInstances = 0;
	protected static int getCount(){
		return numInstances;
	}
	
	private static void addInstance(){
		numInstances++;
	}
	
	// 构造方法是一个类实例化的方法，不需要return
	InstanceCounter(){
		InstanceCounter.addInstance();
	}
	
	public static void main(String[] args){
		System.out.println("starting with "+InstanceCounter.getCount()+" instances");
		for (int i=0; i<500; ++i){
			new InstanceCounter();
		}
		System.out.println("Created "+ InstanceCounter.getCount()+" instances");
	}
}