
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keena
 */
public class sortingroutines extends javax.swing.JFrame {
        
    /**
     * Creates new form sortingroutines
     */
    public sortingroutines() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortingAlgorithim = new javax.swing.ButtonGroup();
        sortingOrder = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblPrompt = new javax.swing.JLabel();
        lblAlgorithim = new javax.swing.JLabel();
        radSelection = new javax.swing.JRadioButton();
        radBubble = new javax.swing.JRadioButton();
        radInsertion = new javax.swing.JRadioButton();
        radQuick = new javax.swing.JRadioButton();
        lblOrder = new javax.swing.JLabel();
        radAscending = new javax.swing.JRadioButton();
        radDescending = new javax.swing.JRadioButton();
        lblNumbers = new javax.swing.JLabel();
        txtNumbers = new javax.swing.JTextField();
        btnSort = new javax.swing.JButton();
        lblOriginal = new javax.swing.JLabel();
        lblSorted = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOriginal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSorted = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Sorting Routines");

        lblPrompt.setText("Enter the following information:");

        lblAlgorithim.setText("Sorting Algoritihim");

        sortingAlgorithim.add(radSelection);
        radSelection.setText("Selection");

        sortingAlgorithim.add(radBubble);
        radBubble.setText("Bubble");

        sortingAlgorithim.add(radInsertion);
        radInsertion.setText("Insertion");

        sortingAlgorithim.add(radQuick);
        radQuick.setText("Quick");

        lblOrder.setText("Sorting Order");

        sortingOrder.add(radAscending);
        radAscending.setText("Ascending");

        sortingOrder.add(radDescending);
        radDescending.setText("Descending");

        lblNumbers.setText("Amount of Numbers to sort:");

        txtNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumbersKeyPressed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        lblOriginal.setText("Original Numbers");

        lblSorted.setText("Sorted Numbers");

        txaOriginal.setColumns(20);
        txaOriginal.setRows(5);
        jScrollPane1.setViewportView(txaOriginal);

        txaSorted.setColumns(20);
        txaSorted.setRows(5);
        jScrollPane2.setViewportView(txaSorted);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrompt)
                                    .addComponent(lblAlgorithim)
                                    .addComponent(lblOrder)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(radAscending)
                                                .addGap(18, 18, 18)
                                                .addComponent(radDescending))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblOriginal)
                                                .addGap(126, 126, 126)
                                                .addComponent(lblSorted)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(radSelection)
                        .addGap(18, 18, 18)
                        .addComponent(radBubble)
                        .addGap(18, 18, 18)
                        .addComponent(radInsertion)
                        .addGap(18, 18, 18)
                        .addComponent(radQuick)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumbers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlgorithim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radSelection)
                    .addComponent(radBubble)
                    .addComponent(radInsertion)
                    .addComponent(radQuick))
                .addGap(18, 18, 18)
                .addComponent(lblOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDescending)
                    .addComponent(radAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumbers)
                    .addComponent(txtNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOriginal)
                    .addComponent(lblSorted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jMenu1.setText("File");

        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtNumbersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumbersKeyPressed
        txtNumbers.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String input;
                int length;
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume(); // if it's not a number, ignore the event
                } else {
                    input = txtNumbers.getText();
                    length = input.length();
                    if (length >= 3) {
                        e.consume();
                    } else {
                    }
                }
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumbersKeyPressed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNumbers.setText("");
        txaOriginal.setText("");
        txaSorted.setText("");
        sortingAlgorithim.clearSelection();
        sortingOrder.clearSelection();
                        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        int [] num;
        String original = null;
        
        if (txtNumbers.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a value", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if (radSelection.isSelected() == false && radBubble.isSelected() == false && radInsertion.isSelected() == false && radQuick.isSelected() == false){
                JOptionPane.showMessageDialog(null, "Please choose a sorting algorithim", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if (radAscending.isSelected() == false && radDescending.isSelected() == false){
                    JOptionPane.showMessageDialog(null, "Please choose a sorting order", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    num = arrayNumbers();
                    
                    for (int i = 0; i < num.length; i++){
                        if (original == null){
                            original = (num[i] + "\n");
                        }
                        else{
                            original = (original + num[i] + "\n"); 
                        }
                    }
                    txaOriginal.setText(original);
                    
                    if (radSelection.isSelected() == true){
                        selection(num);
                    }
                    else if (radBubble.isSelected() == true){
                        bubble(num);
                    }
                    else if (radInsertion.isSelected() == true){
                        insertion(num);
                    }
                    else if (radQuick.isSelected() == true){
                        quick(num, 0, num.length - 1);
                    }
                }
            }
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_btnSortActionPerformed

    public int[] arrayNumbers(){
        String temp = txtNumbers.getText();
        int numbers = Integer.parseInt(temp);
        int a, i;
        int [] array = new int [numbers];
        
        System.out.println("Number of integers to sort: " + numbers);
        
        for (i = 0; i < numbers; i++){
            a = getRandomInteger(1000, -1000);
            array[i] = a;
        }
        return array;
    }
    
    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
    
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public void selection(int a[]) {
        String output = null;
        
        if (radAscending.isSelected() == true){
            for (int i = 0; i < a.length - 1; i++) {
                int minPosition = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[minPosition]) {
                        minPosition = j;
                    }
                }
                if (minPosition != i) { 
                    swap(a, minPosition, i);
                }
            }
        }
        else if (radDescending.isSelected() == true){
            for (int i = 0; i < a.length - 1; i++) {
                int maxPosition = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > a[maxPosition]) { 
                        maxPosition = j;
                    }
                }
                if (maxPosition != i) { 
                    swap(a, maxPosition, i);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (output == null) {
                output = (a[i] + "\n");
            } else {
                output = (output + a[i] + "\n");
            }
        }
        txaSorted.setText(output);
    }
    
    public void bubble(int a[]) {
        int i, j, temp;
        String output = null;
   
        if (radAscending.isSelected() == true){
            for (i = 0; i < (a.length - 1); i++) {
                for (j = 0; j < a.length - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
        else if (radDescending.isSelected() == true){
            for (i = 0; i < (a.length - 1); i++) {
                for (j = 0; j < a.length - i - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            if (output == null) {
                output = (a[i] + "\n");
            } else {
                output = (output + a[i] + "\n");
            }
        }
        txaSorted.setText(output);
    }
    
    public void insertion(int a[]) {
        String output = null;
        int i;
        int size = a.length;
        
        if (radAscending.isSelected() == true){
            for (int step = 1; step < size; step++) {
                int key = a[step];
                int j = step - 1;
                while (j >= 0 && key < a[j]) {
                    a[j + 1] = a[j];
                    --j;
                }
                a[j + 1] = key;
            }
        }
        else if (radDescending.isSelected() == true){
            for (int step = 1; step < size; step++) {
                int key = a[step];
                int j = step - 1;
                while (j >= 0 && key > a[j]) {
                    a[j + 1] = a[j];
                    --j;
                }
                a[j + 1] = key;
            }
        }
        for (i = 0; i < a.length; i++) {
            if (output == null) {
                output = (a[i] + "\n");
            } else {
                output = (output + a[i] + "\n");
            }
        }
        txaSorted.setText(output);
    } 
    
    public void quick(int a[], int low, int high) {
        String output = null;
        int i, temp;
        
        if (radAscending.isSelected() == true){
            if (low < high) {
                temp = partitionA(a, low, high);

                quick(a, low, temp - 1);
                quick(a, temp + 1, high);
            }
        }
        else if (radDescending.isSelected() == true){
            if (low < high) {
                temp = partitionB(a, low, high);
                
                quick(a, low, temp - 1);
                quick(a, temp + 1, high);
            }
        }
        for (i = 0; i < a.length; i++) {
            if (output == null) {
                output = (a[i] + "\n");
            } else {
                output = (output + a[i] + "\n");
            }
        }
        txaSorted.setText(output);
    }
    
    public int partitionA(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
    public int partitionB(int arr[], int left, int right) {
        int pivot = arr[left];
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] > pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }
    
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
            java.util.logging.Logger.getLogger(sortingroutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sortingroutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sortingroutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sortingroutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sortingroutines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSort;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlgorithim;
    private javax.swing.JLabel lblNumbers;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblOriginal;
    private javax.swing.JLabel lblPrompt;
    private javax.swing.JLabel lblSorted;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radAscending;
    private javax.swing.JRadioButton radBubble;
    private javax.swing.JRadioButton radDescending;
    private javax.swing.JRadioButton radInsertion;
    private javax.swing.JRadioButton radQuick;
    private javax.swing.JRadioButton radSelection;
    private javax.swing.ButtonGroup sortingAlgorithim;
    private javax.swing.ButtonGroup sortingOrder;
    private javax.swing.JTextArea txaOriginal;
    private javax.swing.JTextArea txaSorted;
    private javax.swing.JTextField txtNumbers;
    // End of variables declaration//GEN-END:variables

}