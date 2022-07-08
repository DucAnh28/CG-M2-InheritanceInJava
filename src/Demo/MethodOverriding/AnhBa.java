package Demo.MethodOverriding;

public class AnhBa extends AnhHieu {
    public String getName() {
        return "Anh Ba noi con to va nhieu hon";
    }
}

class Client {
    public static void main(String[] args) {
         AnhBa newPer = new AnhBa();
        System.out.println(newPer.getName());
    }
}