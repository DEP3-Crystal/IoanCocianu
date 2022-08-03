
public class vendingMachine {

    public void getChange(double moneyInserted, double priceOfProduct){

        int moneyValue = (int) Math.round(moneyInserted*100);
        int priceValue = (int)  Math.round(priceOfProduct*100);

        double changeReceived=moneyValue-priceValue;
        double changeReceivedCopy = changeReceived;
        int[] moneyArray = new int[6];

        while (changeReceived>=100){
            moneyArray[5]++;
            changeReceived-=100;
        }

        while (changeReceived>=50){
            moneyArray[4]++;
            changeReceived-=50;
        }

        while (changeReceived>=25){
            moneyArray[3]++;
            changeReceived-=25;
        }

        while (changeReceived>=10){
            moneyArray[2]++;
            changeReceived-=10;
        }

        while (changeReceived>=5){
            moneyArray[1]++;
            changeReceived-=5;
        }


        while (changeReceived>=1){
            moneyArray[0]++;
            changeReceived-=1;
        }

        System.out.println("["+moneyArray[5]+","+moneyArray[4]+","+moneyArray[3]+","+moneyArray[2]+","+moneyArray[1]+","+moneyArray[0]+"]");
        System.out.println("meaning "+changeReceivedCopy/100);
    }

}
