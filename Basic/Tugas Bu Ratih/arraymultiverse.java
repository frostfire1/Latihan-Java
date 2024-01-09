public class arraymultiverse {

    public static void main(String[] args) {
        int[][] dua = {{0,1,2,3,4,5,6,7,8,9,10},{,11,12,13,14,15,16,17,18,19,20}};
        int[][][] tiga = {{{0,1,2,3,4,5,6,7,8,9,10}},{{11,12,13,14,14,15,16,17,18,19,20}}};
        System.out.println("2 DIMENSI");
        for(int i = 0; i <= 20; i++){
            if(i <= 10){
                System.out.println(dua[1][i]);
            }
            else{
                System.out.println(dua[2][i]);
            }
        }
        System.out.println("3 DIMENSI");
        for(int i = 0; i <= 20; i++) {
            if (i <= 10) {
                System.out.println(dua[1][1][i]);
            } else {
                System.out.println(dua[1][2][i]);
            }
        }
        }
    }
}