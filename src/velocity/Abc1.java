package velocity;

public interface Abc1 {
	
	int a=5;		// by default  static,public & final			
	
		public void jtm();	// always public 
		
		void ssbt();	// by default public
		
	//	a=5;       // unchanged once declare
		
		public static void nm() {					// you can write complete method
			System.out.println(" hi everyone");		//but it always be static in nature
		}
		
		public static void main(String [] args) {
			System.out.println(a);
			Abc1.nm();
		}
}
