package string_buffer_programs;


public class CommonClassTest<T> {
	public static void main(String[] args) {
		CommonBlueprint<Integer> b1 = new CommonBlueprint<>(10);
		CommonBlueprint<Integer> b2 = new CommonBlueprint<>(10);
		System.out.println(b1.equals(b2));
		
	}
	
	
}
