/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAME;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author krish
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
    }
public void getBookDetails()
{
    int BookId=Integer.parseInt(txt_id.getText());
    try
    {
        Connection con = DBCon.getConnection();
         PreparedStatement ps=con.prepareStatement("select * from book_details where BookId=?");
         ps.setInt(1, BookId);
         ResultSet rs= ps.executeQuery();
         if(rs.next())
         {
             lbl_id.setText(rs.getString(BookId));
              lbl_name.setText(rs.getString(BookName));
               lbl_aut.setText(rs.getString(Author));
                lbl_quan.setText(rs.getString(Quantity));
         }
         else
         {
             lbl_berror.setText("invalid book id");
         }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void getStudentDetails()
{
    int StudentId=Integer.parseInt(txt_id.getText());
    try
    {
        Connection con = DBCon.getConnection();
         PreparedStatement ps=con.prepareStatement("select * from student_details where StudentId=?");
         ps.setInt(1, StudentId);
         ResultSet rs= ps.executeQuery();
         if(rs.next())
         {
             txt_sid.setText(rs.getString(StudentId));
              lbl_sname.setText(rs.getString(StudentName));
               lbl_cou.setText(rs.getString(Course));
                lbl_bra.setText(rs.getString(Branch));
         }
          else
         {
             lbl_serror.setText("invalid student id");
         }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public boolean IssueBook()
{
    boolean isissued=false;
    int BookId=Integer.parseInt("txt_bid.getText()");
    int StudentId=Integer.parseInt("txt_sid.getText()");
    String BookName=lbl_bname.getText();
    String StudentName=lbl_sname.getText();
    Date uIssue_Date=(Date) date_idate.getDatoFecha();
    Date uDue_Date=(Date) date_ddate.getDatoFecha();
    Long 11 = uIssue_Date.getTime();
    long 12 = uDue_Date.getTime();
    java.sql.Date sIssued_Date= new java.sql.Date(11);
    java.sql.Date sDue_Date= new java.sql.Date(12);
     try
       {
           Connection con = DBCon.getConnection();
         String sql="insert into issue_book_details(BookId,BookName,StudentId,StudentName,Issue_Date,Due_Date,Status) values(?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt(1, BookId);
         ps.setString(2, BookName);
         ps.setInt(3, StudentId);
         ps.setString(4, StudentName);
         ps.setDate(5, sIssued_Date);
         ps.setDate(6,sDue_Date);
         ps.setString(7,"pending");
         int rowCount=ps.executeUpdate();
         if(rowCount>0){
             isissued=true;
         }
         else
         {
           isissued=false; 
         }
       }
         catch(Exception e)
                 {
                 e.printStackTrace();
                 }
         return isissued;
}
public void UpdateCount()
{
    int BookId=Integer.parseInt("txt_bid.getText()");
    try
    {
        Connection con = DBCon.getConnection();
      String sql="update book_details set quantity = quantity-1  where BookId=?)";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt(1, BookId);
         int rowCount=ps.executeUpdate();
         if(rowCount>0){
             JOptionPane.showMessageDialog(this, "book updated");
             int count=Integer.parseInt(lbl_quan.getText());
             lbl_quan.setText(Integer.toString(count-1));
         }
         else
         {
           JOptionPane.showMessageDialog(this, "can't update book count");
         }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}  
public boolean IsAIssued()
        {
            boolean isaissued=false;
    int BookId=Integer.parseInt("txt_bid.getText()");
    int StudentId=Integer.parseInt("txt_sid.getText()");
        try
       {
           Connection con = DBCon.getConnection();
         String sql="select * from issue_book_details where BookId=?,StudentId=?and Status=?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt( 1, BookId);
          ps.setInt(2, StudentId);
          ps.setString(3,"pending");
          ResultSet rs= ps.executeQuery();
         if(rs.next()){
             isaissued=true;
         }
         else
         {
           isaissued=false; 
         }
       }
         catch(Exception e)
                 {
                 e.printStackTrace();
                 }
         return isaissued;
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_bra = new javax.swing.JLabel();
        txt_sid = new javax.swing.JLabel();
        lbl_sname = new javax.swing.JLabel();
        lbl_cou = new javax.swing.JLabel();
        lbl_serror = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_quan = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_aut = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_bid = new javax.swing.JLabel();
        lbl_bname = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl_berror = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txt_id = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_id1 = new app.bolivia.swing.JCTextField();
        date_idate = new rojeru_san.componentes.RSDateChooser();
        date_ddate = new rojeru_san.componentes.RSDateChooser();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Student_Male_100px.png"))); // NOI18N
        jLabel2.setText("Book Details");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 280, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Branch:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Id:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 100, 30));
        jPanel2.add(lbl_bra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 160, 30));
        jPanel2.add(txt_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 30));
        jPanel2.add(lbl_sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 30));
        jPanel2.add(lbl_cou, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 160, 30));
        jPanel2.add(lbl_serror, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 556, 200, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 420, 810));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));

        jLabel11.setBackground(new java.awt.Color(0, 0, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Rewind_48px.png"))); // NOI18N
        jLabel11.setText("Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel12.setText("Book Details");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        lbl_quan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_quan.setForeground(new java.awt.Color(255, 255, 255));
        lbl_quan.setText("Quantity:");
        jPanel5.add(lbl_quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, 30));

        lbl_id.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("Book Id:");
        jPanel5.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 30));

        lbl_name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Book Name:");
        jPanel5.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 30));

        lbl_aut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_aut.setForeground(new java.awt.Color(255, 255, 255));
        lbl_aut.setText("Author:");
        jPanel5.add(lbl_aut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 100, 30));
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 160, 30));
        jPanel5.add(txt_bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 30));
        jPanel5.add(lbl_bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 30));
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 160, 30));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 280, -1));
        jPanel5.add(lbl_berror, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 300, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 810));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 280, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel21.setText("Issue Book");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 280, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Book Id:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        txt_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_id.setPlaceholder("Enter Book Id");
        txt_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_idFocusLost(evt);
            }
        });
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Due Date:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, -1, -1));

        txt_id1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_id1.setPlaceholder("Enter Student Id");
        txt_id1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_id1FocusLost(evt);
            }
        });
        txt_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 340, -1, -1));
        jPanel1.add(date_idate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, -1, -1));
        jPanel1.add(date_ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, -1, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle1.setText("Issue Book");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 390, 70));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setText("Student Id:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setText("Issue Date:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1411, 803));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        HomePage page= new HomePage();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed

    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id1ActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        if(lbl_quan.getText().equals("0"))
        {
        JOptionPane.showMessageDialog(this, "book is not available");
    }
        else
    {
        if(IsAIssued()==false)
        {
        if(IssueBook() == true)
       {
           JOptionPane.showMessageDialog(this, "book issued sucessfully");
       UpdateCount();
       }
       else{
           JOptionPane.showMessageDialog(this, " can't issue the book");
}
        }
   else
   {
           JOptionPane.showMessageDialog(this, " this student already has this book");
           }
            }
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void txt_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idFocusLost
     if(!txt_id.getText().equals(""))
     {
         getBookDetails();  
     }
    }//GEN-LAST:event_txt_idFocusLost

    private void txt_id1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_id1FocusLost
 if(!txt_id.getText().equals(""))
     {
         getStudentDetails();  
     }
    }//GEN-LAST:event_txt_id1FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser date_ddate;
    private rojeru_san.componentes.RSDateChooser date_idate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_aut;
    private javax.swing.JLabel lbl_berror;
    private javax.swing.JLabel lbl_bname;
    private javax.swing.JLabel lbl_bra;
    private javax.swing.JLabel lbl_cou;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_quan;
    private javax.swing.JLabel lbl_serror;
    private javax.swing.JLabel lbl_sname;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private javax.swing.JLabel txt_bid;
    private app.bolivia.swing.JCTextField txt_id;
    private app.bolivia.swing.JCTextField txt_id1;
    private javax.swing.JLabel txt_sid;
    // End of variables declaration//GEN-END:variables
}
