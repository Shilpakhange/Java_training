package ExceptionHandling;

public class ThrowKeyword {// Throw is used to create your own exceptions...

	public static void main(String[] args) {
		System.out.println("before exception");

		try {
			throw new Exception("Shilpa exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after exception");
		
		String exec_flag="N";
		if (exec_flag=="N")
		{
			try {
				throw new Exception("Exec flag is blank exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("after throw block");
	} 
	

}
