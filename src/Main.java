public class Main {

    public static void main(String[] args) {

        int ticketPrice = 3019; //Стоимость билета
        int oneMile = 20; //Количество рублей для одной бонусной мили
        int bonus = ticketPrice / oneMile; //Количество бонусных миль

        System.out.println("Колличество бонусных миль = " + bonus);
    }
}
