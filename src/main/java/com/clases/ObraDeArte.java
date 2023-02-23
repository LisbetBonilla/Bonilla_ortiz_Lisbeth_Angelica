package main.java.com.clases;

public class ObraDeArte {

    private static final char[] ArrayObras = null;
    private int id;
    private String nombre;
    private String autor;
    private String tecnica;
    private String material;
    private double precio;
    private double altura;
    private double peso;
    private int piezas;
    private String descripcion;

    /* METODOS***************************************** */

    public ObraDeArte(int id, String nombre, String autor, String tecnica, String material, double precio,
            double altura, double peso, int piezas, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tecnica = tecnica;
        this.material = material;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.descripcion = descripcion;
    }

    /* GETTERS************************************ */
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getTecnica() {
        return tecnica;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrecio() {
        return precio;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getPiezas() {
        return piezas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // *SETTERS************************************** */
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Obra [ID = " + id + ", Nombre = " + nombre + ", Autor = " + autor + ", Tecnica = " + tecnica
                + ", Material = " + material + ", Precio = " + precio + ", Altura = " + altura + ", Peso = " + peso
                + ", Piezas =" + piezas + ", Descripcion =" + descripcion + "]";
    }

    public static void ImprimirEtiqueta() {
    }

}