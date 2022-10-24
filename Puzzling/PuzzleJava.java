import java.util.Random;
public class PuzzleJava{
    private Random randMachine = new Random();
    public int[] getTenRolls(){
        int[] randArray = new int[10];
        for(int i=0;i<randArray.length;i++){
            int temp = randMachine.nextInt(20)+1;
            randArray[i]=temp;
        }
        return randArray;
    }
    public char getRandomLetter(){
        char[] lettersArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int randInt=randMachine.nextInt(26);
        return lettersArr[randInt];
    }
    public String generatePassword(){
        return generatePasswordSet(8);
    }
    public String generatePasswordSet(int n){
        String randPass="";
        for(int i=0;i<n;i++){
            randPass+=getRandomLetter();
        }
        return randPass;
    }

}