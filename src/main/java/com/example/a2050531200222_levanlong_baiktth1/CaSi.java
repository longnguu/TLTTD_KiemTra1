package com.example.a2050531200222_levanlong_baiktth1;

public class CaSi {
    String ten,ngheDanh,quocGia;
    int soSaoBinhChon,hinhAnh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getSoSaoBinhChon() {
        return soSaoBinhChon;
    }

    public void setSoSaoBinhChon(int soSaoBinhChon) {
        this.soSaoBinhChon = soSaoBinhChon;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public CaSi(String ten, String ngheDanh, String quocGia, int soSaoBinhChon, int hinhAnh) {
        this.ten = ten;
        this.ngheDanh = ngheDanh;
        this.quocGia = quocGia;
        this.soSaoBinhChon = soSaoBinhChon;
        this.hinhAnh = hinhAnh;
    }
}
