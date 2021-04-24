package id.sitifauziyah.catatanpenjualan.activity.login

import id.sitifauziyah.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}