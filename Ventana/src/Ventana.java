
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author josem
 */
public class Ventana extends JFrame {

    public JPanel panel;

    public Ventana() {
        setSize(500, 500);// Se establce el tamaño de la panatalla
        setTitle("El mejor titulo");
        //setLocation(100,200); // Se inicializa la posición de la pantalla; se trabaja con pixeles
        //setBounds(100,200,500,500);//setsize y setlocation combinados
        //Para situalr la ventana en el centro de las pontallas se usala setlocationrelaiveto
        setLocationRelativeTo(null);

        //Redimencionamiento de una ventana
        //setResizable(false); //evita que la pantalla se redimensiones con false 
        setMinimumSize(new Dimension(200, 200));//Establece el tamaño minimo que puede tomar la ventana 

        //this.getContentPane().setBackground(Color.blue);//EStablece el color de la ventana
        this.iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        crearPanel();
        //colocarEtiquetas();
        //colocarBotones();
//        colocarRadioBotones();
        //colocarbotonesactivacion();
        //colocarCajaTexto();
        //colocarAreasDeTexto();
//        colocarCasillasVerificacion();
        //colocarListaDesplegable();
        //colocarCampoDeContraseña();
           // colocarTablas();
      colocarLista();     

    }

    private void crearPanel() {
        panel = new JPanel();//Creación de un panel
        //panel.setBackground(Color.green);//Se establece el color del panel
        panel.setLayout(null);//Se desactivan los diseños por defecto del panel
        this.getContentPane().add(panel);// se añade el panel a la ventana

    }

    private void colocarEtiquetas() {
        //Etiquetas
        //JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER);//Se crea una etiqueta de texto con la alineación hacia el centro
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Mundial 2022");//Establecemos el texto de la etiqueta
        etiqueta.setBounds(10, 10, 300, 80);
        //etiqueta.setHorizontalAlignment(SwingConstants.LEFT);//Alineamos el texto hacia la izquierda
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Alinear al centro
        etiqueta.setForeground(Color.BLACK);//eSTABLECE EL COLOR DE LA LETRA A NARANJA
        //etiqueta.setOpaque(true);//Desactivo el diseño por defecto de las etiquetas
        //etiqueta.setBackground(Color.black);//Cambiamos el color de fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black", 0, 40));
        panel.add(etiqueta);

        // Etiqueta 2 - etiqueta tipo imagen
        //JLabel etiqueta2= new JLabel(new ImageIcon("balon.jpg"));//metodo para insertar una imagen en un label
        ImageIcon imagen = new ImageIcon("balon.jpg");
        JLabel etiqueta2 = new JLabel();

        etiqueta2.setBounds(80, 90, 300, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiqueta2);

    }

    private void colocarBotones() {
        //Boton 1 - bontón de texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//Establecemos un texto al boton
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);// Se activa el botón
        boton1.setMnemonic('a');
        //Ajustes del botón
        boton1.setForeground(Color.BLUE);//Establecemos el color de la letra del fondo
        boton1.setFont(new Font("cooper black", 3, 20)); //Se establece la fuente de la letra
        panel.add(boton1);

        //Boton 2 - boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        ImageIcon clicAqui = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));

        boton2.setBackground(Color.BLUE); //Se estaablce el color de fonto del button
        panel.add(boton2);

        //Button 3 para  el manejo de los bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.RED, 3, true));//Tres parametros para el borde, uno es el color, el segundo es para  el espesor del bordo y el tercero es para redondear las esquinas

        panel.add(boton3);

    }

    private void colocarRadioBotones() {
        JRadioButton radioboton1 = new JRadioButton("0pcion 1", true);
        radioboton1.setBounds(50, 100, 200, 50);
        radioboton1.setEnabled(true);
        radioboton1.setText("Programación");
        radioboton1.setFont(new Font("cooper black", 0, 20));

        panel.add(radioboton1);

        JRadioButton radioboton2 = new JRadioButton("0pcion 2", false);
        radioboton2.setBounds(50, 150, 100, 50);
        panel.add(radioboton2);

        JRadioButton radioboton3 = new JRadioButton("0pcion 3", true);
        radioboton3.setBounds(50, 200, 100, 50);
        panel.add(radioboton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioboton1);
        grupoRadioBotones.add(radioboton2);
        grupoRadioBotones.add(radioboton3);

    }

    private void colocarbotonesactivacion() {
        JToggleButton botonActivacion1 = new JToggleButton("opcion 1", true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("opcion 2", false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("opcion 3", false);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);

        ButtonGroup groupBoton = new ButtonGroup();
        groupBoton.add(botonActivacion1);
        groupBoton.add(botonActivacion2);
        groupBoton.add(botonActivacion3);

    }

    private void colocarCajaTexto() {
        JTextField cajatexto = new JTextField();
        cajatexto.setBounds(50, 50, 100, 30);
        cajatexto.setText("Hola");

        System.out.println("Texto en la caja " + cajatexto.getText());
        panel.add(cajatexto);

    }

    private void colocarAreasDeTexto() {
        JTextArea area = new JTextArea();
        area.setBounds(20, 20, 300, 200);
        area.setText("Escriba el texto aquí......");
        area.append("\nEscribe por aqui-.."); //Añadir mas texto al area
        area.setEditable(true);// Editar texto

        System.out.println("El texto es: " + area.getText());
        panel.add(area);

        //Barras de desplazamiento
        JScrollPane barrasDesplazamienot = new JScrollPane(area);
        barrasDesplazamienot.setBounds(20, 20, 300, 200);
        barrasDesplazamienot.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamienot.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasDesplazamienot);

    }

    private void colocarCasillasVerificacion() {
        JCheckBox casillaVerificacion = new JCheckBox("Leche");
        casillaVerificacion.setBounds(20, 20, 100, 40);
        casillaVerificacion.setEnabled(true);

        panel.add(casillaVerificacion);

        JCheckBox casillaVerificacion2 = new JCheckBox("galleta");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);

        JCheckBox casillaVerificacion3 = new JCheckBox("Yogurt");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);

        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal");
        casillaVerificacion4.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion4);

    }

    private void colocarListaDesplegable() {
//        String [] paises ={"Perú","Colombia","Paraguay","Ecuador"};
        //      JComboBox listaDesplegable1= new JComboBox(paises);
        /*    listaDesplegable1.setBounds(20,20,100,30);
        
        listaDesplegable1.addItem("Argentina");
        listaDesplegable1.setSelectedItem("Paraguay");
        panel.add(listaDesplegable1);
        
         */
        Persona persona1 = new Persona("Alejandro Taboada", "Peruano", 21);
        Persona persona2 = new Persona("Tania Bustamente", "Argentina", 20);
        Persona persona3 = new Persona("Karen Bustamente", "Colombia", 20);

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable2 = new JComboBox(modelo);
        listaDesplegable2.setBounds(20, 20, 500, 300);
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        modelo.addElement(persona3);
        listaDesplegable2.setBounds(20, 20, 100, 30);
        panel.add(listaDesplegable2);

    }
    
    private void colocarCampoDeContraseña(){
        JPasswordField campoContraseña= new JPasswordField();
        campoContraseña.setBounds(20,20,150,30);
        campoContraseña.setText("Hola");
        panel.add(campoContraseña);
        String contraseña="";
        
        for (int i = 0; i < campoContraseña.getPassword().length; i++) {
            contraseña += campoContraseña.getPassword()[i];
            
        }
        System.out.println("Contraseña "+contraseña);
        
    }
    
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        
        String [] persona1= {"Alejandro","Peruano","21"};
        String [] persona2= {"Rosa","Mexicana","22"};
        String [] persona3= {"Alejandro","Peruano","21"};
        String [] persona4= {"Rosa","Mexicana","22"};
        String [] persona5= {"Alejandro","Peruano","21"};
        String [] persona6= {"Rosa","Mexicana","22"};
        String [] persona7= {"Alejandro","Peruano","21"};
        String [] persona8= {"Rosa","Mexicana","22"};
        String [] persona9= {"Alejandro","Peruano","21"};
        String [] persona10= {"Rosa","Mexicana","22"};
        String [] persona11= {"Alejandro","Peruano","21"};
        String [] persona12= {"Rosa","Mexicana","22"};
        String [] persona13= {"Alejandro","Peruano","21"};
        String [] persona14= {"Rosa","Mexicana","22"};        
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);
        modelo.addRow(persona14);        
        
        
        
        JTable table = new JTable(modelo);
        
        table.setBounds(20,20,300,200);
        
        panel.add(table);
        
        JScrollPane scroll = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20,20,300,200);
        panel.add(scroll);
        
        
        
        
        
        
    }
    
    private void colocarLista(){
        DefaultListModel modelo=new DefaultListModel();
        
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        modelo.addElement(new Persona("Alejandro Taboada","Peruano",21));
        
        
        
        
        
        JList lista = new JList(modelo);
        lista.setBounds(20,20,200,300);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20,20,200,300);
        panel.add(scroll);
        
        
        
        
        
    }
}
