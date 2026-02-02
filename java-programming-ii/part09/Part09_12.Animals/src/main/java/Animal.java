public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(getName() + " eats");
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps");
    }
}
