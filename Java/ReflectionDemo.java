/*
39. Reflection in Java 
• Objective: Use Java Reflection API. 
• Task: Load a class and invoke methods dynamically. 
• Instructions: 
o Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without 
directly referencing it in code. 
o Print the method names and parameters. 
*/
import java.lang.reflect.*;

class Sample {

    public void greet() {
        System.out.println("Hello from Reflection");
    }
}

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Sample");

        System.out.println("Methods:");

        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        Object obj =
            cls.getDeclaredConstructor().newInstance();

        Method m = cls.getMethod("greet");

        m.invoke(obj);
    }
}