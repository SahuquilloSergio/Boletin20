package com.sergio.libreria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {

    File file;
    Scanner sc;
    FileWriter escribir;
    String linea;

    File fichero = new File("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\Boletin20\\files\\library.txt");
    ArrayList<Libro> libros = new ArrayList();
    String lista[] = new String[4];

    public Metodos() {
        try {
            sc = new Scanner(fichero);
            while (sc.hasNext()) {
                linea = sc.next();
                lista = linea.split(",");
//                Libro l=new Libro(lista[0], lista[1], Integer.parseInt(lista[2], Integer.parseInt([3]));
//                libros.add(l);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error en la lectura del fichero");
        } finally {
            sc.close();
        }
    }

    public void añadir() {
        Libro l = new Libro(JOptionPane.showInputDialog("Inserte Titulo"),
                JOptionPane.showInputDialog("Inserte Autor"),
                Integer.parseInt(JOptionPane.showInputDialog("Inserte Precio")),
                Integer.parseInt(JOptionPane.showInputDialog("Inserte Unidades")));
        libros.add(l);

        try {
            escribir = new FileWriter(fichero);
            for (Libro element : libros) {
                escribir.write(element.getTitulo() + ", " + element.getAutor() + ",  " + element.getPrecio() + ", " + element.getUnidades());
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error a l escriir en el fichero");
        }
    }

    public void visualizar() {
        String todos = "";

        for (Libro element : libros) {
            todos = todos + element.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, todos);
        todos = null;
    }
    
    
    public void ModificarPrecio() {
        boolean var = false;

        String nombre = JOptionPane.showInputDialog("Inserte Titulo");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Inserte Nuevo Precio"));

        for (Libro element : libros) {
            if (nombre.equals(element.getTitulo())) {
                element.setPrecio(precio);
                var = true;
            }
        }

    }

    public void consultar() {

        boolean var = false;
        int precio = 0;

        String nombre = JOptionPane.showInputDialog("Inserte Titulo");

        for (Libro element : libros) {
            if (nombre.equals(element.getTitulo())) {
                precio = (int) element.getPrecio();
                var = true;
            }
        }

        if (var == false) {
            JOptionPane.showMessageDialog(null, "Libro no disponible");
        } else {
            JOptionPane.showMessageDialog(null, precio);
        }
    }
    
    public void eliminarSenUnidades(){        
        Iterator<Libro> it = libros.iterator();
        while(it.hasNext()){
            if(it.next().getUnidades()==0){
                it.remove();
            }
        }
        JOptionPane.showMessageDialog(null,"Libros sen unidades eliminados");
    }


}
