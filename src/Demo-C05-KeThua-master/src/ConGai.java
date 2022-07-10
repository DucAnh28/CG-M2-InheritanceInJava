public class ConGai extends Cha {
    String oto;

    public String getOto() {
        return oto;
    }

    public void setOto(String oto) {
        this.oto = oto;
    }

    @Override
    public String toString() {
        return "ConGai{" +
                "soDo='" + soDo + '\'' +
                ", name='" + name + '\'' +
                ", oto='" + oto + '\'' +
                '}';
    }
}
