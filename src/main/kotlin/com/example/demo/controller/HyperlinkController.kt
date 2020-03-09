package com.example.demo.controller

import com.example.demo.model.Hyperlink
import com.example.demo.utilities.HyperlinkDao
import tornadofx.*

class HyperlinkController : Controller() {
    fun postHyperlink(title: String, url: String) {
        val hyperlink = Hyperlink(title, url)
        val dao = HyperlinkDao()
        dao.addHyperlink(hyperlink)
    }
}