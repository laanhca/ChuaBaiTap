package com.t3h.bai2;

public class Song extends Audio {
    String artis;
    String album;
// do kế thừa từ class abstract nên phải định nghĩa lại phương thức abstract( trừu tượng)
    @Override
    void play() {
        System.out.println("Play song ");
    }
    @Override
    void showInfo(){
        super.showInfo();
        System.out.println("artist: "+artis);
        System.out.println("album: "+album);
    }
}
