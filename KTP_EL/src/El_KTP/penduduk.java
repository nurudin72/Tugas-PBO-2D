/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package El_KTP;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author nurudinhasbullah
 */
public class penduduk {
   public static void main(String[] args) {
        ArrayList<HashMap<String, data>> data1 = new ArrayList<>();
        
        //DataPenduduk RT01
        HashMap<String, data> rt1 = new HashMap<>();
        rt1.put("201611", new data("Adi      ", "Frozenland", "16/03/1993", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt1.put("201612", new data("Samsul   ", "Frozenland", "11/11/1993", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt1.put("201613", new data("Johanes  ", "Frozenland", "12/12/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Mulyadi  ", "Frozenland", "15/07/1992", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Paijo    ", "Frozenland", "12/08/1994", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt1.put("201615", new data("Paiman   ", "Frozenland", "19/04/1994", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt1);
        
        //Data Penduduk RT02
        HashMap<String, El_KTP.data> rt2 = new HashMap<>();
        rt2.put("202611", new El_KTP.data("Muhammad ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202612", new El_KTP.data("Sudirman ", "Frozenland", "12/04/1991", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt2.put("202613", new El_KTP.data("Yolanda  ", "Frozenland", "18/05/1998", "Perempuan", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Meloadi  ", "Frozenland", "26/04/1995", "Perempuan", "B ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Pairan   ", "Frozenland", "26/07/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202615", new El_KTP.data("Paimo    ", "Frozenland", "15/02/1989", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt2);

        //Data Penduduk RT03
        HashMap<String, El_KTP.data> rt3 = new HashMap<>();
        rt3.put("203616", new data("Pardi S  ", "Frozenland", "16/08/1997", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt3.put("203617", new data("Susi     ", "Frozenland", "12/02/1992", "Perempuan", "O ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt3.put("203618", new data("Purwati  ", "Frozenland", "18/01/1996", "Perempuan", "A ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt3.put("203619", new data("Megawati ", "Frozenland", "14/05/1998", "Perempuan", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt3.put("203620", new data("Astuti   ", "Frozenland", "15/01/1993", "Perempuan", "O ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt3);

        //Data Penduduk RT04
        HashMap<String, El_KTP.data> rt4 = new HashMap<>();
        rt4.put("204616", new El_KTP.data("Sumanto  ", "Frozenland", "26/08/1998", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt4.put("204617", new El_KTP.data("Mulyaning", "Frozenland", "27/01/1996", "Perempuan", "O ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt4.put("204618", new El_KTP.data("Mesmi    ", "Frozenland", "12/09/1995", "Perempuan", "A ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt4.put("204619", new El_KTP.data("Yuli     ", "Frozenland", "17/02/1997", "Perempuan", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt4.put("204620", new El_KTP.data("Sisi     ", "Frozenland", "11/05/1992", "Perempuan", "O ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt4);
        
        // assalamualaikum pak galih,
        // maaf pak, disini ada kesalahan pak. untuk Data Penduduk RT 01 - RT 04 itu sebenarnya kerjaan cicilia lidya rani
        // tapi teman saya tadi fitria sifatul ulya yang unamenya WIN 8.1 kurang mengerti pak,
        // fitria tadi megira kalau kodingan dia sama seperti kodingan cicil
        // jadi kodingannya cicil dihapus sama dia pak, dan diganti kodingannya dia,
        // bapak bisa lihat di https://github.com/nurudin72/Tugas-PBO-2D/commits/master kalau cicilia sudah mengerjakan
        // terus kerjaannya dihapus secara tidak sengaja pak, karena tadi ada kesalahpahaman.
        // saya mau menghubungi yang teman-teman yang lain, tapi sepertinya mereka sudah tidur
        // maka dari itu saya post ulang untuk kodingannya cicilia pak..
        // saya mohon maaf harus bilang ke bapak lewat sini, karena saya tidak tau harus menghubungi bapak lewat mana.
        // mohon pengertiannya pak. wassalamualaikum..
        
       //Data Penduduk RT11 
        HashMap<String, data> rt11 = new HashMap<>();
        rt11.put("201611", new data("Slamet   ", "Frozenland", "16/03/1993", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt11.put("201612", new data("Pandu    ", "Frozenland", "11/11/1993", "Laki-Laki", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt11.put("201613", new data("Jatmiko  ", "Frozenland", "12/12/1998", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt11.put("201614", new data("Mingun   ", "Frozenland", "15/07/1992", "Laki-Laki", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt11.put("201614", new data("Wiro S   ", "Frozenland", "12/08/1994", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt11.put("201615", new data("Bima     ", "Frozenland", "19/04/1994", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt11);
         
        //Data Penduduk RT22 
        HashMap<String, El_KTP.data> rt22 = new HashMap<>();
        rt22.put("202611", new El_KTP.data("Misran   ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt22.put("202612", new El_KTP.data("Parmon   ", "Frozenland", "12/04/1991", "Laki-Laki", "B ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt22.put("202613", new El_KTP.data("Aisyah   ", "Frozenland", "18/05/1998", "Perempuan", "AB", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt22.put("202614", new El_KTP.data("Sudirman ", "Frozenland", "26/04/1995", "Perempuan", "B ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt22.put("202614", new El_KTP.data("Agung    ", "Frozenland", "26/07/1998", "Laki-Laki", "AB", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt22.put("202615", new El_KTP.data("Marijan  ", "Frozenland", "15/02/1989", "Laki-Laki", "AB", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt22);

        //Data Penduduk RT33
        HashMap<String, El_KTP.data> rt33 = new HashMap<>();
        rt33.put("203616", new data("Juadi    ", "Frozenland", "16/08/1997", "Laki-Laki", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt33.put("203617", new data("Irma     ", "Frozenland", "12/02/1992", "Perempuan", "O ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt33.put("203618", new data("Rani     ", "Frozenland", "18/01/1996", "Perempuan", "A ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt33.put("203619", new data("Jami     ", "Frozenland", "14/05/1998", "Perempuan", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt33.put("203620", new data("Wahyu    ", "Frozenland", "15/01/1993", "Perempuan", "O ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt33);

        //Data Penduduk RT44
        HashMap<String, El_KTP.data> rt44 = new HashMap<>();
        rt44.put("204616", new El_KTP.data("Tarno    ", "Frozenland", "26/08/1998", "Laki-Laki", "B ", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt44.put("204617", new El_KTP.data("Sumi     ", "Frozenland", "27/01/1996", "Perempuan", "O ", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt44.put("204618", new El_KTP.data("Isna     ", "Frozenland", "12/09/1995", "Perempuan", "A ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt44.put("204619", new El_KTP.data("Tutik    ", "Frozenland", "17/02/1997", "Perempuan", "B ", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt44.put("204620", new El_KTP.data("Yani     ", "Frozenland", "11/05/1992", "Perempuan", "O ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt44);
        
        System.out.println("Data Penduduk Desa Konoha RT 01 :");
        System.out.println(data1.get(0).get("201611").nama + " " + data1.get(0).get("201611").tmpL + " " + data1.get(0).get("201611").tglL + " " + data1.get(0).get("201611").jenKel + " " + data1.get(0).get("201611").golDar + " " + data1.get(0).get("201611").rt + " " + data1.get(0).get("201611").desa + " " + data1.get(0).get("201611").agama + " " + data1.get(0).get("201611").statusK + " " + data1.get(0).get("201611").kerja + " " + data1.get(0).get("201611").negara + " " + data1.get(0).get("201611").msLaku);
        System.out.println(data1.get(0).get("201612").nama + " " + data1.get(0).get("201612").tmpL + " " + data1.get(0).get("201612").tglL + " " + data1.get(0).get("201612").jenKel + " " + data1.get(0).get("201612").golDar + " " + data1.get(0).get("201612").rt + " " + data1.get(0).get("201612").desa + " " + data1.get(0).get("201612").agama + " " + data1.get(0).get("201612").statusK + " " + data1.get(0).get("201612").kerja + " " + data1.get(0).get("201612").negara + " " + data1.get(0).get("201612").msLaku);
        System.out.println(data1.get(0).get("201613").nama + " " + data1.get(0).get("201613").tmpL + " " + data1.get(0).get("201613").tglL + " " + data1.get(0).get("201613").jenKel + " " + data1.get(0).get("201613").golDar + " " + data1.get(0).get("201613").rt + " " + data1.get(0).get("201613").desa + " " + data1.get(0).get("201613").agama + " " + data1.get(0).get("201613").statusK + " " + data1.get(0).get("201613").kerja + " " + data1.get(0).get("201613").negara + " " + data1.get(0).get("201613").msLaku);
        System.out.println(data1.get(0).get("201614").nama + " " + data1.get(0).get("201614").tmpL + " " + data1.get(0).get("201614").tglL + " " + data1.get(0).get("201614").jenKel + " " + data1.get(0).get("201614").golDar + " " + data1.get(0).get("201614").rt + " " + data1.get(0).get("201614").desa + " " + data1.get(0).get("201614").agama + " " + data1.get(0).get("201614").statusK + " " + data1.get(0).get("201614").kerja + " " + data1.get(0).get("201614").negara + " " + data1.get(0).get("201614").msLaku);
        System.out.println(data1.get(0).get("201615").nama + " " + data1.get(0).get("201615").tmpL + " " + data1.get(0).get("201615").tglL + " " + data1.get(0).get("201615").jenKel + " " + data1.get(0).get("201615").golDar + " " + data1.get(0).get("201615").rt + " " + data1.get(0).get("201615").desa + " " + data1.get(0).get("201615").agama + " " + data1.get(0).get("201615").statusK + " " + data1.get(0).get("201615").kerja + " " + data1.get(0).get("201615").negara + " " + data1.get(0).get("201615").msLaku);

        System.out.println("Data Penduduk Desa Konoha RT 02 :");
        System.out.println(data1.get(1).get("202611").nama + " " + data1.get(1).get("202611").tmpL + " " + data1.get(1).get("202611").tglL + " " + data1.get(1).get("202611").jenKel + " " + data1.get(1).get("202611").golDar + " " + data1.get(1).get("202611").rt + " " + data1.get(1).get("202611").desa + " " + data1.get(1).get("202611").agama + " " + data1.get(1).get("202611").statusK + " " + data1.get(1).get("202611").kerja + " " + data1.get(1).get("202611").negara + " " + data1.get(1).get("202611").msLaku);
        System.out.println(data1.get(1).get("202612").nama + " " + data1.get(1).get("202612").tmpL + " " + data1.get(1).get("202612").tglL + " " + data1.get(1).get("202612").jenKel + " " + data1.get(1).get("202612").golDar + " " + data1.get(1).get("202612").rt + " " + data1.get(1).get("202612").desa + " " + data1.get(1).get("202612").agama + " " + data1.get(1).get("202612").statusK + " " + data1.get(1).get("202612").kerja + " " + data1.get(1).get("202612").negara + " " + data1.get(1).get("202612").msLaku);
        System.out.println(data1.get(1).get("202613").nama + " " + data1.get(1).get("202613").tmpL + " " + data1.get(1).get("202613").tglL + " " + data1.get(1).get("202613").jenKel + " " + data1.get(1).get("202613").golDar + " " + data1.get(1).get("202613").rt + " " + data1.get(1).get("202613").desa + " " + data1.get(1).get("202613").agama + " " + data1.get(1).get("202613").statusK + " " + data1.get(1).get("202613").kerja + " " + data1.get(1).get("202613").negara + " " + data1.get(1).get("202613").msLaku);
        System.out.println(data1.get(1).get("202614").nama + " " + data1.get(1).get("202614").tmpL + " " + data1.get(1).get("202614").tglL + " " + data1.get(1).get("202614").jenKel + " " + data1.get(1).get("202614").golDar + " " + data1.get(1).get("202614").rt + " " + data1.get(1).get("202614").desa + " " + data1.get(1).get("202614").agama + " " + data1.get(1).get("202614").statusK + " " + data1.get(1).get("202614").kerja + " " + data1.get(1).get("202614").negara + " " + data1.get(1).get("202614").msLaku);
        System.out.println(data1.get(1).get("202615").nama + " " + data1.get(1).get("202615").tmpL + " " + data1.get(1).get("202615").tglL + " " + data1.get(1).get("202615").jenKel + " " + data1.get(1).get("202615").golDar + " " + data1.get(1).get("202615").rt + " " + data1.get(1).get("202615").desa + " " + data1.get(1).get("202615").agama + " " + data1.get(1).get("202615").statusK + " " + data1.get(1).get("202615").kerja + " " + data1.get(1).get("202615").negara + " " + data1.get(1).get("202615").msLaku);

        
        System.out.println("Data Penduduk Desa Konoha RT 03 :");
        System.out.println(data1.get(2).get("203616").nama + " " + data1.get(2).get("203616").tmpL + " " + data1.get(2).get("203616").tglL + " " + data1.get(2).get("203616").jenKel + " " + data1.get(2).get("203616").golDar + " " + data1.get(2).get("203616").rt + " " + data1.get(2).get("203616").desa + " " + data1.get(2).get("203616").agama + " " + data1.get(2).get("203616").statusK + " " + data1.get(2).get("203616").kerja + " " + data1.get(2).get("203616").negara + " " + data1.get(2).get("203616").msLaku);
        System.out.println(data1.get(2).get("203617").nama + " " + data1.get(2).get("203617").tmpL + " " + data1.get(2).get("203617").tglL + " " + data1.get(2).get("203617").jenKel + " " + data1.get(2).get("203617").golDar + " " + data1.get(2).get("203617").rt + " " + data1.get(2).get("203617").desa + " " + data1.get(2).get("203617").agama + " " + data1.get(2).get("203617").statusK + " " + data1.get(2).get("203617").kerja + " " + data1.get(2).get("203617").negara + " " + data1.get(2).get("203617").msLaku);
        System.out.println(data1.get(2).get("203618").nama + " " + data1.get(2).get("203618").tmpL + " " + data1.get(2).get("203618").tglL + " " + data1.get(2).get("203618").jenKel + " " + data1.get(2).get("203618").golDar + " " + data1.get(2).get("203618").rt + " " + data1.get(2).get("203618").desa + " " + data1.get(2).get("203618").agama + " " + data1.get(2).get("203618").statusK + " " + data1.get(2).get("203618").kerja + " " + data1.get(2).get("203618").negara + " " + data1.get(2).get("203618").msLaku);
        System.out.println(data1.get(2).get("203619").nama + " " + data1.get(2).get("203619").tmpL + " " + data1.get(2).get("203619").tglL + " " + data1.get(2).get("203619").jenKel + " " + data1.get(2).get("203619").golDar + " " + data1.get(2).get("203619").rt + " " + data1.get(2).get("203619").desa + " " + data1.get(2).get("203619").agama + " " + data1.get(2).get("203619").statusK + " " + data1.get(2).get("203619").kerja + " " + data1.get(2).get("203619").negara + " " + data1.get(2).get("203619").msLaku);
        System.out.println(data1.get(2).get("203620").nama + " " + data1.get(2).get("203620").tmpL + " " + data1.get(2).get("203620").tglL + " " + data1.get(2).get("203620").jenKel + " " + data1.get(2).get("203620").golDar + " " + data1.get(2).get("203620").rt + " " + data1.get(2).get("203620").desa + " " + data1.get(2).get("203620").agama + " " + data1.get(2).get("203620").statusK + " " + data1.get(2).get("203620").kerja + " " + data1.get(2).get("203620").negara + " " + data1.get(2).get("203620").msLaku);

        
        System.out.println("Data Penduduk Desa Konoha RT 04 :");
        System.out.println(data1.get(3).get("204616").nama + " " + data1.get(3).get("204616").tmpL + " " + data1.get(3).get("204616").tglL + " " + data1.get(3).get("204616").jenKel + " " + data1.get(3).get("204616").golDar + " " + data1.get(3).get("204616").rt + " " + data1.get(3).get("204616").desa + " " + data1.get(3).get("204616").agama + " " + data1.get(3).get("204616").statusK + " " + data1.get(3).get("204616").kerja + " " + data1.get(3).get("204616").negara + " " + data1.get(3).get("204616").msLaku);
        System.out.println(data1.get(3).get("204617").nama + " " + data1.get(3).get("204617").tmpL + " " + data1.get(3).get("204617").tglL + " " + data1.get(3).get("204617").jenKel + " " + data1.get(3).get("204617").golDar + " " + data1.get(3).get("204617").rt + " " + data1.get(3).get("204617").desa + " " + data1.get(3).get("204617").agama + " " + data1.get(3).get("204617").statusK + " " + data1.get(3).get("204617").kerja + " " + data1.get(3).get("204617").negara + " " + data1.get(3).get("204617").msLaku);
        System.out.println(data1.get(3).get("204618").nama + " " + data1.get(3).get("204618").tmpL + " " + data1.get(3).get("204618").tglL + " " + data1.get(3).get("204618").jenKel + " " + data1.get(3).get("204618").golDar + " " + data1.get(3).get("204618").rt + " " + data1.get(3).get("204618").desa + " " + data1.get(3).get("204618").agama + " " + data1.get(3).get("204618").statusK + " " + data1.get(3).get("204618").kerja + " " + data1.get(3).get("204618").negara + " " + data1.get(3).get("204618").msLaku);
        System.out.println(data1.get(3).get("204618").nama + " " + data1.get(3).get("204618").tmpL + " " + data1.get(3).get("204618").tglL + " " + data1.get(3).get("204618").jenKel + " " + data1.get(3).get("204618").golDar + " " + data1.get(3).get("204618").rt + " " + data1.get(3).get("204618").desa + " " + data1.get(3).get("204618").agama + " " + data1.get(3).get("204618").statusK + " " + data1.get(3).get("204618").kerja + " " + data1.get(3).get("204618").negara + " " + data1.get(3).get("204618").msLaku);
        System.out.println(data1.get(3).get("204619").nama + " " + data1.get(3).get("204619").tmpL + " " + data1.get(3).get("204619").tglL + " " + data1.get(3).get("204619").jenKel + " " + data1.get(3).get("204619").golDar + " " + data1.get(3).get("204619").rt + " " + data1.get(3).get("204619").desa + " " + data1.get(3).get("204619").agama + " " + data1.get(3).get("204619").statusK + " " + data1.get(3).get("204619").kerja + " " + data1.get(3).get("204619").negara + " " + data1.get(3).get("204619").msLaku);
        System.out.println(data1.get(3).get("204620").nama + " " + data1.get(3).get("204620").tmpL + " " + data1.get(3).get("204620").tglL + " " + data1.get(3).get("204620").jenKel + " " + data1.get(3).get("204620").golDar + " " + data1.get(3).get("204620").rt + " " + data1.get(3).get("204620").desa + " " + data1.get(3).get("204620").agama + " " + data1.get(3).get("204620").statusK + " " + data1.get(3).get("204620").kerja + " " + data1.get(3).get("204620").negara + " " + data1.get(3).get("204620").msLaku);

        System.out.println("Data Penduduk Desa Mayumi RT 01 :");
        System.out.println(data1.get(4).get("201611").nama + " " + data1.get(4).get("201611").tmpL + " " + data1.get(4).get("201611").tglL + " " + data1.get(4).get("201611").jenKel + " " + data1.get(4).get("201611").golDar + " " + data1.get(4).get("201611").rt + " " + data1.get(4).get("201611").desa + " " + data1.get(4).get("201611").agama + " " + data1.get(4).get("201611").statusK + " " + data1.get(4).get("201611").kerja + " " + data1.get(4).get("201611").negara + " " + data1.get(4).get("201611").msLaku);
        System.out.println(data1.get(4).get("201612").nama + " " + data1.get(4).get("201612").tmpL + " " + data1.get(4).get("201612").tglL + " " + data1.get(4).get("201612").jenKel + " " + data1.get(4).get("201612").golDar + " " + data1.get(4).get("201612").rt + " " + data1.get(4).get("201612").desa + " " + data1.get(4).get("201612").agama + " " + data1.get(4).get("201612").statusK + " " + data1.get(4).get("201612").kerja + " " + data1.get(4).get("201612").negara + " " + data1.get(4).get("201612").msLaku);
        System.out.println(data1.get(4).get("201613").nama + " " + data1.get(4).get("201613").tmpL + " " + data1.get(4).get("201613").tglL + " " + data1.get(4).get("201613").jenKel + " " + data1.get(4).get("201613").golDar + " " + data1.get(4).get("201613").rt + " " + data1.get(4).get("201613").desa + " " + data1.get(4).get("201613").agama + " " + data1.get(4).get("201613").statusK + " " + data1.get(4).get("201613").kerja + " " + data1.get(4).get("201613").negara + " " + data1.get(4).get("201613").msLaku);
        System.out.println(data1.get(4).get("201614").nama + " " + data1.get(4).get("201614").tmpL + " " + data1.get(4).get("201614").tglL + " " + data1.get(4).get("201614").jenKel + " " + data1.get(4).get("201614").golDar + " " + data1.get(4).get("201614").rt + " " + data1.get(4).get("201614").desa + " " + data1.get(4).get("201614").agama + " " + data1.get(4).get("201614").statusK + " " + data1.get(4).get("201614").kerja + " " + data1.get(4).get("201614").negara + " " + data1.get(4).get("201614").msLaku);
        System.out.println(data1.get(4).get("201615").nama + " " + data1.get(4).get("201615").tmpL + " " + data1.get(4).get("201615").tglL + " " + data1.get(4).get("201615").jenKel + " " + data1.get(4).get("201615").golDar + " " + data1.get(4).get("201615").rt + " " + data1.get(4).get("201615").desa + " " + data1.get(4).get("201615").agama + " " + data1.get(4).get("201615").statusK + " " + data1.get(4).get("201615").kerja + " " + data1.get(4).get("201615").negara + " " + data1.get(4).get("201615").msLaku);

        System.out.println("Data Penduduk Desa Mayumi RT 02 :");
        System.out.println(data1.get(5).get("202611").nama + " " + data1.get(5).get("202611").tmpL + " " + data1.get(5).get("202611").tglL + " " + data1.get(5).get("202611").jenKel + " " + data1.get(5).get("202611").golDar + " " + data1.get(5).get("202611").rt + " " + data1.get(5).get("202611").desa + " " + data1.get(5).get("202611").agama + " " + data1.get(5).get("202611").statusK + " " + data1.get(5).get("202611").kerja + " " + data1.get(5).get("202611").negara + " " + data1.get(5).get("202611").msLaku);
        System.out.println(data1.get(5).get("202612").nama + " " + data1.get(5).get("202612").tmpL + " " + data1.get(5).get("202612").tglL + " " + data1.get(5).get("202612").jenKel + " " + data1.get(5).get("202612").golDar + " " + data1.get(5).get("202612").rt + " " + data1.get(5).get("202612").desa + " " + data1.get(5).get("202612").agama + " " + data1.get(5).get("202612").statusK + " " + data1.get(5).get("202612").kerja + " " + data1.get(5).get("202612").negara + " " + data1.get(5).get("202612").msLaku);
        System.out.println(data1.get(5).get("202613").nama + " " + data1.get(5).get("202613").tmpL + " " + data1.get(5).get("202613").tglL + " " + data1.get(5).get("202613").jenKel + " " + data1.get(5).get("202613").golDar + " " + data1.get(5).get("202613").rt + " " + data1.get(5).get("202613").desa + " " + data1.get(5).get("202613").agama + " " + data1.get(5).get("202613").statusK + " " + data1.get(5).get("202613").kerja + " " + data1.get(5).get("202613").negara + " " + data1.get(5).get("202613").msLaku);
        System.out.println(data1.get(5).get("202614").nama + " " + data1.get(5).get("202614").tmpL + " " + data1.get(5).get("202614").tglL + " " + data1.get(5).get("202614").jenKel + " " + data1.get(5).get("202614").golDar + " " + data1.get(5).get("202614").rt + " " + data1.get(5).get("202614").desa + " " + data1.get(5).get("202614").agama + " " + data1.get(5).get("202614").statusK + " " + data1.get(5).get("202614").kerja + " " + data1.get(5).get("202614").negara + " " + data1.get(5).get("202614").msLaku);
        System.out.println(data1.get(5).get("202615").nama + " " + data1.get(5).get("202615").tmpL + " " + data1.get(5).get("202615").tglL + " " + data1.get(5).get("202615").jenKel + " " + data1.get(5).get("202615").golDar + " " + data1.get(5).get("202615").rt + " " + data1.get(5).get("202615").desa + " " + data1.get(5).get("202615").agama + " " + data1.get(5).get("202615").statusK + " " + data1.get(5).get("202615").kerja + " " + data1.get(5).get("202615").negara + " " + data1.get(5).get("202615").msLaku);

        
        System.out.println("Data Penduduk Desa Mayumi RT 03 :");
        System.out.println(data1.get(6).get("203616").nama + " " + data1.get(6).get("203616").tmpL + " " + data1.get(6).get("203616").tglL + " " + data1.get(6).get("203616").jenKel + " " + data1.get(6).get("203616").golDar + " " + data1.get(6).get("203616").rt + " " + data1.get(6).get("203616").desa + " " + data1.get(6).get("203616").agama + " " + data1.get(6).get("203616").statusK + " " + data1.get(6).get("203616").kerja + " " + data1.get(6).get("203616").negara + " " + data1.get(6).get("203616").msLaku);
        System.out.println(data1.get(6).get("203617").nama + " " + data1.get(6).get("203617").tmpL + " " + data1.get(6).get("203617").tglL + " " + data1.get(6).get("203617").jenKel + " " + data1.get(6).get("203617").golDar + " " + data1.get(6).get("203617").rt + " " + data1.get(6).get("203617").desa + " " + data1.get(6).get("203617").agama + " " + data1.get(6).get("203617").statusK + " " + data1.get(6).get("203617").kerja + " " + data1.get(6).get("203617").negara + " " + data1.get(6).get("203617").msLaku);
        System.out.println(data1.get(6).get("203618").nama + " " + data1.get(6).get("203618").tmpL + " " + data1.get(6).get("203618").tglL + " " + data1.get(6).get("203618").jenKel + " " + data1.get(6).get("203618").golDar + " " + data1.get(6).get("203618").rt + " " + data1.get(6).get("203618").desa + " " + data1.get(6).get("203618").agama + " " + data1.get(6).get("203618").statusK + " " + data1.get(6).get("203618").kerja + " " + data1.get(6).get("203618").negara + " " + data1.get(6).get("203618").msLaku);
        System.out.println(data1.get(6).get("203619").nama + " " + data1.get(6).get("203619").tmpL + " " + data1.get(6).get("203619").tglL + " " + data1.get(6).get("203619").jenKel + " " + data1.get(6).get("203619").golDar + " " + data1.get(6).get("203619").rt + " " + data1.get(6).get("203619").desa + " " + data1.get(6).get("203619").agama + " " + data1.get(6).get("203619").statusK + " " + data1.get(6).get("203619").kerja + " " + data1.get(6).get("203619").negara + " " + data1.get(6).get("203619").msLaku);
        System.out.println(data1.get(6).get("203620").nama + " " + data1.get(6).get("203620").tmpL + " " + data1.get(6).get("203620").tglL + " " + data1.get(6).get("203620").jenKel + " " + data1.get(6).get("203620").golDar + " " + data1.get(6).get("203620").rt + " " + data1.get(6).get("203620").desa + " " + data1.get(6).get("203620").agama + " " + data1.get(6).get("203620").statusK + " " + data1.get(6).get("203620").kerja + " " + data1.get(6).get("203620").negara + " " + data1.get(6).get("203620").msLaku);

        
        System.out.println("Data Penduduk Desa Mayumi RT 04 :");
        System.out.println(data1.get(7).get("204616").nama + " " + data1.get(7).get("204616").tmpL + " " + data1.get(7).get("204616").tglL + " " + data1.get(7).get("204616").jenKel + " " + data1.get(7).get("204616").golDar + " " + data1.get(7).get("204616").rt + " " + data1.get(7).get("204616").desa + " " + data1.get(7).get("204616").agama + " " + data1.get(7).get("204616").statusK + " " + data1.get(7).get("204616").kerja + " " + data1.get(7).get("204616").negara + " " + data1.get(7).get("204616").msLaku);
        System.out.println(data1.get(7).get("204617").nama + " " + data1.get(7).get("204617").tmpL + " " + data1.get(7).get("204617").tglL + " " + data1.get(7).get("204617").jenKel + " " + data1.get(7).get("204617").golDar + " " + data1.get(7).get("204617").rt + " " + data1.get(7).get("204617").desa + " " + data1.get(7).get("204617").agama + " " + data1.get(7).get("204617").statusK + " " + data1.get(7).get("204617").kerja + " " + data1.get(7).get("204617").negara + " " + data1.get(7).get("204617").msLaku);
        System.out.println(data1.get(7).get("204618").nama + " " + data1.get(7).get("204618").tmpL + " " + data1.get(7).get("204618").tglL + " " + data1.get(7).get("204618").jenKel + " " + data1.get(7).get("204618").golDar + " " + data1.get(7).get("204618").rt + " " + data1.get(7).get("204618").desa + " " + data1.get(7).get("204618").agama + " " + data1.get(7).get("204618").statusK + " " + data1.get(7).get("204618").kerja + " " + data1.get(7).get("204618").negara + " " + data1.get(7).get("204618").msLaku);
        System.out.println(data1.get(7).get("204618").nama + " " + data1.get(7).get("204618").tmpL + " " + data1.get(7).get("204618").tglL + " " + data1.get(7).get("204618").jenKel + " " + data1.get(7).get("204618").golDar + " " + data1.get(7).get("204618").rt + " " + data1.get(7).get("204618").desa + " " + data1.get(7).get("204618").agama + " " + data1.get(7).get("204618").statusK + " " + data1.get(7).get("204618").kerja + " " + data1.get(7).get("204618").negara + " " + data1.get(7).get("204618").msLaku);
        System.out.println(data1.get(7).get("204619").nama + " " + data1.get(7).get("204619").tmpL + " " + data1.get(7).get("204619").tglL + " " + data1.get(7).get("204619").jenKel + " " + data1.get(7).get("204619").golDar + " " + data1.get(7).get("204619").rt + " " + data1.get(7).get("204619").desa + " " + data1.get(7).get("204619").agama + " " + data1.get(7).get("204619").statusK + " " + data1.get(7).get("204619").kerja + " " + data1.get(7).get("204619").negara + " " + data1.get(7).get("204619").msLaku);
        System.out.println(data1.get(7).get("204620").nama + " " + data1.get(7).get("204620").tmpL + " " + data1.get(7).get("204620").tglL + " " + data1.get(7).get("204620").jenKel + " " + data1.get(7).get("204620").golDar + " " + data1.get(7).get("204620").rt + " " + data1.get(7).get("204620").desa + " " + data1.get(7).get("204620").agama + " " + data1.get(7).get("204620").statusK + " " + data1.get(7).get("204620").kerja + " " + data1.get(7).get("204620").negara + " " + data1.get(7).get("204620").msLaku);

    }
}