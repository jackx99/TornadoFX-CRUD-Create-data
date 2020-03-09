package com.example.demo.utilities

import com.example.demo.model.Hyperlink

class HyperlinkDao {
    fun addHyperlink(hyperlink: Hyperlink) {
        val connection = Database().connection
        val preparedStatement = connection.prepareStatement("INSERT INTO Hyperlink(title, url) VALUES(?, ?)")
        preparedStatement.setString(1, hyperlink.title)
        preparedStatement.setString(2, hyperlink.url)
        preparedStatement.executeUpdate()
        preparedStatement.close()
        connection.close()
    }
}