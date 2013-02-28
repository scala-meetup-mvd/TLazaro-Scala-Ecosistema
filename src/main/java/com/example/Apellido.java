package com.example;

class Apellido extends Nombre {
    protected String apellido;
    public Apellido(String nombre, String apellido) {
        super(nombre);
        this.apellido = apellido;
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
}
