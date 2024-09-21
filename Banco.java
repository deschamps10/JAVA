import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int pass;
        int[] quantidade = new int[4];
        int[] notas = {100, 100, 100, 100};
        int[] nota = {50, 10, 5, 1};
        int variavel = 2000;
        int[] saque = new int[10];
        int r50, r20, r10, r5;
        int[] senha = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1010};
        int[] valor = {2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000};
        String[] id = {"Eduardo", "Erick", "Raul", "Pedro", "Vinicius", "Gustavo", "Kalebe", "Luis", "Golle", "Augusto"};
        String usuario;

        saque[i] = -1;
        while (saque[i] != 0) {
            System.out.print("Digite seu ID: ");
            usuario = scanner.nextLine();

            System.out.print("Digite sua Senha: ");
            pass = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            for (i = 0; i < 10; i++) {
                if (id[i].equals(usuario) && senha[i] == pass) {
                    System.out.println("Seu Saldo: " + valor[i]);
                    System.out.print("Digite o Valor do Saque: ");
                    saque[i] = scanner.nextInt();

                    valor[i] = valor[i] - saque[i];

                    if (saque[i] > 0 && saque[i] < 1000) {
                        for (int k = 0; k < 4; k++) {
                            while (saque[i] >= nota[k] && notas[k] > 0) {
                                quantidade[k] = quantidade[k] + 1;
                                notas[k] = notas[k] - 1;
                                saque[i] = saque[i] - nota[k];
                            }
                        }

                        clearScreen();
                        for (int l = 0; l < 4; l++) {
                            if (quantidade[l] > 0) {
                                System.out.println(quantidade[l] + " notas de B$ " + nota[l] + ",00 bits");
                            }
                        }
                    }

                    if (saque[i] > 1000) {
                        System.out.println("Quantidade para Saque Indisponível");
                    }
                }
            }
            i = i + 1;
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}