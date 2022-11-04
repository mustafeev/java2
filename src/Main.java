public class Main {
    public static void main(String[] args) {

        int ticketСost = 100;
        int costPerMile = 20;
        if (ticketСost / costPerMile >= 1) {
            System.out.println("Колличество ваших миль:" + ticketСost / costPerMile);
        } else {
            System.out.println("Стоимость билета не может быть менее 20 рублей");
        }

    }
}