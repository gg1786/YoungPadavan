package MyClass.Electronic;

public class CoastItem {
   private int coast;

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) throws CoastExeption {
        if(coast<0){
            throw new CoastExeption("Price is wrong, rewrite this price ");
        }
        this.coast = coast;
    }

     public void getPrice() throws CoastExeption {

       // Computer computer = new Computer();
        CoastItem coastItem = new CoastItem();

        try {
            coastItem.setCoast(1);
        } catch (CoastExeption e) {
            e.printStackTrace();
        }
    coastItem.setCoast(1);
    }

    private void setCoast() {
    }

    public void getCoast(int i) {
    }
}
