import java.util.Scanner;

public class checkpoint {
    public static void main(String[] args) throws InterruptedException {

        Scanner inputBuffObj = new Scanner(System.in);
        int maxNoTicket = 4 ;
        boolean KeepRuuning = true;

        String [] checkpointTicket = new String[maxNoTicket];


        checkpointTicket[2] = "This is the MODIFIED Ticket";
        System.out.println(checkpointTicket[2]);
        for (int  checkpointNoTicket = 0;checkpointNoTicket <  maxNoTicket; checkpointNoTicket++) {
            System.out.println("please enter yout Ticket: ");
            checkpointTicket[checkpointNoTicket] = inputBuffObj.nextLine();


        }


        }
}