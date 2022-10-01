class Solution {
    String[] train;
    int[][] check;
    
    public int solution(String[] train) {
        int answer = -1;
        this.train = train;
        this.check = new int[train.length][train[0].length()];

        checkRow();
        checkColumn();

        for(int row=0; row<train.length; row++) {
            for(int col=0; col<train[0].length()-1; col++) {
                System.out.println((char)check[row][col]);
                System.out.println((char)check[row][col+1]);
            }
        }
        
        return answer;
    }
    
    private void checkRow() {
        for(int row=0; row<train.length; row++) {
            for(int col=0; col<train[0].length()-1; col++) {
                if(train[row].charAt(col)=='E' && train[row].charAt(col+1)=='W') {
                    check[row][col] = 'E';
                    check[row][col+1] = 'W';
                } 
            }
        }
    }

    private void checkColumn() {
        for(int col=0; col<train.length-1; col++) {
            for(int row=0; row<train[0].length(); row++) {
                if(train[row].charAt(col)=='S' && train[row].charAt(col+1)=='N') {
                    check[col][row] = 'S';
                    check[col][row+1] = 'N';
                }
            }
        }
    }
}
