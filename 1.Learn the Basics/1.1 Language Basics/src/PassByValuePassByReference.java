public class PassByValuePassByReference {
    //Java me pass by value hi hota hai toh ye question mai nahi kar raha hoon
    //
    //Read this by chatgpt
    //
    //In Java, all method arguments are passed by value. This means that when you pass a variable to a method, you are actually passing a copy of the value stored in that variable, not the variable itself or a reference to it. This can sometimes be confusing because the behavior may seem similar to pass by reference, but it's important to understand the distinction.
    //
    //Let's break it down:
    //
    //Pass by Value:
    //
    //When you pass a primitive data type (such as int, float, char, etc.) to a method, you are passing the actual value of the variable.
    //Any changes made to the parameter inside the method do not affect the original variable outside the method.
    //Pass by Value (Object References):
    //
    //When you pass an object (non-primitive data type) to a method, you are still passing a copy of the reference to the object, not the actual object.
    //This means that changes made to the object's state (e.g., modifying its fields) inside the method are reflected in the original object since both the original reference and the copied reference point to the same object.
    //
    //In summary, Java uses pass by value for all method arguments. For primitive types, you're passing the actual value, and for objects, you're passing a copy of the reference to the object, which can be used to modify the object's state. Understanding this distinction is important for working effectively with Java.
}
