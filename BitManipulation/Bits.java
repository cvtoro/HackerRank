public class Bits{

	//Inserts the bits of 32 bit M starting at the j position to i of N into the 32 bit N

	public static int insertMintoN(int n, int m, int i, int j){
	//example mask should look like 11110000011111
		int jmask = 1 << 31;
		jmask = jmask >>  (32 - j); //             example result 111000000
		System.out.println(jmask);

		int imask = 1 << 31;
		int shift = 32 - i;
		imask = ~(imask >>  shift); 

		


		int mask = jmask | imask;

		m = m << i;     
		n = n & mask;   //should zero out where want to insert
		return m | n;

	}


	public static void main(String [] args){
		int res = insertMintoN(1024, 19, 2, 6);
			
		System.out.println(Integer.toBinaryString(res));
			
		
			

	}
		

}