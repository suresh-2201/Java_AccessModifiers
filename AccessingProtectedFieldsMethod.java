//Accessing the PROTECTED fields and methods from child class
public class AccessingProtectedFieldsMethod extends ProtectedMethod {

    public static void main(String[] args) {
        //Creating object of AccessingProtectedFieldsMethod
        AccessingProtectedFieldsMethod sub = new AccessingProtectedFieldsMethod();
        //Accessing protected field
        sub.name = "Protected Method in SubClass";
        //Accessing protected method
        sub.protectedMethod();
    }
    /* NOTE :
             - protected member can be access within the package and
                outside the package but within the child classes */
}