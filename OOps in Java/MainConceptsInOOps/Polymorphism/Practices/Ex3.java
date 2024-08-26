// 3. What is the significance of the instanceof operator in achieving runtime polymorphism? Provide an example demonstrating its usage.

// Explanation:

// The instanceof operator checks whether an object is an instance of a particular class or subclass. It is significant in runtime polymorphism because it allows the program to confirm the actual type of an object before invoking methods or casting.


// The instanceof keyword in Java is used to check whether an object is an instance of a specific class or subclass. It is a type comparison operator that returns true or false based on the relationship between the object and the class.

// Purpose of instanceof Keyword:
// The instanceof keyword helps in verifying the actual type of an object at runtime. This is particularly useful when dealing with polymorphism, where a parent class reference can refer to a child class object. Before performing operations specific to the child class (such as method calls that don't exist in the parent class), you need to ensure that the object is of the correct type. This prevents potential ClassCastException errors.

// Example:

// class Animal {
//     void makeSound() {
//         System.out.println("Some generic animal sound");
//     }
// }

// class Dog extends Animal {
//     void makeSound() {
//         System.out.println("Bark");
//     }

//     void fetch() {
//         System.out.println("Dog fetches the ball");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal animal = new Dog();

//         if (animal instanceof Dog) {
//             Dog dog = (Dog) animal;
//             dog.fetch();  // Output: Dog fetches the ball
//         } else {
//             System.out.println("Not a Dog instance");
//         }
//     }
// }


// Here, the instanceof operator ensures that animal is an instance of Dog before invoking the fetch() method, avoiding a ClassCastException.

//Another Example
// Polymorphism with instanceof:

// class Animal {
//     void makeSound() {
//         System.out.println("Some generic animal sound");
//     }
// }

// class Dog extends Animal {
//     void makeSound() {
//         System.out.println("Bark");
//     }

//     void fetch() {
//         System.out.println("Dog fetches the ball");
//     }
// }

// class Cat extends Animal {
//     void makeSound() {
//         System.out.println("Meow");
//     }

//     void scratch() {
//         System.out.println("Cat scratches the post");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal myAnimal = new Dog();  // Parent reference, child object

//         // Check if the object is an instance of Dog
//         if (myAnimal instanceof Dog) {
//             Dog myDog = (Dog) myAnimal;  // Safe downcasting
//             myDog.fetch();  // Output: Dog fetches the ball
//         }

//         // Now let's create a Cat object
//         myAnimal = new Cat();  // Parent reference, different child object

//         // Check if the object is an instance of Cat
//         if (myAnimal instanceof Cat) {
//             Cat myCat = (Cat) myAnimal;  // Safe downcasting
//             myCat.scratch();  // Output: Cat scratches the post
//         }
//     }
// }
// In this example:

// We first check if myAnimal is an instance of Dog. If it is, we cast it to Dog and call the fetch() method.
// Later, we assign a Cat object to myAnimal, and we check if myAnimal is an instance of Cat. If it is, we cast it to Cat and call the scratch() method.



// 5. Can you explain how covariance works with return types in method overriding and how it demonstrates polymorphism? Provide a code example.

// Explanation:

// Covariant return types allow a method in a subclass to return a type that is a subclass of the return type declared in the overridden method in the parent class. This allows method overriding to return more specific types while still demonstrating polymorphism.


// Covariant return types allow a method in a subclass to return a more specific type than the method it overrides in the parent class.
// This makes the code cleaner, avoids unnecessary type casting, and reduces the risk of runtime errors.
// Use covariant return types when overriding methods in subclasses that can return a more specific type.

// Example:


// class Animal {
//     Animal getAnimal() {
//         return new Animal();
//     }
// }

// class Dog extends Animal {
//     @Override
//     Dog getAnimal() {
//         return new Dog();  // Covariant return type
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal animal = new Dog();
//         animal = animal.getAnimal();  // Output: Dog instance returned
//     }
// }


// Here, the getAnimal() method in the Dog class returns a Dog object instead of an Animal, showing how covariant return types work with polymorphism.