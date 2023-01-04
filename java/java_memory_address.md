## **Java memory address short note**

<br>

Firstly, there is a difference between variables and objects. An object is an instance of a class which is stored in the heap memory of a JVM and a variable is a container of data value. The type of variable determines the data value and the reference to the data value. The variable can be pointing to an object (stored in heap memory) or it can be poiting to a primitive data value like int, float, byte, etc.. which is stored in the Stack memory. Here, we will focus on the object.

Before we move ahead with the question, it is important to know that the run-time data areas like Heap memory are not part of the JVM specification and is left to the discretion of the implementor. Hence, each implementation of the JVM has its own way of dealing with object layouts in memory. For this question, we will consider the Hotspot JVM (provided by Oracle).

The JOL (Java Object Layout) tool/API can be used to retrieve the memory address of an object. The addressOf() method declared in the VirtualMachine interface will return the memory address as long value.

**Sample Code:**

    Object obj = new Object();
    System.out.println("Memory address " + VM.current().addressOf(obj));

    Sample output:
    Memory address 31864981224

You can add the following maven dependency in your project to get the relevant JARs for the above sample code:

    <dependency>
        <groupId>org.openjdk.jol</groupId>
        <artifactId>jol-core</artifactId>
        <version>0.10</version>
    </dependency>

Note: This code has to be executed on the HotSpot JVM in order for you to get the results.

In my opinion, we should not temper with the memory address obtained with the above method. During the life time of an object, the memory address of the object may change due to the garbage collector which moves the object across different areas in Heap memory as part of minor GC or major GC.

The hashCode() method is defined in the Object class, which is the parent of all classes in Java. This method can easily be overridden in any java class.

The hashCode() method returns the hash code, in the form of int value, for an object. This method is implemented for the benefit of Hash Table implementations like HashMap. In a Hash Table implementation, the Entry (which is a combination of a Key-Value pair) is stored in the data structure using the hash code value of an object used as Key. The hash code value determines the bucket location where the particular Entry has to be stored or retrieved. The class of the object used as Key should override the hashCode() method for better performance of the hash table implementation. It is always advisable to override the equals() method along with the hashCode() method in order to maintain the general contract of the hashCode() method. Refer the javadoc of Object class for more on the general contract.

There is a misconception that the hashCode() value returned for an object is the memory address of an object or the hexadecimal number after the at the rate operator for the object representation using the toString() method is the memory location.

**Sample Code:**

    Object obj = new Object();
    System.out.println("Memory address: " + VM.current().addressOf(obj));
    System.out.println("toString: " + obj);
    System.out.println("hashCode: " + obj.hashCode());
    System.out.println("hashCode: " + System.identityHashCode(obj));

**Sample Output:**

    Memory address: 31879960584
    toString: java.lang.Object@60addb54
    hashCode: 1622006612
    hashCode: 1622006612

The value returned by the hashCode is different than the memory address returned by the addressOf() method.

[source](https://qr.ae/pry8Ri)