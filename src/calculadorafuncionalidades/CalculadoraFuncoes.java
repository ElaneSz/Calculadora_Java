package calculadorafuncionalidades;

/**
 *
 * @author selan
 */
public class CalculadoraFuncoes {
    private Integer total;
    private String soma = "SOMA";
    private String subtracao = "SUBTRACAO";
    private String divisao = "DIVISAO";
    private String multiplicacao = "MULTIPLICACAO";
    private String resto = "RESTO";
    
    public CalculadoraFuncoes(){
        total = 0;
    }

    
    public Integer realizaCalculo(String operacao, Integer valor){
        if (operacao.equals(soma)){
            total = total + valor;
        } else if (operacao.equals(subtracao)){
            if ( total != 0 ){
                total = total - valor;
            } else {
                total = valor - total;
            }
        } else if (operacao.equals(divisao)){
            if ( total != 0 ){
                total = total / valor;
            } else {
                total = valor;
            }
        } else if (operacao.equals(multiplicacao)){
            if ( total == 0 ){
                total = 1;
                total = total * valor;
            } else {
                total = total * valor;
            }
        } else if ( operacao.equals(resto) ){
            if ( total != 0 ){
                total = total % valor;
            } else {
                total = valor;
            }
        }
        
        return total;
    }
    
    public Integer getTotal(){
        return this.total;
    }
    
    public void zerarTotal(){
        total = 0;
    }
}
