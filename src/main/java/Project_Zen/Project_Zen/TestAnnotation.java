package Project_Zen.Project_Zen;

import org.testng.annotations.Test;

public class TestAnnotation {
	
	
	@Test(priority= '1')
	public void firstmethod (){
		
		System.out.println("First Method Executed");
		
	}
	
	@Test(priority= '3')
	public void secondmethod (){
		
		System.out.println("Second  Method Executed");
		
	}

	@Test(priority= '2')
	public void third (){
	
	System.out.println("Thrid  Method Executed");
	
}

	@Test(priority= '4')
	public void forth (){
	
	System.out.println("Florth  Method Executed");
	
}
	
	
	@Test(priority= '5')
	public void fifth (){
	
	System.out.println("Fifth  Method Executed");
	
}
	
	@Test(priority= '6')
	public void sixth (){
	
	System.out.println("Sixth  Method Executed");
	
	}
	@Test(priority= '7')
	public void Seventh (){
	
	System.out.println("Seven  Method Executed");
}



	

}
