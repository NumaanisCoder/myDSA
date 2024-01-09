public class IncrementAndDecrement {
    public static void main(String[] args) {

        //# POST-INCREMENT - first assigned then increment
        int a = 11;
        int b = (++a) + (++a) + (a++) ;
        // System.out.println(a); // 6
        // System.out.println(b); // 5

        int i = 10;
        int j = (i++) + (i++);  
        // System.out.println(i); // first (i++) => 11, second (i++) => 12 (up)
        // System.out.println(j); // first (i++) => 10 and second (i++) => 11 => 10 + 11 => 21


        // # PRE-INCREMENT - first increment then assigned

        int c  = 10;
        int d = ++c;
        // System.out.println(c); // ++c  => 11
        // System.out.println(d); // ++c => first increment then assigned

        int p = 10;
        int q  = (++p) + (++p); 

        // System.out.println(p); // first (++p) => 11, second (++p) => 12 (up)
        // System.out.println(q); //first (++p) => 11 and second (++p) => 12 => 11 + 12 => 23


        int first = 13;
        int second = ++first;
        int result = (++first) + (second++) + (++first);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(result);



    }
}
