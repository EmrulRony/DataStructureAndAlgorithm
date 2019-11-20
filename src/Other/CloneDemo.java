package Other;

class Address {
	private String area;
	private String city;
	
	public Address() {
		
	}

	public Address(String area, String city) {
		this.area = area;
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}

class Person implements Cloneable {
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, String area, String city) {
		this.name = name;
		this.age = age;
		address = new Address(area, city);
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		person.address = new Address();
		return person;
	}
}

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("Emrul", 26, "Dhanmondi", "Dhaka");

		System.out.println(person.getName() + " " + person.getAge() + "\n" + person.getAddress().getArea() + " "
				+ person.getAddress().getCity() + "\n ------------");
		
		Person clonePerson = (Person) person.clone();
		clonePerson.setName("Kamrul");
		clonePerson.getAddress().setArea("Gopibugh");
		
		System.out.println(person.getName() + " " + person.getAge() + "\n" + person.getAddress().getArea() + " "
				+ person.getAddress().getCity() + "\n ------------");
		
		System.out.println(clonePerson.getName() + " " + clonePerson.getAge() + "\n" + clonePerson.getAddress().getArea() + " "
				+ clonePerson.getAddress().getCity()+ "\n ----------");
	}
}
