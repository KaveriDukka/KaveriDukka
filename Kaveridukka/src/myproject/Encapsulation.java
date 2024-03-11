package myproject;

 class Encapsulation {

	 private String name;
	 private int age;
	
	 public String getName() {
		return name;
	}
	
	 public void setName(String name) {
		this.name = name;
	}
	
	 public int getAge() {
		return age;
	}
	
	 public void setAge(int age) {
		this.age = age;
	}
	 
	public static void main(String args[]) {
		Encapsulation Person = new Encapsulation();
		Person.setName("Kaveri");
		Person.setAge(21);
		
	   System.out.println("Name: " +Person.getName());
	   System.out.println("Age: " +Person.getAge());
	}
}
