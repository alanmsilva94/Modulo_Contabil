package modulocontabil;

import java.util.ArrayList;
import java.util.List;


public class Pagamentos {

    private String empresa;
    List<Impostos> impostos;

    public Pagamentos(String empresa) {
        this.empresa = empresa;
        this.impostos = new ArrayList<>();
    }

    Pagamentos() {
    
    }

    public String getEmpresa() {
        return empresa;
    }

    public List<Impostos> getImpostos() {
        return impostos;
    }

    public void addImposto(Impostos imposto) {
        impostos.add(imposto);
    }

    public void mostrarDetalhes() {
        for (Impostos imposto : impostos) {
            System.out.println("------------------- Detalhes dos impostos -------------------");
            System.out.print("Nome da empresa: "+ getEmpresa() + "\n");
            System.out.printf("Descrição: " + imposto.getDescricao() + "\n");
            System.out.print("Total: R$ " + imposto.calcular() + "\n");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("\n");
        }
    }
}
