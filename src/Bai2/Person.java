/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class Person {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected boolean gioiTinh;

    public Person() {
        gioiTinh=true;
    }

    public Person(String hoTen, String ngaySinh, String diaChi, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String getGioiTinh() {
        return gioiTinh ? "Nam" : "Nu" ;
    }
    
    public void setGioiTinh() {
        this.gioiTinh= gioiTinh;
    }
    
}
