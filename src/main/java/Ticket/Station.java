package Ticket;

public class Station
{
    public static final Station TAIPEI_STATION =
            new Station(100,"Taipei");
    public static final Station TAICHUNG_STATION =
            new Station(200,"Taichung");
    public static final Station KAOUSIUNG_STATION =
            new Station(300,"Kaohsiung");
    int id;
    String name;
    public Station(int id,String name)
    {
        this.id = id;
        this.name = name;

    }
}
