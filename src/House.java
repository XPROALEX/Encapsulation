public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;
   /*public House(int floorsNumber,String address,String[] residentsNames){
        this.floorsNumber=floorsNumber;
        this.address=address;
        this.residentsNames=residentsNames;
    }*/
   public House(){

   }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }
}
