package com.refactoring.study.arrangemethodcomplex;

/**
 * 이 클래스는 사용자가 지정한 최대 값까지 소수를 생성한다. 사용된 알고리즘은 에라스토네테스의 체다.
 * <P>
 * 에라스토테네스 : 기원전 276년에 리비아 키레네에서 출생, 기원전 194년 사망
 * 지구 둘레를 최초로 계산한 사람이자 달력에 윤년을 도입한 사람
 * 알렉산드리아 도서관장을 역임
 * <P>
 * 알고리즘은 상당히 단순하다. 2에서 시작하는 정수 배열을 대상으로
 * 2의 배수를 모두 제거한다. 다음에 남은 정수를 찾아 이 정수의 배수를 모두 지운다.
 * 최대 값의 제곱근이 될 때까지 이를 반복한다.
 * 
 * - main() 함수를 초기값 세팅 부분, initiateArray(), 소수체크 부분 checkPrimes(), 결과 값을 출력하는 부분 putprimesResult() 로 메서드를 분할하시오.
 * 
 * @author Bob
 * @version 2012.02.13
 *
 */
public class GeneratePrimes {
	
	/*
	//as-is
	public int getPrimes(int maxValue) {
		
		int primesCount=0;
	    		
		if (maxValue >= 2) { //유일하게 유효한 경우
			// 선언
			boolean[] crossedOut = new boolean[maxValue + 1];
			int i;
			
			// 배열을 참으로 초가회
			for (i=0; i<crossedOut.length; i++) 
			    crossedOut[i] = true;
			// 소수가 아닌 알려진 숫자를 제거
			crossedOut[0] = crossedOut[1]= false;
			
			int j;
			
			for(i=2; i<Math.sqrt(crossedOut.length)+1; i++) {
				if(crossedOut[i]) {	// i가 남아있는 숫자라면 이 숫자의 배수를 구한다.
					for (j=2*i; j<crossedOut.length; j+=i) {
					    crossedOut[j] = false; // 배수는 소수가 아니다.
					}
				}
			}
			
			//소스 개수는?
			for (i=0; i<crossedOut.length; i++) {
				if (crossedOut[i]) {
					primesCount++; //카운트 증가
				}
			}
			
			int[] primes = new int[primesCount];
			
			//소수를 결과 배열로 이동한다.
			for(i=0, j=0; i<crossedOut.length; i++) {
				if (crossedOut[i])	// 소수일경우에
					primes[j++] = i;
			}
			
			System.out.println("primes 수는 " + primes.length + "개 입니다.");
		}
		else	// maxValue < 2
		    System.out.println("primes 수는 0 개 입니다.");
		
		return primesCount;
	}
	*/
	
	//to-be
	
	//전체 메서드에서 사용되어 필요한 변수는 이렇게 전역변수로 설정한다.
	private boolean[] crossedOut; 
	
	// main로직
	public int getPrimes(int maxValue) {
		
		int primesCount=0;
	    
		//유일하게 유효한 경우
		if (maxValue >= 2) { 
			//초기값 세팅 부분
			initArray(maxValue);
			//소수체크 부분
			primesCount = checkPrimes();
			//결과 값을 출력하는 부분
			putParamResult(primesCount);
		}
		else {	// maxValue < 2
		    System.out.println("primes 수는 0 개 입니다.");
		}
		return primesCount;
	}
	
	//결과 값을 출력하는 부분 ㅌ
	private void putParamResult(int primesCount) {
		int[] primes = new int[primesCount];
		// 소수를 결과 배열로 이동한다.
		for(int i=0, j=0; i<crossedOut.length; i++) {
			// 소수일경우에
			if (crossedOut[i]) {
				primes[j++] = i;
			}
		}
		System.out.println("primes 수는 " + primes.length + "개 입니다.");
	}
	
	//소수체크 부분
	private int checkPrimes() {
		//지엽적으로 사용하는 변수들은 내부변수로 변환한다.
		int primesCount = 0;
		//소스 개수는?
		for (int i=0; i<crossedOut.length; i++) {
			if (crossedOut[i]) {
				primesCount++; //카운트 증가
			}
		}
		return primesCount;
	}
	
	//초기값 세팅 부분
	private void initArray(int maxValue) {
		// 선언
		crossedOut = new boolean[maxValue + 1];
		// 배열을 참으로 초가회
		for (int i=0; i<crossedOut.length; i++) {
		    crossedOut[i] = true;
		}
		
		// 소수가 아닌 알려진 숫자를 제거
		crossedOut[0] = crossedOut[1] = false;
		
		for(int i=2; i<Math.sqrt(crossedOut.length)+1; i++) {
			if(crossedOut[i]) {	// i가 남아있는 숫자라면 이 숫자의 배수를 구한다.
				for (int j=2*i; j<crossedOut.length; j+=i) {
				    crossedOut[j] = false; // 배수는 소수가 아니다.
				}
			}
		}
	}	
	
	
}
