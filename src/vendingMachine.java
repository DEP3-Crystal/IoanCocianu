
public class vendingMachine {

    public void getChange(double baniBagati, double pretProdus){

        int valoareFixBani = (int) Math.round(baniBagati*100);
        int valoareFixPret = (int)  Math.round(pretProdus*100);

        double restPrimit=valoareFixBani-valoareFixPret;
        double restPrimitCopie = restPrimit;
        int[] vectorBaniAfisati = new int[6];

        while (restPrimit>=100){
            vectorBaniAfisati[5]++;
            restPrimit-=100;
        }

        while (restPrimit>=50){
            vectorBaniAfisati[4]++;
            restPrimit-=50;
        }

        while (restPrimit>=25){
            vectorBaniAfisati[3]++;
            restPrimit-=25;
        }

        while (restPrimit>=10){
            vectorBaniAfisati[2]++;
            restPrimit-=10;
        }

        while (restPrimit>=5){
            vectorBaniAfisati[1]++;
            restPrimit-=5;
        }


        while (restPrimit>=1){
            vectorBaniAfisati[0]++;
            restPrimit-=1;
        }

        System.out.println("["+vectorBaniAfisati[5]+","+vectorBaniAfisati[4]+","+vectorBaniAfisati[3]+","+vectorBaniAfisati[2]+","+vectorBaniAfisati[1]+","+vectorBaniAfisati[0]+"]");
        System.out.println("adica "+restPrimitCopie/100);
    }

}
