package com.example.countries
class MyList(name:String, id:Int) {
    private var name:String
    private var imgId:Int
    init {
        this.name = name
        imgId = id
    }
    fun getName():String{
        return name
    }
    fun setName(name:String){
        this.name=name
    }
    fun getImgId():Int{
        return imgId
    }
    fun setImgId(id:Int){
        this.imgId = id
    }
}
