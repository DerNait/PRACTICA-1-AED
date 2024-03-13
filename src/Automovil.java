public class Automovil {
    // Atributos de la clase
    private String marca;
    private int modelo;
    private String linea;
    private double precio;
    private String placa;

    // Constructor de la clase
    public Automovil(String marca, int modelo, String linea, double precio, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.precio = precio;
        this.placa = placa;
    }

    // Métodos 'get' y 'set' para cada atributo
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Línea: " + linea +
                ", Precio: $" + precio +
                ", Placa: " + placa;
    }
}
