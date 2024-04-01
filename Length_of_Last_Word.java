public class Length_of_Last_Word 
{
    public static int lengthOfLastWord(String s) 
    {
        String a[] = s.split("\\s");
        String last = a[a.length -1 ];
        return last.length();
    } 
    public static void main(String[] args) 
    {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
