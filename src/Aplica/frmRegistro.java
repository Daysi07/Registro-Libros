package Aplica;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import clases.Libro;
import clases.validar;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import rojerusan.RSPanelsSlider;

public class frmRegistro extends javax.swing.JFrame {
validar nota = new validar();
    Libro objLi;
    DefaultListModel moLibro, moEditorial, moClase, moAño, moPaginas, moCosto;
    DefaultListModel moEstadisticas;

    public frmRegistro() {
        initComponents();
        llenaEditorial();
        llenaClase();
        cargaModelos();
        setIconImage(new ImageIcon(getClass().getResource("/imagen/logo.png")).getImage());
        this.setTitle("REGISTRO DE LIBROS");
         transparenciaBotones();
      mostrarp();
        
    }
    private void mostrarp(){
       Animacion.Animacion.mover_izquierda(211, 5, 1, 1, btnMenu);
            Animacion.Animacion.mover_izquierda(211, 50, 1, 1, contenedor);
            Animacion.Animacion.mover_izquierda(5, -200, 1, 1, pnlMenu);
            Animacion.Animacion.mover_izquierda(211, 200, 1, 1, titulo);  
    }
     private void transparenciaBotones() {
        this.btnRegistrar.setOpaque(false);
        this.btnRegistrar.setContentAreaFilled(false);
        this.btnRegistrar.setBorderPainted(false);
        this.btnLimpiar.setOpaque(false);
        this.btnLimpiar.setContentAreaFilled(false);
        this.btnLimpiar.setBorderPainted(false);
         this.btnElimina.setOpaque(false);
        this.btnElimina.setContentAreaFilled(false);
        this.btnElimina.setBorderPainted(false);
        this.btnBuscar.setOpaque(false);
        this.btnBuscar.setContentAreaFilled(false);
        this.btnBuscar.setBorderPainted(false);
    }
         private String CantidadLibrosEditorial() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < moEditorial.getSize(); i++) {
            String Letra = moEditorial.elementAt(i).toString();
            switch (Letra) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
            }
        }
        return "Cantidad por Editorial:\n A [ " + a + " ] \n B [ " + b + " ]\n C [ " + c + " ]";
    }
        private String CantidadLibrosClase() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < moClase.getSize(); i++) {
            String Letra = moClase.elementAt(i).toString();
            switch (Letra) {
                case "Programacion":
                    a++;
                    break;
                case "Analisis":
                    b++;
                    break;
                case "Diseño":
                    c++;
                    break;
            }
        }
        return "\n Programacion [ " + a + " ] \n Analisis     [ " + b + " ]\n Diseño       [ " + c + " ]";
    }

    void cargaModelos() {
        moLibro = new DefaultListModel();
        moEditorial = new DefaultListModel();
        moClase = new DefaultListModel();
        moAño = new DefaultListModel();
        moPaginas = new DefaultListModel();
        moCosto = new DefaultListModel();
        moEstadisticas = new DefaultListModel();
        lstLibro.setModel(moLibro);
        lstEditorial.setModel(moEditorial);
        lstClase.setModel(moClase);
        lstAño.setModel(moAño);
        lstPaginas.setModel(moPaginas);
        lstCosto.setModel(moCosto);
        lstEstadisticas.setModel(moEstadisticas);
    }

    void llenaModelos() {
        moLibro.addElement(objLi.getNombre());
        moEditorial.addElement(objLi.getEditorial());
        moClase.addElement(objLi.getClase());
        moAño.addElement(objLi.getAño());
        moPaginas.addElement(objLi.getPaginas());
        moCosto.addElement(objLi.getCosto());
    }
        private void limpiar() {
        this.txtLibro.setText("");
        this.txtAño.setText("");
        this.txtCosto.setText("");
        this.txtPaginas.setText("");
        this.txtLibro.requestFocus();
    }

    void llenaEditorial() {

        cboEditorial.addItem("A");
        cboEditorial.addItem("B");
        cboEditorial.addItem("C");
    }

    void llenaClase() {

        cboClase.addItem("Programacion");
        cboClase.addItem("Analisis");
        cboClase.addItem("Diseño");
    }

    String getLibro() {
        return txtLibro.getText();
    }

    String getEditorial() {
        return String.valueOf(cboEditorial.getSelectedItem());
    }

    String getClase() {
        return String.valueOf(cboClase.getSelectedItem());
    }

    int getAño() {
        return Integer.parseInt(txtAño.getText());
    }

    int getPaginas() {
        return Integer.parseInt(txtPaginas.getText());
    }

    double getCosto() {
        return Double.parseDouble(txtCosto.getText());
    }

 private void Noescribir() {
       
        txtLibro.setEditable(false);
        txtAño.setEditable(false);
        txtCosto.setEditable(false);
        txtPaginas.setEditable(false);
    }

    private void Escribir() {
        txtPaginas.setEditable(true);
       txtCosto.setEditable(true);
       txtAño.setEditable(true);
        txtLibro.setEditable(true);
      
    }
       private void EliminarByIndex(int index) {
        moLibro.remove(index);
        moEditorial.remove(index);
        moClase.remove(index);
        moAño.remove(index);
        moPaginas.remove(index);
        moCosto.remove(index);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnMostrarRegistro = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        contenedor = new rojerusan.RSPanelsSlider();
        pnl11 = new javax.swing.JPanel();
        pnlInicio1 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        estadistica = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEstadisticas = new javax.swing.JList<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtEditoto1 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtEditoto = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstCosto = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstPaginas = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAño = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClase = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnElimina = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        pnl1 = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        txtLibro = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        cboEditorial = new javax.swing.JComboBox<>();
        cboClase = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlRegistro1 = new javax.swing.JPanel();
        txtLibro1 = new javax.swing.JTextField();
        txtAño1 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstLibro1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstClase1 = new javax.swing.JList<>();
        txtPaginas1 = new javax.swing.JTextField();
        txtCosto1 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        lstEditorial1 = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        lstAño1 = new javax.swing.JList<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        lstPaginas1 = new javax.swing.JList<>();
        btnEstadisticas1 = new javax.swing.JButton();
        cboEditorial1 = new javax.swing.JComboBox<>();
        cboClase1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        lstEstadisticas1 = new javax.swing.JList<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        lstCosto1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 1500));
        jPanel3.setLayout(null);

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowBottomShadow(false);
        pnlMenu.setBorder(dropShadowBorder1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/books_200px.png"))); // NOI18N

        btnNuevo.setBackground(new java.awt.Color(0, 153, 204));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO LIBRO");
        btnNuevo.setBorder(null);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setOpaque(true);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnMostrarRegistro.setBackground(new java.awt.Color(0, 153, 204));
        btnMostrarRegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMostrarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarRegistro.setText("REGISTRO");
        btnMostrarRegistro.setBorder(null);
        btnMostrarRegistro.setContentAreaFilled(false);
        btnMostrarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarRegistro.setOpaque(true);
        btnMostrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistroActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(0, 153, 204));
        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setOpaque(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnEstadisticas.setBackground(new java.awt.Color(0, 153, 204));
        btnEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setContentAreaFilled(false);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setOpaque(true);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMostrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel3.add(pnlMenu);
        pnlMenu.setBounds(5, 5, 188, 540);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/close.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir);
        btnSalir.setBounds(810, 10, 50, 50);

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/text.gif"))); // NOI18N
        jPanel3.add(titulo);
        titulo.setBounds(320, 10, 440, 50);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btnMenu);
        btnMenu.setBounds(200, 10, 51, 52);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        pnl11.setBackground(new java.awt.Color(255, 255, 255));
        pnl11.setName("pnl11"); // NOI18N

        pnlInicio1.setBackground(new java.awt.Color(255, 255, 255));
        pnlInicio1.setLayout(null);

        titulo3.setBackground(new java.awt.Color(255, 255, 255));
        titulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/libroooo.gif"))); // NOI18N
        pnlInicio1.add(titulo3);
        titulo3.setBounds(90, 0, 392, 337);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\bienvenido.png")); // NOI18N
        pnlInicio1.add(jLabel12);
        jLabel12.setBounds(50, 340, 480, 110);

        javax.swing.GroupLayout pnl11Layout = new javax.swing.GroupLayout(pnl11);
        pnl11.setLayout(pnl11Layout);
        pnl11Layout.setHorizontalGroup(
            pnl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl11Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(pnlInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnl11Layout.setVerticalGroup(
            pnl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedor.add(pnl11, "card2");

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setName("pnl3"); // NOI18N

        estadistica.setBackground(new java.awt.Color(255, 255, 255));
        estadistica.setLayout(null);

        lstEstadisticas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(lstEstadisticas);

        estadistica.add(jScrollPane2);
        jScrollPane2.setBounds(30, 260, 590, 140);

        txtEditoto1.setBackground(new java.awt.Color(0, 153, 204));
        txtEditoto1.setColumns(20);
        txtEditoto1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtEditoto1.setRows(5);
        jScrollPane16.setViewportView(txtEditoto1);

        estadistica.add(jScrollPane16);
        jScrollPane16.setBounds(20, 40, 290, 160);

        txtEditoto.setBackground(new java.awt.Color(0, 153, 204));
        txtEditoto.setColumns(20);
        txtEditoto.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtEditoto.setForeground(new java.awt.Color(255, 255, 255));
        txtEditoto.setRows(5);
        jScrollPane15.setViewportView(txtEditoto);

        estadistica.add(jScrollPane15);
        jScrollPane15.setBounds(320, 40, 300, 160);

        jLabel17.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("CANTIDAD POR EDITORIAL");
        estadistica.add(jLabel17);
        jLabel17.setBounds(320, 0, 260, 30);

        jLabel18.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 204));
        jLabel18.setText("OTROS DATOS");
        estadistica.add(jLabel18);
        jLabel18.setBounds(30, 220, 310, 30);

        jLabel19.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 204));
        jLabel19.setText("CANTIDAD POR CLASE");
        estadistica.add(jLabel19);
        jLabel19.setBounds(20, 0, 260, 30);

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contenedor.add(pnl3, "card4");

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setName("pnl2"); // NOI18N

        pnlRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistro.setLayout(null);

        lstCosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        lstCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCostoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(lstCosto);

        pnlRegistro.add(jScrollPane7);
        jScrollPane7.setBounds(540, 90, 100, 250);

        lstPaginas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        lstPaginas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPaginasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lstPaginas);

        pnlRegistro.add(jScrollPane6);
        jScrollPane6.setBounds(460, 90, 80, 250);

        lstAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        lstAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAñoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lstAño);

        pnlRegistro.add(jScrollPane4);
        jScrollPane4.setBounds(380, 90, 80, 250);

        lstEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        lstEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEditorialMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstEditorial);

        pnlRegistro.add(jScrollPane3);
        jScrollPane3.setBounds(300, 90, 80, 250);

        lstClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        lstClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstClaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstClase);

        pnlRegistro.add(jScrollPane1);
        jScrollPane1.setBounds(180, 90, 120, 250);

        lstLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        lstLibro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lstLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstLibroMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(lstLibro);

        pnlRegistro.add(jScrollPane8);
        jScrollPane8.setBounds(10, 90, 170, 250);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("-->Costo");
        pnlRegistro.add(jLabel9);
        jLabel9.setBounds(560, 60, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("-->NOMBRE");
        pnlRegistro.add(jLabel10);
        jLabel10.setBounds(10, 60, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("-->CLASE");
        pnlRegistro.add(jLabel13);
        jLabel13.setBounds(190, 60, 80, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("-->ED.");
        pnlRegistro.add(jLabel14);
        jLabel14.setBounds(310, 60, 80, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("-->AÑO");
        pnlRegistro.add(jLabel15);
        jLabel15.setBounds(380, 60, 80, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("-->PAG.");
        pnlRegistro.add(jLabel16);
        jLabel16.setBounds(470, 60, 80, 30);

        btnElimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/delete1.png"))); // NOI18N
        btnElimina.setToolTipText("Eliminar");
        btnElimina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/delete.png"))); // NOI18N
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnElimina);
        btnElimina.setBounds(570, 350, 60, 80);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscar1.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnBuscar);
        btnBuscar.setBounds(480, 350, 60, 80);

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contenedor.add(pnl2, "card3");

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setName("pnl1"); // NOI18N

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatos.setLayout(null);

        txtLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });
        txtLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLibroKeyTyped(evt);
            }
        });
        pnlDatos.add(txtLibro);
        txtLibro.setBounds(220, 20, 320, 50);

        txtAño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAñoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        pnlDatos.add(txtAño);
        txtAño.setBounds(220, 200, 140, 50);

        txtPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaginasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginasKeyTyped(evt);
            }
        });
        pnlDatos.add(txtPaginas);
        txtPaginas.setBounds(220, 260, 140, 50);

        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        pnlDatos.add(txtCosto);
        txtCosto.setBounds(220, 320, 140, 50);

        cboEditorial.setBackground(new java.awt.Color(0, 153, 204));
        cboEditorial.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cboEditorial.setForeground(new java.awt.Color(255, 255, 255));
        pnlDatos.add(cboEditorial);
        cboEditorial.setBounds(220, 140, 200, 40);

        cboClase.setBackground(new java.awt.Color(0, 153, 204));
        cboClase.setForeground(new java.awt.Color(255, 255, 255));
        pnlDatos.add(cboClase);
        cboClase.setBounds(220, 90, 200, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("COSTO                    :");
        pnlDatos.add(jLabel3);
        jLabel3.setBounds(50, 340, 130, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("CLASE DE LIBRO        :");
        pnlDatos.add(jLabel2);
        jLabel2.setBounds(50, 100, 140, 20);

        pnlRegistro1.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistro1.setLayout(null);

        txtLibro1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Libro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibro1ActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtLibro1);
        txtLibro1.setBounds(10, 20, 260, 60);

        txtAño1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Año de Edicion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtAño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAño1ActionPerformed(evt);
            }
        });
        pnlRegistro1.add(txtAño1);
        txtAño1.setBounds(10, 100, 100, 60);

        jScrollPane9.setViewportView(lstLibro1);

        pnlRegistro1.add(jScrollPane9);
        jScrollPane9.setBounds(10, 210, 170, 190);

        jScrollPane5.setViewportView(lstClase1);

        pnlRegistro1.add(jScrollPane5);
        jScrollPane5.setBounds(190, 210, 110, 190);

        txtPaginas1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        txtPaginas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginas1KeyTyped(evt);
            }
        });
        pnlRegistro1.add(txtPaginas1);
        txtPaginas1.setBounds(150, 100, 90, 60);

        txtCosto1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        pnlRegistro1.add(txtCosto1);
        txtCosto1.setBounds(270, 100, 100, 60);

        jScrollPane10.setViewportView(lstEditorial1);

        pnlRegistro1.add(jScrollPane10);
        jScrollPane10.setBounds(310, 210, 60, 190);

        jScrollPane11.setViewportView(lstAño1);

        pnlRegistro1.add(jScrollPane11);
        jScrollPane11.setBounds(380, 210, 70, 190);

        jScrollPane12.setViewportView(lstPaginas1);

        pnlRegistro1.add(jScrollPane12);
        jScrollPane12.setBounds(460, 210, 90, 190);

        btnEstadisticas1.setText("ESTADISTICAS");
        btnEstadisticas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticas1ActionPerformed(evt);
            }
        });
        pnlRegistro1.add(btnEstadisticas1);
        btnEstadisticas1.setBounds(10, 410, 530, 30);

        pnlRegistro1.add(cboEditorial1);
        cboEditorial1.setBounds(290, 40, 110, 40);

        pnlRegistro1.add(cboClase1);
        cboClase1.setBounds(420, 40, 130, 40);

        jLabel4.setText("Tipo de Editorial");
        pnlRegistro1.add(jLabel4);
        jLabel4.setBounds(290, 10, 100, 16);

        jLabel6.setText("Clase de Libro");
        pnlRegistro1.add(jLabel6);
        jLabel6.setBounds(440, 10, 90, 16);

        jScrollPane13.setViewportView(lstEstadisticas1);

        pnlRegistro1.add(jScrollPane13);
        jScrollPane13.setBounds(10, 450, 580, 120);

        jScrollPane14.setViewportView(lstCosto1);

        pnlRegistro1.add(jScrollPane14);
        jScrollPane14.setBounds(560, 210, 90, 190);

        pnlDatos.add(pnlRegistro1);
        pnlRegistro1.setBounds(0, 0, 0, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("NOMBRE DEL LIBRO   :");
        pnlDatos.add(jLabel1);
        jLabel1.setBounds(50, 30, 138, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("TIPO DE EDITORIAL   :");
        pnlDatos.add(jLabel7);
        jLabel7.setBounds(50, 150, 150, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("AÑO DE EDICIÓN        :");
        pnlDatos.add(jLabel8);
        jLabel8.setBounds(50, 210, 140, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("PÁGINAS                   :");
        pnlDatos.add(jLabel11);
        jLabel11.setBounds(50, 270, 150, 20);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/check.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/check1.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlDatos.add(btnRegistrar);
        btnRegistrar.setBounds(400, 330, 110, 90);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/añadir1.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlDatos.add(btnLimpiar);
        btnLimpiar.setBounds(520, 330, 100, 90);

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        contenedor.add(pnl1, "card5");

        jPanel3.add(contenedor);
        contenedor.setBounds(200, 72, 659, 474);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
              int posicion = btnMenu.getX();
        if(posicion > 5){
             mostrarp();
        }else{
            Animacion.Animacion.mover_derecha(5, 210, 2, 2, btnMenu);
            Animacion.Animacion.mover_derecha(5, 210, 2, 2, contenedor);
            Animacion.Animacion.mover_derecha(-200, 5, 2, 2, pnlMenu);
            Animacion.Animacion.mover_derecha(65, 310, 2, 2, titulo);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMostrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistroActionPerformed
 if(!this.btnMostrarRegistro.isSelected()){
            this.btnNuevo.setSelected(false);
            this.btnMostrarRegistro.setSelected(true);
            this.btnEstadisticas.setSelected(false);
            this.btnInicio.setSelected(false);
            
            contenedor.slidPanel(1, pnl2, RSPanelsSlider.direct.Dowun);
        }
  mostrarp();
    }//GEN-LAST:event_btnMostrarRegistroActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
  if(!this.btnNuevo.isSelected()){
            this.btnNuevo.setSelected(true);
            this.btnMostrarRegistro.setSelected(false);
            this.btnEstadisticas.setSelected(false);
            this.btnInicio.setSelected(false);
            
            contenedor.slidPanel(1, pnl1, RSPanelsSlider.direct.Right);
        }
   mostrarp();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroActionPerformed

    private void txtPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasKeyTyped
        try {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txtPaginas.getText().length() == 4) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_txtPaginasKeyTyped

    private void txtLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibro1ActionPerformed

    private void txtAño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAño1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAño1ActionPerformed

    private void txtPaginas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginas1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginas1KeyTyped

    private void btnEstadisticas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticas1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            objLi = new Libro(getLibro(), getEditorial(), getClase(), getAño(), getPaginas(), getCosto());
            llenaModelos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                "Error en la Aplicacion " + ex.getMessage());
        }    
         Noescribir();  
      
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
  if(!this.btnInicio.isSelected()){
            this.btnNuevo.setSelected(false);
            this.btnMostrarRegistro.setSelected(false);
            this.btnEstadisticas.setSelected(false);
            this.btnInicio.setSelected(true);
            
            contenedor.slidPanel(1, pnl11, RSPanelsSlider.direct.Right);
        }       mostrarp();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
         try {
            moEstadisticas.clear();
            moEstadisticas.addElement("Numero de Libro de Análisis de la Editorial B es: \n" + objLi.getTAnalisis());
            int mayor = Integer.MIN_VALUE;
            int pos = 0;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Integer.parseInt(moAño.elementAt(i).toString()) > mayor) {
                    mayor = Integer.parseInt(moAño.elementAt(i).toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Libro con el año de edición más reciente: :\n" + moLibro.getElementAt(pos));
            int menor = Integer.MAX_VALUE;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Integer.parseInt(moPaginas.elementAt(i).toString()) < menor) {
                    menor = Integer.parseInt(moPaginas.elementAt(i).toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Editorial con libro de menor pagina es : \n" + moEditorial.getElementAt(pos));
            double mayorCosto = Double.MIN_VALUE;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Double.parseDouble(moCosto.elementAt(i).toString()) > mayorCosto) {
                    mayorCosto = Double.parseDouble(moCosto.elementAt(i).toString());
                    pos = i;
                }
            }
            
            if(!this.btnEstadisticas.isSelected()){
            this.btnNuevo.setSelected(false);
            this.btnMostrarRegistro.setSelected(false);
            this.btnEstadisticas.setSelected(true);
            this.btnInicio.setSelected(false);
            
            contenedor.slidPanel(1, pnl3, RSPanelsSlider.direct.Right);
        }
         mostrarp();
            moEstadisticas.addElement("Libro con mayor costo es: \n" + moLibro.getElementAt(pos));
            this.txtEditoto.append(""+CantidadLibrosEditorial());
            this.txtEditoto1.append(""+CantidadLibrosClase());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion " + ex.getMessage());
        }

        
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 limpiar(); 
 Escribir();// TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        try {
            /*  Se selecciona la fila y se elimna todos los datos iguales a ella   */
            int index = lstLibro.getSelectedIndex();
            EliminarByIndex(index);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminaActionPerformed
    private void SeleccionarTodasFilas(int index) {
        lstLibro.setSelectedIndex(index);
        lstEditorial.setSelectedIndex(index);
        lstClase.setSelectedIndex(index);
        lstAño.setSelectedIndex(index);
        lstPaginas.setSelectedIndex(index);
        lstCosto.setSelectedIndex(index);
    }
        private void MostrarDatosCampos() {
        txtLibro.setText(lstLibro.getSelectedValue());
        cboEditorial.setSelectedItem(lstEditorial.getSelectedValue());
        cboClase.setSelectedItem(lstClase.getSelectedValue());
        String anio = String.valueOf(lstAño.getSelectedValue());
        txtAño.setText(anio);
        String paginas = String.valueOf(lstPaginas.getSelectedValue());
        txtPaginas.setText(paginas);
        String costo = String.valueOf(lstCosto.getSelectedValue());
        txtCosto.setText(costo);
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            /*  Se obtiene el nombre del libro  */
            String NombreLibro = JOptionPane.showInputDialog("Ingresar el nombre del libro a buscar");
            if (NombreLibro.isEmpty() || NombreLibro == null) {
                return;
            }

            /*  Se busca en la lista y cargan los datos el sus cuadros correspondientes  */
            for (int i = 0; i < moLibro.size(); i++) {
                String nombre = moLibro.getElementAt(i).toString();
                if (NombreLibro.equals(nombre)) {
                    SeleccionarTodasFilas(i);
                    MostrarDatosCampos();
                    break;
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lstLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstLibroMouseClicked
         int index = lstLibro.getSelectedIndex();
        SeleccionarTodasFilas(index);  // TODO add your handling code here:
    }//GEN-LAST:event_lstLibroMouseClicked

    private void lstClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstClaseMouseClicked
         int index = lstEditorial.getSelectedIndex();
        SeleccionarTodasFilas(index); // TODO add your handling code here:
    }//GEN-LAST:event_lstClaseMouseClicked

    private void lstEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEditorialMouseClicked
          int index = lstClase.getSelectedIndex();
        SeleccionarTodasFilas(index); // TODO add your handling code here:
    }//GEN-LAST:event_lstEditorialMouseClicked

    private void lstAñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAñoMouseClicked
        int index = lstAño.getSelectedIndex();
        SeleccionarTodasFilas(index);// TODO add your handling code here:
    }//GEN-LAST:event_lstAñoMouseClicked

    private void lstPaginasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPaginasMouseClicked
          int index = lstPaginas.getSelectedIndex();
        SeleccionarTodasFilas(index);   // TODO add your handling code here:
    }//GEN-LAST:event_lstPaginasMouseClicked

    private void lstCostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCostoMouseClicked
      int index = lstCosto.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstCostoMouseClicked

    private void txtLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroKeyTyped
   try {
            if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            }
            String texto=txtLibro.getText();
    
        if(texto.length()>0){
            char pri=texto.charAt(0);
            texto=Character.toUpperCase(pri)+texto.substring(1,texto.length());
            txtLibro.setText(texto);}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
   try {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txtAño.getText().length() == 4) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtPaginasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasKeyReleased
nota.V(txtPaginas);        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginasKeyReleased

    private void txtAñoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyReleased
     nota.V(txtAño);     // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoKeyReleased

    private void txtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyReleased
      nota.V(txtCosto);   // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyReleased

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
 try {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txtCosto.getText().length() == 5) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyTyped

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnEstadisticas1;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMostrarRegistro;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboClase;
    private javax.swing.JComboBox<String> cboClase1;
    private javax.swing.JComboBox<String> cboEditorial;
    private javax.swing.JComboBox<String> cboEditorial1;
    private rojerusan.RSPanelsSlider contenedor;
    private javax.swing.JPanel estadistica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> lstAño;
    private javax.swing.JList<String> lstAño1;
    private javax.swing.JList<String> lstClase;
    private javax.swing.JList<String> lstClase1;
    private javax.swing.JList<String> lstCosto;
    private javax.swing.JList<String> lstCosto1;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstEditorial1;
    private javax.swing.JList<String> lstEstadisticas;
    private javax.swing.JList<String> lstEstadisticas1;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JList<String> lstLibro1;
    private javax.swing.JList<String> lstPaginas;
    private javax.swing.JList<String> lstPaginas1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl11;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlInicio1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegistro1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo3;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtAño1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtCosto1;
    private javax.swing.JTextArea txtEditoto;
    private javax.swing.JTextArea txtEditoto1;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtLibro1;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtPaginas1;
    // End of variables declaration//GEN-END:variables


}
