
package View;

import Model.Employees;
import Controller.DAO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.IOfile;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class EmployeesPanel extends javax.swing.JPanel {
    private SimpleDateFormat date_format = new SimpleDateFormat("dd/mm/yyyy");
    private List<Employees> lsEm;

    private IOfile file;
    private DAO dao = new DAO();
    private DefaultTableModel tbModel;

    static int position = 0;
    public EmployeesPanel() {
        file = new IOfile();

        lsEm = file.doc();

        initComponents();


    }
        
     
    
    public void fillData() throws IOException{
         tbModel = (DefaultTableModel) tbtNhanvien.getModel();
          tbModel.setRowCount(0);
                    
                     
        for(Employees ee : dao.getAllNhanVien()){
            Object[] rowData = new Object[7];
            rowData[0] = ee.getMaNV();
            rowData[1] = ee.getTenNV();
            String gtt = "Nữ";
            if(ee.isGioitinh()){
                gtt = "Nam";
            }
                    
            rowData[2] = gtt;
            rowData[3] = date_format.format(ee.getNgaysinh());
            rowData[4] = ee.getCmnd();

            rowData[5] = ee.getSdt();

            rowData[6] = ee.getWorktime();
            tbModel.addRow(rowData);
            lsEm.add(ee);
            file.ghi(lsEm);
        
          

                
     
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdnam = new javax.swing.JRadioButton();
        rdnu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cbworktime = new javax.swing.JComboBox<>();
        lbcount = new javax.swing.JLabel();
        btnFist = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnLass = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbstatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCmnd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        n1 = new javax.swing.JScrollPane();
        tbtNhanvien = new javax.swing.JTable();
        no1 = new javax.swing.JLabel();
        no2 = new javax.swing.JLabel();
        no3 = new javax.swing.JLabel();
        no4 = new javax.swing.JLabel();
        no5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(999, 675));
        setPreferredSize(new java.awt.Dimension(999, 675));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Quản Lý Nhân Sự");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mã Nhân Viên :");

        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Họ Và Tên :");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Ngày Sinh :");

        txtDate.setBackground(new java.awt.Color(255, 255, 255));
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Giới Tính :");

        buttonGroup1.add(rdnam);
        rdnam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdnam.setSelected(true);
        rdnam.setText("Nam");

        buttonGroup1.add(rdnu);
        rdnu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdnu.setText("Nữ");
        rdnu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Work Time :");

        cbworktime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbworktime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FullTime", "PartTime" }));
        cbworktime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbcount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbcount.setText("Count :");

        btnFist.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/First.png"))); // NOI18N
        btnFist.setPreferredSize(new java.awt.Dimension(50, 29));
        btnFist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFistActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Rewind.png"))); // NOI18N
        btnback.setPreferredSize(new java.awt.Dimension(50, 29));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnnext.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Fast-forward.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnLass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Last.png"))); // NOI18N
        btnLass.setPreferredSize(new java.awt.Dimension(50, 29));
        btnLass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLassActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View_1.png"))); // NOI18N
        btnFind.setText("Tìm Kiếm");
        btnFind.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 102)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create.png"))); // NOI18N
        btnNew.setText("Thêm Mới");
        btnNew.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnChange.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Repair.png"))); // NOI18N
        btnChange.setText("Sửa");
        btnChange.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbstatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbstatus.setText("Status :");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Male symbol.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Female symbol.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("CMND :");

        txtCmnd.setBackground(new java.awt.Color(255, 255, 255));
        txtCmnd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCmnd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCmnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCmndActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("SDT :");

        txtsdt.setBackground(new java.awt.Color(255, 255, 255));
        txtsdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsdt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tbtNhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MaNV", "Họ Và Tên", "Giới Tính", "Ngày Sinh", "CMND", "SĐT", "Work Time"
            }
        ));
        tbtNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtNhanvienMouseClicked(evt);
            }
        });
        n1.setViewportView(tbtNhanvien);
        if (tbtNhanvien.getColumnModel().getColumnCount() > 0) {
            tbtNhanvien.getColumnModel().getColumn(0).setPreferredWidth(60);
        }

        no1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        no2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        no3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        no4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        no5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbcount, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdnam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(rdnu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(txtid)
                            .addComponent(txtName)
                            .addComponent(txtDate)
                            .addComponent(cbworktime, 0, 237, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no2)
                            .addComponent(no1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsdt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnFist, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLass, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(no2)
                                .addComponent(no4)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(no3)
                                .addComponent(no5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdnam))
                                    .addComponent(rdnu)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbworktime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbcount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbstatus)
                .addGap(18, 18, 18)
                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLassActionPerformed
        // TODO add your handling code here:
        position =dao.count() -1;
        setModel(dao.getOneEmployeeAtPossition(position));
    }//GEN-LAST:event_btnLassActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        position ++;
        if(position>=0){
            position =dao.count()-1;
        }
        setModel(dao.getOneEmployeeAtPossition(position));
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnFistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFistActionPerformed
        // TODO add your handling code here:
        position =0;
        setModel(dao.getOneEmployeeAtPossition(position));
    }//GEN-LAST:event_btnFistActionPerformed
    public Employees getModel() throws ParseException{
        Employees ee = new Employees();
        ee.setMaNV(txtid.getText());
        ee.setTenNV(txtName.getText());
        ee.setNgaysinh(date_format.parse(txtDate.getText()));
        boolean gt = false;
        if(rdnam.isSelected()){
            gt= true;
        }
        ee.setGioitinh(gt);
        ee.setWorktime(cbworktime.getSelectedItem().toString());
        ee.setCmnd(txtCmnd.getText());
        ee.setSdt(txtsdt.getText());
        
       
        return ee;
    }
    public boolean checkValidateForm(){
        if(txtid.getText().isEmpty()|| txtName.getText().isEmpty()||txtCmnd.getText().isEmpty()){
            return false;
    } else if(txtName.getText().matches("[^a-zA-Z]+")){
        JOptionPane.showMessageDialog(this, "Tên Không Chứa Ký Tự Đặc Biệt");
        return false;
    }else if(txtCmnd.getText().matches("[^0-9]+")){
         JOptionPane.showMessageDialog(this, "CMND Chỉ Bao Gồm Số");
        return false;
    }else if(txtsdt.getText().matches("[^0-9]+")){
         JOptionPane.showMessageDialog(this, "Số Điện Thoại Không Hợp Lệ");
        return false;
    }
        return true;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(checkValidateForm()){
            try {
                Employees e = getModel();

                if(dao.add(e)>0){
                    lbstatus.setText("Cập Nhật Thành Công!!");
                    lbstatus.setForeground(Color.BLUE);
                    lbcount.setText("Count: "+dao.count());
                    no1.setText("V");
                    no1.setForeground(Color.green);
                    no2.setText("V");
                    no2.setForeground(Color.green);
                    no3.setText("V");
                    no3.setForeground(Color.green);
                    no4.setText("V");
                    no4.setForeground(Color.green);
                    no5.setText("V");
                    no5.setForeground(Color.green);
                    
                     fillData();
                  
                }else{
                    lbstatus.setText("Cập Nhật Không Thành Công !!");
                    lbstatus.setForeground(Color.red);
                }
                
            } catch (ParseException ex) {
                System.out.println(""+ex.toString());
            } catch (IOException ex) {
                Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Chưa Nhập Đầy Đủ thông tin!!");
             no1.setText("*");
                    no1.setForeground(Color.red);
                    no2.setText("*");
                    no2.setForeground(Color.red);
                    no3.setText("*");
                    no3.setForeground(Color.red);
                    no4.setText("*");
                    no4.setForeground(Color.red);
                    no5.setText("*");
                    no5.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    public void  resetForm(){
        txtid.setText("");
        txtName.setText("");
        txtDate.setText("");
        rdnam.setSelected(true);
        cbworktime.setSelectedIndex(0);
        txtCmnd.setText("");
        txtsdt.setText("");
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnNewActionPerformed
    public void setModel( Employees ee){
        txtid.setText(ee.getMaNV());
        txtName.setText(ee.getTenNV());
        txtDate.setText(date_format.format(ee.getNgaysinh()));
        rdnam.setSelected(ee.isGioitinh());
        rdnu.setSelected(!ee.isGioitinh());
        cbworktime.setSelectedItem(ee.getWorktime());
        txtCmnd.setText(ee.getCmnd());
        txtsdt.setText(ee.getSdt());
       
        
    }
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        if(txtid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa Nhập Mã Tìm Kiếm !!");
            
        } else{
            Employees ee = dao.findByID(txtid.getText());
            if(ee != null){
                setModel(ee);
                lbstatus.setText("Tìm Thấy Nhân Viên Khả Dụng !!");
            }else {
                lbstatus.setText("Không tìm thấy thông tin nhân viên: "+txtid.getText());
                    lbstatus.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
      if(txtid.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Chưa Nhập Mã Nhân Viên!!");
      } else{
          
          try {
              Employees ee = getModel();
              if(dao.Change(ee)>0){
              lbstatus.setText("Cập Nhật Thành Công!!");
              lbstatus.setForeground(Color.BLUE);
              fillData();
              }else{
                  lbstatus.setText("Không tìm Thấy Nhân Viên!!");
              lbstatus.setForeground(Color.RED);
              }
                  
          } catch (ParseException ex) {
              Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, ex);
          }
          
              
          }
      
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
       if(dao.del(txtid.getText())>0){
           JOptionPane.showMessageDialog(this, "Xóa Thành Công!!");
       } else {
           lbstatus.setText("Xóa Không Thành Công!!");
              lbstatus.setForeground(Color.RED);
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        position --;
        if(position<=0){
            position =0;
        }
        setModel(dao.getOneEmployeeAtPossition(position));
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void rdnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdnuActionPerformed

    private void txtCmndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCmndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCmndActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void tbtNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtNhanvienMouseClicked
        // TODO add your handling code here:
        int point = tbtNhanvien.rowAtPoint(evt.getPoint());
        Employees ee = dao.getOneEmployeeAtPossition(point);
        setModel(ee);
    }//GEN-LAST:event_tbtNhanvienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFist;
    private javax.swing.JButton btnLass;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbworktime;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcount;
    private javax.swing.JLabel lbstatus;
    private javax.swing.JScrollPane n1;
    private javax.swing.JLabel no1;
    private javax.swing.JLabel no2;
    private javax.swing.JLabel no3;
    private javax.swing.JLabel no4;
    private javax.swing.JLabel no5;
    private javax.swing.JRadioButton rdnam;
    private javax.swing.JRadioButton rdnu;
    private javax.swing.JTable tbtNhanvien;
    private javax.swing.JTextField txtCmnd;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables

  
  
   }

