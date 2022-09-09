package Sprint5;

public class Practice2findShortestWord {
    public static void main(String[] args) {
        String[] words={"Jo","Bob","Mark","Sujay","J"};
        Practice2findShortestWord ad=new Practice2findShortestWord();
        String shortestW=ad.ShortestWord(words);
        System.out.println(shortestW);
    }
    public String ShortestWord(String[] w)
    {
        String shrtW=w[0];
        for(int i=0;i<w.length;i++)
        {
            if(shrtW.length()>w[i].length())
            {
                shrtW=w[i];
            }
        }
        return shrtW;
    }
}
