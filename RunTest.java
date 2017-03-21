package work03;

/**
 * 比较String和StringBuilder的运行效率
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
		System.out.println("String直接相加 "+num+"次耗费时间："+(endTime1 -beginTime1)+"ns");
		
		
		StringBuilder builder = new StringBuilder("");
		long beginTime2 = System.nanoTime();
		for(int i = 0;i<num;i++){
			builder.append(i);
		}
		long endTime2 = System.nanoTime();
		System.out.println("StringBuilder直接相加"+num+"次耗费时间："+(endTime2-beginTime2)+"ns");
		
		System.out.println("-----------------------------------------------------");
	}		
	
	//测试一下效率
	public static void main(String[] args){
		
		add(10);
		add(100);
		add(1000);
		add(10000);
		add(100000);
		
	}
	
	
}