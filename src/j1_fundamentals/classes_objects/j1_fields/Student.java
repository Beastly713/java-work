package j1_fundamentals.classes_objects.j1_fields;

public class Student {
    // Making a class public does NOT make its fields public.
    // In Java:
    // Class visibility and
    // Member (field/method) visibility
    // are completely separate.

    // If Java made all members public automatically:
    // You could not hide internal data
    // Encapsulation would be impossible

    public int age;
    public String name;
}

// Fields are declared inside a class but outside methods.

// Why are they called Instance Variables?
// They are created when an object (instance) is created
// Each object gets its own copy of the fields

// If you don’t assign values, Java gives default values

// Field vs Local Variable (Important!)
// | Field              | Local Variable            |
// | ------------------ | ------------------------- |
// | Declared in class  | Declared inside method    |
// | Gets default value |  No default value         |
// | Belongs to object  | Exists only inside method |

// class Demo {
//     int x; // field

//     void show() {
//         int y; // local variable
//         // System.out.println(y);  ERROR (not initialized)
//     }
// }

// EXplanation :
// Field at the Class Level (Before Runtime)
// At the class level, a field is a declaration.
// It’s part of the class blueprint.

// class Car {
//     String brand;   // field
//     int speed;      // field
// }

// Here:
// brand and speed are fields of the class
// They define what data every Car object will have
// No memory for actual values exists yet (until objects are created)


// Field at Runtime (Inside an Object)
// Now when you create an object:

// Car car1 = new Car();

// Java allocates memory like this:
// car1 →
//     brand = null
//     speed = 0

// Now:
// The object car1 contains actual storage
// Each field has its own memory location
// Values can differ between objects
// If you create another object:
// Car car2 = new Car();
// You now have two separate copies of brand and speed in memory.

// So at runtime:
// A field becomes actual storage inside each object.

// A field is a member variable(A variable declared inside a class, but outside any method, constructor, or block.) declared in a class, and each object created from that class gets its own copy of that field (unless it’s static).
// So:
// In the class → it’s a declaration
// In the object → it’s actual memory storage
// Both are correct — just different perspectives.

// Important: Static Fields (Exception Case)

// Consider:
// class Car {
//     static int wheels = 4;
// }

// This field:
// Belongs to the class itself
// Only one copy exists
// Not duplicated per object

// So:
// Instance field → stored inside each object
// Static field → stored once at class level
