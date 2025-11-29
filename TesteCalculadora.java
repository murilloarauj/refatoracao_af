/**
 * <p><strong>Projeto TesteCalculadora</strong></p>
 * 
 * <p>Esta classe testa os métodos da classe Calculadora, verificando se as operações
 * matemáticas básicas estão funcionando corretamente.</p>
 * 
 * <ul>
 *     <li>Testes unitários para operações matemáticas</li>
 *     <li>Verificação de exceções para operações inválidas</li>
 * </ul>
 * <p>Esse projeto complementa o projeto Calculadora, que foi refatorado para melhorar a legibilidade
 * e facilitar os testes unitários de cada operação</p>
 * 
 * @author Murillo Araujo Santana Lucas 
 * @version 1.0
 */

package calculadora;

/**
 * Classe de teste para a Calculadora
 */

public class TesteCalculadora {

    /**
     * Método principal para executar os testes da Calculadora e,
     * operadores básicos: +, -, *, /.
     * @throws IllegalArgumentException se uma operação inválida for informada e 
     * se houver tentativa de divisão por zero
     */
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.calcular(10, 5, "+")); // Saída: 15
        System.out.println(calc.calcular(10, 5, "-")); // Saída: 5
        System.out.println(calc.calcular(10, 5, "*")); // Saída: 50
        System.out.println(calc.calcular(10, 5, "/")); // Saída: 2.0

        /**
         * Testes de exceção
         * Divisão por zero e operação inválida
         */
        try {
            System.out.println(calc.calcular(10, 5, "/")); // execeção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(10, 5, "x")); // execeção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
