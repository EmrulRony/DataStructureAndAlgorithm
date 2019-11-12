<h2 style="text-align:center">Clone() method in Java</h2>

Object cloning means creating a carbon copy of on Object. It creates an instance of the original object and initializes all the fields with the same value of original object fields.

##### <u>Using Assignment Operator</u>

There's no operator for copying object in Java. The assignment operator just copy the reference variable but not the object. For example...

```java

public class Test{
int x, y;
Test(){
    this.x = 10;
    this.y = 20; 
}
 public static void main(String []args){
    Test obj1 = new Test();
    System.out.println(obj1.x + "............"+ obj1.y);
    Test obj2 = obj1;
    obj2.x=100;
    System.out.println(obj1.x + "............"+ obj1.y);
    System.out.println(obj2.x + "............"+ obj2.y);
 }
}

OUTPUT:
10............20
100............20
100............20
```

<h4 style="text-align:center">Creating a copy using clone()</h4>

- Every class whose object's to be cloned must have a public clone() method in it.
- Every class that implements clone() should call super.clone() to obtain the cloned object reference.
- Class must also implement java.lang.Cloneable interface. Without implementing this interface it will throw CloneNotSupportedException.
- clone() is a method of java.lang.Object class and it's declared as protected and native. We don't override clone to get cloned object reference.

**Shallow Copy using clone()**

```java
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
		return (Person) super.clone();
	}
}

class Address {
	private String area;
	private String city;
    
    public Address(){}

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

OUTPUT: 
Emrul 26
Dhanmondi Dhaka
 ---------------------------------------------------
Emrul 26
Gopibugh Dhaka
 ---------------------------------------------------
Kamrul 26
Gopibugh Dhaka
 ---------------------------------------------------
```

**Shallow copy vs Deep copy**

In Shallow copy if an object has references to other objects as a field both original and cloned object will share the memory location of that field. So any change in cloned object will reflect in original object.

In Shallow copy if an object has references to other objects as a field ,original and cloned object will have a different memory location of that object. So any change in cloned object will not reflect in original object.

For primitive objects Shallow copy and Deep Copy will act as same.

 **Deep copy using clone()**

We have to modify the clone() method in order to get deep copy

```java
// Inside Person class
public Person clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		person.address = new Address();
		return person;
	}
```

Output:

```
Emrul 26
Dhanmondi Dhaka
 ------------
Emrul 26
Dhanmondi Dhaka
 ------------
Kamrul 26
Gopibugh null
 ----------
```

