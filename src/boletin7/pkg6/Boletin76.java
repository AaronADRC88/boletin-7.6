
package boletin7.pkg6;

import javax.swing.JOptionPane;

public class Boletin76 {

    public static void main(String[] args) {
      int productos;
Almacen obx=new Almacen();
String aux=JOptionPane.showInputDialog("Teclea o numero de vendas anuais");
productos=Integer.parseInt(aux);
obx.almacen(productos);
}
    }
    
