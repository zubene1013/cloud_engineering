package exam17_유틸리티;

class Calendar{
	
	private static Calendar cal;
	
	private Calendar() {}
	
	public static Calendar getInstance() {
		if(cal==null) cal = new Calendar();
		return cal;
	}
}


public class SingleTonDesignTest {

	public static void main(String[] args) {
		// 싱글톤 디자인 패턴 : 단 하나의 인스턴스만 만들 때 사용 ex. 지구, 대한민국,....
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal == cal2);// true
		
	}

}
