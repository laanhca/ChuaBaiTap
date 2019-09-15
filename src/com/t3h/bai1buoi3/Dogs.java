package com.t3h.bai1buoi3;

public class Dogs extends Mammals {
    private String khaNangDanhHoi;

    public String getKhaNangDanhHoi() {
        return khaNangDanhHoi;
    }
    public void setKhaNangDanhHoi(String khaNangDanhHoi) {
        this.khaNangDanhHoi = khaNangDanhHoi;
    }
    @Override
    public void hienthi(){
        super.hienthi();
        System.out.println("Kha nang danh hoi: "+khaNangDanhHoi);
    }
    public void sua(){
        System.out.println(" sủa");
    }
    public void coinha(){

        System.out.println("coi nhà");
    }
    public void sosanhkndh(){
        System.out.println("so sanh khả năng đánh hơi");
    }
}
