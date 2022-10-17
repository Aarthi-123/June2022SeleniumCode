package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	//AAA in unit test
	//Arrange, Act, and Assert 
	
	//generic function for createUser:
	public void createAUser() {
		System.out.println("creating a user");
	}
	
	@Test
	public void a_createUser() {
		System.out.println("create user");//100
		createAUser();//100
		//int i = 9/0;
	}
	
//	@Test(dependsOnMethods = "a_createUser")//if a_createUser() have the problem it will skipped the depended method(update and deleteUser()) unnecessarily
//	public void updateUser() {				//so dont use dependsOnMethods. The methods should not depend on other methods. The methods should
//		System.out.println("update user");	//be in independent.So always create generic function and used inside the dependent functions if needed.. so it wont affect the test
//
//	}
//	
//	@Test(dependsOnMethods = "a_createUser")
//	public void deleteUser() {
//		System.out.println("delete user");
//
//	}
	
	@Test()
	public void updateUser() {
		createAUser();//101
		System.out.println("update user");//101

	}
	
	@Test()
	public void deleteUser() {
		createAUser();//201
		System.out.println("delete user");//201

	}

}
