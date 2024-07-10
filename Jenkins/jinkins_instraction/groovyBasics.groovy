// This is a single-line comment

/*
   This is a
   multi-line comment
*/

// variables
def number = 10             // Dynamic typing
int age = 25                // Static typing
final String name = "John"  // Constant

// strings
def name = "Alice"
def greeting = "Hello, $name!"

// list
def numbers = [1, 2, 3, 4, 5]

// maps
def person = [name: "Alice", age: 30]


// If-else statement
if (age >= 18) {
    println "You are an adult."
} else {
    println "You are a minor."
}

// For loop
for (i in 1..5) {
    println i
}

// While loop
def count = 0
while (count < 5) {
    println count
    count++
}



// functions
def greet(name) {
    println "Hello, $name!"
}

greet("Bob")

// classes
class Person {
    String name
    int age

    Person(String name, int age) {
        this.name = name
        this.age = age
    }

    void greet() {
        println "Hello, my name is $name and I'm $age years old."
    }
}

def person = new Person("Alice", 30)
person.greet()

