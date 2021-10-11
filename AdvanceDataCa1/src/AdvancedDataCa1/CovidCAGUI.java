
package AdvancedDataCa1;
/**
 *
 * @author Conor Keller x18353923
 */

public class CovidCAGUI extends javax.swing.JFrame {
		
  
   public int PriorityNew = 0;
   int ageConverted=0;
	
    private final PQInterface myPQueue;
    public CovidCAGUI() {
        myPQueue = new MyPriorityQueue();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        cvd10lbl = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        cnd = new javax.swing.JLabel();
        nmTxt = new javax.swing.JTextField();
        agTxt = new javax.swing.JTextField();
        totBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        rmBtn = new javax.swing.JButton();
        displayJLabel = new javax.swing.JLabel();
        ag = new javax.swing.JLabel();
        cndTxt = new javax.swing.JTextField();
        lstBtn = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infolbl = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        cvd10lbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cvd10lbl.setText("Covid19 Application");

        nm.setBackground(new java.awt.Color(255, 51, 102));
        nm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nm.setForeground(new java.awt.Color(255, 51, 102));
        nm.setText("Name");

        cnd.setBackground(new java.awt.Color(255, 51, 102));
        cnd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cnd.setForeground(new java.awt.Color(255, 51, 102));
        cnd.setText("Condition");

        nmTxt.setBackground(new java.awt.Color(102, 255, 153));
        nmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmTxtActionPerformed(evt);
            }
        });

        agTxt.setBackground(new java.awt.Color(102, 255, 153));
        agTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agTxtActionPerformed(evt);
            }
        });

        totBtn.setBackground(new java.awt.Color(102, 255, 153));
        totBtn.setForeground(new java.awt.Color(255, 51, 102));
        totBtn.setText("Total ");
        totBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(102, 255, 153));
        addBtn.setForeground(new java.awt.Color(255, 51, 102));
        addBtn.setText("Add ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        rmBtn.setBackground(new java.awt.Color(102, 255, 153));
        rmBtn.setForeground(new java.awt.Color(255, 51, 102));
        rmBtn.setText("Remove ");
        rmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmBtnActionPerformed(evt);
            }
        });

        displayJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ag.setBackground(new java.awt.Color(255, 51, 102));
        ag.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ag.setForeground(new java.awt.Color(255, 51, 102));
        ag.setText("Age");

        cndTxt.setBackground(new java.awt.Color(102, 255, 153));
        cndTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cndTxtActionPerformed(evt);
            }
        });

        lstBtn.setBackground(new java.awt.Color(102, 255, 153));
        lstBtn.setForeground(new java.awt.Color(255, 51, 102));
        lstBtn.setText("List ");
        lstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstBtnActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(102, 255, 153));
        Exit.setForeground(new java.awt.Color(255, 51, 102));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 153));
        jButton1.setForeground(new java.awt.Color(255, 51, 102));
        jButton1.setText("Priorty");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        infolbl.setBackground(new java.awt.Color(102, 255, 153));
        infolbl.setColumns(20);
        infolbl.setRows(5);
        jScrollPane1.setViewportView(infolbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cnd)
                                            .addComponent(ag)
                                            .addComponent(nm))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nmTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(agTxt)
                                            .addComponent(cndTxt))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(totBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(550, 550, 550)
                                        .addComponent(displayJLabel))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(cvd10lbl)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cvd10lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nm)
                            .addComponent(addBtn)
                            .addComponent(lstBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ag))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnd)
                            .addComponent(cndTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totBtn)
                            .addComponent(rmBtn)
                            .addComponent(Exit)))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(displayJLabel)
                .addGap(741, 741, 741))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmTxtActionPerformed
    
    }//GEN-LAST:event_nmTxtActionPerformed

    private void totBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totBtnActionPerformed
       
        infolbl.append("There are " + myPQueue.size() + " patients ready"+ "\n");
    }//GEN-LAST:event_totBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
    // press add and then Priorty to get calculate the priorty//
   // i left the System.out.print(PriorityNew); because for some reason the priorty in the list wasnt printing the value, bt with the system print it was//
   //yes or no works so make sure to say no in the text box when testing//
		
        String name;
        int priority = 0;
        Integer priorityINT;
        Patient p = new Patient();
        name = nmTxt.getText();
		
		String age = agTxt.getText();
		String condition = cndTxt.getText();
        p.setName(name);
		p.setAge(age);
		p.setCondition(condition);
        
        
       
  
        myPQueue.enqueue(priority,p);

        infolbl.append(nmTxt.getText() + " your details have been successfully added to the queue"+ "\n");
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void rmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmBtnActionPerformed
       

        if(!myPQueue.isEmpty()){
            PQElement pqelem = (PQElement)myPQueue.dequeue();
            Patient p1 = (Patient)pqelem.getElement();
            
            infolbl.append(" " + p1.getName());
            infolbl.append("  age: " + p1.getAge());
            infolbl.append("  condition: " + pqelem.getKey()+ "\n");
        }
        else
            infolbl.append("There are no more patients waiting"+ "\n");
		
		
    }//GEN-LAST:event_rmBtnActionPerformed

    private void cndTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cndTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cndTxtActionPerformed

    private void lstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstBtnActionPerformed
     
        infolbl.append("The List is currently...."+ "\n");
        infolbl.append(myPQueue.printPQueue()+ "\n");
    }//GEN-LAST:event_lstBtnActionPerformed

    private void agTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agTxtActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		
		// press add and then Priorty to get calculate the priorty//
		// i left the System.out.print(PriorityNew); because for some reason the priorty in the list wasnt printing the value, bt with the system print it was//
		
		PriorityNew =0; 
		String age = agTxt.getText();
		String condition = cndTxt.getText();
		
		
		int ageConverted = Integer.parseInt(age);
		if(ageConverted < 18){
			PriorityNew =+1;
		}
		if(ageConverted >= 18 && ageConverted <=29){
			PriorityNew =+2;
		}
		if(ageConverted >= 30 && ageConverted <=44){
			PriorityNew =+3;
		}
		if(ageConverted >= 45 && ageConverted <=54){
			PriorityNew =+4;
		}
		if(ageConverted >= 55 && ageConverted <=64){
			PriorityNew =+5;
		}
		
		if(ageConverted >= 65 && ageConverted <=69){
			PriorityNew =+7;
		}
		if(ageConverted >= 70 && ageConverted <=79){
			PriorityNew =+8;
		}
		if(ageConverted >= 80 && ageConverted <=89){
			PriorityNew =+9;
		}
		if(ageConverted >= 90 && ageConverted <=100){
			PriorityNew =+10;
		}
		
		
		if(ageConverted >= 18 && ageConverted <=64 && condition.equals("yes")){
			PriorityNew =+6;
		}
		
		
		System.out.print(PriorityNew);
		
		
		nmTxt.setText("");
        agTxt.setText("");
        cndTxt.setText("");
		
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel ag;
    private javax.swing.JTextField agTxt;
    private javax.swing.JLabel cnd;
    private javax.swing.JTextField cndTxt;
    private javax.swing.JLabel cvd10lbl;
    private javax.swing.JLabel displayJLabel;
    private javax.swing.JTextArea infolbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lstBtn;
    private javax.swing.JLabel nm;
    private javax.swing.JTextField nmTxt;
    private javax.swing.JButton rmBtn;
    private javax.swing.JButton totBtn;
    // End of variables declaration//GEN-END:variables

}
