package org.sopt.kotlin.model

public data class Data (var title : String, var description : String) {

    private var ID_COUNTER : Long = 1;
    public var id : Long

    init {

        id = ID_COUNTER;
    }
}