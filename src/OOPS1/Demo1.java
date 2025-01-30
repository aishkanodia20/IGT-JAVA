package OOPS1;

class Emp {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + "]";
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.setId(100);
        e.setName("Aish");

        // Print the Emp object
        System.out.println(e);

    }
}