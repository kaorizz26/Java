package forDailyCommit;

public class commit {
    public static void main(String[] args) {
        
        String[][] crushes = {
            {"Sandra", "Smiley", "Zahra"}, 
            {"Bianca", "Dessirre", "Minseon"},
            {"Ginalyn", "Michaela", "Lourelie"}
        };

        for (int i = 0; i < crushes.length; i++) {
            for (int j = 0; j < crushes[i].length; j++) {
                System.out.print(crushes[i][j]+" ");
            }
            System.out.println();
        }
    }
}

