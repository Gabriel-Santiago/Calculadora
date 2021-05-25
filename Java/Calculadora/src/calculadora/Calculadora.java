package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws Exception {
        
        int op;
        
        Scanner input = new Scanner(System.in);
        
            System.out.println("------------------ BEM VINDO ------------------");

        do{
            System.out.println("Escolha uma das operações:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz");
            System.out.println("7 - Logaritmo");
            System.out.println("8 - Fatorial");
            System.out.println("9 - Seno");
            System.out.println("10 - Cosseno");
            System.out.println("11 - Tangente");
            System.out.println("12 - Seno Hiperbólico");
            System.out.println("13 - Cosseno Hiperbólico");
            System.out.println("14 - Tangente Hiperbólica");
            System.out.println("15 - Cossecante");
            System.out.println("16 - Secante");
            System.out.println("17 - Cotangente");
            System.out.println("18 - Cossecante Hiperbólica");
            System.out.println("19 - Secante Hiperbólica");
            System.out.println("20 - Cotangente Hiperbólica");

            int opcao = input.nextInt();

            switch(opcao){

                case 1 -> {
                    System.out.println("Digite o primeiro número");
                    float sum = input.nextFloat();
                    System.out.println("Digite o segundo número");
                    float soma = input.nextFloat();

                    System.out.printf("\nResultado:\n");
                    System.out.printf("%f + %f = %f", sum, soma, (sum + soma));
                    break;
                }

                case 2 -> {
                    System.out.println("Digite o primeiro número");
                    float sub = input.nextFloat();
                    System.out.println("Digite o segundo número");
                    float subt = input.nextFloat();

                    System.out.printf("\nResultado:\n");
                    System.out.printf("%f - %f = %f", sub, subt, (sub - subt));
                    break;
                }

                case 3 -> {
                    System.out.println("Digite o primeiro número");
                    float mul = input.nextFloat();
                    System.out.println("Digite o segundo número");
                    float mult = input.nextFloat();

                    System.out.printf("\nResultado:\n");
                    System.out.printf("%f * %f = %f", mul, mult, (mul * mult));
                    break;
                }

                case 4 -> {
                    System.out.println("Digite o primeiro número");
                    float div = input.nextFloat();
                    System.out.println("Digite o segundo número");
                    float divi = input.nextFloat();

                    if(divi == 0){
                        System.out.println("Não pode dividir um número por 0");
                        break;
                    }else{
                        System.out.printf("\nResultado:\n");
                        System.out.printf("%f / %f = %.3f", div, divi, (div / divi));
                    }
                    break;
                }

                case 5 -> {
                    System.out.println("Digite o número");
                    float po = input.nextFloat();
                    System.out.println("O número anterior vai ser elevado a");
                    float pot = input.nextFloat();

                    System.out.printf("\nResultado:\n");
                    System.out.printf("%f ^ %f = %f", po, pot, Math.pow(po, pot));
                    break;
                }

                case 6 -> {
                    System.out.println("Digite o número / radicando");
                    float raiz = input.nextFloat();
                    System.out.println("Digite o valor do índice");
                    float raiz2 = input.nextFloat();

                    System.out.printf("\nResultado:\n");
                    System.out.printf("%f",Math.pow(raiz, 1.0/raiz2));
                    break;
                }

                case 7 -> {
                    System.out.println("Digite o primeiro número");
                    int log = input.nextInt();
                    System.out.println("Digite a base do log");
                    int base = input.nextInt();

                    double resultado = Math.log(log) / Math.log(base);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Log de " + "%d = %.3f", log, resultado);
                    break;
                }

                case 8 -> {
                    System.out.println("Digite o número");
                    double fat = input.nextDouble();

                    if(fat == 1 || fat == 0){
                        System.out.printf("O fatorial de %.0f é 1", fat);
                    }else if(fat < 0){
                        System.out.println("Não existe fatorial de número negativo!");
                    }else{
                        int i;
                        double fatorial = 1;

                        for(i = 1; i <= fat; i++){
                            fatorial *= i;
                        }    
                        System.out.printf("Fatorial de " + "%.0f = %.0f", fat, fatorial);  
                    }
                    break;
                }

                case 9 -> {
                    System.out.println("Digite o valor do seno em graus");
                    int seno = input.nextInt();

                    double valor1 = seno * (Math.PI/180);
                    double valor2 = Math.sin(valor1);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Seno de " + "%d° = %.3f", seno, valor2);
                    break;
                }

                case 10 -> {
                    System.out.println("Digite o valor do cosseno em graus");
                    int cosseno = input.nextInt();

                    double value1 = cosseno * (Math.PI/180);
                    double value2 = Math.cos(value1);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Cosseno de " + "%d° = %.3f", cosseno, value2);
                    break;
                }

                case 11 -> {
                    System.out.println("Digite o valor da tangente em graus");
                    int tan = input.nextInt();

                    double wert1 = tan * (Math.PI/180);
                    double wert2 = Math.tan(wert1);


                    System.out.printf("\nResultado:\n");
                    System.out.printf("Tangente de " + "%d° = %.3f", tan, wert2);
                    break;
                }

                case 12 -> {
                    System.out.println("Digite o valor do seno hiperbólico em graus");
                    int senoh = input.nextInt();

                    double valor3 = senoh * (Math.PI/180);
                    double valor4 = Math.sinh(valor3);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Seno hiperbólico de " + "%d° = %.3f", senoh, valor4);
                    break;
                }

                case 13 -> {
                    System.out.println("Digite o valor do cosseno hiperbólico em graus");
                    int cossenoh = input.nextInt();

                    double value3 = cossenoh * (Math.PI/180);
                    double value4 = Math.cosh(value3);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Cosseno hiperbólico de " + "%d° = %.3f", cossenoh, value4);
                    break;
                }

                case 14 -> {
                    System.out.println("Digite o valor da tangente hiperbólica em graus");
                    int tanh = input.nextInt();

                    double wert3 = tanh * (Math.PI/180);
                    double wert4 = Math.tanh(wert3);


                    System.out.printf("\nResultado:\n");
                    System.out.printf("Tangente hiperbólica de " + "%d° = %.3f", tanh, wert4);
                    break;
                }    

                case 15 -> {
                    System.out.println("Digite o valor da cossecante em graus");
                    int cossecante = input.nextInt();

                    double valor5 = cossecante * (Math.PI/180);
                    double valor6 = 1 / Math.sin(valor5);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Cossecante de " + "%d° = %.3f", cossecante, valor6);
                    break;
                }

                case 16 -> {
                    System.out.println("Digite o valor do secante em graus");
                    int secante = input.nextInt();

                    double value5 = secante * (Math.PI/180);
                    double value6 = 1 / Math.cos(value5);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Secante de " + "%d° = %.3f", secante, value6);
                    break;
                }

                case 17 -> {
                    System.out.println("Digite o valor da cotangente em graus");
                    int cotan = input.nextInt();

                    double wert5 = cotan * (Math.PI/180);
                    double wert6 = 1 / Math.tan(wert5);


                    System.out.printf("\nResultado:\n");
                    System.out.printf("Cotangente de " + "%d° = %.3f", cotan, wert6);
                    break;
                }    

                case 18 -> {
                    System.out.println("Digite o valor da cossecante hiperbólico em graus");
                    int cossecanteh = input.nextInt();

                    double valor7 = cossecanteh * (Math.PI/180);
                    double valor8 = 1 / Math.sinh(valor7);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Cossecante hiperbólico de " + "%d° = %.3f", cossecanteh, valor8);
                    break;
                }

                case 19 -> {
                    System.out.println("Digite o valor da secante hiperbólico em graus");
                    int secanteh = input.nextInt();

                    double value7 = secanteh * (Math.PI/180);
                    double value8 = 1 / Math.cosh(value7);

                    System.out.printf("\nResultado:\n");
                    System.out.printf("Secante hiperbólico de " + "%d° = %.3f", secanteh, value8);
                    break;
                }

                case 20 -> {
                    System.out.println("Digite o valor da cotangente hiperbólica em graus");
                    int cotanh = input.nextInt();

                    double wert7 = cotanh * (Math.PI/180);
                    double wert8 = 1 / Math.tanh(wert7);


                    System.out.printf("\nResultado:\n");
                    System.out.printf("Cotangente hiperbólica de " + "%d° = %.3f", cotanh, wert8);
                    break;
                }     

                default -> throw new Exception("Entrada inválida");
            }

            System.out.println("\nDeseja realizar outro cálculo?" + "\n 21 - Sim \n 0 - Não\n");
            op = input.nextInt();
        }
        while(op == 21);
        System.exit(0);
    }
}
