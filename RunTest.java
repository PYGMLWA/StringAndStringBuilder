package work03;

/**
 * �Ƚ�String��StringBuilder������Ч��
 * @author PengLiu
 *
 */
public class RunTest {
	
	public static void add(int num){
		
		String str = "";
		long beginTime1 = System.nanoTime();
		for(int i =0;i<num;i++){
			str += i;
		}	
		long endTime1 = System.nanoTime();
		System.out.println("Stringֱ����� "+num+"�κķ�ʱ�䣺"+(endTime1 -beginTime1)+"ns");
		
		
		StringBuilder builder = new StringBuilder("");
		long beginTime2 = System.nanoTime();
		for(int i = 0;i<num;i++){
			builder.append(i);
		}
		long endTime2 = System.nanoTime();
		System.out.println("StringBuilderֱ�����"+num+"�κķ�ʱ�䣺"+(endTime2-beginTime2)+"ns");
		
		System.out.println("-----------------------------------------------------");
	}		
	
	//����һ��Ч��
	public static void main(String[] args){
		
		add(10);
		add(100);
		add(1000);
		add(10000);
		add(100000);
		
	}
	
	
}