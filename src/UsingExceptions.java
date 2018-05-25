public class UsingExceptions
{
	public static void main(String[] args) {
//		try {
//			throwException();
//		}
//		catch (Exception exception) {
//			System.err.println("Exception handled in main");
//		}
//		doesNotThrowException();
		
		try {
			method1();
		}
		catch (Exception e) {
			System.err.printf("%s%n%n", e.getMessage());
			e.printStackTrace();
			
			StackTraceElement[] traceElements = e.getStackTrace();
			
			System.out.printf("%nStack trace from getStackTrace:%n");
			System.out.println("Class\t\tFile\t\t\tLine\tMethod");
			
			for (StackTraceElement element : traceElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}
	}
	
	public static void throwException() throws Exception {
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch (Exception exception) {
			System.err.println("Exception handled in method throwException");
			throw exception;
		}
		finally {
			System.err.println("Finally excuted in throwException");
		}
	}
	
	public static void doesNotThrowException() {
		try {
			System.out.println("Method doesNotThrowException");
		}
		catch (Exception exception) {
			System.err.println(exception);
		}
		finally {
			System.err.println("Finally excuted in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowException");
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		method3();
	}
	
	public static void method3() throws Exception {
		throw new Exception("Exception throw in method3");
	}
}