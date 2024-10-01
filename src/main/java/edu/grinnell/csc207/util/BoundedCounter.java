package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter{
    int bound;

    public BoundedCounter(int startVal, int upperBound){
        super(startVal);
        this.bound = upperBound;
    }

    @Override
    public void increment() throws Exception{
        if (Integer.MAX_VALUE == this.bound){
            throw (new Exception());
        }
    
        super.count++;
      }
}
