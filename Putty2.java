// ���幹�췽��(һ��������ж�����췽��)

// ���췽��Ҫ����ͬ��

/*
public class Puppy{
	public Puppy(){
	};
	
	public Puppy(String name){
		// �������������һ��������name
	};
}
*/

// ��������
public class Putty2{
	
	int puttyAge;
	// ������
	public Putty2(String name){
		System.out.println("С���������ǣ�"+ name);
	};
	public void setAge(int age){
		puttyAge = age;
	};
	
	public int getAge(){
		System.out.println("С��������Ϊ��"+puttyAge);
		return puttyAge;
	};
	
	
	public static void main(String[] args){
		// �����Ǵ���һ�� Putty ����
		Putty2 myPutty = new Putty2("tommy");
		
		// ͨ��setAge�������趨 puttyAge
		myPutty.setAge(2);
		
		// ͨ��getAge()��������ȡ age
		myPutty.getAge();
		
		System.out.println("����ֵ��"+myPutty.puttyAge);
	}
}

/*
֪ʶ�ܽ᣺
һ��Դ�ļ�ֻ����һ��public ��
һ��Դ�ļ������ж����public ��
Դ�ļ�������Ӧ�ú�public�����������һ�¡�
���һ���ඨ����ĳ�����У� ��ôpackage ���Ӧ����Դ�ļ�������
���Դ�ļ�����import ��䣬 ��ôӦ�÷���package�����ඨ��֮��
import �� package ����Դ�ļ��ж���������඼��Ч��

*/


