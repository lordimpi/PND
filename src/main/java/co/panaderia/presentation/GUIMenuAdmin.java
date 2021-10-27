package co.panaderia.presentation;

import static co.panaderia.infra.Messages.successMessage;
import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Santiago Acuña
 */
public class GUIMenuAdmin extends javax.swing.JFrame {

    /**
     * Variable para controlar los estados de maximizar o minimizar pantalla
     */
    private boolean state = false;
    /**
     * Guarda la coordenada en eje x para poder mover el formulario con el raton
     */
    private int x = 0;
    /**
     * Guarda la coordenada en eje y para poder mover el formulario con el raton
     */
    private int y = 0;

    /**
     * Constructor que inicializa el formulario Menu admin
     *
     */
    public GUIMenuAdmin() {
        initComponents();
        cargarLista();
        setLocationRelativeTo(null);
        initIcons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlBg = new javax.swing.JPanel();
        jPnlSide = new javax.swing.JPanel();
        BtnHomePage = new javax.swing.JPanel();
        jLbHomePageIcono = new javax.swing.JLabel();
        jLbHomePage = new javax.swing.JLabel();
        BtnMenus = new javax.swing.JPanel();
        jLbMenusIcon = new javax.swing.JLabel();
        jLbMenus = new javax.swing.JLabel();
        BtnProductos = new javax.swing.JPanel();
        jLbProductosIcon = new javax.swing.JLabel();
        jLbProductos = new javax.swing.JLabel();
        BtnFoodDishes = new javax.swing.JPanel();
        jLbFoodDishesIcon = new javax.swing.JLabel();
        jLbFoodDishes = new javax.swing.JLabel();
        BtnAccounting = new javax.swing.JPanel();
        jLbAccountingIcon = new javax.swing.JLabel();
        jLbAccounting = new javax.swing.JLabel();
        BtnUsuarios = new javax.swing.JPanel();
        jLbUsuariosIcon = new javax.swing.JLabel();
        jLbUsuarios = new javax.swing.JLabel();
        BtnClientes = new javax.swing.JPanel();
        jLbClientesIcon = new javax.swing.JLabel();
        jLbClientes = new javax.swing.JLabel();
        jLbLogOut = new javax.swing.JLabel();
        jLbUserName = new javax.swing.JLabel();
        jLbUserPhoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPnlCMH = new javax.swing.JPanel();
        jLbMaxMin = new javax.swing.JLabel();
        jLbHide = new javax.swing.JLabel();
        jLbClose1 = new javax.swing.JLabel();
        dskEscritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPnlBg.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBg.setLayout(new java.awt.BorderLayout());

        jPnlSide.setBackground(new java.awt.Color(54, 33, 88));
        jPnlSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnHomePage.setBackground(new java.awt.Color(85, 65, 118));
        BtnHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnHomePageMousePressed(evt);
            }
        });

        jLbHomePageIcono.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbHomePage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbHomePage.setForeground(new java.awt.Color(204, 204, 204));
        jLbHomePage.setText("Home page");

        javax.swing.GroupLayout BtnHomePageLayout = new javax.swing.GroupLayout(BtnHomePage);
        BtnHomePage.setLayout(BtnHomePageLayout);
        BtnHomePageLayout.setHorizontalGroup(
            BtnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnHomePageLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbHomePageIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnHomePageLayout.setVerticalGroup(
            BtnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnHomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbHomePage)
                    .addComponent(jLbHomePageIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 40));

        BtnMenus.setBackground(new java.awt.Color(64, 43, 100));
        BtnMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnMenusMousePressed(evt);
            }
        });

        jLbMenusIcon.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbMenus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbMenus.setForeground(new java.awt.Color(204, 204, 204));
        jLbMenus.setText("Menus");

        javax.swing.GroupLayout BtnMenusLayout = new javax.swing.GroupLayout(BtnMenus);
        BtnMenus.setLayout(BtnMenusLayout);
        BtnMenusLayout.setHorizontalGroup(
            BtnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMenusLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbMenusIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnMenusLayout.setVerticalGroup(
            BtnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMenusLayout.createSequentialGroup()
                .addGroup(BtnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbMenusIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnMenusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbMenus)))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 40));

        BtnProductos.setBackground(new java.awt.Color(64, 43, 100));
        BtnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnProductosMousePressed(evt);
            }
        });

        jLbProductosIcon.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbProductos.setForeground(new java.awt.Color(204, 204, 204));
        jLbProductos.setText("Productos");

        javax.swing.GroupLayout BtnProductosLayout = new javax.swing.GroupLayout(BtnProductos);
        BtnProductos.setLayout(BtnProductosLayout);
        BtnProductosLayout.setHorizontalGroup(
            BtnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnProductosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbProductosIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnProductosLayout.setVerticalGroup(
            BtnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnProductosLayout.createSequentialGroup()
                .addGroup(BtnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbProductosIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbProductos)))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 40));

        BtnFoodDishes.setBackground(new java.awt.Color(64, 43, 100));
        BtnFoodDishes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFoodDishesMousePressed(evt);
            }
        });

        jLbFoodDishesIcon.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbFoodDishes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbFoodDishes.setForeground(new java.awt.Color(204, 204, 204));
        jLbFoodDishes.setText("Food dishes");

        javax.swing.GroupLayout BtnFoodDishesLayout = new javax.swing.GroupLayout(BtnFoodDishes);
        BtnFoodDishes.setLayout(BtnFoodDishesLayout);
        BtnFoodDishesLayout.setHorizontalGroup(
            BtnFoodDishesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnFoodDishesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbFoodDishesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbFoodDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnFoodDishesLayout.setVerticalGroup(
            BtnFoodDishesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnFoodDishesLayout.createSequentialGroup()
                .addGroup(BtnFoodDishesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbFoodDishesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnFoodDishesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbFoodDishes)))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnFoodDishes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, 40));

        BtnAccounting.setBackground(new java.awt.Color(64, 43, 100));
        BtnAccounting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAccountingMousePressed(evt);
            }
        });

        jLbAccountingIcon.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbAccounting.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbAccounting.setForeground(new java.awt.Color(204, 204, 204));
        jLbAccounting.setText("Accounting");

        javax.swing.GroupLayout BtnAccountingLayout = new javax.swing.GroupLayout(BtnAccounting);
        BtnAccounting.setLayout(BtnAccountingLayout);
        BtnAccountingLayout.setHorizontalGroup(
            BtnAccountingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAccountingLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbAccountingIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnAccountingLayout.setVerticalGroup(
            BtnAccountingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAccountingLayout.createSequentialGroup()
                .addGroup(BtnAccountingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbAccountingIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnAccountingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbAccounting)))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnAccounting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, 40));

        BtnUsuarios.setBackground(new java.awt.Color(64, 43, 100));
        BtnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnUsuariosMousePressed(evt);
            }
        });

        jLbUsuariosIcon.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbUsuarios.setForeground(new java.awt.Color(204, 204, 204));
        jLbUsuarios.setText("Usuarios");

        javax.swing.GroupLayout BtnUsuariosLayout = new javax.swing.GroupLayout(BtnUsuarios);
        BtnUsuarios.setLayout(BtnUsuariosLayout);
        BtnUsuariosLayout.setHorizontalGroup(
            BtnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnUsuariosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbUsuariosIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnUsuariosLayout.setVerticalGroup(
            BtnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnUsuariosLayout.createSequentialGroup()
                .addGroup(BtnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbUsuariosIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbUsuarios)))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, 40));

        BtnClientes.setBackground(new java.awt.Color(64, 43, 100));
        BtnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnClientesMousePressed(evt);
            }
        });

        jLbClientesIcon.setPreferredSize(new java.awt.Dimension(34, 35));

        jLbClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbClientes.setForeground(new java.awt.Color(204, 204, 204));
        jLbClientes.setText("Clientes");

        javax.swing.GroupLayout BtnClientesLayout = new javax.swing.GroupLayout(BtnClientes);
        BtnClientes.setLayout(BtnClientesLayout);
        BtnClientesLayout.setHorizontalGroup(
            BtnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnClientesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLbClientesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        BtnClientesLayout.setVerticalGroup(
            BtnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnClientesLayout.createSequentialGroup()
                .addGroup(BtnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbClientesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbClientes)))
                .addGap(21, 21, 21))
        );

        jPnlSide.add(BtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, 40));

        jLbLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLbLogOut.setForeground(new java.awt.Color(204, 204, 204));
        jLbLogOut.setText("Log out");
        jLbLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLbLogOutMousePressed(evt);
            }
        });
        jPnlSide.add(jLbLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 50, -1));

        jLbUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLbUserName.setForeground(new java.awt.Color(204, 204, 204));
        jLbUserName.setText("User");
        jLbUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLbUserNameMousePressed(evt);
            }
        });
        jPnlSide.add(jLbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, -1));
        jPnlSide.add(jLbUserPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 100));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPnlSide.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 10));

        jPnlBg.add(jPnlSide, java.awt.BorderLayout.LINE_START);

        jPnlCMH.setBackground(new java.awt.Color(122, 72, 221));
        jPnlCMH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPnlCMHMouseDragged(evt);
            }
        });
        jPnlCMH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPnlCMHMousePressed(evt);
            }
        });

        jLbMaxMin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLbMaxMin.setForeground(new java.awt.Color(255, 255, 255));
        jLbMaxMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbMaxMin.setText("[]");
        jLbMaxMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbMaxMinMouseClicked(evt);
            }
        });

        jLbHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLbHide.setForeground(new java.awt.Color(255, 255, 255));
        jLbHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbHide.setText("-");
        jLbHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbHideMouseClicked(evt);
            }
        });

        jLbClose1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLbClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLbClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbClose1.setText("X");
        jLbClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbClose1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPnlCMHLayout = new javax.swing.GroupLayout(jPnlCMH);
        jPnlCMH.setLayout(jPnlCMHLayout);
        jPnlCMHLayout.setHorizontalGroup(
            jPnlCMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlCMHLayout.createSequentialGroup()
                .addContainerGap(1014, Short.MAX_VALUE)
                .addComponent(jLbHide, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLbMaxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLbClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPnlCMHLayout.setVerticalGroup(
            jPnlCMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCMHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlCMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLbMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbHide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPnlBg.add(jPnlCMH, java.awt.BorderLayout.PAGE_START);

        dskEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dskEscritorioLayout = new javax.swing.GroupLayout(dskEscritorio);
        dskEscritorio.setLayout(dskEscritorioLayout);
        dskEscritorioLayout.setHorizontalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        dskEscritorioLayout.setVerticalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jPnlBg.add(dskEscritorio, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPnlBg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton para cerrar el formulario
     *
     * @param evt Evento del boton cerrar
     */
    private void jLbClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLbClose1MouseClicked

    /**
     * Boton para Maximizar o Minimizar el formulario
     *
     * @param evt Evento del boton Max Min form
     */
    private void jLbMaxMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMaxMinMouseClicked

        if (state) {
            this.setExtendedState(NORMAL);
            state = false;
        } else {
            this.setExtendedState(MAXIMIZED_BOTH);
            state = true;
        }
    }//GEN-LAST:event_jLbMaxMinMouseClicked

    /**
     * Boton para ocultar el formulario
     *
     * @param evt Evento del boton ocultar
     */
    private void jLbHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbHideMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLbHideMouseClicked

    /**
     * Metodo encargado de capturar las coordenadas del raton para poder mover
     * el formulario
     *
     * @param evt Evento del Mouse pressed
     */
    private void jPnlCMHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlCMHMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPnlCMHMousePressed

    /**
     * Metodo encargado de insertar las coordenada del formulario para ubicar el
     * formulario luego de mover con el raton
     *
     * @param evt Evento del mouse dragged
     */
    private void jPnlCMHMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPnlCMHMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPnlCMHMouseDragged

    /**
     * Boton para regresar a la pagina principal del restaurante
     *
     * @param evt Evento del boton home
     */
    private void BtnHomePageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomePageMousePressed
        setColor(BtnHomePage);
        resetColor(BtnProductos);
        resetColor(BtnMenus);
        resetColor(BtnFoodDishes);
        resetColor(BtnClientes);
        resetColor(BtnUsuarios);
        resetColor(BtnAccounting);

    }//GEN-LAST:event_BtnHomePageMousePressed

    /**
     * Boton que despliega los restaurantes que estan disponibles
     *
     * @param evt Evento del boton restaurante disponibles
     */
    private void BtnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProductosMousePressed
        resetColor(BtnHomePage);
        setColor(BtnProductos);
        resetColor(BtnMenus);
        resetColor(BtnFoodDishes);
        resetColor(BtnClientes);
        resetColor(BtnUsuarios);
        resetColor(BtnAccounting);
    }//GEN-LAST:event_BtnProductosMousePressed

    /**
     * Boton que despliega los menus del dia
     *
     * @param evt Evento del boton menus
     */
    private void BtnMenusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenusMousePressed
        resetColor(BtnHomePage);
        resetColor(BtnProductos);
        setColor(BtnMenus);
        resetColor(BtnFoodDishes);
        resetColor(BtnClientes);
        resetColor(BtnUsuarios);
        resetColor(BtnAccounting);
    }//GEN-LAST:event_BtnMenusMousePressed

    /**
     * Boton que despliega los clientes que hay en la base de datos
     *
     * @param evt Evento del boton
     */
    private void BtnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientesMousePressed
        resetColor(BtnHomePage);
        resetColor(BtnProductos);
        resetColor(BtnMenus);
        resetColor(BtnFoodDishes);
        setColor(BtnClientes);
        resetColor(BtnUsuarios);
        resetColor(BtnAccounting);

    }//GEN-LAST:event_BtnClientesMousePressed

    /**
     * Boton que despliega las opciones para contabilidad
     *
     * @param evt Evento del boton contabilidad
     */
    private void BtnAccountingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccountingMousePressed
        resetColor(BtnHomePage);
        resetColor(BtnProductos);
        resetColor(BtnMenus);
        resetColor(BtnFoodDishes);
        resetColor(BtnClientes);
        resetColor(BtnUsuarios);
        setColor(BtnAccounting);

    }//GEN-LAST:event_BtnAccountingMousePressed

    /**
     * Boton que despliega las opciones para platos principales
     *
     * @param evt Evento del boton platos principales
     */
    private void BtnFoodDishesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFoodDishesMousePressed
        resetColor(BtnHomePage);
        resetColor(BtnProductos);
        resetColor(BtnMenus);
        setColor(BtnFoodDishes);
        resetColor(BtnClientes);
        resetColor(BtnUsuarios);
        resetColor(BtnAccounting);
    }//GEN-LAST:event_BtnFoodDishesMousePressed

    /**
     * Boton que despliega las opcciones de usuario
     *
     * @param evt Evento del boton
     */
    private void BtnUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMousePressed
        resetColor(BtnHomePage);
        resetColor(BtnProductos);
        resetColor(BtnMenus);
        resetColor(BtnFoodDishes);
        resetColor(BtnClientes);
        setColor(BtnUsuarios);
        resetColor(BtnAccounting);

    }//GEN-LAST:event_BtnUsuariosMousePressed

    /**
     * Metodo encargado de modificar un usuario donde false activa el boton
     * modificar y apaga el de registrar
     *
     * @param evt evento del raton al precionar
     */
    private void jLbUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbUserNameMousePressed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }//GEN-LAST:event_jLbUserNameMousePressed

    /**
     * Boton encargado de deslogear un usuario
     *
     * @param evt Evento del boton
     */
    private void jLbLogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbLogOutMousePressed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }//GEN-LAST:event_jLbLogOutMousePressed

    /**
     * Inicia el formulario del menu para el admin
     *
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnAccounting;
    private javax.swing.JPanel BtnClientes;
    private javax.swing.JPanel BtnFoodDishes;
    private javax.swing.JPanel BtnHomePage;
    private javax.swing.JPanel BtnMenus;
    private javax.swing.JPanel BtnProductos;
    private javax.swing.JPanel BtnUsuarios;
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JLabel jLbAccounting;
    private javax.swing.JLabel jLbAccountingIcon;
    private javax.swing.JLabel jLbClientes;
    private javax.swing.JLabel jLbClientesIcon;
    private javax.swing.JLabel jLbClose1;
    private javax.swing.JLabel jLbFoodDishes;
    private javax.swing.JLabel jLbFoodDishesIcon;
    private javax.swing.JLabel jLbHide;
    private javax.swing.JLabel jLbHomePage;
    private javax.swing.JLabel jLbHomePageIcono;
    private javax.swing.JLabel jLbLogOut;
    private javax.swing.JLabel jLbMaxMin;
    private javax.swing.JLabel jLbMenus;
    private javax.swing.JLabel jLbMenusIcon;
    private javax.swing.JLabel jLbProductos;
    private javax.swing.JLabel jLbProductosIcon;
    private javax.swing.JLabel jLbUserName;
    private javax.swing.JLabel jLbUserPhoto;
    private javax.swing.JLabel jLbUsuarios;
    private javax.swing.JLabel jLbUsuariosIcon;
    private javax.swing.JPanel jPnlBg;
    private javax.swing.JPanel jPnlCMH;
    private javax.swing.JPanel jPnlSide;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    /**
     * Asigna un especifico a un panel
     *
     * @param panel Panel a cambiar el color
     */
    private void setColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));

    }

    /**
     * Metodo encargado de reiniciar un color en especifico
     *
     * @param panel Paenel al que se le reiniciara el colo
     */
    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(64, 43, 100));

    }

    /**
     * Metodo encargado de cargar varios iconos para varias etiquetas del
     * formulario
     */
    private void initIcons() {
        addIcon(jLbHomePageIcono, "src/main/java/resources/home.png");
        addIcon(jLbProductosIcon, "src/main/java/resources/restaurant.png");
        addIcon(jLbMenusIcon, "src/main/java/resources/restaurantMenu.png");
        addIcon(jLbFoodDishesIcon, "src/main/java/resources/foodDishes.png");
        addIcon(jLbClientesIcon, "src/main/java/resources/customers.png");
        addIcon(jLbUsuariosIcon, "src/main/java/resources/users.png");
        addIcon(jLbAccountingIcon, "src/main/java/resources/accounting.png");
        addIcon(jLbUserPhoto, "src/main/java/resources/userPhoto.png");
    }

    /**
     * Metodo encargado de cargar un icono para una etiquetas
     *
     * @param lb Etiqueta que funciona como icono
     * @param pathIcon Direccion donde se encuentra el icono
     */
    private void addIcon(JLabel lb, String pathIcon) {
        ImageIcon img = new ImageIcon(pathIcon);
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(
                lb.getWidth(),
                lb.getHeight(),
                Image.SCALE_DEFAULT));
        lb.setIcon(icono);
        this.repaint();
    }

    /**
     * Carga un lista a traves de un socket
     */
    private void cargarLista() {

    }
}
