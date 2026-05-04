package padroescomportamentais.strategy;

public class PrecoPromocional implements EstrategiaPreco {
    @Override
    public float calcular(float valorBase, int quantidade) {
        return (valorBase * quantidade) / 2;
    }
}