package modulocontabil;

public class Pis implements Impostos {

    private double debito;
    private double credito;

    public Pis(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public double getCredito() {
        return credito;
    }

    @Override
    public double calcular() {
        return (debito - credito) * 0.0165;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }

}
