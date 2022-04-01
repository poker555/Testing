package Ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1:Taipei,2:Taichung,3:Kaohsiung)");
        int choose = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choose)
        {
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;
            case 3:
                start = Station.KAOUSIUNG_STATION;
                break;
        }
        System.out.println("Your destination station?(1:Taipei,2:Taichung,3:Kaohsiung)");
        choose = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choose)
        {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOUSIUNG_STATION;
                break;
        }
        System.out.println("Which kind of ticket?(1:Normal,2:Student,3:Elder ticket");
        choose = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choose)
        {
            case 1:
                ticket = new Ticket(start,destination);
                break;
            case 2:
                ticket = new StudentTicket(start,destination);
                break;

        }
        Ticket.print();

    }
}
