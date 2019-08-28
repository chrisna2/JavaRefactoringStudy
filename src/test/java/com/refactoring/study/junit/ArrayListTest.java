package com.refactoring.study.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * Junit 테스트 케이스 작성
 * - java.util.ArrayList를 대상으로 add(), set(), remove(), addAll() 메서드에 대한 테스트 케이스 작성 
 * 
 * 테스트 코드의 이해 
 * - 태스트 코드는  소스코드와 같이 중요하다.
 * - 게발 소스는 테스트 코드와 1:1로 매칭 된다
 * - 테스트 코드가 없다면 , 모든 소스코드 변경은 잠점적인 버그이다.
 * 
 * Junit은 자바기반의 오픈소스 테스트 프레임워크 
 * - 현재 스프링 부트에서는 starter 프로젝트 생성시 기본으로 maven으로 내장 되어 나간다.
 * 
 * @author chris
 *
 */
public class ArrayListTest {
	
	ArrayList<String> arrayList = new ArrayList<String>();
	
	//태스트 코드가 실행되기 전에 테스트 환경을 설정하는 어너테이션이다.
	@Before
	public void setUp() throws Exception {
        for (int i=0; i<3; i++) {
            arrayList.add("" + i);
        }
	}
	
	
	/* Junit Assert 구문
	 * [1] assertArrayEquals(String message, Object[] a, Object[] b) : 배열 a 와 b가 일치함을 확인
	 * [2] assertEquals(String message, Object a, Object b) : a 와 b의 값이 일치함을 확인
	 * [3] assertSame(String message, Object a, Object b) : a 와 b가 같은 객체임을 확인
	 * [4] assertSame(String message, boolean a) : a 값이 false인지 확인
	 * [5] assertTrue(String message, boolean a) : a 값이 true인지 확인
	 * [6] assertNotNull(String message, Object a) : a객체가 null이 아님을 확인
	 */
	
	
	//기본적으로 위에 설정된 값은 메서드별로 초기화 되어 개별적으로 적용된다.
	//순서대로 메서드가 실행 된다.
	@Test
    public void testAdd() {
        assertEquals(arrayList.size(), 3);
        arrayList.add(1, "Insert");
        assertEquals(arrayList.size(), 4);
        assertEquals(arrayList.get(1), "Insert");
    }
	
	@Test
    public void testSet() {
        assertEquals(arrayList.size(), 3);
        arrayList.set(1, "Set");
        assertEquals(arrayList.size(), 3);
        assertEquals(arrayList.get(1), "Set");		
    }
    
	@Test
    public void testRemove() {
        assertEquals(arrayList.size(), 3);
        arrayList.remove(1);
        assertEquals(arrayList.size(), 2);
        String[] strs = {"0","2"};
        compare(arrayList, strs);
    }
	
	@Test
    public void testAddAll() {
        assertEquals(arrayList.size(), 3);
        arrayList.addAll(arrayList);
        assertEquals(arrayList.size(), 6);
        
        
    }
	//자체적으로 테스트 케이스 안에서 사용하는 메서드를 구성하려면 다음과 같이 설정 가능 하다.
    @SuppressWarnings("unused")
	private void compare(ArrayList<String> lst, String[] strs) {
        Object[] array = lst.toArray();
        assertTrue("Arrays not the same length", array.length == strs.length);
        for (int i = 0; i < array.length; i++)
        assertEquals(strs[i], (String) array[i]);
    }


}
