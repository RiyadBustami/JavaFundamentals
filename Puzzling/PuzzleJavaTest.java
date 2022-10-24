public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava puzzle = new PuzzleJava();
        int[] randArr= puzzle.getTenRolls();
        for(int i=0;i<randArr.length;i++){
            System.out.println(randArr[i]);

        }

        System.out.println(puzzle.getRandomLetter());

        System.out.println(puzzle.generatePassword());
        
        System.out.println(puzzle.generatePasswordSet(10));
    }
}