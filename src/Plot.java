public class Plot {

    public String plantname;
    public int numberofplant;
    public boolean needswater;

    public Plot(){
        numberofplant=(int)(Math.random()*90+10);



        int plantID=(int) (Math.random());

        if(plantID==0){
            plantname="empty";

        } else if (plantID==1) {
            plantname="tomato";

        } else if (plantID==2) {
            plantname="carrot";
            
        } else if (plantID==3) {
            plantname="tulip";
            
        }else{
            plantname="lettuce";
        }
        int waterID = (int)(Math.random()*2);

        if (waterID == 0 && plantname.equals("empty")){
            needswater=true;

        }else{
            needswater = false;
        }
    }







    public void printplotinfo(){
        System.out.println("*****PLANT INFO*****");
        System.out.println("plant name: " + plantname);
        System.out.println("Number of Plants: " + numberofplant);
        System.out.println("Nedds water: " + needswater);

    }



}

