
package boletin7.pkg6;

import javax.swing.JOptionPane;

public class Almacen {
    
     private int productos;
public Almacen() {
}
public Almacen(int productos) {
this.productos = productos;
}
public void almacen(int productos) {
if (productos <=100) {
JOptionPane.showMessageDialog(null, "artigo de consumo baixo");
} else if (productos > 100 && productos <= 500) {
JOptionPane.showMessageDialog(null, "artigo de consumo medio");
} else if (productos > 500 && productos <= 1000) {
JOptionPane.showMessageDialog(null, "artigo de consumo alto");
} else {
JOptionPane.showMessageDialog(null, "artigo de consumo de primeira necesidade");
}
}
}

