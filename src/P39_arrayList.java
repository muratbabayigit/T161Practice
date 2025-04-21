import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P39_arrayList {
    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list=new ArrayList<>(Arrays.asList("Ali","Veli","Ayşe","Fatma","Ömer"));

        List<String> newList=new ArrayList<>();

        for (String each:list  ) {
            if (!each.toLowerCase().contains("a")){
                newList.add(each);
            }

        }
        System.out.println(list);
        System.out.println(newList);




    }
}
