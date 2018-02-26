package boletin20;

import com.sergio.libreria.Metodos;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Boletin20 {

    public static void main(String[] args) throws FileNotFoundException {
        Metodos M1 = new Metodos();
        File file = new File("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\Boletin20\\files\\library.txt");
        int op;
    
    do{
    op=Integer.parseInt(JOptionPane.showInputDialog("***MENÚ***\n"
                                                        + "1. Añadir\n"
                                                        + "2. Visualizar\n"
                                                        + "3. Consultar\n"
                                                        + "4. Modificar Precio\n"
                                                        + "5. Eliminar Sen unidades\n"
                                                        + "6. Salir"));
    
    switch(op){
        
        case 1: M1.añadir();
                break;
        
        case 2: M1.visualizar();
                break;
        case 3: M1.consultar();
                break;
        case 4: M1.ModificarPrecio();
                break;
        case 5: M1.eliminarSenUnidades();
                break;
        case 6: System.exit(0);
                break;
        
    }
}while(op<7);
     
    }
}
