class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { //while문에 (true) 생략 불가 //무한 반복문
			if(sum > 100)
				break;
			++i;
			
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}
