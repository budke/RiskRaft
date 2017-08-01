import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        String currentPrice = " ";
        System.out.println("Current Price: ");
        Scanner currentPricein = new Scanner (System.in);
        currentPrice = currentPricein.next();

        String peak = " ";
        System.out.println("Peak: ");
        Scanner kbPeak = new Scanner(System.in);
        peak = kbPeak.next();

        String low = " ";
        System.out.println("Low: ");
        Scanner kbLow = new Scanner (System.in);
        low = kbLow.next();


        double x = Double.parseDouble(currentPrice);
        double a = Double.parseDouble(peak);
        double b = Double.parseDouble(low);

        double y = a-x;
        double z = x-b;
        double r = y-z;

        double sellPointBasic = r/2;



        double profitSP = x + sellPointBasic;
        double lossSP = x - sellPointBasic;

        double percentRisk = (profitSP/x);

        if(z>y){
            System.out.println("Do Not Buy");
        }

        else if(y>z){
            System.out.println("Buy\n\nPlace sell orders at " + "\n\n" +
                    profitSP + "\n" +
                    " & " + "\n" +
                    lossSP + "\n\n" +
                    "Profit/Loss Percent is " +
                    percentRisk + "%");
        }

        String myProjections = " ";
        System.out.println("Would you like to see projections?");
        Scanner kbProjection = new Scanner(System.in);
        myProjections = kbProjection.next();
        if(myProjections.equalsIgnoreCase("No")||myProjections.equalsIgnoreCase("N")){
            System.out.println("Press run to get the numbers of a new stock.");
        }
        if(myProjections.equalsIgnoreCase("Yes") ||myProjections.equalsIgnoreCase("Y")){
            String considerPrice = " ";
            System.out.println("How much money are you considering? ");
            Scanner kbMayMoney= new Scanner(System.in);
            considerPrice = kbMayMoney.next();

            double dollarNum = Double.parseDouble(considerPrice);

            double stockNum = dollarNum/x;
            double grossProfit = stockNum*x*percentRisk;
            double netProfit = grossProfit-dollarNum;

            System.out.println("Your investment of " + dollarNum + " dollars in this company could net you $" + netProfit);
        }
    }
}