package ch10;

public class NullPointerExceptionMain {

	public static void main(String[] args) {
//		String data = null;
//		System.out.println(data.toString());

//		try 영역은 오류가 발생할 가능성이 있는 실행코드를 입력하는 것
		try {
			String data = null;
			System.out.println(data.toString());
		}
//		catch 영역은 오류가 발생했을 경우 처리 할 코드를 입력하는 부분
//		catch() 괄호 부분은 try영역에서 발생하는 오류의 종류 입력, 오류의 클래스 명을 입력, 오류의 종류를 모를 경우는 Exception e라고 입력
//		Exception은 모든 오류의 조상 클래스
		catch (NullPointerException e) {
			System.out.println("오류가 발생했습니다.");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
		
		System.out.println("오류 발생 후 출력되는 문자열");
	}

}
