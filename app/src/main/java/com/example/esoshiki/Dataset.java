package com.example.esoshiki;

public class Dataset  {
   public String digit;
   public String full;

    public Dataset() {

    }

    public Dataset(String digit, String full) {
        this.digit = digit;
        this.full = full;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }
}
