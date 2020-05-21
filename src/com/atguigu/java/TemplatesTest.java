package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author clp
 * @date 2020/5/21/021-10:29
 *
 * 1.IDEA中代码模板所处的位置： setting - Editor-live Templates-poxtfix completion
 *
 */
public class TemplatesTest {
    //模板六 ： prsf
    private static final int I=0;
    //变形： psf
    public static final int M=0;
    //变形： psfi
    public static final int N=0;
    //变形： psfs
    public static final String P="jjh";
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        int num1= 10;
        System.out.println("hello world!!!");
        //变形： soutp  soutm  soutv  xxx.sout
        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei","lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形： itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四： list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形： list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        //变形： list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list);
        }
        //模板五： ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形 ：xxx.nn  / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }
    }


}
