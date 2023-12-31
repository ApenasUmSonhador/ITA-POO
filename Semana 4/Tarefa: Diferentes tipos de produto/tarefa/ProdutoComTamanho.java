package tarefa;

import java.util.Objects;

class ProdutoComTamanho extends Produto {
    private String tamanho;

    public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ProdutoComTamanho that = (ProdutoComTamanho) o;
        return Objects.equals(tamanho, that.tamanho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
}
