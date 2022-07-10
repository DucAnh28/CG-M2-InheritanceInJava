public class main {
    public static void main(String[] args) {
//        Cha c = new ConTrai();
//        Cha c1 = new Cha();
//        Cha c2 = new ConGai();
//      <Kiểu khai báo>    <Kiểu thực tế>
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(c2);
//
        Cha cha[] = new Cha[3];
//        Ép kiểu từ con lên cha
        cha[0] = new ConTrai();
        cha[1] = new ConGai();
        cha[2] = new ConGai();
//        Ép kiểu từ cha xuống con
//        (Kiểu dữ liệu)<tên biến>
        ((ConGai)cha[1]).getOto();



    }
}
