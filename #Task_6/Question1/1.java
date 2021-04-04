package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        Deque<Integer> dq= new ArrayDeque<>();
        ArrayList<Integer> zeroIndex= new ArrayList<>();

        for(int i=0;i<n;i++){
            al.add(scanner.nextInt());
        }
        for(int i=0;i<al.size();i++){
            if(al.get(i)==0){
                zeroIndex.add(i);
            }
        }

        for(int i=1;i<=n;i++){
            if(al.contains(i)==false){
                if(i%2==0){
                    dq.addFirst(i);
                }else{
                    dq.addLast(i);
                }
            }

        }
        for(int i=0;i<zeroIndex.size();i++){
            int k=zeroIndex.get(i);
            if(k==0){
                int k2=al.get(k+1);


                    if(k2%2==0){
                        al.set(k,dq.pollFirst());
                    }else{
                        al.set(k,dq.pollLast());
                    }



            }else if(k==al.size()-1){
                int k2=al.get(k-1);
                if(k2%2==0){
                    al.set(k,dq.pollFirst());
                }else{
                    al.set(k,dq.pollLast());
                }

            }else {


                int k1 = al.get(k - 1);
                int k2 = al.get(k + 1);
                if ((k1 != 0) && (k2 != 0)) {
                    if ((k1 % 2 == 0) && (k2 % 2 == 0)) {
                        al.set(k, dq.pollFirst());
                    }
                    if ((k1 % 2 != 0) && (k2 %2!= 0)) {
                        al.set(k, dq.pollLast());
                    }

                } else {
                    if (k1 == 0) {
                        if (k2 % 2 == 0) {
                            al.set(k, dq.pollFirst());
                        } else {
                            al.set(k, dq.pollLast());

                        }
                    }
                    if (k2 == 0) {
                        if (k1 % 2 == 0) {
                            al.set(k, dq.pollFirst());
                        } else {
                            al.set(k, dq.pollLast());
                        }
                    }

                }
            }
        }

        Iterator iterator=al.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
        }

