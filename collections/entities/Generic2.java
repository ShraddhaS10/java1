package com.gv.collections.entities;

public class Generic2 {
    
    private Integer number;
    
    public Generic2(Integer number) {
        this.number = number;
    }
    
    public Integer getNumber() {
        return number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    // Optional override of toString() for better string representation
    @Override
    public String toString() {
        return "Generic2 [number=" + number + "]";
    }
}
