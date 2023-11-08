package Project;

import java.util.Scanner;
public class BelanjaNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String drink = null, food = null, decision, menu;
        int wontoon = 0, peking = 0, pork = 0, tea = 0, water = 0, price = 0, price1 = 0, sum = 0;
        wontoon = 50000;
        peking = 200000;
        pork = 100000;
        tea = 3000;
        water = 3000; 
        boolean Cont = true;
        System.out.println("=============================");
        System.out.println("==Welcome to our restaurant==");
        System.out.println("=============================");
        while(Cont){
        System.out.println("please select one of our menu: ");
        System.out.println("1. Menu and list ");
        System.out.println("2. bill and payment ");
        System.out.println("menu: ");
        menu = input.nextLine();
        switch (menu){
            case ("1") :
                System.out.println("===List of menu===");
                System.out.println("1. Wontoon ");
                System.out.println("2. Peking duck ");
                System.out.println("3. Pork lard ");
                System.out.println("=Drink=");
                System.out.println("1. Iced tea ");
                System.out.println("2. mineral water ");
                System.out.println(" enter the order number of food: ");
                food = input.nextLine();
                if (food.equalsIgnoreCase("1")){
                    price = wontoon;
                }else if (food.equalsIgnoreCase("2")){
                    price = peking;
                }else if (food.equalsIgnoreCase("3")){
                    price = pork;
                }
                System.out.println("enter the order number of drink: ");
                drink = input.nextLine();
                if (drink.equalsIgnoreCase("1")){
                    price1 = tea;
                }else if (drink.equalsIgnoreCase("2")){
                    price1 = water;
                }
                System.out.println("do you want to print receipt (y/n): ");
                decision = input.nextLine();
                if (decision.equalsIgnoreCase("y")){
                    System.out.println("===your order===");
                    System.out.println("yor food  choosen number "+food);
                    System.out.println("your drink choosen number "+drink);
                    System.out.println("do you want back to menu (y/n): ");
                    decision = input.nextLine();
                    if (decision.equalsIgnoreCase("t")){
                        Cont = false;
                    }
                }
                break;
            case ("2") :
            if (food !=null || drink !=null){
                System.out.println("===your total payment===");
                System.out.println("your food price "+price);
                System.out.println("your drink price "+price1);
                sum = price + price1;
                System.out.println("Your total bill is "+sum );
                System.out.println("do you want back to menu (y/n): ");
                    decision = input.nextLine();
                    if (decision.equalsIgnoreCase("y")){
                        Cont = true;
                        break;
                    }
            }
            System.out.println("please enter your receipt order first ");
            System.out.println("do you want back to menu (y/n): ");
                    decision = input.nextLine();
                    if (decision.equalsIgnoreCase("t")){
                        Cont = false;
                    }
                break;
            }
        }
    }
}
