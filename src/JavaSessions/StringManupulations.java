package JavaSessions;

public class StringManupulations {

	public static void main(String[] args) {
		
		
		String s="This is my first java and testing class";
		
		System.out.println("-----------------String length---------------------");
		int l=s.length();
		System.out.println(l);//39
		System.out.println("LI"+0);
		System.out.println("HI"+(l-1));//38
		
		System.out.println("-----------------String charAt---------------------");
		
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(20));
		System.out.println(s.charAt(38));
		
		System.out.println("-----------------String index---------------------");
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('t'));
		
		
		System.out.println("-----------------String trim---------------------");
		
		
		String str="   Testing     ";
		System.out.println(str.trim());
		
		String st= "    Selenium      ";	
		
		System.out.println(st.trim());
		
		System.out.println("-----------------String replace---------------------");
		
		String date="12-12-2021";//12/12/2021
		System.out.println(date.replace('-', '/'));
		
		
		String s1= "This is my test case";
		System.out.println(s1.replace(' ', ','));
		
		System.out.println("-----------------String uppercase and lower case---------------------");
		
		String s2="this is my test case";
		System.out.println(s2.toUpperCase());
		
		String s3="THIS IS MY JAVA TRAINING";
		System.out.println(s3.toLowerCase());
		
		System.out.println("-----------------String Contains---------------------");
		
		String s4="This is my testing training";
		
		System.out.println(s4.contains("i"));
		
		String browser="Chrome";
		if(browser.contains("Chrome")) {
			System.out.println("Lanch chrome browser");
		}
		
		System.out.println("-----------------String comparission---------------------");
		
		String b="Chrome";
		String c="chrome";
		
		System.out.println(b.equals(c));
		
		System.out.println(b.equalsIgnoreCase(c));
		
		
		
		
		System.out.println("-----------------String Split---------------------");
		
		String x="This is my first java and testing class";
		
		String words[]=x.split(" ");
		System.out.println(words.length);
		
		for(String e:words) {
			System.out.println(e);
		}
		
		String x1="java;c;c++;python;.net;c#";
		
		String lang[]=x1.split(";");
		
		for(String e:lang) {
			System.out.println(e);
		}
		
		System.out.println("-----------------String Sub String---------------------");
		
		String main= "Your total fee is 100000";
		System.out.println(main.substring(18));
		
		System.out.println(main.substring(18, 21));
		System.out.println("-----------------String reverse---------------------");
		
		String ss="SeleniemTesting";//gnitseTmeineles
		StringBuffer sa=new StringBuffer(ss);
		System.out.println(sa.reverse());
		
	}
	
	
	
	
	
	
	

}
