package day32maps.newokulproje;

import day32maps.hashcityproject.City;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IlkOkul extends Okul{

    static IlkOkul ilkOkul1;


    public IlkOkul(String adSoyad, Long newTc, int sinif) {
        super(adSoyad, newTc, sinif);
    }

    public static IlkOkul newIlkokul(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("New Student Create Page");
        System.out.println("Adı soyadı");
        String newAd=input1.nextLine();
        System.out.println("Tc si");
        Long newTcsi=input1.nextLong();
        System.out.println("Sınıfı");
        int newSinif=input1.nextInt();
        ilkOkul1=new IlkOkul(newAd,newTcsi,newSinif);
        return ilkOkul1;
    }
    public static void listIlk() {
        System.out.println("Primary student listesi");
        Set<Map.Entry<Integer, IlkOkul>> entries = hashMapIlkokul.entrySet();
        Iterator<Map.Entry<Integer, IlkOkul>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, IlkOkul> next = iterator.next();
            System.out.print("No  =" + next.getKey() + "  ");
            System.out.println(next.getValue());

        }
    }
    public static void ilkUpdate(){
        System.out.println("Update istediğiniz öğrencinin numarasını giriniz");
        int studentNoUpdate = input.nextInt();
        if (ilkokulNumaralariSet1.contains(studentNoUpdate)) {
            System.out.println("Update student process page ");
            hashMapIlkokul.put(studentNoUpdate, IlkOkul.newIlkokul());
            IlkOkul ogrenci1 = hashMapIlkokul.get(studentNoUpdate);
            System.out.println("\n-----Updeted------" + ogrenci1);
        }
    }
    public static void IlkSerach(){
        System.out.println("Aramak istediğiniz öğrencinin numarasını giriniz");
        int studentNo = input.nextInt();
        if (ilkokulNumaralariSet1.contains(studentNo)) {
            IlkOkul ogrenci = hashMapIlkokul.get(studentNo);
            System.out.println(ogrenci);
        }
    }
        public static void ilkDelete(){
        System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz");
        int studentNoDelete = input.nextInt();
        if (ilkokulNumaralariSet1.contains(studentNoDelete)) {
            IlkOkul ogrenci = hashMapIlkokul.get(studentNoDelete);
            System.out.println("\n-----Deleted------"+ogrenci);
            hashMapIlkokul.remove(studentNoDelete);
        }
    }

}
