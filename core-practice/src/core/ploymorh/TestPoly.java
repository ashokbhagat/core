package core.ploymorh;

class Animal {
    protected void getData() {
        System.out.println("Inside Animal getData");
    }
}

class Dog extends Animal {
    protected void getData() {
        System.out.println("Inside Dog getData");
    }
}

public class TestPoly {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.getData();
    }
}

