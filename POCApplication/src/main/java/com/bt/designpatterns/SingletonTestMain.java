package com.bt.designpatterns;

public class SingletonTestMain {

	public static void main(String[] args) {
		
		SingleTonObject singleObject = SingleTonObject.getInstance();

	      //show the message
		singleObject.showMessage();
		
		InnerClassSingleTon innerClassSingleTon=InnerClassSingleTon.getInstance();
		
		
		innerClassSingleTon.showInnerSingleTonMessage();
	}

}
