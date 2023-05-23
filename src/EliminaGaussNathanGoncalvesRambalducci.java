import java.util.Scanner;

public class EliminaGaussNathanGoncalvesRambalducci {

    public static void main(String[] args) {

        // Linha, Coluna
        float OneOne;
        float OneTwo;
        float OneThree;
        float TwoOne;
        float TwoTwo;
        float TwoThree;
        float ThreeOne;
        float ThreeTwo;
        float ThreeThree;
        float bOne;
        float bTwo;
        float bThree;

        float pivo1;
        float pivo2;
        float pivo3;

        Scanner input = new Scanner(System.in);

        System.out.println("Número para 1,1");
        OneOne = input.nextFloat();

        System.out.println("Número para 1,2");
        OneTwo = input.nextFloat();

        System.out.println("Número para 1,3");
        OneThree = input.nextFloat();

        System.out.println("Número para 2,1");
        TwoOne = input.nextFloat();

        System.out.println("Número para 2,2");
        TwoTwo = input.nextFloat();

        System.out.println("Número para 2,3");
        TwoThree = input.nextFloat();

        System.out.println("Número para 3,1");
        ThreeOne = input.nextFloat();

        System.out.println("Número para 3,2");
        ThreeTwo = input.nextFloat();

        System.out.println("Número para 3,3");
        ThreeThree = input.nextFloat();

        System.out.println("Número para B 1");
        bOne = input.nextFloat();

        System.out.println("Número para B 2");
        bTwo = input.nextFloat();

        System.out.println("Número para B 3");
        bThree = input.nextFloat();

        //TODO: Colocar a quarta coluna no codigo que eu esqueci

        //Primeiro de tudo, eliminar os número da 1 coluna debaixo da diagonal principal


        // Encontre o primeiro pivo na primeira coluna(Valor não nulo)

        if (OneOne != 0) {
            pivo1 = OneOne;
        } else if (TwoOne != 0) {
            pivo1 = TwoOne;
        } else if (ThreeOne != 0) {
            pivo1 = ThreeOne;
        } else {
            pivo1 = 0;
        }

        // e inverte os sinais da coluna inteira agora

        OneOne = -OneOne;
        TwoOne = -TwoOne;
        ThreeOne = -ThreeOne;


        // troque a 2ª linha com a 1ª

        float OneOnecopy = OneOne;
        float OneTwocopy = OneTwo;
        float OneThreecopy = OneThree;
        float TwoOnecopy = TwoOne;
        float TwoTwoCopy =

        TwoOne = OneOnecopy;
        OneOne = TwoOnecopy;

        OneOnecopy = OneOne;
        TwoOnecopy = TwoOne;

        // Multiplique a 1ª linha por pelo primeiro número da 2 linha

        OneOne = OneOne * TwoOne;
        OneTwo = OneTwo * TwoOne;
        OneThree = OneThree * TwoOne;

        // Subtraia a 1ª linha pela 2ª linha

        TwoOne = -OneOne + TwoOne;
        TwoTwo = -OneTwo + TwoTwo;
        TwoThree = -OneThree + TwoThree;

        // e recupere-a primeira linha

        OneOne = OneOnecopy;
        OneTwo = OneTwocopy;
        OneThree = OneThreecopy;

        //Multiplique a 1ª linha por pelo primeiro número da 3 linha

        OneOne = OneOne * ThreeOne;
        OneTwo = OneTwo * ThreeOne;
        OneThree = OneThree * ThreeOne;


        //Subtraia a 1ª linha pela 3ª linha

        ThreeOne = -OneOne + ThreeOne;
        ThreeTwo = -OneTwo + ThreeTwo;
        ThreeThree = -OneThree + ThreeThree;

        // e recupere-a primeira linha

        OneOne = OneOnecopy;
        OneTwo = OneTwocopy;
        OneThree = OneThreecopy;

        //Faça o pivô na 2ª coluna dividindo a 2ª linha pelo numero do pivo

        if (OneTwo != 0) {
            pivo2 = OneTwo;
        } else if (TwoTwo != 0) {
            pivo2 = TwoTwo;
        } else if (ThreeTwo != 0) {
            pivo2 = ThreeTwo;
        } else {
            pivo2 = 0;
        }

        //Multiplique a 2ª linha pelo 2 numero da primeira linha e Segunda coluna

        TwoOne = TwoOne * OneTwo;
        TwoTwo = TwoTwo * OneTwo;
        TwoThree = TwoThree * OneTwo;

        //Subtraia a 2ª linha pela 1ª linha e recupere-a

        OneOne = -TwoOne + OneOne;
        OneTwo = -TwoTwo + OneTwo;
        OneThree = -TwoThree + OneThree;

        // e recupere-a segunda linha

        //Multiplique a 2ª linha por 10

        //Faça o pivô na 3ª coluna dividindo a 3ª linha por 11/7

        //Multiplique a 3ª linha por -11/7

        //Subtraia a 3ª linha pela 1ª linha e recupere-a

        //Multiplique a 3ª linha por 1/7

        // Subtraia a 3ª linha pela 2ª linha e recupere-a















        System.out.println("X1 = " + bOne);
        System.out.println("X2 = " + bTwo);
        System.out.println("X3 = " + bThree);

    }
}
