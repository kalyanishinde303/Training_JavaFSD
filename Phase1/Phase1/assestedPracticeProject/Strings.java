package Phase1.assestedPracticeProject;

public class Strings {

	public static void main(String[] args) {
		System.out.println("First Java Program");
		
		String sl=new String("Swapnali Wakale");
		System.out.println(sl.length());

		String sub=new String("Satara");
		System.out.println(sub.substring(2));

		String s1="madhuri";
		String s2="shweta";
		System.out.println(s1.compareTo(s2));

		String s4="meghna";
		System.out.println(s4.isEmpty());

		String s5="madhuri";
		System.out.println(s1.toLowerCase());
		
		String s6="Hello";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

		String x="Welcome to World";
		String y="WeLcOmE tO World";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer\n");
		StringBuffer s=new StringBuffer("Hello World");
		s.append("How are you all");
		System.out.println(s);

		s.insert(0, 'w');
		System.out.println(s);

		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		sb.delete(0, 1);
		System.out.println(sb);
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}
