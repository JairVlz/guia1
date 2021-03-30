package com.company.ejercicio5;

public class Time {
    private int hour;
    private int minute;
    private int seg;

    public Time() {
    }

    public Time(int hour, int minute, int seg) {
        this.hour = hour;
        this.minute = minute;
        this.seg = seg;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeg() {
        return this.seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public void aumenttSeg(Time tiempo) {
        tiempo.setSeg(tiempo.seg + 1);
    }

    public void decreaseSeg(Time tiempo) {
        tiempo.setSeg(tiempo.seg - 1);
    }

    public void showTime(Time a) {
        System.out.println(a.hour + ":" + a.minute + ":" + a.seg);
    }
}
