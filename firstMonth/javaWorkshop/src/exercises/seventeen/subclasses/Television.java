package exercises.seventeen.subclasses;

import exercises.seventeen.Electrodomestico;

public class Television extends Electrodomestico {
    protected double resolucion = 20.0;
    protected boolean sintonizadorTDT = false;

    public Television() {
        super();
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        int byResolucion = incrementByResolucion();
        int incrementByTDT = incrementByTDT();
        this.precioBase += byResolucion + incrementByTDT;
    }

    private int incrementByResolucion() {
        final int percentageIncrement = (this.precioBase / 100)  * 30;
        if (this.resolucion > 40) {
            return percentageIncrement;
        }
        return 0;
    }
    private int incrementByTDT() {
        if(this.sintonizadorTDT) {
            return 50;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
