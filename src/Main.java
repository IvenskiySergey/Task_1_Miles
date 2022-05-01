public class Main {

    public static void main(String[] args) {

        int TicketPrice = 3019; //Стоимость билета
        int OneMile = 20; //Количество рублей для одной бонусной мили
        int Bonus = TicketPrice/OneMile; //Количество бонусных миль

        System.out.println("Колличество бонусных миль = " + Bonus);
    }
}
