package com.amar.library.provider.interfaces

import androidx.annotation.StyleableRes

interface IResourceProvider {
    fun getResourceId(@StyleableRes styleResId: Int): Int
    fun recycle()
}