package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.addFirst(3);
        System.out.println(ll);

        ArrayList<Integer> ll2=new ArrayList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        for(int i=0;i<ll2.size();i++){
            System.out.println(ll2.get(i));
        }

        HashSet<Emp> e=new HashSet<>();
        e.add(new Emp("Dee","GET",20344));
        e.add(new Emp("Dee","GET",20344));
        e.add(new Emp("akhil","GET",20346));
        System.out.println();
        System.out.println(e.size());

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set.size());
    }
}