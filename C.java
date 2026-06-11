// Lec 41(StringBuffer(Thread Safe) & StringBuilder(Not Thread Safe)):
class A{
    public static void main(String[]args)
    {
        // StringBuffer gives Buffer size of 16Bytes.
        StringBuffer sb = new StringBuffer("Navin");
        // It increases as ( 16+Navin ) and become 21 now.
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        sb.append(" Readdy");
        // System.out.println(sb);

        // System.out.println(sb);
        // String str = sb.toString();     //It will print "Navin Readdy"

        // sb.deleteCharAt(2);
        // System.out.println(sb);

        // sb.insert(0,"Java ");
        // System.out.println(sb);

        //It will give 30 space after Navin Readdy.
        // sb.setLength(30);
        // System.out.println(sb);

        sb.ensureCapacity(1000);
        System.out.println(sb);
    }
}