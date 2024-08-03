    Random randomNumbers = new Random();
    int numero;
    int adivinhanum;
    int contador;
    Scanner input = new Scanner(System.in);

    numero = 1 + randomNumbers.nextInt(100);

    System.out.println("Entre com um Número de 1 até 100");

    int i = 1;
    for (contador = 1; contador <= 5; contador++) {
        System.out.printf("Entre com a tentativa Nº%d: ", i);
        adivinhanum = input.nextInt();
        i++;

        if  (adivinhanum < numero ) System.out.println("Sua Escolha é menor que o Número Sorteado");

        if  (adivinhanum > numero ) System.out.println("Sua Escolha é maior que o Número Sorteado");

        if ( adivinhanum != numero && contador == 5 ) System.out.printf("Sinto muito mas não foi desta vez, o número sorteado foi %d", numero);

        if (adivinhanum == numero ) {
            System.out.println("Parabéns, Você Acertou o Número Sorteado");
            break;
        }
    }
}
