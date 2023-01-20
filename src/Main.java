public class Main {
    public static void main(String[] args) {

       Landline l1 =  new Landline("123457");
       Landline l2 = new Landline("123456");

       l1.callNumber("123456");
       l2.receiveCall("123456");
        System.out.println(l2.answerCall());
    }
}