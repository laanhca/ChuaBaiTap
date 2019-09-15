package com.t3h.bai1buoi3;

public class Cats extends Mammals{
    private String khaNangNhinTrongDem;
    public String getKhaNangNhinTrongDem() {
        return khaNangNhinTrongDem;
    }
    public void setKhaNangNhinTrongDem(String khaNangNhinTrongDem) {
        this.khaNangNhinTrongDem = khaNangNhinTrongDem;
    }
    @Override
    public void hienthi(){
        super.hienthi();
        System.out.println("Kha nang nhin trong dem: "+khaNangNhinTrongDem);
    }
    public void keu(){
        System.out.println(" kêu meo meo");
    }
    public void batchuot(){

        System.out.println("bắt chuột");
    }
    public void sosanhkndh(){
        System.out.println("so sanh khả năng bắt chuột");
    }
}
