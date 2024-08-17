
package clavemurcielago;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Murcielago extends javax.swing.JFrame {
     int longitud,a=0,e=0,i=0,o=0,u=0;
     String palabra,murcielago="",mostrar="",lugar="";
     
   
 
    public Murcielago() {
        initComponents();
     this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        areaTexto = new javax.swing.JScrollPane();
        txt_ingreso = new javax.swing.JTextArea();
        lbl_mensaje = new javax.swing.JLabel();
        btn_procesar = new javax.swing.JButton();
        lbl_longitud = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_primera = new javax.swing.JLabel();
        lbl_ultima = new javax.swing.JLabel();
        lbl_centro = new javax.swing.JLabel();
        lbl_pimeroP = new javax.swing.JLabel();
        lbl_centralP = new javax.swing.JLabel();
        lbl_ultimaP = new javax.swing.JLabel();
        lbl_a = new javax.swing.JLabel();
        lbl_e = new javax.swing.JLabel();
        lbl_i = new javax.swing.JLabel();
        lbl_o = new javax.swing.JLabel();
        lbl_u = new javax.swing.JLabel();
        lbl_traduccion = new javax.swing.JLabel();
        respuesta = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JLabel();
        respuesta2 = new javax.swing.JLabel();
        respuesta3 = new javax.swing.JLabel();
        respuesta4 = new javax.swing.JLabel();
        respuesta5 = new javax.swing.JLabel();
        respuesta6 = new javax.swing.JLabel();
        respuesta7 = new javax.swing.JLabel();
        respuesta8 = new javax.swing.JLabel();
        respuesta9 = new javax.swing.JLabel();
        respuesta10 = new javax.swing.JLabel();
        respuesta11 = new javax.swing.JLabel();
        respuesta12 = new javax.swing.JLabel();
        respuesta13 = new javax.swing.JLabel();
        respuesta14 = new javax.swing.JLabel();
        areaTexto1 = new javax.swing.JScrollPane();
        txt_proceso = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        copiar = new javax.swing.JMenuItem();
        cortar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        buscar = new javax.swing.JMenuItem();
        reemplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 204, 255));
        panel.setForeground(new java.awt.Color(153, 204, 255));
        panel.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N

        txt_ingreso.setBackground(new java.awt.Color(204, 204, 204));
        txt_ingreso.setColumns(20);
        txt_ingreso.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        txt_ingreso.setRows(5);
        txt_ingreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        areaTexto.setViewportView(txt_ingreso);

        lbl_mensaje.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbl_mensaje.setText("MANEJO DE CADENAS");

        btn_procesar.setBackground(new java.awt.Color(0, 0, 0));
        btn_procesar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_procesar.setForeground(new java.awt.Color(255, 255, 255));
        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        lbl_longitud.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_longitud.setText("Longitud del texto..");

        lbl_total.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_total.setText("Total de palabras");

        lbl_primera.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_primera.setText("Primera letra del texto");

        lbl_ultima.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_ultima.setText("Última letra del texto");

        lbl_centro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_centro.setText("Letra central del texto");

        lbl_pimeroP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_pimeroP.setText("Primera palabra");

        lbl_centralP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_centralP.setText("Palabra Central");

        lbl_ultimaP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_ultimaP.setText("Última palabra");

        lbl_a.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_a.setText("Repeticiones de \"A\", \"a\" ó \"á\":");

        lbl_e.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_e.setText("Repeticiones de \"E\", \"e\" ó \"é\":");

        lbl_i.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_i.setText("Repeticiones de \"I\", \"i\" ó \"í\":");

        lbl_o.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_o.setText("Repeticiones de \"O\", \"o\" ú \"ó\":");

        lbl_u.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_u.setText("Repeticiones de \"U\", \"u\" ó \"ú\":");

        lbl_traduccion.setBackground(new java.awt.Color(51, 51, 255));
        lbl_traduccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_traduccion.setText("TRADUCCIÓN A CLAVE MURCIELAGO");

        respuesta.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta2.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        respuesta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta3.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta4.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta5.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta7.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta8.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta9.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta10.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta11.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta12.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta13.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        respuesta14.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        respuesta14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_proceso.setColumns(20);
        txt_proceso.setRows(5);
        txt_proceso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        areaTexto1.setViewportView(txt_proceso);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_ultimaP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_centralP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_pimeroP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_centro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_primera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_ultima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_longitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(respuesta7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE))
                            .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_o, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(lbl_i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_u, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respuesta8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuesta9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuesta10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuesta11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuesta12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuesta13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuesta14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(lbl_traduccion))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lbl_mensaje))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(btn_procesar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(lbl_mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_procesar)
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_longitud)
                    .addComponent(lbl_a)
                    .addComponent(respuesta)
                    .addComponent(respuesta8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total)
                    .addComponent(lbl_e)
                    .addComponent(respuesta1)
                    .addComponent(respuesta9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_primera)
                    .addComponent(lbl_i)
                    .addComponent(respuesta2)
                    .addComponent(respuesta10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ultima)
                    .addComponent(lbl_o)
                    .addComponent(respuesta3)
                    .addComponent(respuesta11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_centro)
                    .addComponent(lbl_u)
                    .addComponent(respuesta4)
                    .addComponent(respuesta12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pimeroP)
                    .addComponent(respuesta5)
                    .addComponent(respuesta13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_centralP)
                    .addComponent(respuesta6)
                    .addComponent(respuesta14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ultimaP)
                    .addComponent(respuesta7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        archivo.setText("Archivo");

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);

        guardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        guardarComo.setText("Guardar como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        archivo.add(guardarComo);

        menu.add(archivo);

        editar.setText("Editar");

        copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        editar.add(copiar);

        cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cortar.setText("Cortar");
        cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarActionPerformed(evt);
            }
        });
        editar.add(cortar);

        pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        editar.add(pegar);

        buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        editar.add(buscar);

        reemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        reemplazar.setText("Reemplazar");
        reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazarActionPerformed(evt);
            }
        });
        editar.add(reemplazar);

        menu.add(editar);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        txt_proceso.setText("");
        palabra = txt_ingreso.getText();
        longitud = palabra.length(); 
        
        respuesta.setText(String.valueOf(longitud)); 
   
         StringTokenizer contador = new StringTokenizer(palabra);
        respuesta1.setText(String.valueOf(contador.countTokens()));
        respuesta2.setText( String.valueOf(palabra.charAt(0)));
        respuesta3.setText( String.valueOf(palabra.charAt(longitud-1)));
        respuesta4.setText( String.valueOf(palabra.charAt((longitud -1)/2) ));
       
        
        respuesta5.setText( String.valueOf(contador.nextToken()) );
        respuesta8.setText( String.valueOf( contarA() ) );
        respuesta9.setText( String.valueOf( contarE() ) );
        respuesta10.setText( String.valueOf( contarI() ) );
        respuesta11.setText( String.valueOf( contarO() ) );
        respuesta12.setText( String.valueOf( contarU() ) );
       
        txt_proceso.setText(ClaveMurcielago());
        
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarActionPerformed
             txt_ingreso.cut();
    }//GEN-LAST:event_cortarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
     
        
        String buscar = JOptionPane.showInputDialog("Digite la palabra a buscar..");
      
        if(palabra.contains(buscar)){
         JOptionPane.showMessageDialog(null,"La palabra "+buscar+" si se encuentra en el texto");
        }else{
         JOptionPane.showMessageDialog(null,"La palabra "+buscar+" no se encuentra en el texto");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazarActionPerformed
        
        String buscar = JOptionPane.showInputDialog("Digite la palabra a buscar.. ");
        String cambio = JOptionPane.showInputDialog("Digite la palabra para reemplazar..");
        
        String temporal = palabra.replace(buscar, cambio);
        
        JOptionPane.showMessageDialog(null,"La palabra "+buscar+" fue reemplazada por "+cambio +" con éxito!!");
        
        reiniciar();
        palabra = temporal;
        txt_ingreso.setText(palabra);
        
        
    }//GEN-LAST:event_reemplazarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        txt_ingreso.copy();
    }//GEN-LAST:event_copiarActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        // TODO add your handling code here:
        txt_ingreso.paste();
    }//GEN-LAST:event_pegarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed

         try {
             String contenido="";
            File archivo;
           String ruta;

           JFileChooser buscarArchivo;

           buscarArchivo= new JFileChooser();

           buscarArchivo.showOpenDialog(null);

           archivo = buscarArchivo.getSelectedFile();
           ruta = archivo.getAbsolutePath();
           FileReader leer = new FileReader(ruta);
           BufferedReader lectura = new BufferedReader(leer);
           lugar= ruta;
           
             while(contenido != null){
                
                
               
                    mostrar+=contenido;
                 contenido= lectura.readLine();
                 mostrar+="\n";
           
             }
            
         } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null,"Error al abrir el archivo "+ex);
         }catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,"Error al abrir el archivo "+ex);
             }
         
         txt_ingreso.setText(mostrar);
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
      
        JFileChooser jfc= new JFileChooser(); 
            String direc = ""; 
            try{ 
            if(jfc.showSaveDialog(null)==jfc.APPROVE_OPTION){ 
            direc = jfc.getSelectedFile().getAbsolutePath();
            lugar=direc;
                File archivo = new File(direc);
                 FileWriter ec = new FileWriter(archivo);
                 ec.write("Palabra ingresada: ");
                 ec.write(txt_ingreso.getText());   
                 ec.write("\r\n");
                 ec.write("Clave Murcielago: ");
                 ec.write(txt_proceso.getText()); 
                 ec.close();
                 JOptionPane.showMessageDialog(null,"Archivo guardado con exito!! ");
 
            } 
            }catch (Exception ex){ 
            ex.printStackTrace(); 
            } 
    }//GEN-LAST:event_guardarComoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
            try{ 
            
                File archivos = new File(lugar);
                 FileWriter ec1 = new FileWriter(archivos,true);
                 ec1.write("\r\n\n");
                 ec1.write("Palabra ingresada: ");
                 ec1.write(txt_ingreso.getText());   
                 ec1.write("\r\n");
                 ec1.write("Clave Murcielago: ");
                 ec1.write(txt_proceso.getText()); 
                 JOptionPane.showMessageDialog(null,"Guardado con Exito");
                 ec1.close();
                 reiniciar();
 
      
            }catch (Exception ex){ 
                JOptionPane.showMessageDialog(null,"Erro al guardar los cambios.. "+ex);
            } 
    }//GEN-LAST:event_guardarActionPerformed

     
 public void reiniciar(){
     a=e=i=o=u=0;
     txt_ingreso.setText("");
     txt_proceso.setText("");
     respuesta.setText("");
     respuesta1.setText("");
     respuesta2.setText("");
     respuesta3.setText("");
     respuesta4.setText("");
     respuesta5.setText("");
     respuesta6.setText("");
     respuesta7.setText("");
     respuesta8.setText("");
     respuesta9.setText("");
     respuesta10.setText("");
     respuesta11.setText("");
     respuesta12.setText("");
     respuesta13.setText("");
     respuesta14.setText("");
     
 }
    
    public int contarA(){
        
        for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'A':  
                case 'a': 
                case 'á': a++; break;
            }  
        }
      
        return a;
    }
    
    public int contarE(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'E' :
                case 'e' :
                case 'é' : e++; break;
            }  
            
        }
        
        return e;
    }
    
    public int contarI(){
        
         for(int j=0; j<longitud;j++){
           
            char letra = palabra.charAt(j);
            
            switch(letra){
                case 'I' :
                case 'i' :
                case 'í' : i++; break;
            }  
        }
        return i;
    }
    
    public int contarO(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'O' :
                case 'o' :
                case 'ó' : o++; break;
            }   
        }
        return o;
    }
    
    public int contarU(){
        
         for(int i =0; i<longitud;i++){
           
            char letra = palabra.charAt(i);
            
            switch(letra){
                case 'U' :
                case 'u' :
                case 'ú' : u++; break;
            }  
        }
        return u;
    }
    
    
    public String ClaveMurcielago( ){
        for(int J =0; J<longitud;J++){
           
            char letra = palabra.charAt(J);
            
            switch(letra){
                
                case 'M':  
                case 'm': murcielago += "0"; break;
                
                case 'U' :
                case 'u' :
                case 'ú' : murcielago += "1"; break;
                
                case 'R':  
                case 'r': murcielago += "2"; break;
                
                case 'C':  
                case 'c': murcielago += "3"; break;
                
                case 'I' :
                case 'i' :
                case 'í' : murcielago += "4"; break;
                
                case 'E' :
                case 'e' :
                case 'é' : murcielago += "5"; break;
                
                case 'L':  
                case 'l': murcielago += "6"; break;
                
                case 'A':  
                case 'a': 
                case 'á': murcielago += "7"; break;
                
                case 'G':  
                case 'g': murcielago += "8"; break;
               
                case 'O' :
                case 'o' :
                case 'ó' : murcielago += "9"; break;
                
                
                default : murcielago += String.valueOf(letra); break;
                
            }  
        }
        
        return murcielago;
    }
    
  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Murcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Murcielago().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenu archivo;
    private javax.swing.JScrollPane areaTexto;
    private javax.swing.JScrollPane areaTexto1;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JMenuItem buscar;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_centralP;
    private javax.swing.JLabel lbl_centro;
    private javax.swing.JLabel lbl_e;
    private javax.swing.JLabel lbl_i;
    private javax.swing.JLabel lbl_longitud;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JLabel lbl_o;
    private javax.swing.JLabel lbl_pimeroP;
    private javax.swing.JLabel lbl_primera;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_traduccion;
    private javax.swing.JLabel lbl_u;
    private javax.swing.JLabel lbl_ultima;
    private javax.swing.JLabel lbl_ultimaP;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenuItem reemplazar;
    private javax.swing.JLabel respuesta;
    private javax.swing.JLabel respuesta1;
    private javax.swing.JLabel respuesta10;
    private javax.swing.JLabel respuesta11;
    private javax.swing.JLabel respuesta12;
    private javax.swing.JLabel respuesta13;
    private javax.swing.JLabel respuesta14;
    private javax.swing.JLabel respuesta2;
    private javax.swing.JLabel respuesta3;
    private javax.swing.JLabel respuesta4;
    private javax.swing.JLabel respuesta5;
    private javax.swing.JLabel respuesta6;
    private javax.swing.JLabel respuesta7;
    private javax.swing.JLabel respuesta8;
    private javax.swing.JLabel respuesta9;
    private javax.swing.JTextArea txt_ingreso;
    private javax.swing.JTextArea txt_proceso;
    // End of variables declaration//GEN-END:variables
}
