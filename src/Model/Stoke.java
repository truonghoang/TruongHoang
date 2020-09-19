/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Stoke implements Serializable{
    private String MaSP;
    private String NameProduct;
    private String Group;
    private String Color;
    private String Chatlieu;
    private boolean fit;
    private String Size;
    private String price;
    private String soluong;

    public Stoke() {
    }

    public Stoke(String MaSP, String NameProduct, String Group, String Color, String Chatlieu, boolean fit, String Size, String price, String soluong) {
        this.MaSP = MaSP;
        this.NameProduct = NameProduct;
        this.Group = Group;
        this.Color = Color;
        this.Chatlieu = Chatlieu;
        this.fit = fit;
        this.Size = Size;
        this.price = price;
        this.soluong = soluong;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String NameProduct) {
        this.NameProduct = NameProduct;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getChatlieu() {
        return Chatlieu;
    }

    public void setChatlieu(String Chatlieu) {
        this.Chatlieu = Chatlieu;
    }

    public boolean isFit() {
        return fit;
    }

    public void setFit(boolean fit) {
        this.fit = fit;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
}
