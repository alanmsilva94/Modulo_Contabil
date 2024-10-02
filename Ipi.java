package modulocontabil;

public class Ipi implements Impostos {

    private double aliquota;
    private double valor_produto;
    private double frete;
    private double seguro;
    private double outras_despesas;

    public Ipi(double aliquota, double valor_produto, double frete, double seguro, double outras_despesas) {
        this.aliquota = aliquota;
        this.valor_produto = valor_produto;
        this.frete = frete;
        this.seguro = seguro;
        this.outras_despesas = outras_despesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public double getFrete() {
        return frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public double getOutras_despesas() {
        return outras_despesas;
    }

    @Override
    public double calcular() {
        double calculo = valor_produto + frete + seguro + outras_despesas;
        return calculo * (aliquota / 100);
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }

}
