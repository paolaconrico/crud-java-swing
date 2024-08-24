
package Logica;

public class Usuario {
    private String nombreC, rut, genero, correo, direccion, situacion ;
    private int edad,porcentaje;
    private float examen;
    private int id;
    public Usuario() {
        this.id = 0;

    }
   
    public Usuario( String nombreC, String rut, String genero, String correo, String direccion, String situacion, int edad, float examen, int porcentaje) {
        this();
        this.nombreC = nombreC;
        this.rut = rut;
        this.genero = genero;
        this.correo = correo;
        this.direccion = direccion;
        this.situacion = situacion;
        this.edad = edad;
        this.examen = examen;
        this.porcentaje = porcentaje;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getExamen() {
        return examen;
    }

    public void setExamen(float examen) {
        this.examen = examen;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    
    public String getDatos() {
        return "Usuario:" + "nombre Completo=" + nombreC + ", rut=" + rut + ", genero=" + genero + ", correo=" + correo + ", direccion=" + direccion + ", situacion=" + situacion + ", edad=" + edad + ", resultados del examen=" + examen + ", porcentaje del registro social=" + porcentaje  + '}';
    }

    public void setId() {
    }


    
    
}
    

    

    

