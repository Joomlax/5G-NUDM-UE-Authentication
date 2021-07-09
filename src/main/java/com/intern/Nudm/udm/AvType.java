package com.intern.Nudm.udm;

public class AvType {

    private String avType;

    public AvType(String avType) {
        this.avType = avType;
    }

    public String getAvType() {
        return avType;
    }

    public void setAvType(String avType) {
        this.avType = avType;
    }

    @Override
    public String toString() {
        return "AvType{" +
                "avType='" + avType + '\'' +
                '}';
    }
}
