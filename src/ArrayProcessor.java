import java.util.Random;

public class ArrayProcessor {
	private Random generator;
	
	public ArrayProcessor() {
		generator = new Random();
		generator.setSeed(1234);
	}
	
	public void fill(int[]values) {
		for(int i = 0; i<values.length;i++)
			values[i]=generator.nextInt(100);
	}
}
