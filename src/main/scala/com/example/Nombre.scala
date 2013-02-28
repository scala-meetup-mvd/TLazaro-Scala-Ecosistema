package com.example

class Nombre (var nombre: String)

class Apodo (_nombre: String, _apellido: String, var apodo: String) extends Apellido(_nombre, _apellido) {
  override def toString() = s"$nombre $getApellido conocido como $apodo"
}