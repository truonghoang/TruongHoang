
package View;

import Model.Customer;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Controller.DAO;
import View.CustomerPanel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class SalePanel extends javax.swing.JPanel {

    private SimpleDateFormat date_format = new SimpleDateFormat("dd/mm/yyyy");
   private DAO dao = new DAO();
          private List<Customer> cus;
          private CustomerPanel cusp= new CustomerPanel();
    public SalePanel()  {
      
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSdt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btncheck1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMAsp = new javax.swing.JTextField();
        btncheck2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtpro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtsize = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtcolor = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        txtname = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        st = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(999, 675));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        txtSdt.setBackground(new java.awt.Color(255, 255, 255));
        txtSdt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtSdt);
        txtSdt.setBounds(130, 100, 187, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Bán Hàng ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(379, 12, 216, 39);

        btncheck1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncheck1.setText("Check");
        btncheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheck1ActionPerformed(evt);
            }
        });
        jPanel1.add(btncheck1);
        btncheck1.setBounds(330, 100, 83, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Tên Khách Hàng :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(495, 116, 141, 25);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ngày Sinh :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(495, 175, 141, 22);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(642, 196, 231, 10);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Nhập SĐT :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(12, 98, 88, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Nhập MÃ SP:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 190, 110, 30);

        txtMAsp.setBackground(new java.awt.Color(255, 255, 255));
        txtMAsp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtMAsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAspActionPerformed(evt);
            }
        });
        jPanel1.add(txtMAsp);
        txtMAsp.setBounds(130, 190, 190, 30);

        btncheck2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncheck2.setText("Check");
        jPanel1.add(btncheck2);
        btncheck2.setBounds(329, 190, 84, 32);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("NameProduct:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 290, 120, 25);

        txtpro.setBackground(new java.awt.Color(153, 204, 255));
        txtpro.setBorder(null);
        jPanel1.add(txtpro);
        txtpro.setBounds(130, 280, 188, 30);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setAutoscrolls(true);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(130, 310, 190, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Size:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 340, 110, 30);

        txtsize.setBackground(new java.awt.Color(153, 204, 255));
        txtsize.setBorder(null);
        jPanel1.add(txtsize);
        txtsize.setBounds(130, 330, 190, 30);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(130, 360, 190, 10);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Màu :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 390, 100, 22);

        txtcolor.setBackground(new java.awt.Color(153, 204, 255));
        txtcolor.setBorder(null);
        jPanel1.add(txtcolor);
        txtcolor.setBounds(130, 380, 190, 30);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(130, 410, 190, 2);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Giá :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 440, 60, 22);

        txtprice.setBackground(new java.awt.Color(153, 204, 255));
        txtprice.setBorder(null);
        jPanel1.add(txtprice);
        txtprice.setBounds(130, 430, 190, 30);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(130, 460, 190, 20);

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(550, 300, 410, 350);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Xuất Hóa Đơn :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 310, 130, 22);

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsave.setText("Lưu");
        jPanel1.add(btnsave);
        btnsave.setBounds(400, 380, 100, 30);

        btnremove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnremove.setText("Hủy");
        jPanel1.add(btnremove);
        btnremove.setBounds(400, 440, 100, 30);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(640, 140, 230, 2);

        txtname.setBackground(new java.awt.Color(153, 204, 255));
        txtname.setBorder(null);
        jPanel1.add(txtname);
        txtname.setBounds(640, 110, 230, 30);

        txtdate.setBackground(new java.awt.Color(153, 204, 255));
        txtdate.setBorder(null);
        jPanel1.add(txtdate);
        txtdate.setBounds(640, 170, 230, 30);

        st.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jPanel1.add(st);
        st.setBounds(130, 140, 330, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMAspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAspActionPerformed
public void  setModel() throws ParseException{
        Customer e = cusp.getModel();
    if(dao.add(e)>0 ){
        
       txtname.setText(e.getTenKH());
     txtdate.setText(date_format.format(e.getNgaysinh()));
   
    }
    
    
    
}

    private void btncheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheck1ActionPerformed
        try {
           
            setModel();
        } catch (ParseException ex) {
            Logger.getLogger(SalePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btncheck1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncheck1;
    private javax.swing.JButton btncheck2;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel st;
    private javax.swing.JTextField txtMAsp;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpro;
    private javax.swing.JTextField txtsize;
    // End of variables declaration//GEN-END:variables
}
