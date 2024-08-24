package vista;

import Logica.*;

public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        requiButton = new javax.swing.JButton();
        postularButton = new javax.swing.JButton();
        tituloFormulario = new javax.swing.JLabel();
        Salida2 = new javax.swing.JLabel();
        Salida1 = new javax.swing.JLabel();
        tituloFormulario1 = new javax.swing.JLabel();
        tituloFormulario2 = new javax.swing.JLabel();
        tituloFormulario3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tituloFormulario4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        requiButton.setBackground(new java.awt.Color(0, 51, 153));
        requiButton.setForeground(new java.awt.Color(0, 0, 0));
        requiButton.setText("Requisitos");
        requiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requiButtonActionPerformed(evt);
            }
        });

        postularButton.setBackground(new java.awt.Color(0, 51, 153));
        postularButton.setForeground(new java.awt.Color(0, 0, 0));
        postularButton.setText("Postular");
        postularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postularButtonActionPerformed(evt);
            }
        });

        tituloFormulario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tituloFormulario.setForeground(new java.awt.Color(0, 0, 153));
        tituloFormulario.setText("CONSIGUE TU BECA 2024");

        Salida2.setBackground(new java.awt.Color(0, 51, 102));

        Salida1.setBackground(new java.awt.Color(0, 51, 102));

        tituloFormulario1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        tituloFormulario1.setForeground(new java.awt.Color(255, 255, 255));
        tituloFormulario1.setText("Llena tu formulario");

        tituloFormulario2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tituloFormulario2.setForeground(new java.awt.Color(0, 0, 0));
        tituloFormulario2.setText("¡PERIODOS DE INSCRIPCIONES!");

        tituloFormulario3.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        tituloFormulario3.setForeground(new java.awt.Color(255, 255, 255));
        tituloFormulario3.setText("Más de 10000 becas para universitarios");

        tituloFormulario4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        tituloFormulario4.setForeground(new java.awt.Color(255, 255, 255));
        tituloFormulario4.setText("Conoce los requisitos ahora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(tituloFormulario3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(requiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(tituloFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Salida1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salida2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(tituloFormulario4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloFormulario1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(221, 221, 221)
                    .addComponent(tituloFormulario2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tituloFormulario)
                .addGap(133, 133, 133)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salida1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloFormulario3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salida2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloFormulario1)
                    .addComponent(tituloFormulario4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(tituloFormulario2)
                    .addContainerGap(490, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void postularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postularButtonActionPerformed
        jframeingresar jframe2 = new jframeingresar();
        jframe2.setVisible(true);


    }//GEN-LAST:event_postularButtonActionPerformed

    private void requiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requiButtonActionPerformed
        requisito rq = new requisito();
        Salida1.setText(rq.mostrar2());
        Salida2.setText(rq.mostrar());

    }//GEN-LAST:event_requiButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Salida1;
    private javax.swing.JLabel Salida2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton postularButton;
    private javax.swing.JButton requiButton;
    private javax.swing.JLabel tituloFormulario;
    private javax.swing.JLabel tituloFormulario1;
    private javax.swing.JLabel tituloFormulario2;
    private javax.swing.JLabel tituloFormulario3;
    private javax.swing.JLabel tituloFormulario4;
    // End of variables declaration//GEN-END:variables
}
