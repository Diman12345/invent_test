package model;

import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "produk")
@EntityListeners(AuditingEntityListener.class)

public class Barang implements Serializable {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int id;

    @NotBlank
    private String nama_barang;

    @NotBlank
    private String kode_barang;

    @NotBlank
    private int jumlah_barang;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date tanggal;

    public int getId() {
        return id;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}

