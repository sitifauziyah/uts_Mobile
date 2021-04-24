package id.sitifauziyah.catatanpenjualan.activity.report.presenter

import id.sitifauziyah.catatanpenjualan.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}