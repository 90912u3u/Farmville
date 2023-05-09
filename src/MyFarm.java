import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyFarm {
ArrayList<Plot>row;

    public static void main(String[] args) {

        MyFarm HarrisonFawcettsfarm = new MyFarm();
    }


    public MyFarm(){
        System.out.println("hello");
        row= new ArrayList<>();

        for(int i=0;i<10;i++){
            row.add(new Plot());
        }


        for(int x = 0; x<row.size();){
            row.get(x).printplotinfo();


        }




        totalPlants();
        printplantNames();
        printRowInfo();
        totalCarrots();
        averagenumberofPlants();
        numberOfEmptyPlots();
        everyotherneedsWater();

    }

    public void totalPlants(){
        System.out.println("******TOTAL PLANTS******");
        int total=0;
        for(int t=0;t<row.size();t++){
            total=total+row.get(t).numberofplant;
        }
        System.out.println("total plants: " + total);
    }

    public void printplantNames(){
        System.out.println("*********PLANT NAMES*********");
        for(int t=0;t<row.size();t++){
            System.out.print(t+":"+row.get(t).plantname + ",");
        }
    }
    public void printRowInfo(){
        System.out.println("***********Print Row Info************");
        for(int x=0;x<row.size();x++){
            row.get(x).printplotinfo();
        }
    }

    public void  totalCarrots(){
        System.out.println("***********Total Carrots************");
        int total=0;
        for(int i=0;i<row.size();i++){
            if (row.get(i).plantname=="carrot"){
                total=total+row.get(i).numberofplant;
            }
        }
        System.out.println("The total number of carrots is"  + total);
    }


    public void averagenumberofPlants(){
        System.out.println("**********Average Plants**********");
        int total=0;
        int avg=0;
        for(int k=0;k<row.size();k++){
            total=total+row.get(k).numberofplant;
        }
        avg=total/row.size();
        System.out.println("Average number of plants:  "+ avg);


    }

    public void everyotherneedsWater(){
       System.out.println("*************Every other needs water*************");
            for (int i = 0; i < row.size(); i++) {
                if (i % 2 == 0) {
                    row.get(i);
                }
            }
        System.out.println("Every other needs water");

    }

    public void plantwithMaxNumber(){

    }
    public void plantWithMinNumber(){
        System.out.println("*********Min Number*********");
        int totalCarrots=0;
        int totalToamatoes=0;
        int totaltulips=0;
        int tootallettuce=0;

        for(int t=0;t< row.size();t+=1){
            if(row.get(t).plantname.equals("Carrot")){
                totalCarrots=totalCarrots+row.get(t).numberofplant;

            }else if(row.get(t).plantname.equals("Toamatoes")){
                totalToamatoes=totalToamatoes+row.get(t).numberofplant;

            }else if(row.get(t).plantname.equals("tulips")){
                totaltulips=totaltulips+row.get(t).numberofplant;

            }else if(row.get(t).plantname.equals("lettuce")){
                tootallettuce=tootallettuce+row.get(t).numberofplant;

            }
            else{

            }
        }

        int currentMin=0;
        String minPlantTypes;

        if(totalCarrots<totalToamatoes){
            currentMin=totalCarrots;
            minPlantTypes="carrot";

        }else{
            currentMin=totalToamatoes;
            minPlantTypes="tomato";
        }
        if(totaltulips<currentMin){
            currentMin=totaltulips;
            minPlantTypes="tulip";

        }
        if(tootallettuce<currentMin) {
            currentMin = tootallettuce;
            minPlantTypes = "lettuce";


        }
        System.out.println("The plant type with the fewest total plan is: " + minPlantTypes+ " with " + currentMin+ " Plants ");

    }




    public void greaterThan10() {

    }



    public void plantWithMaxNumberNeedsWater(){

    }
    public void addLettuce() {

        // add a lettuce plot to the end of the row with 42 plants that need water

        // call printPlantNames() method before and after your addition to make sure it worked

    }



    public void addTulip() {

        // at index 3, add a new tulip plot with 70 plants that do not need water

        // call printPlantNames() method before and after your addition to make sure it worked

    }



    public void tomatoLocations() {



    }
    public void numberOfCarrotPlots() {

        // how many plots have carrots on them

// call printPlantNames() method to check

    }



    public void numberOfEmptyPlots() {

        int emptyPlots = 0;

        for(int k=0;k<row.size();k++){
            emptyPlots=emptyPlots+row.get(k).numberofplant;
        }


        System.out.println("Number of empty plots: " + emptyPlots);

        // Call the printPlantNames() method

    }









}
