package edu.grinnell.csc207.util;

public class BasicCounter implements Counter{

    // fields:
    int count;
    int start;
    // fieldsEnd

    public BasicCounter(int start1){
        this.count = start1;
        this.start = start1;
    }

  /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception{
    if (Integer.MAX_VALUE == this.count){
        throw (new Exception());
    }

    this.count++;
  }

  /**
   * Reset the counter.
   */
  public void reset(){
    this.count = this.start;
  }

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get(){
    return this.count;
  }

  public String toString(){
    return "[" + this.count + "]";
  }
}
