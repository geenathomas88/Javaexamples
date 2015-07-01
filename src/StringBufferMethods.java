
public class StringBufferMethods {
	public static void main(String agrs[]){
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(10);
		System.out.println(sb);//append
		System.out.println(sb.length());//length
		System.out.println(sb.reverse());//reverse
		System.out.println(sb.insert(2, "ws"));//insert
		System.out.println(sb.delete(2, 4));//delete
		System.out.println(sb.replace(2,4, "oo"));//replace
		
		System.out.println(sb.capacity());//capacity
		System.out.println(sb.charAt(2));//find character at a position
		System.out.println(sb.indexOf("c"));//index of substring
		System.out.println(sb.substring(2));//substring
		
		//sb.getChars(srcBegin, srcEnd, dst, dstBegin);
	}
		
}
