package smartarray;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        for (int i = 0; i < 50; i++) {
            smartArray.add(i);
        }

        smartArray.replace(-1, 3);
        for (int i = 0; i <smartArray.size() ; i++) {
            System.out.println(smartArray.get(i));
        }
    }
}
