package ������ģʽ;


public class MySubject implements Subject {  

	public void accept(Visitor visitor) {  
		visitor.visit(this);  
	}  

	public String getSubject() {  
		return "love";  
	}  
}  

