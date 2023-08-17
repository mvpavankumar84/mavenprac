package Mpackage;


public class duplicatevalues {

	

	public static void main(String[] args) {
		
			//int i=1;
					/*while(i<=10){
						System.out.println(i);
						i++;
						
					}*/
		/*	do {
				System.out.println(i);
				i++;
			}while(i<=1);
			*/
			/*while(true) {
				if (i<=10) {
					System.out.println(i);
					i++;
				}
			}*/
			/*while(true) {
				if(i==10) {
					break;
				}
				System.out.println(i);
				i++;
			} */
			/*for (int i=1; i<=10;i++) {
				if(i==5) {
					//break;
					continue;
				} System.out.println(i);
			}*/
		
		String str="Test java jars";
		int count=0;
		for (int i=0; i<str.length()-1; i++)
			{ if (str.charAt(i)== 'j')
			{
				count++;
				
			}
			}System.out.println(count);

			/*
			 * System.out.println(str.endsWith("r"));
			 * System.out.println(str.endsWith("jars"));
			 */
			String str1="test Java jars, JVM jars, DB jars";
			String a="hellow";
			char[] b=a.toCharArray();
			for(int i=0; i<a.length(); i++) {
				System.out.println(b);
			}
			//System.out.println(str1.substring(1, 6));
			/*String [] st=str1.split(" ");
			System.out.println(st);
			for (String string : st) {
				System.out.println(string);
				
			}*/
			//String str2=str1.replaceFirst("jars" , "Testjavajars");
			//System.out.println(str2);
			int d=str1.indexOf('j');
			System.out.println(d);
			/*if (str.equalsIgnoreCase(str1)) {
				System.out.println("equals");				
			} else {System.out.println("not equal");

			}*/
			
}}

