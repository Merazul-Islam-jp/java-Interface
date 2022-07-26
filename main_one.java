public class main_one {

    public static void main(String[] args) {
        Bycycle obj = new Bycycle();
        obj.SpeedUp(5);
        obj.changeGare(2);
        obj.ApllyBrack(2);
        System.out.println("apply to method:");
        obj.printStates();
    }

}
