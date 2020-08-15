package com.example.recyclerview14_01

class User(title: String,description: String,count : Int) {
    var title: String = ""
    var description: String = ""
    var count: Int = 0
    init {
        this.title = title
        this.description = description
        this.count = count
    }
    constructor():this("","",0)
}