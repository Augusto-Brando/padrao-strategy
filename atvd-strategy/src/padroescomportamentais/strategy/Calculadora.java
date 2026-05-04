package padroescomportamentais.strategy;

public class Calculadora {
    private float valorBase;
    private int quantidade;

    public Calculadora(float valorBase, int quantidade) {
        this.valorBase = valorBase;
        this.quantidade = quantidade;
    }

    public float calcular(EstrategiaPreco estrategia) {
        return estrategia.calcular(valorBase, quantidade);
    }
}