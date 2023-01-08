package xo_MiniProjekat;

import java.util.ArrayList;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;

    private String imeXIgraca;
    private String imeOIgraca;
    private Boolean naPotezu = false;

    public ArrayList<String> nizPolja = new ArrayList<String>();

    public String getImeXIgraca() {
        return imeXIgraca;
    }

    public void setImeXIgraca(String imeXIgraca) {
        this.imeXIgraca = imeXIgraca;
    }

    public String getImeOIgraca() {
        return imeOIgraca;
    }

    public void setImeOIgraca(String imeOIgraca) {
        this.imeOIgraca = imeOIgraca;
    }

    public Boolean getNaPotezu() {
        return naPotezu;
    }

    public void pokreniIgru() {

        polje1 = " ";
        polje2 = " ";
        polje3 = " ";
        polje4 = " ";
        polje5 = " ";
        polje6 = " ";
        polje7 = " ";
        polje8 = " ";
        polje9 = " ";
        naPotezu = false;

        nizPolja.add(polje1);
        nizPolja.add(polje2);
        nizPolja.add(polje3);
        nizPolja.add(polje4);
        nizPolja.add(polje5);
        nizPolja.add(polje6);
        nizPolja.add(polje7);
        nizPolja.add(polje8);
        nizPolja.add(polje9);

    }

    public void stampaj() {

        for (int i = 0; i < nizPolja.size(); i++) {
            System.out.print(nizPolja.get(i));
            if (i == 0 || i == 3 || i == 6) {
                System.out.print(" | ");
            }
            if (i == 1 || i == 4 || i == 7) {
                System.out.print(" | ");
            }
            if (i % 3 == 2) {
                System.out.println();
            }
        }
        System.out.println("Igrac X: " + imeXIgraca);
        System.out.println("Igrac O: " + imeOIgraca);

        if (pobednikX()) {
            System.out.println("Cestitamo! Pobednik je igrac " + imeXIgraca);
        }
        if (pobednikO()) {
            System.out.println("Cestitamo! Pobednik je igrac " + imeOIgraca);
        }
        if (popunjenaTabela()) {
            System.out.println("Igra je neresena!");
        }
    }

    public boolean poljePrazno(int brojPolja) {

        for (int i = 0; i < 9; i++) {
            if (nizPolja.get(brojPolja - 1).equals(" ")) {
                return true;
            }
        }
        return false;
    }

    public void odigrajPotez(int brojPolja) {
        if (poljePrazno(brojPolja)) {
            if (!naPotezu) {
                nizPolja.set(brojPolja - 1, "X");

            } else {
                nizPolja.set(brojPolja - 1, "O");
            }
            zameniIgraca();
        } else {
            System.out.println("Potez nije validan");
            System.out.println();
        }
    }

    public void zameniIgraca() {
        if (!naPotezu) {
            naPotezu = true;
        } else {
            naPotezu = false;
        }
    }

    public void koJeNaPotezu() {

        if (!naPotezu) {
            System.out.println("Na potezu je: " + getImeXIgraca());
        } else {
            System.out.println("Na potezu je: " + getImeOIgraca());
        }
    }

    public boolean popunjenaTabela() {

        int brojac = 0;

        for (int i = 0; i < nizPolja.size(); i++) {

            if (nizPolja.get(i).equals("X") || nizPolja.get(i).equals("O")) {
                brojac += 1;
            }
        }
        if (brojac == 9) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pobednikX() {
        if ((nizPolja.get(0).equals("X") && nizPolja.get(1).equals("X") && nizPolja.get(2).equals("X"))
                || (nizPolja.get(3).equals("X") && nizPolja.get(4).equals("X") && nizPolja.get(5).equals("X"))
                || (nizPolja.get(6).equals("X") && nizPolja.get(7).equals("X") && nizPolja.get(8).equals("X"))
                || (nizPolja.get(0).equals("X") && nizPolja.get(3).equals("X") && nizPolja.get(6).equals("X"))
                || (nizPolja.get(1).equals("X") && nizPolja.get(4).equals("X") && nizPolja.get(7).equals("X"))
                || (nizPolja.get(2).equals("X") && nizPolja.get(5).equals("X") && nizPolja.get(8).equals("X"))
                || (nizPolja.get(0).equals("X") && nizPolja.get(4).equals("X") && nizPolja.get(8).equals("X"))
                || (nizPolja.get(2).equals("X") && nizPolja.get(4).equals("X") && nizPolja.get(6).equals("X"))) {
            return true;
        }
        return false;
    }

    public boolean pobednikO() {
        if ((nizPolja.get(0).equals("O") && nizPolja.get(1).equals("O") && nizPolja.get(2).equals("O"))
                || (nizPolja.get(3).equals("O") && nizPolja.get(4).equals("O") && nizPolja.get(5).equals("O"))
                || (nizPolja.get(6).equals("O") && nizPolja.get(7).equals("O") && nizPolja.get(8).equals("O"))
                || (nizPolja.get(0).equals("O") && nizPolja.get(3).equals("O") && nizPolja.get(6).equals("O"))
                || (nizPolja.get(1).equals("O") && nizPolja.get(4).equals("O") && nizPolja.get(7).equals("O"))
                || (nizPolja.get(2).equals("O") && nizPolja.get(5).equals("O") && nizPolja.get(8).equals("O"))
                || (nizPolja.get(0).equals("O") && nizPolja.get(4).equals("O") && nizPolja.get(8).equals("O"))
                || (nizPolja.get(2).equals("O") && nizPolja.get(4).equals("O") && nizPolja.get(6).equals("O"))) {
            return true;
        }
        return false;
    }
}



