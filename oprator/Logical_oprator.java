public class Logical_oprator {
    public static void main(String args[]) {
        int a = 6;
        int b = 7;
        int c = 9;
        System.out.println("AND oprator = " + (b > a && c > b));
        System.out.println("OR oprator = " + (a > b || c > b));
        System.out.println("NOT operator = " + !(b < a));
    }
}
