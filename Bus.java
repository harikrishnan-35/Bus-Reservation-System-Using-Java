package busres;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap)
    {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }
    public int getCapacity(){
        return capacity;

    }
    public int getBusNo()
    {
        return busNo;
    }
    public void setCapacity(int cap)
    {
        this.capacity = cap;
    }
    public boolean isAc()
    {
        return ac;
    }
    public void setAc(boolean val)
    {
        this.ac = val;
    }
    public void displayBusInfo()
    {
        System.out.println("BusNo:"+ busNo + "Ac: "+ ac + " TotalCapacity:" + capacity);
    }
    
}
