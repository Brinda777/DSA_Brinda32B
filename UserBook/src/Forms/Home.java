package Forms;


import DB.SignUp;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Vogi
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    SignUp ob = new SignUp();
    Intro ob1 = new Intro();
//    NewsFeed ob2=new NewsFeed();
    public Home() throws ClassNotFoundException, SQLException {
        initComponents();
        setResizable(false);
        
//        list1.add("Bibek");
        list1.add("Asmita");
        list1.add("Kiran");
        jLabel1.setText("Username: " + "Brinda");
        if(ob.messagetrack[ob1.userpos]!=0)
        {
            Inbox.setForeground(Color.yellow);
            Inbox.setText("Inbox(new)");
        }
        if(ob.Notificationtrack[ob1.userpos]!=0)
        {
            Notifications.setForeground(Color.yellow);
            Notifications.setText("Notifications(new)"); 
        }
        if(ob.Friendnotificationtrack[ob1.userpos]!=0)
        {
             Friendreq.setForeground(Color.yellow);
             Friendreq.setText("Friend Requests(new)"); 
        }
             //     list1.setVisible(rootPaneCheckingEnabled);
        int i = 0;
        int p = 0;
        int r = 0;
        int j;
        j = ob.totals();
        int f = 0;

        for (i = 0; i < ob.total; i++) {
            String[] result = new String[2];
            String[] result2 = new String[2];
//            try {
//                result = ob.getFrndReqInfo(Integer.toString(i), Integer.toString(ob1.userpos));
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            try {
//                result2 = ob.getFrndReqInfo(Integer.toString(ob1.userpos), Integer.toString(i));
//                //System.out.println(result[0]+"   "+result[1]);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }


            /*if (result[0].compareTo("9") == 0) {

                if (i != ob1.userpos) {
                    continue;
                }
            }
            if (i == ob1.userpos || (ob.frndchecker[ob1.userpos][i] == 1 && ob.frndchecker[i][ob1.userpos] == 1)) {*/
//            if((result[0].compareTo("1")==0&&result[1].compareTo("1")==0)||(result2[0].compareTo("1")==0&&result2[1].compareTo("1")==0))
//            {  
//                ob.loadOnline(Integer.toString(i));
//                if(ob.online[i]==1){
//                ob.sbutrack[f] = i;
//                list1.add(ob.uname[i]);
//                f++;}
//            }
        }
     //   if(ob.statustrack[ob1.userpos]!=0)
     //   mystatus.setText("My Status:\n "+ ob.status[ob1.userpos][ob.statustrack[ob1.userpos]-1]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Statusbox = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Apps = new javax.swing.JButton();
        Post = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        Searchbox = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Newsfeed = new javax.swing.JButton();
        Inbox = new javax.swing.JButton();
        Notifications = new javax.swing.JButton();
        Friendreq = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        Events = new javax.swing.JButton();
        Accountsettings = new javax.swing.JButton();
        home = new javax.swing.JButton();
        list1 = new java.awt.List();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Statusbox.setColumns(20);
        Statusbox.setRows(5);
        jScrollPane1.setViewportView(Statusbox);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 906, 282));

        jLabel2.setText("What is on your mind?");
        jLabel2.setMaximumSize(new java.awt.Dimension(106, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 199, 28));

        Apps.setBackground(new java.awt.Color(153, 0, 0));
        Apps.setText("APPS");
        Apps.setHideActionText(true);
        Apps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppsActionPerformed(evt);
            }
        });
        getContentPane().add(Apps, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 107, 36));

        Post.setBackground(new java.awt.Color(0, 102, 102));
        Post.setForeground(new java.awt.Color(255, 255, 255));
        Post.setText("Post");
        Post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostActionPerformed(evt);
            }
        });
        getContentPane().add(Post, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 127, 34));

        jPanel1.setBackground(new java.awt.Color(59, 89, 152));

        logout.setBackground(new java.awt.Color(0, 102, 102));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(0, 102, 153));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        Newsfeed.setBackground(new java.awt.Color(0, 102, 102));
        Newsfeed.setForeground(new java.awt.Color(255, 255, 255));
        Newsfeed.setText("News Feed");
        Newsfeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewsfeedActionPerformed(evt);
            }
        });

        Inbox.setBackground(new java.awt.Color(0, 102, 102));
        Inbox.setForeground(new java.awt.Color(255, 255, 255));
        Inbox.setText("Inbox");
        Inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InboxActionPerformed(evt);
            }
        });

        Notifications.setBackground(new java.awt.Color(0, 102, 102));
        Notifications.setForeground(new java.awt.Color(255, 255, 255));
        Notifications.setText("Notifications");
        Notifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationsActionPerformed(evt);
            }
        });

        Friendreq.setBackground(new java.awt.Color(0, 102, 102));
        Friendreq.setForeground(new java.awt.Color(255, 255, 255));
        Friendreq.setText("Friend Requests");
        Friendreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriendreqActionPerformed(evt);
            }
        });

        Profile.setBackground(new java.awt.Color(0, 102, 102));
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        Events.setBackground(new java.awt.Color(0, 102, 102));
        Events.setForeground(new java.awt.Color(255, 255, 255));
        Events.setText("Events");
        Events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventsActionPerformed(evt);
            }
        });

        Accountsettings.setBackground(new java.awt.Color(0, 102, 102));
        Accountsettings.setForeground(new java.awt.Color(255, 255, 255));
        Accountsettings.setText("Account Settings");
        Accountsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Newsfeed, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(Inbox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(Friendreq, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(Notifications, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(Events, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Accountsettings)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Accountsettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Events)
                        .addComponent(Notifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Newsfeed)
                        .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inbox))
                    .addComponent(Friendreq))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        home.setBackground(new java.awt.Color(0, 102, 153));
        home.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Refresh");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(logout)
                                .addComponent(home))
                            .addGap(60, 60, 60))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Searchbox)))
                    .addComponent(Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        int i=0;
        for(i=0;i<10;i++)
        {
            jLabel1.setText("Username:");
        }

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        getContentPane().add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 200, 202, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Untitled.png"))); // NOI18N
        jLabel3.setText("Friends Online");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 160, 200, 27));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostActionPerformed
        
        // TODO add your handling code here:
        
       ob.status[ob1.userpos][ob.statustrack[ob1.userpos]]=Statusbox.getText();
       ob.statustrack[ob1.userpos]++;
       Statusbox.setText("");
        JOptionPane.showMessageDialog(null,   "Status Added Succesully" ); 
       this.setVisible(false);
        
            new NewsFeed().setVisible(true);

    }//GEN-LAST:event_PostActionPerformed

    private void AccountsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsettingsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new PrivacySettings().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AccountsettingsActionPerformed

    private void AppsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
//        new Apps().setVisible(true);
    }//GEN-LAST:event_AppsActionPerformed

    private void NewsfeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewsfeedActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
//        try {
//            new NewsFeed().setVisible(true);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_NewsfeedActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new Profile().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProfileActionPerformed

    private void InboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InboxActionPerformed
        ob.messagetrack[ob1.userpos]=0;
       
        this.setVisible(false);
        try {
            new Inboxsubject().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InboxActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        ob.search = Searchbox.getText();
        this.setVisible(false);
        new Search().setVisible(true);
    }//GEN-LAST:event_SearchActionPerformed

    private void FriendreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriendreqActionPerformed
        // TODO add your handling code here:
        ob.Friendnotificationtrack[ob1.userpos]=0;
        
        this.setVisible(false);
        try {
            new Friendrequestlist().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FriendreqActionPerformed

    private void NotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationsActionPerformed
        // TODO add your handling code here:
       
//        this.setVisible(false);
       
    }//GEN-LAST:event_NotificationsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try {
            // TODO add your handling code here:
            ob.updateOnline(Integer.toString(ob1.userpos),(ob.birthday[ob1.userpos]),("0"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        new Intro().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void EventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventsActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
//        try {
//            new Event().setVisible(true);
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_EventsActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
         int r;
        r = list1.getSelectedIndex();
          this.setVisible(false);
        try {
            new ProfileOthers().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_list1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new Home().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inboxmessage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inboxmessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>



        /*
         * Create and display the form
         */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Home().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accountsettings;
    private javax.swing.JButton Apps;
    private javax.swing.JButton Events;
    private javax.swing.JButton Friendreq;
    private javax.swing.JButton Inbox;
    private javax.swing.JButton Newsfeed;
    private javax.swing.JButton Notifications;
    private javax.swing.JButton Post;
    private javax.swing.JButton Profile;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Searchbox;
    private javax.swing.JTextArea Statusbox;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List list1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
