/** 
 * <p><strong>Projeto Calculadora</strong></p>
 * 
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração, 
 * multiplicação e divisão, além de um método principal que seleciona a operação 
 * desejada com base em um operador informado pelo usuário.</p>
 * <ul>
 *      <li>Técnicas de revisão estática(Caixa branca)</li>
 *      <li>Técnicas de revisão(Caixa branca)</li>
 *      <li>Aplicação de refatoração em código Java</li>
 *      <li>Documentação com Javadoc</li>
 * </ul>
 *  *<p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 * 
 * @author Murillo Araujo Santana Lucas
 * @version 1.0
*/
package calculadora;

public class Calculadora {

    /**
     * Soma dois números inteiros.
     * 
     * @param a O primeiro operado
     * @param b O segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */

    public int somar(int a, int b) {
        return a + b;
    }

     /**
     * Subtrai dois números inteiros.
     * 
     * @param a O primeiro operado
     * @param b O segundo operando
     * @return o resultado da subtração de {@code a} e {@code b}
     */

    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * 
     * @param a O primeiro operado
     * @param b O segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * 
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     * 
     * <p>Operações aceitos:</p>
     * <ul> 
     *    <li>"+" soma</li>
     *    <li>"-" subtração</li>
     *    <li>"*" multiplicação</li>
     *    <li>"/" divisão</li>
     * </ul>
     * 
     * <p>Qualquer operador inválido resulta em exceção.</p>
     * 
     * @param a O primeiro operado
     * @param b O segundo operando  
     * @param operacao simbolo de operação desejada
     * @return o resultado da operação correspondente ao operador informado{@code a} e {@code b}
     * 
     * @throws IllegalArgumentException se o operador não for um simbolo inválido
     */

    public int calcular(int a, int b, String operacao) {
        return switch (operacao) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b); 
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        };
    }   
}



