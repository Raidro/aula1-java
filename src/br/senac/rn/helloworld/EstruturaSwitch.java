package br.senac.rn.helloworld;

public class EstruturaSwitch {

    public static void main(String[] args) {

        Character letra = 'a';

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal!");
                break;
            default:
                System.out.println("Não é vogal!");
        }

    }
}
