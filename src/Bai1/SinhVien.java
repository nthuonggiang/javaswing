/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class SinhVien {
    protected String maSV;
    protected String hoTen;
    protected String ngaySinh;
    protected boolean gioiTinh;
    protected double diemTB;

    public SinhVien() {
        gioiTinh=true;
    }

    public SinhVien(String maSV, String hoTen, String ngaySinh, boolean gioiTinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public String getGioiTinh()
    {
        return gioiTinh?"Nam":"Nu";
    }
    
    public void setGioiTinh()
    {
        this.gioiTinh=gioiTinh;
    }

    @Override
    public String toString() {
        return "" + "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh
                + ", gioiTinh=" + getGioiTinh() + ", diemTB=" + diemTB ;
    }
    
    public void xuat()
    {
        System.out.println(toString());
    }
    
    
}
