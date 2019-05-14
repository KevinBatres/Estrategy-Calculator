/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author kevin
 */
public class code {

    public String[] matriza(int aaa, int bbb, int ccc, int ddd, int aaaa, int bbbb, int cccc, int dddd) {

        int A = aaa;
        int B = bbb;
        int C = ccc;
        int D = ddd;

        int AA = aaaa;
        int BB = bbbb;
        int CC = cccc;
        int DD = dddd;

        String dominante = "";
        String maxmin = "";
        String enash = "";

        //estrategia dominante
        //El jugador 1 equivale al ultimo numero de cada cuadro de la tabla.
        int estrategia1[] = {AA, CC};
        int estrategia2[] = {BB, DD};

        //dominante
        if (AA > BB && CC > DD) {
            dominante = "La estrategia dominante es la No. 1: " + AA + ", " + CC;
        } else {
            if (BB > AA && DD > CC) {
                dominante = "La estrategia dominante es la No. 2: " + BB + ", " + DD;
            } else {
                dominante = "No hay Dominante";
            }
        }

        //Jugador 2 minmax
        //El jugador 2 equivale al numero central de cada cuadro de la tabla
        //obtener MAXIMIN
        int m, min1 = estrategia1[0];
        int n, min2 = estrategia2[0];

        //Estrategia 1
        for (m = 0; m < estrategia1.length; m++) {
            if (min1 > estrategia1[m]) {
                min1 = estrategia1[m];
            }
        }

        //Estrategia 2
        for (n = 0; n < estrategia2.length; n++) {
            if (min2 > estrategia2[n]) {
                min2 = estrategia2[n];
            }
        }

        int[] listmin = {min1, min2};
        int ma, max = listmin[0];

        //max
        for (ma = 0; ma < listmin.length; ma++) {
            if (max < listmin[ma]) {
                max = listmin[ma];
            }
        }

        maxmin = "MAXMIN: " + max;

        //Equilibrio Nash
        int aa[] = {A, AA};
        int bb[] = {B, BB};

        int cc[] = {C, CC};
        int dd[] = {D, DD};

        // estrategia del jugador 1 dn relacion al juego del oponente
        int estrategia01[] = {aa[1], bb[1]};
        int estrategia02[] = {cc[1], dd[1]};

        int estrategia03[] = {aa[0], cc[0]};
        int estrategia04[] = {bb[0], dd[0]};

        String pos1, pos2;
        String pos3, pos4;

        //Jugador 2
        // estrategia 1
        if (aa[1] < bb[1]) {
            System.out.println("El mayor es B: " + bb[1]);
            pos1 = "b";
        } else {
            System.out.println("El mayor es A: " + aa[1]);
            pos1 = "a";
        }

        // estrategia 2
        if (cc[1] < dd[1]) {
            System.out.println("El mayor es D: " + dd[1]);
            pos2 = "d";
        } else {
            System.out.println("El mayor es C: " + cc[1]);
            pos2 = "c";
        }

        //Jugador 1
        // estrategia 1
        if (aa[0] < cc[0]) {
            System.out.println("El mayor es C: " + cc[0]);
            pos3 = "c";
        } else {
            System.out.println("El mayor es A:" + aa[0]);
            pos3 = "a";
        }

        // estrategia 2
        if (bb[0] < dd[0]) {
            System.out.println("El mayor es D: " + dd[0]);
            pos4 = "d";
        } else {
            System.out.println("El mayor es B: " + bb[0]);
            pos4 = "b";
        }

        //arreglo con los mayores de cada estrategia para comparar y encontrar el equilibrio nash
        String j1[] = {pos1, pos2};
        String j2[] = {pos3, pos4};

        //indicador de si exiten equilibrios;
        boolean nash = false;
        //contador de cuantos equilibrio encontro
        int count = 0;

        for (int p = 0; p < j1.length; p++) {
            for (int q = 0; q < j2.length; q++) {
                if (j1[p].equals(j2[q])) {
                    enash = "El equilibrio nash es: " + j1[p];
                    nash = true;
                    count++;
                }
            }
        }

        if (nash) {
            System.out.println("Existe: " + count + " equilibrio nash");
        } else {
            enash = "No hay equilibrio nash";
        }

        String[] respuestas = {dominante, maxmin, enash};
        return respuestas;

    }

    public String[] matrizb(int aaa, int bbb, int ccc, int ddd, int eee, int fff, int ggg, int hhh, int iii, int aaaa, int bbbb, int cccc, int dddd, int eeee, int ffff, int gggg, int hhhh, int iiii) {

        int A = aaa;
        int B = bbb;
        int C = ccc;
        int D = ddd;
        int E = eee;
        int F = fff;
        int G = ggg;
        int H = hhh;
        int I = iii;

        int AA = aaaa;
        int BB = bbbb;
        int CC = cccc;
        int DD = dddd;
        int EE = eeee;
        int FF = ffff;
        int GG = gggg;
        int HH = hhhh;
        int II = iiii;

        String dominante = "";
        String maxmin = "";
        String enash = "";

        //estrategia dominante
        //El jugador 1 equivale al ultimo numero de cada cuadro de la tabla.
        int estrategia1[] = {AA, DD, GG};
        int estrategia2[] = {BB, EE, HH};
        int estrategia3[] = {CC, FF, II};

        if (AA > BB && DD > EE && GG > HH) {
            if (AA > CC && DD > FF && GG > II) {
                dominante = "estrategia1 " + AA + ", " + DD + ", " + GG;
            } else {
                dominante = "Estrategia 3: " + CC + ", " + FF + ", " + II;
            }
        } else {
            if (BB > CC && EE > FF && HH > II) {
                dominante = "Estrategia 2: " + BB + ", " + EE + ", " + HH;
            } else {
                if (CC > BB && FF > EE && II > HH) {
                    dominante = "Estrategia 3: " + CC + ", " + FF + ", " + II;
                } else {
                    dominante = "No hay dominante";
                }
            }
        }
        System.out.println("/n");

        //Jugador 2 minmax
        //El jugador 2 equivale al numero central de cada cuadro de la tabla
        System.out.println("MAXMIN: ");

        //obtener MAXIMIN
        int m, min1 = estrategia1[0];
        int n, min2 = estrategia2[0];
        int o, min3 = estrategia3[0];

        //Estrategia 1
        for (m = 0; m < estrategia1.length; m++) {
            if (min1 > estrategia1[m]) {
                min1 = estrategia1[m];
            }
        }

        //Estrategia 2
        for (n = 0; n < estrategia2.length; n++) {
            if (min2 > estrategia2[n]) {
                min2 = estrategia2[n];
            }
        }

        //Estrategia 3
        for (o = 0; o < estrategia3.length; o++) {
            if (min3 > estrategia3[o]) {
                min3 = estrategia3[o];
            }
        }

        int[] listmin = {min1, min2, min3};
        int ma, max = listmin[0];
        System.out.println(max);

        //max
        for (ma = 0; ma < listmin.length; ma++) {
            if (max < listmin[ma]) {
                max = listmin[ma];
            }
        }
        System.out.println(min1 + " " + min2 + " " + min3);
        maxmin = "MAXMIN: " + max;

        //Equilibrio Nash
        int aa[] = {A, AA};
        int bb[] = {B, BB};
        int cc[] = {C, CC};

        int dd[] = {D, DD};
        int ee[] = {E, EE};
        int ff[] = {F, FF};

        int gg[] = {G, GG};
        int hh[] = {H, HH};
        int ii[] = {I, II};

        // estrategia del jugador 1 dn relacion al juego del oponente
        int estrategia01[] = {aa[1], bb[1], cc[1]};
        int estrategia02[] = {dd[1], ee[1], ff[1]};
        int estrategia03[] = {gg[1], hh[1], ii[1]};

        int estrategia04[] = {aa[0], dd[0], gg[0]};
        int estrategia05[] = {bb[0], ee[0], hh[0]};
        int estrategia06[] = {cc[0], ff[0], ii[0]};

        String pos1, pos2, pos3;
        String pos4, pos5, pos6;

        //Jugador 2
        // estrategia 1
        if (aa[1] < bb[1]) {
            if (bb[1] < cc[1]) {
                System.out.println("El mayor es C: " + cc[1]);
                pos1 = "c";
            } else {
                System.out.println("El mayor es B: " + bb[1]);
                pos1 = "b";
            }
        } else {
            if (aa[1] < cc[1]) {
                System.out.println("El mayor es C: " + cc[1]);
                pos1 = "c";
            } else {
                System.out.println("El mayor es A: " + aa[1]);
                pos1 = "a";
            }
        }

        // estrategia 2
        if (dd[1] < ee[1]) {
            if (ee[1] < ff[1]) {
                System.out.println("El mayor es F: " + ff[1]);
                pos2 = "f";
            } else {
                System.out.println("El mayor es E: " + ee[1]);
                pos2 = "e";
            }
        } else {
            if (dd[1] < ff[1]) {
                System.out.println("El mayor es F: " + ff[1]);
                pos2 = "f";
            } else {
                System.out.println("El mayor es D: " + dd[1]);
                pos2 = "d";
            }
        }

        // estrategia 3
        if (gg[1] < hh[1]) {
            if (hh[1] < ii[1]) {
                System.out.println("El mayor es I: " + ii[1]);
                pos3 = "i";
            } else {
                System.out.println("El mayor es H: " + hh[1]);
                pos3 = "h";
            }
        } else {
            if (gg[1] < ii[1]) {
                System.out.println("El mayor es I: " + ii[1]);
                pos3 = "i";
            } else {
                System.out.println("El mayor es G: " + gg[1]);
                pos3 = "g";
            }
        }

        //Jugador 1
        // estrategia 1
        if (aa[0] < dd[0]) {
            if (dd[0] < gg[0]) {
                System.out.println("El mayor es C: " + gg[0]);
                pos4 = "g";
            } else {
                System.out.println("El mayor es B: " + dd[0]);
                pos4 = "d";
            }
        } else {
            if (aa[0] < gg[0]) {
                System.out.println("El mayor es C: " + gg[0]);
                pos4 = "g";
            } else {
                System.out.println("El mayor es A: " + aa[0]);
                pos4 = "a";
            }
        }

        // estrategia 2
        if (bb[0] < ee[0]) {
            if (ee[0] < hh[0]) {
                System.out.println("El mayor es F: " + hh[0]);
                pos5 = "h";
            } else {
                System.out.println("El mayor es E: " + ee[0]);
                pos5 = "e";
            }
        } else {
            if (bb[0] < ff[0]) {
                System.out.println("El mayor es F: " + hh[0]);
                pos5 = "h";
            } else {
                System.out.println("El mayor es D: " + bb[0]);
                pos5 = "b";
            }
        }

        // estrategia 3
        if (cc[0] < ff[0]) {
            if (ff[0] < ii[0]) {
                System.out.println("El mayor es I: " + ii[0]);
                pos6 = "i";
            } else {
                System.out.println("El mayor es H: " + ff[0]);
                pos6 = "f";
            }
        } else {
            if (cc[0] < ii[0]) {
                System.out.println("El mayor es I: " + ii[0]);
                pos6 = "i";
            } else {
                System.out.println("El mayor es G: " + cc[0]);
                pos6 = "c";
            }
        }

        //arreglo con los mayores de cada estrategia para comparar y encontrar el equilibrio nash
        String j1[] = {pos1, pos2, pos3};
        String j2[] = {pos4, pos5, pos6};

        //indicador de si exiten equilibrios;
        boolean nash = false;
        //contador de cuantos equilibrio encontro
        int count = 0;

        for (int p = 0; p < j1.length; p++) {
            for (int q = 0; q < j2.length; q++) {
                if (j1[p].equals(j2[q])) {
                     enash = "El equilibrio nash es: " + j1[p];
                    nash = true;
                    count++;
                }
            }
        }
        if (nash) {
            System.out.println("Existe: " + count + " equilibrio nash");
        } else {
             enash = "No hay equilibrio nash";
        }

        String[] respuestas = {dominante, maxmin, enash};
        return respuestas;
    }

}
