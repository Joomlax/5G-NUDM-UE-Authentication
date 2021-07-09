package com.intern.Nudm.udm;

public class AuthenticationVector {

    private AvEapAkaPrime avEapAkaPrime;
    private AvGHeAka avGHeAka;

    public AuthenticationVector(AvEapAkaPrime avEapAkaPrime) {
        this.avEapAkaPrime = avEapAkaPrime;
    }

    public AuthenticationVector(AvGHeAka avGHeAka) {
        this.avGHeAka = avGHeAka;
    }

    public AvEapAkaPrime getAvEapAkaPrime() {
        return avEapAkaPrime;
    }

    public void setAvEapAkaPrime(AvEapAkaPrime avEapAkaPrime) {
        this.avEapAkaPrime = avEapAkaPrime;
    }

    public AvGHeAka getAvGHeAka() {
        return avGHeAka;
    }

    public void setAvGHeAka(AvGHeAka avGHeAka) {
        this.avGHeAka = avGHeAka;
    }

    @Override
    public String toString() {
        return "AuthenticationVector{" +
                "avEapAkaPrime=" + avEapAkaPrime +
                ", avGHeAka=" + avGHeAka +
                '}';
    }
}
