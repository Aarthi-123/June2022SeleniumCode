package testngsessions;

import org.testng.annotations.Test;

public class PriorityConcept {

	@Test(priority = 1)
	public void a_test() {
		System.out.println("a test");
	}

	@Test(priority = 3)
	public void b_test() {
		System.out.println("b test");
	}

	@Test(priority = 2)
	public void c_test() {
		System.out.println("c test");
	}

	@Test()
	public void d_test() {
		System.out.println("d test");
	}

	@Test()
	public void e_test() {
		System.out.println("e test");
	}
}

//if priority is 0 it will execute first
//if priority is -1 it will execute first negative values area allowed but always use +ve values
//same priority number it will execute in alphabetical order of method name
//both priority and non priority are available means it always execute the non priority method first then the priority test caes will be execute
