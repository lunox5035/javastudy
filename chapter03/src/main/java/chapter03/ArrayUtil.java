package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] result = null;

		if (a == null) {
			return result;
		}

		result = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}

		return result;
	}
	
	public static int[] doubletoInt(Double[] b) {
		int[] result2 = null;
		
		if (b==null) {
			return result2;
		}
		
		result2 = new int[b.length];
		
		for(int i = 0; i<b.length;i++) {
			result2[i] = (int)b[i];
		}
		
		return result2;
	}
	
	public static int[] concat(int[] a, int[] b) {
		int size=0;
		if (a !=null) {
			size+=a.length;
		}
		int[] result = new int[(a==null ? 0: a.length)]; 
		
		int index=0;
		for(int v:a) {
			result[index++] =v;
		};
	
		for(int v:b) {
			result[index++]=v;
		}
		raeturn null;
	
	}
}