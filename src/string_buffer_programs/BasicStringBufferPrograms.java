package string_buffer_programs;

public class BasicStringBufferPrograms {
public static void main(String[] args) {
	StringBuffer sf = new StringBuffer("Hello");
//	StringBuffer sf1 = new StringBuffer("Hello");
	
	System.out.println(sf);
	sf.append(" World");
	System.out.println(sf);
	sf.delete(0, 3);
	System.out.println(sf);
	sf.insert(0,"Dey ");
	System.out.println(sf);
	System.out.println(sf);
	sf.replace(0, 3, "Mame");
	System.out.println(sf);
	System.out.println(sf.capacity());
	sf.trimToSize();
	System.out.println(sf.capacity());
	System.out.println(sf.substring(3));
}

static int checkCapacity(StringBuffer sf) {
	return sf.capacity();
}
}
