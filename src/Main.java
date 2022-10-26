public class Main {
    public static void main(String[] args) {

        int TicketСost = 100;
        int CostPerMile = 20;
        if (TicketСost / CostPerMile >= 1) {
            System.out.println("Колличество ваших миль:" + TicketСost / CostPerMile);
        } else {
            System.out.println("Стоимость билета не может быть менее 20 рублей");
        }

    }
}