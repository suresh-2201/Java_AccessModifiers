//class with private fields and method
public class ProtectedMethod {
    //Protected field
    protected String name;

    //Protected method
    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

//Accessing protected fields and methods from other class in the same package
class protectedClass_03 {
    public static void main(String[] args) {
        //Creating object of ProtectedClassFieldsMethod class.
        ProtectedMethod pc = new ProtectedMethod();
        //Accessing protected field
        pc.name = "Protected Method";
        //Accessing protected method
        pc.protectedMethod();
    }
}