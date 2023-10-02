class Training07_2 {
	public static void main(String[] args) {
		int a = 10; int b = 1_0; long c = 10L;
		byte d = 10; char e = 'a';
		float f = 10.0f; double g = 10.0;
		boolean h = true;
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println('a' == e);
		System.out.println(f == g);
		System.out.println('a' == e);
		System.out.println(true == h);
		
		int[] aa = {10}; int [] bb = {10};
		int[] cc = {10}; int [] dd = cc;
		
		System.out.println(aa == bb);
		System.out.println(cc == dd);
		
		String aaa = "aaa";
		String bbb = "aaa";
		String eee = aaa.intern();
		String ccc = new String("aaa");
		String ddd = new String("aaa");
		
		System.out.println(aaa == bbb);
		System.out.println(aaa == eee);
		System.out.println(bbb == eee);
		System.out.println(aaa == ccc);
		System.out.println(ccc == ddd);
		
        String a1 = "aaa";
        String b1 = a1+ "A";

        String c1 = "aaa";
        String d1 = c1.concat("A");

        StringBuilder e1 = new StringBuilder("aaa");
        StringBuilder f1 = e1.append("A");

        System.out.println(a1 == b1);
        System.out.println(c1 == d1);
        System.out.println(e1 == f1);
        System.out.println(e1);
        System.out.println(f1);
        // System.out.println(a1 == e1); コンパイルエラー（異なる参照型の比較）
	}
}