/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hidan h = new hidan("Hidan", "Yugakure", "Singga", "Selalu membawa sabit bermata 3", "Shiji Hio Ketsu");
            h.displayAnggota();            
        kakuzu k = new kakuzu("Kakuzu", "Takigakure", "-", "Syar'i, punya jantung 4", "Giongu");
            k.displayAnggota();
        ucihaItachi u = new ucihaItachi("Uciha Itachi", "Klan Uciha", "Konohakagure", "Memiliki mata Sharinggan", "Amaterasu");
            u.displayAnggota();
        kisame kis = new kisame("Kisame", "Kiri", "Kirigakure", "Muka Hiu, Punya pedang, Rambut Jocong", "Daikodan");
            kis.displayAnggota();
        zetsu z = new zetsu("Zetsu", "-", "-", "Punya dua sisi yakni Hitam dan Putih", "NariKawari");
            z.displayAnggota();
        tobi t = new tobi("Tobi", "-", "Konohagakure", "Memakai topeng Jingga mata 1", "Kanui");
            t.displayAnggota();
        orochiMaru o = new orochiMaru("OrochiMaru", "-", "Konoha", "Muka Ular", "Yamata");
            o.displayAnggota();
        deidara d = new deidara("Deidara", "-", "Iwagakure ", "Muka robot, rambut kuning,", "C 0");
            d.displayAnggota();
        sasori s = new sasori("Sasori", "-", "Sunagakure", "Rambut merah, bertubuh bineka", "Akihigi");
            s.displayAnggota();
        konan kon = new konan("Konan", "-", "Amegakure", "Wanita satu satunya", "Kami no shiaha");
            kon.displayAnggota();
        Pain p = new Pain("Pain", "-", "Amegakure", "Rambut oreng di tindik", "Rine Tensei");
            p.displayAnggota();
            
            
                
                
    }
    
}
