package com.company;

public class node {

    protected int data;
    protected node next;

    public node(){
        this.data = 0;
        this.next=null;
    }

    public node(int data){
        this.data = data;
        this.next = null;
    }

    public void set_next(node connect)
    {
        this.next = connect;
    }

    public void display(){
        System.out.println(this.data);
    }

}
