package padroescomportamentais.strategy;

public class Pedido {
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void calcularPrecoNormal(float valorBase, int quantidade) {
        Calculadora calculadora = new Calculadora(valorBase, quantidade);
        this.preco = calculadora.calcular(new PrecoNormal());
    }

    public void calcularPrecoComDesconto(float valorBase, int quantidade) {
        Calculadora calculadora = new Calculadora(valorBase, quantidade);
        this.preco = calculadora.calcular(new PrecoComDesconto());
    }

    public void calcularPrecoCombo(float valorBase, int quantidade) {
        Calculadora calculadora = new Calculadora(valorBase, quantidade);
        this.preco = calculadora.calcular(new PrecoCombo());
    }

    public void calcularPrecoComTaxaEntrega(float valorBase, int quantidade) {
        Calculadora calculadora = new Calculadora(valorBase, quantidade);
        this.preco = calculadora.calcular(new PrecoComTaxaEntrega());
    }

    public void calcularPrecoPromocional(float valorBase, int quantidade) {
        Calculadora calculadora = new Calculadora(valorBase, quantidade);
        this.preco = calculadora.calcular(new PrecoPromocional());
    }
}