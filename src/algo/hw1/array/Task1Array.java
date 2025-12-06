package algo.hw1.array;

public class Task1Array {

    public static void main(String[] args) {
        Connection[][] arr = new Connection[6][6];

        Connection connAB = new Connection(1500,90); // a - b
        Connection connAC = new Connection(2000,10); // a - c
        Connection connAD = new Connection(1000,50); // a - d
        Connection connBF = new Connection(1500,60); // b - f
        Connection connCF = new Connection(500,20); // c - F
        Connection connCE = new Connection(900,5); // c - e
        Connection connEF = new Connection(300,85); // e - f
        Connection connED = new Connection(2500,1); // e - d


        /**
         * В массиве для нод a - e предопределены ячейки:
        a - 0, b - 1, c - 2, d - 3, e - 4, f -5
        */

        arr[0][1] = connAB;
        arr[1][0] = connAB;

        arr[0][2] = connAC;
        arr[2][0] = connAC;

        arr[0][3] = connAD;
        arr[3][0] = connAD;

        arr[1][5] = connBF;
        arr[5][1] = connBF;

        arr[2][5] = connCF;
        arr[5][2] = connCF;

        arr[2][4] = connCE;
        arr[4][2] = connCE;

        arr[4][5] = connEF;
        arr[5][4] = connEF;

        arr[5][3] = connED;
        arr[3][5] = connED;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j] == null) {
                    continue;
                }
                System.out.println(arr[i][j]);
            }
        }
    }

}

