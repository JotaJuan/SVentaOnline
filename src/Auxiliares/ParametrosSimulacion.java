/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author JuanMa
 */
public class ParametrosSimulacion {

    public void setCantClientes(String cantClientes) {
        this.cantClientes = cantClientes;
    }

    public void setProbEnvioPorCorreo(String probEnvioPorCorreo) {
        this.probEnvioPorCorreo = probEnvioPorCorreo;
    }

    public void setProbConfirmarCompra(String probConfirmarCompra) {
        this.probConfirmarCompra = probConfirmarCompra;
    }

    public void setProbCaida(String probCaida) {
        this.probCaida = probCaida;
    }

    public void setCantProductos(String cantProductos) {
        this.cantProductos = cantProductos;
    }

    public void setCantVendedores(String cantVendedores) {
        this.cantVendedores = cantVendedores;
    }

    public void setVariacionStock(String variacionStock) {
        this.variacionStock = variacionStock;
    }

    public void setProbInfraccion(String probInfraccion) {
        this.probInfraccion = probInfraccion;
    }

    public void setProbAutorizar(String probAutorizar) {
        this.probAutorizar = probAutorizar;
    }
    
    public void guardar(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        /*String ruta = "C:/Users/JuanMa/Documents/NetBeansProjects/SVentaOnline/"
                + "src/Auxiliares/ArchivoConfiguracion.txt";*/
        String ruta = "jar/ArchivoConfiguracion.txt";
        
        try
        {
            fichero = new FileWriter(ruta, false);
            
            pw = new PrintWriter(fichero);          
                        
            pw.println(cantClientes);                
            pw.println(probEnvioPorCorreo);                
            pw.println(probConfirmarCompra);                
            pw.println(probCaida);                
            pw.println(cantProductos);                
            pw.println(cantVendedores);                
            pw.println(variacionStock);                
            pw.println(probInfraccion);                
            pw.println(probAutorizar);             
            pw.println("0");        
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    private String cantClientes;
    private String probEnvioPorCorreo;
    private String probConfirmarCompra;
    private String probCaida;
    private String cantProductos;
    private String cantVendedores;
    private String variacionStock;
    private String probInfraccion;
    private String probAutorizar;
    
}
