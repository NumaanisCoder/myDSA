class Bitwise{
    public static void main(String[] args) {

//Bitwise Operators

        // OR Operator( NEED ONLY ONE 1)
        System.out.println("OR OF 12 and 7 : "+(12|7)); //15


        //NOT Operator (Inverse 0-> 1, 1-> 0) and then represent in 2's(1's (inverse) then + 1 ) complement
        System.out.println("NOT OF 10 : "+ ~10); // -11

        //AND Operator (Need Both 1 One)
        System.out.println("AND OF 2 and 5 : "+(2 & 5)); //0

        //XOR Operator (Need Only One 1, but not two 1)

        System.out.println("XOR OF 5 and 8 : "+(5^8)); //13




        // # Left Shift Operator
        //It shift digit one by one to left side, effect (double the no. (X 2)) on small no. 
        // but not on big numbers
        //padding always 0

        System.out.println("Left shift of 5 one time : "+ (5<<1)); //10
        System.out.println("Left shift of 5 two time : "+ (5<<2)); //20

        // #Right Shift Operator
        //It shift digit one by one to left side, effect (divide the no. by two (/ 2)). 
        // but not on big numbers

        System.out.println("Right shift  of 10 one time : "+ (10>>1)); //5
        System.out.println("Right shift  of 10 two time : "+ (10>>2)); //2
        System.out.println("Right shift  of 7 one time : "+ (7>>1)); //3

        System.out.println(-10>>3); //-2 in my case
        //it depends upon the compiler what to add padding (0 or 1);

        

    }
}