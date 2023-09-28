import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeComprasApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaDeCompras = new ArrayList<>();

        while (true) {
            System.out.println("===== Aplicativo de Lista de Compras =====");
            System.out.println("1. Adicionar item à lista");
            System.out.println("2. Remover item da lista");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine(); // Limpa o buffer do Enter
                    System.out.print("Digite o item a ser adicionado: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("'" + item + "' foi adicionado à lista de compras.");
                    break;
                case 2:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista de compras está vazia.");
                    } else {
                        System.out.println("Lista de compras atual: ");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                        System.out.print("Digite o número do item a ser removido: ");
                        int itemIndex = scanner.nextInt();
                        if (itemIndex >= 1 && itemIndex <= listaDeCompras.size()) {
                            String removedItem = listaDeCompras.remove(itemIndex - 1);
                            System.out.println("'" + removedItem + "' foi removido da lista de compras.");
                        } else {
                            System.out.println("Número de item inválido.");
                        }
                    }
                    break;
                case 3:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista de compras está vazia.");
                    } else {
                        System.out.println("Lista de compras atual: ");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do aplicativo de Lista de Compras. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

