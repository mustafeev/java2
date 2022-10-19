public class Main {
    public static void main(String[] args) {

        int ticketСost = 100;
        int costpermile = 20;
        if (ticketСost / costpermile >= 1) {
            System.out.println("Колличество ваших миль:" + ticketСost / costpermile);
        } else {
            System.out.println("Стоимость билета не может быть менее 20 рублей");
        }

    }
}