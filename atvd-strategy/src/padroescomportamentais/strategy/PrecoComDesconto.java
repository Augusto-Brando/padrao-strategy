package padroescomportamentais.strategy;

public class PrecoComDesconto implements EstrategiaPreco {
    @Override
    public float calcular(float valorBase, int quantidade) {
        return (valorBase * quantidade) * 0.90f;
    }
}