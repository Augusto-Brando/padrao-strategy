package padroescomportamentais.strategy;

public class PrecoCombo implements EstrategiaPreco {
    @Override
    public float calcular(float valorBase, int quantidade) {
        int grupos = quantidade / 3;
        int resto  = quantidade % 3;
        return (grupos * 2 * valorBase) + (resto * valorBase);
    }
}