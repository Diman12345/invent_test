package main.java.com.diman.api.mobilecom;

import java.util.List;

public interface BarangRepo extends JpaRepository<model.Barang,Long>{
    List<model.Barang> findByAllProduk(String nama_barang);
}
