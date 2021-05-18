package com.example.mylibrarymath

class Calculate {

    companion object {
        fun tambah (i1: Int, i2: Int) : Int
        {
            return (i1 + i2)
        }

        fun kurang (i1: Int, i2: Int) : Int
        {
            return (i1 - i2)
        }

        fun bagi (i1: Int, i2: Int) : Int
        {
            require (i2 != 0) {"Devide by zero, error!"}
            return (i1 / i2)
        }

        fun kali (i1: Int, i2: Int) : Int
        {
            return (i1 * i2)
        }
    }
}