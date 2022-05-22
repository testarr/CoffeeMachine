import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {

         double coffee_powder;
         double milk;
         double water;
         double sugar;
         int Coffee_Count = 0;


        void SetIngredients(){
                if (coffee_powder+12 < 30 && milk+14 < 30 && water+30 < 60) {
                        coffee_powder += 12;
                        milk += 14;
                        water += 20;
                        sugar +=15;
                        System.out.println(" ");
                        System.out.println("Ingredients are successfully set!");
                        System.out.println(" ");
                        Start();
                } else {
                        System.out.println(" ");
                        System.out.println("Machine Already Fully Filled!");
                        System.out.println(" ");System.out.println(" ");
                }
                Start();
        }

        void makecoffee(){

                System.out.println("(Coffee)");
                System.out.println("(Milk)");
                System.out.println("(Back)");
                System.out.println(" ");
                System.out.print("Please Choose Your Preferred Drink: ");
                Scanner S1 = new Scanner(System.in);
                String PreferredDrink = S1.nextLine();
                System.out.println(" ");
                if(Objects.equals(PreferredDrink, "Coffee")){
                        System.out.println(" ");
                        BlackCoffee();
                }
                else if(Objects.equals(PreferredDrink, "Milk")){
                        System.out.println(" ");
                        Milk();
                }
                else if(Objects.equals(PreferredDrink, "Back")){
                        System.out.println(" ");
                        Start();
                }
                else{
                        System.out.println("Invalid Selection!");
                        System.out.println(" ");
                        System.out.println(" ");
                        makecoffee();
                }
        }

        void BlackCoffee(){
                if(coffee_powder >= 3.5 && water >= 6) {
                        System.out.println("Making Coffee, Please Wait..");
                        System.out.println("Filling Coffee, Amount = 3.5");
                        this.coffee_powder = coffee_powder-3.5;
                        System.out.println("Filling Water, Amount = 6oz.");
                        this.water = water-6;
                        System.out.println("Filling Sugar, Amount = 2.25");
                        this.sugar = sugar-2.25;
                        System.out.println("Coffee Making Successful!");
                        Coffee_Count += 1;
                        System.out.println(" ");
                        Start();
                }else{
                        System.out.println("Not Enough Ingredients!");
                        System.out.println("Please Fill Machine First.");
                        System.out.println(" ");
                        System.out.println(" ");
                        Start();
                }
        }

        void Milk(){
                if(milk >3.5 && water > 6){
                        System.out.println(" ");
                        System.out.println("Making Milk, Please Wait..");
                        System.out.println("Filling Milk, Amount = 3.5");
                        this.milk = milk-3.5;
                        System.out.println("Filling Water, Amount = 6oz.");
                        this.water = water-6;
                        System.out.println("Filling Sugar, Amount = 2.25");
                        this.sugar = sugar-2.25;
                        System.out.println(" ");
                        System.out.println("Milk Making Successful!");
                        Coffee_Count += 1;
                        Start();
                }else{
                        System.out.println(" ");
                        System.out.println("Not Enough Ingredients!");
                        System.out.println("Please Fill Machine First.");
                        System.out.println(" ");
                        Start();
                }
        }
        void Start(){
                System.out.println("*******************************");
                System.out.println("*Welcome to the Coffee Machine!*");
                System.out.println("*******************************");
                System.out.println(" ");

                System.out.println("(1): View Ingredients.");
                System.out.println("(2): Fill Ingredients.");
                System.out.println("(3): Make Coffee.");
                System.out.println("(4): How Many Coffees Were Made.");
                System.out.println("(5): Exit(Turn Off Machine)");
                System.out.println(" ");

                System.out.println("Please Choose Action: ");

                Scanner S2 = new Scanner(System.in);
                int Action = S2.nextInt();
                System.out.println(" ");
                if(Action == 1){
                        System.out.println("Ingredients~ ");
                        System.out.println("Coffee: " + coffee_powder);
                        System.out.println("Milk: " + milk);
                        System.out.println("Water: " + water);
                        System.out.println("Sugar: " + sugar);
                        System.out.println(" ");


                        for(int i = 0; i<1;) {
                                System.out.println("(Back) or (Exit-Turn Off Machine-)");
                                System.out.println(" ");
                                String firstaction = S2.next();
                                if (Objects.equals(firstaction, "Back")) {
                                        i++;
                                        Start();
                                } else if (Objects.equals(firstaction, "Exit")) {
                                        System.out.println(" ");
                                        i++;
                                        exitmachine();
                                } else {
                                        System.out.println("Invalid Selection!");
                                        System.out.println(" ");
                                }
                        }
                }
                else if(Action == 2){
                        SetIngredients();
                }
                else if(Action == 3){
                        makecoffee();
                }
                else if(Action == 4){
                        System.out.println(Coffee_Count + " Coffees Made.");
                        System.out.println("");
                        for(int i = 0; i<1;) {
                                System.out.print("(Back) or (Exit-Turn Off Machine)");
                                String fourthaction = S2.next();
                                if (Objects.equals(fourthaction, "Back")) {
                                        i++;
                                        Start();
                                } else if (Objects.equals(fourthaction, "Exit")) {
                                        i++;
                                        exitmachine();
                                }else{

                                        System.out.println("Invalid Selection!");
                                        System.out.println(" ");
                                }
                        }
                }
                else if(Action == 5){
                        exitmachine();
                }
                else{
                        System.out.println("Invalid Selection!");
                        System.out.println(" ");
                        System.out.println(" ");
                        Start();

                }

        }
void exitmachine(){
        System.out.println(" ");
                System.out.println("Thank You For Using Our Machine!");
                System.out.println("Shutting Down!");
}

}

class User{
        CoffeeMachine Machine = new CoffeeMachine();
        void CleanMachine(){
                Machine.milk = 0;
                Machine.Coffee_Count = 0;
                Machine.coffee_powder = 0;
                Machine.sugar = 0;
                Machine.water = 0;
                System.out.println("Machine Cleaned Successfully!");
                System.out.println(" ");
                System.out.println(" ");
                Machine.Start();


        }
        void ActivateMachine(){
                System.out.println("Machine Starting Up, Please Wait...");
                System.out.println(" ");
                System.out.println("Machine Start Up Successful!");
                System.out.println(" ");


                Scanner ActMac = new Scanner(System.in);
                for(int i = 0; i!=1;) {
                        System.out.println("Clean Machine?");
                        System.out.println(" (Yes) or (No)");
                        String Ans = ActMac.nextLine();
                        System.out.println(" ");
                        if (Objects.equals(Ans, "Yes")) {
                                CleanMachine();
                                i++;
                        } else if (Objects.equals(Ans, "No")) {
                                Machine.exitmachine();
                                i++;

                        } else {
                                System.out.println("Invalid Response!");
                                System.out.println(" ");
                        }
                }
        }
}
class MakeCoffee{
        public static void main(String[] args){
                User MachineManage = new User();
                CoffeeMachine MachineManageSec = new CoffeeMachine();
            System.out.println("Start Machine?");
            System.out.println("'Y' = Yes, 'N' = No");
            Scanner qstart = new Scanner(System.in);

            char d = qstart.next().charAt(0);
            if(d == 'Y' || d =='y'){
                    MachineManage.ActivateMachine();
            }
            else if(d == 'N' || d == 'n'){
                    MachineManageSec.exitmachine();
            }

        }
}