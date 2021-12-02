/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemParkirFilkomUB;

import static SistemParkirFilkomUB.Sistem.dataParkirArrayList;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahm4d
 */
public class formParkir extends javax.swing.JFrame {
    Sistem varLok = new Sistem();
    
    /**
     * Creates new form add
     */
    public formParkir() {
        initComponents();
        //inisialisasi data
        Sistem.inisialisasiDataParkir();
        //pada saat membuat objek otomatis menampilkan data
        menampilkanData();
        //menghilangkan tombol update dan delete
        bt_update.setVisible(false);
        bt_del.setVisible(false);
        bt_del.setBackground(Color.red);
        bt_update.setBackground(Color.yellow);
        bt_add.setBackground(Color.yellow);
        bt_search.setBackground(Color.yellow);
        bt_cetak.setBackground(Color.yellow);
        tabel.setRowHeight(30);
        tabel.setShowGrid(true);
        //tabel.setBackground(Color.CYAN);
        tabel.setBackground(Color.lightGray);
        tabel.setForeground(Color.WHITE);
        tabel.setSelectionBackground(Color.BLACK);
        this.setResizable(false);
        showDate();
        //saya komentar, karena kalo memunculkan waktu secara realtime membutuhkan banyak resources
//        showTime();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_blue = new javax.swing.JPanel();
        bt_add = new javax.swing.JButton();
        bt_update = new javax.swing.JButton();
        bt_del = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        bt_minimaze = new javax.swing.JButton();
        lbnopar = new javax.swing.JLabel();
        innopar = new javax.swing.JTextField();
        lbnopol = new javax.swing.JLabel();
        innopol = new javax.swing.JTextField();
        lbmanufak = new javax.swing.JLabel();
        inmanufaktur = new javax.swing.JTextField();
        lbjenis = new javax.swing.JLabel();
        injenis = new javax.swing.JTextField();
        lbwarna = new javax.swing.JLabel();
        inwarna = new javax.swing.JTextField();
        lbtransmisi = new javax.swing.JLabel();
        intransmisi = new javax.swing.JTextField();
        lbharga = new javax.swing.JLabel();
        inharga = new javax.swing.JTextField();
        lbstatus = new javax.swing.JLabel();
        instatus = new javax.swing.JTextField();
        bt_search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        bt_cetak = new javax.swing.JButton();
        lb_tgl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Parkir FILKOM-UB");
        setBackground(new java.awt.Color(0, 0, 0));

        bg_blue.setBackground(new java.awt.Color(140, 122, 230));
        bg_blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bg_blueMouseClicked(evt);
            }
        });

        bt_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        bt_add.setText("tambah");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        bt_update.setText("perbarui");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        bt_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        bt_del.setText("hapus");
        bt_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delActionPerformed(evt);
            }
        });

        bt_exit.setBackground(new java.awt.Color(140, 122, 230));
        bt_exit.setForeground(new java.awt.Color(140, 122, 230));
        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        bt_minimaze.setBackground(new java.awt.Color(140, 122, 230));
        bt_minimaze.setForeground(new java.awt.Color(140, 122, 230));
        bt_minimaze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimaze.png"))); // NOI18N
        bt_minimaze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_minimazeActionPerformed(evt);
            }
        });

        lbnopar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbnopar.setText("kode parkir");

        innopar.setMinimumSize(new java.awt.Dimension(5, 19));

        lbnopol.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbnopol.setText("nomor polisi");

        innopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innopolActionPerformed(evt);
            }
        });

        lbmanufak.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbmanufak.setText("manufaktur");

        inmanufaktur.setMinimumSize(new java.awt.Dimension(5, 20));
        inmanufaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmanufakturActionPerformed(evt);
            }
        });

        lbjenis.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbjenis.setText("jenis");

        injenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injenisActionPerformed(evt);
            }
        });

        lbwarna.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbwarna.setText("warna");

        lbtransmisi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbtransmisi.setText("transmisi");

        lbharga.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbharga.setText("harga");

        lbstatus.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbstatus.setText("status");

        bt_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find.png"))); // NOI18N
        bt_search.setText("cari");
        bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_searchActionPerformed(evt);
            }
        });

        tabel.setBackground(new java.awt.Color(73, 155, 171));
        tabel.setForeground(new java.awt.Color(73, 155, 171));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Parkir", "Nomor Polisi", "Manufaktur", "Jenis", "Warna", "Transmisi", "Harga", "Status"
            }
        ));
        tabel.setSelectionBackground(new java.awt.Color(131, 168, 50));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        bt_cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        bt_cetak.setText("cetak");
        bt_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cetakActionPerformed(evt);
            }
        });

        lb_tgl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_tgl.setText("date");

        javax.swing.GroupLayout bg_blueLayout = new javax.swing.GroupLayout(bg_blue);
        bg_blue.setLayout(bg_blueLayout);
        bg_blueLayout.setHorizontalGroup(
            bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_blueLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_blueLayout.createSequentialGroup()
                        .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg_blueLayout.createSequentialGroup()
                                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbmanufak)
                                    .addComponent(lbjenis)
                                    .addComponent(lbnopol)
                                    .addComponent(lbnopar))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bg_blueLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(bt_update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg_blueLayout.createSequentialGroup()
                                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inmanufaktur, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(innopol)
                                    .addComponent(innopar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(injenis))
                                .addGap(72, 72, 72)
                                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbtransmisi)
                                    .addComponent(lbwarna)
                                    .addComponent(lbharga)
                                    .addComponent(lbstatus))
                                .addGap(50, 50, 50)
                                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inwarna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(intransmisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inharga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(instatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(bg_blueLayout.createSequentialGroup()
                                .addComponent(bt_del)
                                .addGap(134, 134, 134)
                                .addComponent(bt_cetak)
                                .addGap(48, 48, 48)))
                        .addComponent(bt_search)
                        .addGap(44, 44, 44)
                        .addComponent(bt_add))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_blueLayout.createSequentialGroup()
                        .addComponent(lb_tgl)
                        .addGap(38, 38, 38)
                        .addComponent(bt_minimaze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_blueLayout.setVerticalGroup(
            bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_blueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_minimaze, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_tgl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnopar)
                    .addComponent(innopar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtransmisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intransmisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnopol)
                    .addComponent(innopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbwarna)
                    .addComponent(inwarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmanufak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inmanufaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbharga)
                    .addComponent(inharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(injenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbstatus)
                    .addComponent(instatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_update)
                    .addComponent(bt_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_search)
                    .addComponent(bt_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_blue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void showDate(){
        Date tanggal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        lb_tgl.setText(sdf.format(tanggal));
         
    }
//    
//    public void showTime(){
//        new Timer(0, new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                Date d = new Date();
//                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//                lb_time.setText(sdf.format(d));
//            }
//        }).start();
//    }
    
    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // TODO add your handling code here:
        try{
            //konversi text pada Jtable kedalam String
            String cekNo = innopar.getText();
            String cekNop = innopol.getText();
            String cekMan = inmanufaktur.getText();
            String cekJen = injenis.getText();
            String cekWar = inwarna.getText();
            String cekTra = intransmisi.getText();
            String cekHa = inharga.getText();
            String cekSta = instatus.getText();
            //Mendapatkan text dari innopar 
            int idno = varLok.cariDengan(dataParkirArrayList, innopar.getText());
            //mencari dan jika cocok akan masuk dengan blok if
            if(idno == -1) {
                if(cekNo.isEmpty()  || cekNop.isEmpty() || cekMan.isEmpty() || cekJen.isEmpty() || cekWar.isEmpty() || cekTra.isEmpty() || cekHa.isEmpty() || cekSta.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Data gagal ditambah: ada field yang kosong");
                }else{
                //dataParkirArrayList.add(new Sistem(innopar.getText(), innopol.getText(), inmanufaktur.getText(), injenis.getText(), inwarna.getText(), intransmisi.getText(), inharga.getText(), instatus.getText()));
                dataParkirArrayList.add( new Sistem(cekNo, cekNop, cekMan, cekJen, cekWar, cekTra, cekHa, cekSta));
                varLok.tambahDataParkir();
                JOptionPane.showMessageDialog(this, "Data berhasil ditambah!");
                menampilkanData();
                }
            }else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambah: Kode Parkir tidak boleh dirubah atau masih ada field yang kosong");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //apabila telah tekan tombol maka otomtasi field kosong
        membersihkanField();
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here:
        //konversi text pada Jtable kedalam String
        String cekNo = innopar.getText();
        String cekNop = innopol.getText();
        String cekMan = inmanufaktur.getText();
        String cekJen = injenis.getText();
        String cekWar = inwarna.getText();
        String cekTra = intransmisi.getText();
        String cekHa = inharga.getText();
        String cekSta = instatus.getText();
        try{
            int idno = varLok.cariDengan(dataParkirArrayList, innopar.getText());
            if(idno >= 0 ){
                if(cekNo.isEmpty()  || cekNop.isEmpty() || cekMan.isEmpty() || cekJen.isEmpty() || cekWar.isEmpty() || cekTra.isEmpty() || cekHa.isEmpty() || cekSta.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Data gagal diperbarui: Anda memasukkan data kurang lengkap");
                }
                dataParkirArrayList.set(idno, new Sistem(innopar.getText(), innopol.getText(), inmanufaktur.getText(), injenis.getText(), inwarna.getText(), intransmisi.getText(), inharga.getText(), instatus.getText()));
                varLok.tambahDataParkir();
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
                //JOptionPane.showMessageDialog(this, idno);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal diperbarui: Demi keamanan, kode parkir tidak boleh dirubah!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        //apabila selesai tekan tombol akan menampilkan, membersihkan
        menampilkanData();
        membersihkanField();
        //innopol.setEditable(true);
    }//GEN-LAST:event_bt_updateActionPerformed

    private void bg_blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg_blueMouseClicked
        // TODO add your handling code here:
        //jika klik bg warna biru tombol update dan delete hilang, dan membersihkan field serta menampilkan
        bt_update.setVisible(false);
        bt_del.setVisible(false);
        //tabel.setEnabled(true);
        membersihkanField();
        menampilkanData();
    }//GEN-LAST:event_bg_blueMouseClicked

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        // TODO add your handling code here:
        int respon = JOptionPane.showConfirmDialog(this, "Apakah anda ingin keluar dari program?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(respon == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Terima kasih telah menggunakan program kami!");
            System.exit(0);
        }
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_minimazeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_minimazeActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_bt_minimazeActionPerformed

    private void bt_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delActionPerformed
        // TODO add your handling code here:
        try{
            int idnopol = varLok.cariDengan(dataParkirArrayList, innopar.getText());
            int del = JOptionPane.showConfirmDialog(this, "Apakah anda ingin menghapus data?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(del == 0){
                if(idnopol >= 0){
                    dataParkirArrayList.remove(idnopol);
                    varLok.tambahDataParkir();
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    menampilkanData();
                }else{
                    JOptionPane.showMessageDialog(this, "Data gagal dihapus!", "", JOptionPane.CANCEL_OPTION);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "", JOptionPane.CANCEL_OPTION);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        membersihkanField();
        innopar.setEditable(true);
    }//GEN-LAST:event_bt_delActionPerformed

    private void bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_searchActionPerformed
        // TODO add your handling code here:  
        String inNop = JOptionPane.showInputDialog(this, "Masukkan Kode Parkir:");
        bt_add.setVisible(true);
        bt_update.setVisible(true);
        for (int i = 0; i < dataParkirArrayList.size(); i++) {
            if(dataParkirArrayList.get(i).getNoParkir().equals(inNop)){
                JOptionPane.showMessageDialog(this, "Kode Parkir ditemukan!","Mencari Kode parkir", 2);
                innopar.setText(dataParkirArrayList.get(i).getNoParkir());
                innopol.setText(dataParkirArrayList.get(i).getNopol());
                inmanufaktur.setText(dataParkirArrayList.get(i).getManufaktur());
                injenis.setText(dataParkirArrayList.get(i).getJenis());
                inwarna.setText(dataParkirArrayList.get(i).getWarna());
                intransmisi.setText(dataParkirArrayList.get(i).getTransmisi());
                inharga.setText(dataParkirArrayList.get(i).getHarga());
                instatus.setText(dataParkirArrayList.get(i).getStatus());
                return;
            }
            
        }
        
    }//GEN-LAST:event_bt_searchActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        bt_update.setVisible(true);
        bt_del.setVisible(true);
        int ambilData = tabel.getSelectedRow();
        innopar.setText(dataParkirArrayList.get(ambilData).getNoParkir());
        innopol.setText(dataParkirArrayList.get(ambilData).getNopol());
        inmanufaktur.setText(dataParkirArrayList.get(ambilData).getManufaktur());
        injenis.setText(dataParkirArrayList.get(ambilData).getJenis());
        inwarna.setText(dataParkirArrayList.get(ambilData).getWarna());
        intransmisi.setText(dataParkirArrayList.get(ambilData).getTransmisi());
        inharga.setText(dataParkirArrayList.get(ambilData).getHarga());
        instatus.setText(dataParkirArrayList.get(ambilData).getStatus());
        menampilkanData();
        
    }//GEN-LAST:event_tabelMouseClicked

    private void innopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innopolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_innopolActionPerformed

    private void bt_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cetakActionPerformed
        // TODO add your handling code here:
        MessageFormat header =  new MessageFormat("Report Parkir FILKOM-UB");
        MessageFormat footer = new MessageFormat("Halaman(0,number,integer)");
        try{
            tabel.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Tidak bisa mencetak :", e);
        }
    }//GEN-LAST:event_bt_cetakActionPerformed

    private void inmanufakturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmanufakturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inmanufakturActionPerformed

    private void injenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_injenisActionPerformed

    public void menampilkanData(){        
        DefaultTableModel tabelData = (DefaultTableModel) tabel.getModel(); 
//        tabelData.setRowCount(0);
        //apabila diklik tidak meload lagi
        while(tabelData.getRowCount() > 0){
            for (int i = 0; i < tabelData.getRowCount(); i++) {
                tabelData.removeRow(i);
            }
        }
        Object[] barisAtribut = new Object[8];
        int i = 0;
        for (; i < dataParkirArrayList.size(); i++) {
            barisAtribut[0] = dataParkirArrayList.get(i).getNoParkir();
            barisAtribut[1] = dataParkirArrayList.get(i).getNopol();
            barisAtribut[2] = dataParkirArrayList.get(i).getManufaktur();
            barisAtribut[3] = dataParkirArrayList.get(i).getJenis();
            barisAtribut[4] = dataParkirArrayList.get(i).getWarna();
            barisAtribut[5] = dataParkirArrayList.get(i).getTransmisi();
            barisAtribut[6] = "Rp"+dataParkirArrayList.get(i).getHarga()+",00";
            barisAtribut[7] = dataParkirArrayList.get(i).getStatus();
            tabelData.addRow(barisAtribut);
        }
    }
    
    public void membersihkanField(){
        innopar.setText("");
        innopol.setText("");
        inmanufaktur.setText("");
        injenis.setText("");
        inwarna.setText("");
        intransmisi.setText("");
        inharga.setText("");
        instatus.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new formParkir().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_blue;
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cetak;
    private javax.swing.JButton bt_del;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_minimaze;
    private javax.swing.JButton bt_search;
    private javax.swing.JButton bt_update;
    private javax.swing.JTextField inharga;
    private javax.swing.JTextField injenis;
    private javax.swing.JTextField inmanufaktur;
    private javax.swing.JTextField innopar;
    private javax.swing.JTextField innopol;
    private javax.swing.JTextField instatus;
    private javax.swing.JTextField intransmisi;
    private javax.swing.JTextField inwarna;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_tgl;
    private javax.swing.JLabel lbharga;
    private javax.swing.JLabel lbjenis;
    private javax.swing.JLabel lbmanufak;
    private javax.swing.JLabel lbnopar;
    private javax.swing.JLabel lbnopol;
    private javax.swing.JLabel lbstatus;
    private javax.swing.JLabel lbtransmisi;
    private javax.swing.JLabel lbwarna;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
