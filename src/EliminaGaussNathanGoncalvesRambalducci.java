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
        // Coluna, Linha
        float bOne;
        float bTwo;
        float bThree;
        // Pivo
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

        float bOneCopy = bOne;
        float bTwoCopy = bTwo;
        bOne = bTwoCopy;
        bTwo = bOneCopy;
        bOneCopy = bOne;
        bTwoCopy = bTwo;

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
        float TwoTwoCopy = TwoTwo;

        TwoOne = OneOnecopy;
        OneOne = TwoOnecopy;

        OneOnecopy = OneOne;
        TwoOnecopy = TwoOne;

        // Multiplique a 1ª linha por pelo primeiro número da 2 linha

        OneOne = OneOne * TwoOne;
        OneTwo = OneTwo * TwoOne;
        OneThree = OneThree * TwoOne;
        bOne = bOne * TwoOne;

        // Subtraia a 1ª linha pela 2ª linha

        TwoOne = -OneOne + TwoOne;
        TwoTwo = -OneTwo + TwoTwo;
        TwoThree = -OneThree + TwoThree;
        bTwo = -bOne + bTwo;

        // e recupere-a primeira linha

        OneOne = OneOnecopy;
        OneTwo = OneTwocopy;
        OneThree = OneThreecopy;

        //Multiplique a 1ª linha por pelo primeiro número da 3 linha

        OneOne = OneOne * ThreeOne;
        OneTwo = OneTwo * ThreeOne;
        OneThree = OneThree * ThreeOne;
        bOne = bOne * ThreeOne;


        //Subtraia a 1ª linha pela 3ª linha

        ThreeOne = -OneOne + ThreeOne;
        ThreeTwo = -OneTwo + ThreeTwo;
        ThreeThree = -OneThree + ThreeThree;
        bThree = -bOne + bThree;

        // e recupere-a primeira linha

        OneOne = OneOnecopy;
        OneTwo = OneTwocopy;
        OneThree = OneThreecopy;

        //Faça o pivô na 2ª coluna dividindo a 2ª linha pelo numero do pivo

        if (TwoOne != 0) {
            pivo2 = TwoOne;
        } else if (TwoTwo != 0) {
            pivo2 = TwoTwo;
        } else if (TwoThree != 0) {
            pivo2 = TwoThree;
        } else {
            pivo2 = 0;
        }

        TwoOne = TwoOne / pivo2;
        TwoTwo = TwoTwo / pivo2;
        TwoThree = TwoThree / pivo2;
        bTwo = bTwo / pivo2;

        //Multiplique a 2ª linha pelo 2 numero da primeira linha e Segunda coluna

        TwoOne = TwoOne * OneTwo;
        TwoTwo = TwoTwo * OneTwo;
        TwoThree = TwoThree * OneTwo;
        bTwo = bTwo * OneTwo;

        //Subtraia a 2ª linha pela 1ª linha

        OneOne = -TwoOne + OneOne;
        OneTwo = -TwoTwo + OneTwo;
        OneThree = -TwoThree + OneThree;
        bOne = -bTwo + bOne;

        // e recupere-a segunda linha

        TwoOne = 0;

        //Multiplique a 2ª linha pelo numero da segunda coluna da 3 linha

        TwoOne = TwoOne * ThreeTwo;
        TwoTwo = TwoTwo * ThreeTwo;
        TwoThree = TwoThree * ThreeTwo;
        bTwo = bTwo * ThreeTwo;

        //Faça o pivô na 3ª coluna dividindo a 3ª linha pelo numero da terceira coluna da terceira linha

        if (ThreeOne != 0) {
            pivo3 = ThreeOne;
        } else if (ThreeTwo != 0) {
            pivo3 = ThreeTwo;
        } else if (ThreeThree != 0) {
            pivo3 = ThreeThree;
        } else {
            pivo3 = 0;
        }

        ThreeThree = ThreeThree / pivo3;

        //Multiplique a 3ª linha pelo numero da terceira coluna da terceira linha

        ThreeOne = ThreeOne * ThreeThree;
        ThreeTwo = ThreeTwo * ThreeThree;
        ThreeThree = ThreeThree * ThreeThree;
        bThree = bThree * ThreeThree;

        //Subtraia a 3ª linha pela 1ª linha e recupere-a

        OneOne = -ThreeOne + OneOne;
        OneTwo = -ThreeTwo + OneTwo;
        OneThree = -ThreeThree + OneThree;
        bOne = -bThree + bOne;

        ThreeOne = 0;
        ThreeTwo = 0;
        ThreeThree = 1;

        //Multiplique a 3ª linha pelo numero da terceira coluna da segunda linha

        ThreeThree = ThreeThree * TwoThree;
        bThree = bThree * TwoThree;

        // Subtraia a 3ª linha pela 2ª linha e recupere-a

        TwoThree = -ThreeThree + TwoThree;
        bTwo = -bThree + bTwo;

        ThreeThree = 1;

        System.out.println("X1 = " + bOne);
        System.out.println("X2 = " + bTwo);
        System.out.println("X3 = " + bThree);

    }
}
