package com.intern.Nudm.udm;

public class ResynchronizationInfo {
    private String rand; //Required
    private String auts; //Required

    public ResynchronizationInfo(String rand, String auts) {
        this.rand = rand;
        this.auts = auts;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }

    public String getAuts() {
        return auts;
    }

    public void setAuts(String auts) {
        this.auts = auts;
    }

    @Override
    public String toString() {
        return "ResynchronizationInfo{" +
                "rand='" + rand + '\'' +
                ", auts='" + auts + '\'' +
                '}';
    }
}
