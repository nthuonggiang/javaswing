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
public class SinhVienMatMa extends SinhVien{
    protected String donVi;
    protected int Luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String donVi, int Luong, String maSV, String hoTen, String ngaySinh, boolean gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.Luong = Luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

    @Override
    public String toString() {
        return "SinhVienMatMa{" +super.toString() + ", donVi=" + donVi + ", Luong=" + Luong + "}\n";
    }
    
    public void xuat()
    {
        System.out.println(toString());
    }
    
}
