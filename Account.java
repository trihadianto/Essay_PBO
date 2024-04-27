public abstract class Akun {
    private String nomorAkun;
    protected double saldo;

    public Akun(String nomorAkun, double saldoAwal) {
        this.nomorAkun = nomorAkun;
        this.saldo = saldoAwal;
    }

    public String dapatkanNomorAkun() {
        return nomorAkun;
    }

    public double dapatkanSaldo() {
        return saldo;
    }

    public abstract void setor(double jumlah);

    public abstract void tarik(double jumlah);

    @Override
    public String toString() {
        return "Nomor Akun: " + nomorAkun + "\nSaldo: Rp" + saldo;
    }
}
