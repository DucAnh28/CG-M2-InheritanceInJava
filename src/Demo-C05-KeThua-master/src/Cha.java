public class Cha {
    String soDo;
    String name;

    @Override
    public String toString() {
        return "Cha{" +
                "soDo='" + soDo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Cha() {
        System.out.println("Cha");
    }

    public Cha(String soDo, String name) {
        this.soDo = soDo;
        this.name = name;
        System.out.println("Cha");
    }

    public String getSoDo() {
        return soDo;
    }

    public void setSoDo(String soDo) {
        this.soDo = soDo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
