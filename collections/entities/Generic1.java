package com.gv.collections.entities;

public class Generic1 {
    
    private String name;
    
    public Generic1(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Optional override of toString() for better string representation
    @Override
    public String toString() {
        return "Generic1 [name=" + name + "]";
    }
}
