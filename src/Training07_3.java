class Training07_3 {
	public static void main(String[] args) {
		int i = 10;
		double d = 20.0;
		
		d = i;
		i = (int)d;
		
		System.out.println(d);
		System.out.println(i);
		
		foo((short) i);
		
		short s1 = 10;
		short s2 = 20;
		
//		s1 = s1 + 1; コンパイルエラー
		s1 = (short)(s1 + 1);
		s2 = ++s2;
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	static void foo(short s) {
		System.out.println(s);
	}
}