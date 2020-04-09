/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab07;


import java.util.ArrayList;
import java.util.Random;
import LeviThompsonLab07.IntegerModifier;
        
/**
 *
 * @author levi.thompson
 */
public class Utils {

    /*
    1. write a static method like the one we did in class. call it "repeat" it
    should take 2 parameters, (1) an instance of any type and (2) an int of the
    number of times to repeat said element in an arraylist.
     */
   
    public static <T> ArrayList<T> repeat(T input, int numberOfRepeats) {
       //creates an arraylist that uses a generic type
       ArrayList<T> ls = new ArrayList();
       
       /*
       a for loop to put the input into the arraylist however many times 
       necessary; in other words, until i is no longer less than 
       numberOfRepeats
       */
       for (int i = 0; i < numberOfRepeats; i++) {
           ls.add(input);
       }
       
       return ls;
   }

    /*
    2. Write a function called indexedOutput that takes an ArrayList of any type
    and RETURNS a two line string where the first line is the index of each
    element.
     */
     
    public static <T> String indexedOutput(ArrayList<T> ls) {
        /*
        a for loop that prints two strings: the first being the index, which
        is i, and the second string being the element at the index.
        */ 
        for (int i = 0;i < ls.size(); i++) {
             System.out.println("The index is: " + i);
             System.out.println("The element is: " + ls.get(i));
         }
         return "";
     }

    /*
    3. A few steps for this one. Similar to the modify integer functionality we
    did in class.
    (1) create a single method interface called IntegerModifier with a method
    called modify. I think you know what the types should be.
    (2) Write a function called modifyIntegerXTimes. This function should return
    the integer result and take 3 arguments in this order: the modifying function,
    the number of times to apply it, the starting integer to modify.
    (3) Write a function called modifyIntegerXTimesTester with at least 5 asserts
    an assert statement has the form:
       assert <booleanExp> : "text describing what failed"
    It will throw a runtime error if the expression evaluates to false AND YOU
    HAVE ASSERTIONS TURNED ON. SEE HERE:
    (https://wiki.openoffice.org/wiki/NetBeans_Tips_and_Tricks#Assertions)
    Here is one you can use:
         assert modifyIntegerXTimes(x -> x + 1, 5, -1) == 4 : "+1 modify test failed";
     */
     
     public static int modifyIntegerXTimes(IntegerModifier modify, 
             Integer numberOfTimes, Integer startingNumber){
         
         /*
         creating an integer object that will store 0
         */
         Integer finalResult = 0;
         /*
         a for loop that uses modify to do a function for however many times is
         is needed
         */
         for (int i = 0; i < numberOfTimes; i++) {
             finalResult = modify.modify(startingNumber);
             
         }
         
         return finalResult;
     }
     

     public static void modifyIntegerXTimesTester() {
         /*
         group of assert statements that check if math is true or false
         */
         assert modifyIntegerXTimes(x -> x + 1, 5, -1) == 4 : "+1 modify "
                 + "test failed"; 
         assert modifyIntegerXTimes(x -> x - 1, 10, 10) == 0 : "-1 modify "
                 + "test failed";
         assert modifyIntegerXTimes(x -> x * 2, 5, 1) == 32 : "*2 modify "
                 + "test failed";
         assert modifyIntegerXTimes(x -> x + 5, 3, 1) == 16 : "+5 modify "
                 + "test failed";
         assert modifyIntegerXTimes(x -> x - 5, 3, 25) == 10 : "-5 modify "
                 + "test failed";
     }
     
     

    /*
    4. Write a function called checkInvolutence
    (see https://en.wikipedia.org/wiki/Involution_(mathematics))
    In short, an involutive function is its own inverse. aka:
    f(f(x)) == x.
    The simplest example is probably the boolean not function. Applying it twice,
    you always end up with what you started with.
    not(not(x)) == x.

    Now, it's not possible (in the general case) to check all possible inputs,
    but we want to be able to check a lot of them. Let me help illustrate the
    issue. We might have a function like: f(x)=x*0. Well if we test it on zero,
    aka x=0, it looks involutive: 0 == (0*0) * 0. However, when we test it on
    literally anything else, it's not the case. For example, x = 1:
       1 != (1*0) * 0.

    So we want to check many inputs, not just one. But how can we check many
    inputs if we want this involutive checker to have a chance at giving correct
    answers? solution: checkInvolutence will take 2 arguements: (1) The function
    which is being checked (you'll need to create a generic interface for this.
    Hint: are we interested in functions that return a different type than they
    take in?) and (2) a function that generates random instances of said type.

    Here's an example call to checkInvolutence for Integers (note your checkInvolutence
    function must work for any typed function, not just Integers or just numbers!
      checkInvolutence((Integer x) -> x + 0, () -> new Random().nextInt());
    //equals true

    Hint 2: You will need to create an interface for each arguement in
    checkInvolutence.
     */
   

  

}
