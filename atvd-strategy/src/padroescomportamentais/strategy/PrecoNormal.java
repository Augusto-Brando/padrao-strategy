package padroescomportamentais.strategy;

public class PrecoNormal implements EstrategiaPreco {
    @Override
    public float calcular(float valorBase, int quantidade) {
        return valorBase * quantidade;
    }
}