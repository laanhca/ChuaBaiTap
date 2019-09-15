package com.t3h.bai1buoi3;

public class Mammals<get> {
    protected String chungLoai;
    public String getChungLoai() {
        return chungLoai;
    }
    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }
    protected String nguonGoc;
    public String getNguonGoc() {
        return nguonGoc;
    }
    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }
    protected String mauSac;
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    protected String ten;

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    protected int tuoi;

    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void hienthi(){
        System.out.println("Chung loai: "+chungLoai);
        System.out.println("Nguon goc: "+nguonGoc);
        System.out.println("Mau sac: "+mauSac);
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
    }
}
