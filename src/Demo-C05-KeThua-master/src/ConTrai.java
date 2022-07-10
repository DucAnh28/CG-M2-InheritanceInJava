public class ConTrai extends Cha {
    String dt;

    @Override
    public String toString() {
        return "Con{" +
                "soDo='" + soDo + '\'' +
                ", name='" + name + '\'' +
                ", dt='" + dt + '\'' +
                '}';
    }

    public ConTrai() {
        System.out.println("Con");
    }

    public ConTrai(String dt) {
        this.dt = dt;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

}
