/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.Serializable;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Employees implements Serializable{

    public static Iterable<Employees> lsEm;
    private String maNV;
    private String tenNV;
    private Date ngaysinh;
    private boolean gioitinh;
    private String worktime;
    private String cmnd;
    private String sdt;

    public Employees() {
    }

    public Employees(String maNV, String tenNV, Date ngaysinh, boolean gioitinh, String worktime,String cmnd,String sdt) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.worktime = worktime;
        this.cmnd= cmnd;
        this.sdt= sdt;
                
    }
    
    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    
    public Vector toObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
}
