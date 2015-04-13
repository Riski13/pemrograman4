/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author Riski
 */
public class Pegawai {
    private int id_pegawai;
    private String nama_pegawai;
    private String jabatan;
    int gaji;
    
public Pegawai (){
}

public void setNPegawai(String Nama){
    nama_pegawai = Nama;
}
        
public String getNama(){
    System.out.println(nama_pegawai);
    return nama_pegawai;
}

public void setidPeg(int ID){
    id_pegawai = ID;
}

public int getID(){
    System.out.println(id_pegawai);
    return id_pegawai;
}

public void setJab(String Jabatan){
    jabatan = Jabatan;
}

public String getJab(){
    System.out.println(jabatan);
    return jabatan;
}
public void Gaji(int gaji1){
    gaji = gaji1;
    System.out.println(gaji);
}


public void Gaji(int gaji, int gaji1){
    gaji =  gaji + gaji1;
    System.out.println(gaji);
}
      
        
    public static void main(String[] args) {
      Pegawai Baru = new Pegawai();
      Baru.setidPeg(123);
      Baru.getID();
      Baru.setNPegawai("Riski ");
      Baru.getNama();
      Baru.setJab("Direktur");
      Baru.getJab();
      Baru.Gaji(2000000);
     
      
      Pegawai tes = new Pegawai();
      tes.setidPeg(234);
      tes.getID();
      tes.setNPegawai("Marvian ");
      tes.getNama();
      tes.setJab("Pemimpin");
      tes.getJab();
      tes.Gaji(2000000,1000000);
    }
    
}
