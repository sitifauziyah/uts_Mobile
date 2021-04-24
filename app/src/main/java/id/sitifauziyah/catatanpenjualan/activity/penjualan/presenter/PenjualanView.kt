package id.sitifauziyah.catatanpenjualan.activity.penjualan.presenter

import id.sitifauziyah.catatanpenjualan.model.Barang
import id.sitifauziyah.catatanpenjualan.model.Keranjang

interface PenjualanView {
    fun onSuccessGetKeranjang(keranjang: List<Keranjang?>?)
    fun onFailedGetKeranjang(msg: String?)

    fun onSuccessSearchItem(barangs: List<Barang?>?)
    fun onFailedSearchItem(msg : String?)

    fun onSuccessAddItemToKeranjang(msg: String?)
    fun onFailedAddItemToKeranjang(msg: String?)

    fun onSuccessDeleteItemKeranjang(msg: String?)
    fun onFailedDeleteItemKeranjang(msg: String?)

    fun onSuccessJualBarang(msg: String?)
    fun onFailedJualBarang(msg: String?)

    fun onSuccessAddKeranjang(msg: String?)
    fun onFailedAddKeranjang(msg: String?)
}