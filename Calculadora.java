import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        float result;
        float nmr1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um Número: "));
        float nmr2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um Número: "));

        String menu = JOptionPane.showInputDialog(null, "1- Adição \n 2- Subtração \n 3- Divisão \n 4- Multiplicação");
        int escolha = Integer.parseInt(menu);

        switch (escolha) {
            case 1:
                result = nmr1 + nmr2;
                JOptionPane.showMessageDialog(null, "O resultado da adição foi: " + result);
                break;
            case 2:
                result = nmr1 - nmr2;
                JOptionPane.showMessageDialog(null, "O resultado da subtração foi: " + result);
                break;
            case 3:
                if (nmr2 != 0) {
                    result = nmr1 / nmr2;
                    JOptionPane.showMessageDialog(null, "O resultado da divisão foi: " + result);
                } else {
                    JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                }
                break;
            case 4:
                result = nmr1 * nmr2;
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação foi: " + result);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}