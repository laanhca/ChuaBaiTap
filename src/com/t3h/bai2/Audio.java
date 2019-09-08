package com.t3h.bai2;

public abstract class Audio {//class chứa abstract => abstract class
    String name;
    String type;
    int duration;
    String quality;
    abstract void play(); // phuong thuc nay không biết làm ntn: play nhạc hay play vieo=> phương thức trừu tượng
    void showInfo(){
        System.out.println("Nanme: " + name);
        System.out.println("type: " + type);
        System.out.println("Nanme: " + duration);
        System.out.println("Nanme: " + quality);
    }
}
