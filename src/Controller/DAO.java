

package Controller;

import Model.Employees;
import Model.Customer;
import Model.Stoke;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAO {
    List<Employees> lsEm = new ArrayList<>();
    List<Customer> lsCu = new ArrayList<>();
    List<Stoke> lsSt = new ArrayList<>();
//    Vừng Lưu dữ liệu Tạm Thời Của Các Đối Tượng
    public int add(Customer c){
        lsCu.add(c);
        return 1;
    }
   public int count1(){
       return lsCu.size();
   }
   public int add(Employees e){
        lsEm.add(e);
        return 1;
    }
    public int count(){
        return lsEm.size();
    }
    public int add(Stoke e){
        lsSt.add(e);
        return 1;
    }
    public int count2(){
        return lsSt.size();
    }
//    end.
//    Vùng Find Dữ Liệu Theo truy vấn
   public  Customer findBysdt(String SDT){
       for(Customer ee : lsCu){
           if(ee.getSdt().equalsIgnoreCase(SDT))
               return ee;
       }
       return null;
   }
   public Stoke findByMaSP(String MaSP){
       for(Stoke ee : lsSt){
           if(!ee.getMaSP().equalsIgnoreCase(MaSP)) 
            return ee;  
       }
       return null;
   }
   public Employees findByID(String maNV){
        for(Employees ee : lsEm){
            if(ee.getMaNV().equalsIgnoreCase(maNV)){
                return ee;
                
            }
        }
       return null; 
    }
//   end.
//   Vùng Change Dữ Liệu Theo Truy Vấn
   
    public int Changecus(Customer e){
        for(Customer cu :lsCu){
            if(cu.getSdt().equalsIgnoreCase(e.getSdt())){
                cu.setTenKH(e.getTenKH());
                cu.setGioitinh(e.isGioitinh());
                cu.setNgaysinh(e.getNgaysinh());
                return 1;
            }
        }
        return -1;
    }
    public int Change (Employees e){
        for(Employees nv : lsEm){
            if(nv.getMaNV().equalsIgnoreCase(e.getMaNV())){
                nv.setTenNV(e.getTenNV());
                nv.setNgaysinh(e.getNgaysinh());
                nv.setGioitinh(e.isGioitinh());
                nv.setWorktime(e.getWorktime());
                nv.setCmnd(e.getCmnd());
                nv.setSdt(e.getSdt());
                return 1;
            }
        }
        return -1;
    }
    public int Change2 (Stoke e){
        for(Stoke nv : lsSt){
            if(nv.getMaSP().equalsIgnoreCase(e.getMaSP())){
                nv.setNameProduct(e.getNameProduct());
                nv.setGroup(e.getGroup());
                nv.setColor(e.getColor());
                nv.setChatlieu(e.getChatlieu());
                nv.setFit(e.isFit());
                nv.setSize(e.getSize());
                nv.setPrice(e.getPrice());
                nv.setSoluong(e.getSoluong());
                return 1;
            }
        }
        return -1;
    }
//    Phần Xóa Dữ Liệu 
    public int del(String maNV) {
        Employees e = findByID(maNV);
        if(e != null){
            lsEm.remove(e);
            return 1;
        }
        return -1;
    
                }
     public int del1(String MaSP) {
        Stoke e = findByMaSP(MaSP);
        if(e != null){
            lsSt.remove(e);
            return 1;
        }
        return -1;
    
                }
//     Hiển Thị Dữ Liệu Lên bảng
    public Customer getOneCustomerAtPossition(int pos){
        return lsCu.get(pos);
    }
    public Stoke getOneStokeAtPossition(int pos){
        return lsSt.get(pos);
    }
    public Employees getOneEmployeeAtPossition(int pos){
        return lsEm.get(pos);
    }
    public List<Employees> getAllNhanVien(){
        return  lsEm;
    }   
    public List<Stoke> getAllKho(){
        return  lsSt;
    }   
   public List<Customer> getAllkhachhang(){
       return lsCu;
   }

       
}

