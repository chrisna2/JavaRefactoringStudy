package com.refactoring.study.methodsimple_8;

import java.util.EmptyStackException;
import java.util.Stack;

public class ResourcePool {

	Stack _available;
	Stack _allocated;
	
	ResourcePool(){
		  _available=new Stack();
		  _allocated=new Stack();
	}
	
   Resource getResource() {
       Resource result;
       
       if(_available.isEmpty()) {
    	   result = new Resource();
    	   _allocated.push(result);
    	   return result;
       }
       
	   result = (Resource)_available.pop();
	   _allocated.push(result);
	   return result;

	   // Resource 고갈을 예기치못한 일이 아니므로 예외처리를 사용하지 않는 것이 좋음
       
       /*
       try {
    	   result = (Resource)_available.pop();
    	   _allocated.push(result);
    	   return result;
       } catch (EmptyStackException e) {
    	   result = new Resource();
    	   _allocated.push(result);
    	   return result;
       }
       // Resource 고갈을 예기치못한 일이 아니므로 예외처리를 사용하지 않는 것이 좋음
        */
   }



}
