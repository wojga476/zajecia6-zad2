import java.util.Random;

public class MultiArray {

        private int[][] tab;

    public int[][] getTab() {
        return tab;
    }

    public void setTab(int[][] tab) {
        this.tab = tab;
    }

    public MultiArray(int N, int M){
            tab = new int[N][M];
            randomize();
    }

    public void randomize(){

            Random rand = new Random(30);
            for(int i=0;i<tab.length;i++){
                for(int j=0;j<tab[i].length;j++){
                    tab[i][j]=rand.nextInt();
                }
            }
    }

    public int findMin() {
        int wartosc = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (wartosc < tab[i][j]) {
                    wartosc = tab[i][i];
                }
            }
        }return wartosc;
    }
    public int findMax(){
        int wartosc = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (wartosc > tab[i][j]) {
                    wartosc = tab[i][j];
                }
            }
        }return wartosc;
    }
    public void printInfo(){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }}

    }

}
