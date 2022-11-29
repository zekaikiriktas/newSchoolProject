package day32maps.newokulproje;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lise extends Okul {

    static Lise lise1;
    public Lise(String adSoyad, Long newTc, int sinif) {
        super(adSoyad, newTc, sinif);
    }

    public static Lise newLise(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("New Lise Student Create/Affairs Page");
        System.out.println("Adı soyadı");
        String newAd=input1.nextLine();
        System.out.println("Tc si");
        Long newTcsi=input1.nextLong();
        System.out.println("Sınıfı");
        int newSinif=input1.nextInt();
        lise1=new Lise(newAd,newTcsi,newSinif);
        return lise1;
    }
    public static void listLise() {
        System.out.println("High Student List");
        Set<Map.Entry<Integer, Lise>> entries = hashMapLise.entrySet();
        Iterator<Map.Entry<Integer, Lise>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Lise> next = iterator.next();
            System.out.print("No  =" + next.getKey() + "  ");
            System.out.println(next.getValue());

        }
    }
    public static void liseUpdate(){
        System.out.println("Update istediğiniz öğrencinin numarasını giriniz");
        int studentNoUpdate = input.nextInt();
        if (liseNumaralariSet1.contains(studentNoUpdate)) {
            System.out.println("Update student process page ");
            hashMapLise.put(studentNoUpdate, Lise.newLise());
            Lise ogrenci1 = hashMapLise.get(studentNoUpdate);
            System.out.println("\n-----Updeted------" + ogrenci1);
        }
    }
    public static void liseSerach(){
        System.out.println("Aramak istediğiniz öğrencinin numarasını giriniz");
        int studentNo = input.nextInt();
        if (liseNumaralariSet1.contains(studentNo)) {
            Lise ogrenci = hashMapLise.get(studentNo);
            System.out.println(ogrenci);
        }
    }
    public static void liseDelete(){
        System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz");
        int studentNoDelete = input.nextInt();
        if (liseNumaralariSet1.contains(studentNoDelete)) {
            Lise ogrenci = hashMapLise.get(studentNoDelete);
            System.out.println("\n-----Deleted------"+ogrenci);
            hashMapLise.remove(studentNoDelete);
        }
    }


}
