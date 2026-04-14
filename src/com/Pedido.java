package com;

public class Pedido {

    private String cliente;
    private String producto;
    private String total;
    private String correo;

    // constructor
    public Pedido(String cliente, String producto, String total, String correo) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.correo = correo;
    }

    public Pedido (){
        
    }

// getters
    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public String getTotal() {
        return total;
    }

    public String getCorreo() {
        return correo;
    }

    //setters
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    
}

