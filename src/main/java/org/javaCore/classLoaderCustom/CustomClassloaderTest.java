package org.javaCore.classLoaderCustom;

class CustomClassLoader extends ClassLoader{
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        ClassLoader l = ClassLoader.getSystemClassLoader();
        return l.loadClass(name);
    }
}

public class CustomClassloaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        Student s1 = new Student();

        CustomClassLoader c = new CustomClassLoader();
        Class<?> studentClass = c.loadClass("Student");

        // Now you can create an instance of Student using reflection
        try {
            Object studentInstance = studentClass.newInstance();
            Student student = (Student) studentInstance;
            // Use the Student instance as needed
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}