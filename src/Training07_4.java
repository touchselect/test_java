class Training07_4 {
	public static void main(String[] args) {
		int i = 10;
		Integer i_class = 10;
		System.out.println(i == i_class); //値自体の比較
		
		i_class = i; //Boxing
		int i2 = i_class; //Unboxing
		add(i2); //メソッドの引数で自動変換
		
		double d = 1;
//		Double d_class = 1; Boxingにおいては、自動型変換できない
		System.out.println(d);
	}
	
	static void add(Integer i_class) {
		int i = i_class + 10; //Integerとintの計算
		System.out.println(i);
	}
}