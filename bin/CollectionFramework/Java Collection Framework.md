## Java Collection Framework

**What's Collection?**

Represents a group of individual objects as a single entity

**Collection vs Collections**

| Collection                                                   | Collections                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| It is an interface represent a group of individual objects as a single entity. | It is a utility class under `java.util` package that defines several utility methods for collection objects. |

**Array vs Collections**

| Array                                           | Collections                                  |
| ----------------------------------------------- | -------------------------------------------- |
| Fixed in size                                   | Growable in nature                           |
| Homogeneous                                     | Can be both homogenous and heterogenous      |
| Recommended WRT  to performance                 | Recommended WRT memory                       |
| No readymade method support                     | There are readymade method support           |
| Can be used to hold both primitives and objects | Collections can be used to hold only objects |

![class-and-interface-hierarchy](C:\Users\Sarowar-221\Downloads\class-and-interface-hierarchy.png)

### **Collection(I)**

------

Represent a group of individual objects as a single entity

<u>**Important methods**</u>

1. boolean add(Object obj)
2. boolean addAll(Collection c)
3. void clear( )
4. boolean contains(Object obj)
5. boolean containsAll(Collection c)
6. boolean equals(Object obj)
7. int hashCode( )
8. boolean isEmpty( )
9. Iterator iterator( )
10. boolean remove(Object obj)
11. boolean removeAll(Collection c)
12. int size( )

### **List (I)**

------

![gateViewSample](C:\Users\Sarowar-221\Downloads\gateViewSample.PNG) 

- The child interface of collection
- Insertion order preserved
- Duplicates allowed

**<u>Important methods</u>**

1. boolean add(int index, Object obj)
2. boolean addAll(int index, Collection c)
3. Object get(int index)
4. int indexOf(Object obj)
5. int lastIndexOf(Object obj)
6. ListIterator listIterator( )
7. Object remove(int index)
8. Object set(int index, Object obj)

#### ArrayList(C)

- Insertion order preserved
- Duplicates are allowed
- Null insertion possible
- DS: Growable Array
- Recommended when frequent operation is retrieval operation
- Implements serializable and cloneable
- Implements random access

<u>**Constructors**</u>

1. ArrayList()

   - Creates an empty Arraylist Object with initial capacity(10)

   - Once the initial capacity reached then new ArrayList object is created with,

     new capacity = (current capacity * 3/2) +1

2. ArrayList(int initialCapacity)

   - Creates an empty ArrayList object with the specified initial capacity

3. new ArrayList(Collection c)

   - Creates an equivalent ArrayList object for the given collection

```java
   public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Emrul");
		al.add("Rony");
		al.add(123);
		al.add(null);
		
		System.out.println(al);
	}
}
Output: [Emrul, Rony, 123, null]
```

