package com.company;
import java.util.Scanner;

public class Main {

    protected Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        node head = null;
        node tail = null;

        for(int i =0; i<10; ++i)
        {
            if(head == null)
            {
                head = new node(i);
                head.set_next(null);
                tail = head;
            }
            else {
                tail.next = new node(i);
                tail = tail.next;
            }
        }

        //display

        node temp = head;
        while(temp != null)
        {
            temp.display();
            temp = temp.next;
        }


//Array based implementation because wtf.
    /*    node[]array = new node[12];

        for(int i =0; i<10; ++i)
        {
            array[i]= new node(i);
            if(i ==9)
                array[i].set_next(null);
            else
                array[i].set_next(array[i+1]);
        }

        for(int i =0; i<10; ++i)
        {
            array[i].display();
        }
*/

    }
}
