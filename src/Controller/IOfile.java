/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.Employees;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;
import View.EmployeesPanel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class IOfile {
    SimpleDateFormat date_format = new SimpleDateFormat("dd/mm/yyyy");
   public void ghi(List<Employees> lsEm){ 
       try(PrintWriter pw = new PrintWriter(new File("employese.dat"))){
           for(Employees ee :lsEm){
               pw.println(ee.getMaNV());
                    pw.println(ee.getTenNV());
                    String gt = "Nữ";
                    if(ee.isGioitinh()){
                        gt = "Nam";
                }
                    pw.println(gt);
                    pw.println(date_format.format(ee.getNgaysinh()));
                    pw.println(ee.getCmnd());
                    pw.println(ee.getSdt());
                    pw.println(ee.getWorktime());

               
           }
   }catch(Exception e){
       
    }
   }
   public ArrayList doc(){
       ArrayList<Employees> ls= new ArrayList<>();
       try(Scanner sc = new Scanner(new File("employese.dat"))){
           while(sc.hasNext()){
               Employees s = new Employees();
               s.setMaNV(sc.nextLine());
               s.setTenNV(sc.nextLine());
               s.setGioitinh(true);
               s.setNgaysinh(date_format.parse(sc.nextLine()));
               s.setCmnd(sc.nextLine());
               s.setSdt(sc.nextLine());
               s.setWorktime(sc.nextLine());
               ls.add(s);
           }
       }catch(Exception e){
           
       }
       return ls;
   }

    public void ghi1(List<Customer> lsCm) {
        try (PrintWriter pw = new PrintWriter(new File("Customer.dat"))) {
            for (Customer ee : lsCm) {
                pw.println(ee.getTenKH());

                String gt = "Nữ";
                if (ee.isGioitinh()) {
                    gt = "Nam";
                }
                pw.println(gt);
                pw.println(date_format.format(ee.getNgaysinh()));

                pw.println(ee.getSdt());

            }
   }catch(Exception e){
       
    }
   }
    public ArrayList doc1() {
        ArrayList<Customer> lc = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("Customer.dat"))) {
            while (sc.hasNext()) {
                Customer s = new Customer();
                s.setTenKH(sc.nextLine());
                s.setGioitinh(true);
                s.setNgaysinh(date_format.parse(sc.nextLine()));
                s.setSdt(sc.nextLine());
                lc.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lc;
   }

   

   
 
}
