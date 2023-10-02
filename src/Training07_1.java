class Training07_1 {
	public static void main(String[] args) {
		char var = 'a';
        String var2 = "Hello World";

        System.out.println(var);
        System.out.println(var2);
        
        String s = "abcdef";

        System.out.println(s.charAt(1)); //b
        System.out.println(s.equals("abcde")); //false
        System.out.println(s.intern()); //"abcdef"
        System.out.println(s.indexOf('c')); //2
        System.out.println(s.length()); //6
        System.out.println(s.replace('a', 'z')); //"zbcdef"
        System.out.println(s.substring(4)); //"ef"
        
		StringBuilder sb = new StringBuilder("abcdef");
		
        System.out.println(sb.append("zzz")); //"abcdefzzz"
        System.out.println(sb.insert(2, "zzz")); //abzzzcdefzzz"
        System.out.println(sb.delete(0, 5)); // "cdefzzz"
        System.out.println(sb.replace(0, 5, "zzz")); //"zzzzz"
        System.out.println(sb.substring(4)); //"z"
        System.out.println(sb.length()); //5
	}
}