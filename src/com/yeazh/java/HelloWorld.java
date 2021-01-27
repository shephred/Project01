package com.yeazh.java;

import com.yeazh.bean.Customer;

import java.util.ArrayList;

/**
 * @author shephred
 * @create 2021-01-27-12:03 下午
 */
public class HelloWorld {

//    模板七：prsf
    private static final Customer cust = new Customer();
//   psf
    public static final
//    psfi
    public static final int ;
//    psfs
    public static final String ;




//    模板一：psvm
    public static void main(String[] args) {
        System.out.println("Hello World!!");


        System.out.println("Hello Worl的d!!");
        System.out.println();
//        模板二：sout
        System.out.println("hello");
//        模板三：soutp/soutm/soutv/xxx.sout
        
//        模板四：fori
        String[] arr = new String[]{"tom","lilei","hanmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        模板五：iter
        for (String s : arr) {
            System.out.println(s);
        }
//        模板六：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
//        list.for
        ArrayList list  = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(189);
        list.add(000);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }



    }
    public void method(){
        System.out.println("TemplateTest.method");
//        模板五：ifn
        ArrayList list  = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(189);
        list.add(000);
        if (list == null) {

        }
//        inn
        if (list != null) {

        }
//        xxx.nn    xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
