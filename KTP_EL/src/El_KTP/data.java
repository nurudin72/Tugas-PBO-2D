/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package El_KTP;

/**
 *
 * @author nurudinhasbullah
 */
public class data {

    int nik;
    String nama, tmpL, tglL, jenKel, golDar, rt, desa, agama, statusK, kerja, negara, msLaku;

    public data(int nik, String nama, String tmpL, String tglL, String jenKel, String golDar, String rt, String desa, String agama, String statusK, String kerja, String negara, String msLaku) {
        setNik(nik);
        setNama(nama);
        setTmpL(tmpL);
        setTglL(tglL);
        setJenKel(jenKel);
        setGolDar(golDar);
        setRt(rt);
        setDesa(desa);
        setAgama(agama);
        setStatusK(statusK);
        setKerja(kerja);
        setNegara(negara);
        setMsLaku(msLaku);
    }

    data() {
    }

    data(String nama, String tmpL, String tglL, String jenKel, String golDar, String rt, String desa, String agama, String statusK, String kerja, String negara, String msLaku) {
        setNama(nama);
        setTmpL(tmpL);
        setTglL(tglL);
        setJenKel(jenKel);
        setGolDar(golDar);
        setRt(rt);
        setDesa(desa);
        setAgama(agama);
        setStatusK(statusK);
        setKerja(kerja);
        setNegara(negara);
        setMsLaku(msLaku);
    }

    private void setNik(int nik) {
        this.nik = nik;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    private void setTmpL(String tmpL) {
        this.tmpL = tmpL;
    }

    private void setTglL(String tglL) {
        this.tglL = tglL;
    }

    private void setJenKel(String jenKel) {
        this.jenKel = jenKel;
    }

    private void setGolDar(String golDar) {
        this.golDar = golDar;
    }

    private void setRt(String rt) {
        this.rt = rt;
    }

    private void setDesa(String desa) {
        this.desa = desa;
    }

    private void setAgama(String agama) {
        this.agama = agama;
    }

    private void setStatusK(String statusK) {
        this.statusK = statusK;
    }

    private void setKerja(String kerja) {
        this.kerja = kerja;
    }

    private void setNegara(String negara) {
        this.negara = negara;
    }

    private void setMsLaku(String msLaku) {
        this.msLaku = msLaku;
    }

    public int getNik(){
        return nik;
    }
    
    public String getNama() {
        return nama;
    }

    public String getTmpL() {
        return tmpL;
    }

    public String getTglL() {
        return tglL;
    }

    public String getJenKel() {
        return jenKel;
    }

    public String getGolDar() {
        return golDar;
    }

    public String getRt() {
        return rt;
    }

    public String getDesa() {
        return desa;
    }

    public String getAgama() {
        return agama;
    }

    public String getStatusK() {
        return statusK;
    }

    public String getKerja() {
        return kerja;
    }

    public String getNegara() {
        return negara;
    }

    public String getMsLaku() {
        return msLaku;
    }

}
