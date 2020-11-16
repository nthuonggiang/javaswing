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
public class SinhVienATTT extends SinhVien{
    protected int hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(int hocPhi, String maSV, String hoTen, String ngaySinh, boolean gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT{" +super.toString() + ", hocPhi=" + hocPhi + "}\n";
    }
    
    
    public void xuat()
    {
        System.out.println(toString());
    }
    
}
