package com.sergio.libreria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    File file;
    Scanner sc;
    PrintWriter pw;
    ArrayList<Libros> libro = new ArrayList();
    
    public void engadir() throws FileNotFoundException{
        file = new File("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\Boletin20\\files\\library.txt");
        try{
        pw = new PrintWriter(file);
        String titulo = JOptionPane.showInputDialog("Titulo");
        String autor = JOptionPane.showInputDialog("Autor");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio"));
        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades"));
        
       libro.add(new Libros(titulo, autor, precio, unidades)); 
       pw.println(titulo+autor+precio+unidades);
        }catch(FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }catch(IOException ex1) {
            System.out.println("Error");
        } finally{
            pw.close();
        }
    }
    
    public void visualizar(){
        String linea;
        String[] lista = new String[4];
        Libros li;
        Scanner sc = null;
        
        try{
            sc = new Scanner(new File("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\Boletin20\\files\\library.txt"));
            
            while(sc.hasNextLine()){
                linea = sc.nextLine();
                lista = new String[4];
                lista = linea.split(",");
                li = new Libros(lista[0], lista[1], Integer.parseInt(lista[2]), Integer.parseInt(lista[3]));
                System.out.println(li);
        }
        
    }catch (FileNotFoundException ex){
            System.out.println("erro1" + ex.getMessage());
    }
        sc.close();
    }






}
