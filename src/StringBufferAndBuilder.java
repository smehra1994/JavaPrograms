
public class StringBufferAndBuilder {
    public static void main(String[] args)
    {
        String str = "Geeks";
 
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
 
        // conversion from String object to StringBuilder
        StringBuilder sbl = new StringBuilder(str);
        sbl.append("ForGeeks");
        System.out.println(sbl);
    }
}
//Both are used to make string mutable but SBuilder is more preffered due to its non thread safe nature