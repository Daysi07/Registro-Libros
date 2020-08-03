package clases;

public class Libro {

    private String nombre;
    private String editorial;
    private String clase;
    private int año;
    private int paginas;
    private double costo;
    private static int tAnalisisB;
    private static int edito1,edito2,edito3;
    private static int cla1,cla2,cla3;
    private String nombreLibro;
    private String nombreEditorial;
    private String nombreLibroMayorCosto;

    public Libro(String nombre, String editorial, String clase,
            int año, int paginas, double costo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.clase = clase;
        this.año = año;
        this.paginas = paginas;
        this.costo = costo;
        conteos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTAnalisis() {
        return tAnalisisB;
    }

    public  int getEdito1() {
        return edito1;
    }

    public  int getEdito2() {
        return edito2;
    }

    public int getEdito3() {
        return edito3;
    }

    public int getCla1() {
        return cla1;
    }

    public  int getCla2() {
        return cla2;
    }

    public  int getCla3() {
        return cla3;
    }

    void conteos() {
        if (getClase().equals("Analisis")
                && getEditorial().equals("B")) {
            tAnalisisB++;
        }
    }
    void conteo1(){
        if (getClase().equals("Programacion")){
                
            cla1++;
        }else if(getClase().equals("Analisis")){
        cla2++;
    }else if(getClase().equals("Diseño")){
        cla3++;
    } 
    }
        void conteo2(){
        if (getEditorial().equals("A")){
                
            edito1++;
        }else if(getClase().equals("B")){
        edito2++;
    }else if(getClase().equals("C")){
        edito3++;
    } 
    }
}
