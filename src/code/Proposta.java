package code;
public class Proposta {
    float total;
    int numeroParcelas;
    float valorParcela;
    
    public Proposta() {}
    
    public Proposta(float total, int numeroParcelas) {
        this.total = total;
        this.numeroParcelas = numeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return total / numeroParcelas;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    
    
}
