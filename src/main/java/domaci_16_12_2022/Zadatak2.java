package domaci_16_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5.
//        iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//        prvi nacin
//        for (int i = 0; i < 5; i++) {
//            System.out.println("_ _ _ _ _");
//
//        }
        for (int i = 0; i < 25; i++) {
            System.out.print("_" + " ");
            if(i%5 == 4){
                System.out.println();
            }

        }
    }
}
