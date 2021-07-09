package com.intern.Nudm.udm;

public class AvEapAkaPrime {

    private AvType avType; //Required
    private String rand; //Required
    private String xres; //Required
    private String autn; //Required
    private String ckPrime; //Required
    private String ikPrime; //Required

    public AvEapAkaPrime(AvType avType, String rand, String xres, String autn, String ckPrime, String ikPrime) {
        this.avType = avType;
        this.rand = rand;
        this.xres = xres;
        this.autn = autn;
        this.ckPrime = ckPrime;
        this.ikPrime = ikPrime;
    }

    public AvType getAvType() {
        return avType;
    }

    public void setAvType(AvType avType) {
        this.avType = avType;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }

    public String getXres() {
        return xres;
    }

    public void setXres(String xres) {
        this.xres = xres;
    }

    public String getAutn() {
        return autn;
    }

    public void setAutn(String autn) {
        this.autn = autn;
    }

    public String getCkPrime() {
        return ckPrime;
    }

    public void setCkPrime(String ckPrime) {
        this.ckPrime = ckPrime;
    }

    public String getIkPrime() {
        return ikPrime;
    }

    public void setIkPrime(String ikPrime) {
        this.ikPrime = ikPrime;
    }

    @Override
    public String toString() {
        return "AvEapAkaPrime{" +
                "avType=" + avType +
                ", rand='" + rand + '\'' +
                ", xres='" + xres + '\'' +
                ", autn='" + autn + '\'' +
                ", ckPrime='" + ckPrime + '\'' +
                ", ikPrime='" + ikPrime + '\'' +
                '}';
    }
}
