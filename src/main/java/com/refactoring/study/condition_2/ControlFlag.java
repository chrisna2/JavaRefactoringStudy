package com.refactoring.study.condition_2;

/**
 * 제어 플래그 제거
 * - controlFlag 클래스내의 제어플래그 found를 삭제하고 return 문으로 대체
 * 
 * 불필요한 플래그 변수는 지양하자.. -> return, break, continue로 변경
 * 
 * @author chris
 */
public class ControlFlag {
	
	public ControlFlag() {}
	
	/*
	//as-is
	public void checkSecurity(String[] people) {
		String found = "";
		for (int i = 0; i < people.length; i++) {
			//한명이라도 걸리면 여기서 끝남
			if (found.equals("")) {
				if (people[i].equals("Don")) {
					sendAlert(people[i]);
					found = "Don";
				}
				if (people[i].equals("John")) {
					sendAlert(people[i]);
					found = "John";
				}
			}
		}
	}
	*/
	
	//to-be
	public void checkSecurity(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				sendAlert(people[i]);
				return;
			}
			if (people[i].equals("John")) {
				sendAlert(people[i]);
				return;
			}
		}
	}
	
	private void sendAlert(String user) {
		System.out.println(user + " Access Permitted!!");
	}

}
